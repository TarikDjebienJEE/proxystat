package com.dreamit.proxystat.model.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.IEquipmentDAO;
import com.dreamit.proxystat.model.dao.IFlatDAO;
import com.dreamit.proxystat.model.dao.IGuestDAO;
import com.dreamit.proxystat.model.dao.IOptionDAO;
import com.dreamit.proxystat.model.dao.IPassDAO;
import com.dreamit.proxystat.model.dao.ITrainingCourseDAO;
import com.dreamit.proxystat.model.dto.Basket;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Guest;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.PaymentCredit;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.service.IBookingService;

@Service(value = "bookingService")
@Transactional
public class BookingServiceImpl implements IBookingService{

	private static final float DEPOSIT_PERCENTAGE = 0.20f;

	@Autowired 
	private IFlatDAO flatDao;

	@Autowired 
	private IOptionDAO optionDao;

	@Autowired 
	private IAgeCategoryDAO ageCategoryDao;
	
	@Autowired 
	private IEquipmentDAO equipementDao;

	@Autowired 
	private IPassDAO passDao;

	@Autowired 
	private IGuestDAO guestDao;

	@Autowired 
	private IAgeCategoryDAO ageCategoryDAO;

	@Autowired 
	private IBookingDAO bookingDao;
	
	@Autowired 
	private ITrainingCourseDAO trainingCourseDao;
	

	/**
	 * Methode permettant de calculer le prix d'un 
	 * Option pour un panier b
	 * @param : le panier 
	 * @return le prix calcule
	 */
	private Float calculateOptionsPrice(Basket b) {
		Float optionPrice = new Float(0.0);
		List<Option> options = b.getOptionsSelected();
		for (Option option : options) {
			Price price = option.getPrice() ; 
			if (price != null){
				optionPrice += price.getPrice();
			}
		}
		return optionPrice;
	}


	/**
	 * Methode permettant de calculer le prix d'un 
	 * Flat pour un panier b
	 * @param : le panier 
	 * @return le prix calcule
	 */
	private Float calculateFlatPrice(Basket b) {
		Float flatPrice = new Float(0.0);
		Flat basketFlat = b.getFlat();
		if (basketFlat !=null){
			FlatType flatType = basketFlat.getFlatType();
			if (flatType !=null){
				Price price = flatType.getPrice();
				if (price != null){
					flatPrice = price.getPrice();
				}
			}
		}
		return flatPrice;
	}


	/**
	 * Methode permettant de calculer le prix d'un 
	 * guestequipment pour un panier b
	 * @param : le panier 
	 * @return le prix calcule
	 */
	private Float calculatePassPrice(Basket b) {
		Float passPrice = new Float(0.0);
		Pass basketPass = b.getPass();
		if (basketPass !=null){
			Price price = basketPass.getPrice();
			if (price != null){
				passPrice = price.getPrice();
			}
		}
		return passPrice;
	}



	/**
	 * Methode permettant de calculer le prix d'un 
	 * guestequipment pour un panier b
	 * @param : le panier 
	 * @return le prix calcule
	 */
	private Float calculateGuestEquipmentPrice(Basket b) {
		return b.getGuestEquipment().getEquipment().getPrice().getPrice();
	}



	@Override
	/** {@inheritDoc}**/
	public List<Flat> getFlatAvalaible(Date startDate, Date endDate) {
		List<Flat> result = new ArrayList<Flat>();

		if (endDate.before(startDate)){
			return result ; 
		}

		List<Flat> all =flatDao.findAll();
		for (Flat f : all) {

			if (f.getAvalaible()){
				result.add(f);
				continue ; 
			}				

			Booking booking = f.getBooking() ; 
			Date startDateBooking;
			Date endDateBooking;
			boolean bookingExists = (booking != null) ; 

			if (bookingExists){
				startDateBooking = booking.getStartDate();
				endDateBooking = booking.getEndDate();

				boolean isBeforeInterval = (startDate.before(startDateBooking) && endDate.before(startDateBooking)) ; 
				boolean isAfterInterval = (startDate.after(endDateBooking) && endDate.before(endDateBooking)) ; 
				boolean dateAvalaible = (isBeforeInterval || isAfterInterval);

				if (dateAvalaible){
					result.add(f);
				}
			}
		}
		return result ; 
	}
	
	@Override
	/** {@inheritDoc}**/
	public List<Flat> getFlatAvalaible(Date startDate , Date endDate, Float price) {
		List<Flat> flats = getFlatAvalaible(startDate, endDate);
		List<Flat> result = new ArrayList<Flat>();
		for (Flat flat : flats) {
			Price priceFlat = flat.getFlatType().getPrice();
			if (priceFlat != null){
				Float priceValue = priceFlat.getPrice() ; 
				if (priceValue <=  price){
					result.add(flat);
				}
			}
		}
		return result ; 
	}
	



	@Override
	/** {@inheritDoc}**/
	public Basket addPrice(Basket basket, Float price){
		Float actualPrice = basket.getTotalPrice() ; 
		Float totalPriceToSet = actualPrice + price ;
		basket.setTotalPrice(totalPriceToSet);
		Float newAccount = DEPOSIT_PERCENTAGE  * totalPriceToSet ; 
		basket.setTotalAccount(newAccount);
		return basket ; 
	}


	@Override
	/** {@inheritDoc}**/
	public Float getTotalAmount(Basket b){
		Float passPrice = calculatePassPrice(b);
		Float flatPrice = calculateFlatPrice(b);		
		Float optionPrice = calculateOptionsPrice(b);
		Float guestEquipmentPrice = calculateGuestEquipmentPrice(b);

		Float total = passPrice + flatPrice + optionPrice + guestEquipmentPrice; 
		b.setTotalPrice(total);
		return total;
	}



	@Override
	/** {@inheritDoc}**/
	public List<PaymentCredit> getCardAvalaible() {
		List<PaymentCredit> result = new ArrayList<PaymentCredit>();
		PaymentCredit p1 = new PaymentCredit();
		p1.setType("Visa");
		result.add(p1);
		PaymentCredit p2 = new PaymentCredit();
		p2.setType("Master card");
		result.add(p2);
		return result;
	}
	

	
	@Override
	public Booking createOrder(Basket basket) {
		Flat flat = basket.getFlat(); 
		Float totalPrice = basket.getTotalPrice();
		List<Option> optionsSelected = basket.getOptionsSelected();
		Collection<Guest> guests = basket.getGuests();

		Booking booking = new Booking();
		booking.setStartDate(Calendar.getInstance().getTime());
		booking.setBookingDate(Calendar.getInstance().getTime());
		booking.setAdvancePaid(false);
		booking.setFlat(flat);
		booking.setTotalPrice(totalPrice);
		booking.setAmountPaid(new Float(0.0));
		booking.setCanceled(false);
		booking.setOptions(optionsSelected);
		booking.setGuests(guests);
		booking.setCustomer(null);
		
		booking = bookingDao.save(booking);
		if (guests != null){
			for (Guest guest : guests) {
				guest.setBooking(booking);
				guestDao.save(guest);
			}	
		}
	
		return booking ; 
	}

	/**
	 * methode qui retrourne la liste des options possibles pour les services
	 * @return List<Option>
	 */
	@Override
	public List<Option> getListOption() {		
		return optionDao.findAll();
	}

	/**
	 * méthode qui vérifie la validité d'un mode de paiement et ensuite effectue le paiement 
	 * @param typeCard
	 * @param numberOfCard
	 * @param expiration
	 * @return true
	 */
	// TODO Rudy faire les contrôles de champs (typeCard existant, numéro de carte valide, date supérieur à la date du jour) , puis renvoit true
	@Override
	public boolean payment(String typeCard, int numberOfCard, Date expiration) {
		return true;
	}


	/**
	 * methode qui retourne le montant de l'accompte du panier
	 * @param basket
	 * @return montant de l'accompte
	 */
	@Override
	public Float getDeposit(Basket basket) {
		Float price=null;
		Float deposit =null;
		Flat flat = basket.getFlat();
		Booking booking = flat.getBooking();
		if(booking!=null){
			price = booking.getTotalPrice();
		}
		if(price!=null){
			deposit =  DEPOSIT_PERCENTAGE  * price;
			basket.setTotalAccount(deposit);
		}
		return deposit;
	}





	/**
	 * Get total amounts for all option selected
	 * @param optionsSelected
	 * @return
	 */
	@Override
	public Float getOptionsPrice(List<Option> optionsSelected) {
		Float totalPrice = (float) 0;
		for (Option option : optionsSelected) {
			Option optionInBdd = optionDao.findById(option.getId());
			Price price = optionInBdd.getPrice();
			totalPrice+=price.getPrice();
		}
		return totalPrice;
	}

	@Override
	public List<AgeCategory> getAllGuestType() {
		return ageCategoryDao.findAll();
	}

	/**
	 * TODO RUDY : Faire le test unitaire correspondant
	 * Get All equipments availables for the corresponding criterias
	 * @param typePersonne : age category de la personne
	 * @param personheight taille 
	 * @param shoesSize pointure
	 * @return
	 */
	@Override
	public List<Equipment> getAllEquipments(){
		return equipementDao.findAll();
	}	
	
	
	/**
	 * TODO RUDY : Faire le test unitaire correspondant
	 * Get All equipments availables for the corresponding criterias
	 * @param typePersonne : age category de la personne
	 * @param personheight taille 
	 * @param shoesSize pointure
	 * @return
	 */
	@Override
	public List<Equipment> getAllCorrespondingEquipments(
			AgeCategory typePersonne, 
			Integer personheight, 
			Integer shoesSize) {
		List<Equipment> listeEquipmentOk = new ArrayList<Equipment>();
		List<Equipment> listEquipment = equipementDao.findAll();
		for (Equipment equipment : listEquipment){
			boolean nameEquals = equipment.getAgeCategory().getName().equals(typePersonne.getName()) ; 
			boolean startAgeEquals = equipment.getAgeCategory().getStartAge().equals(typePersonne.getStartAge()) ; 
			boolean endAgeEquals = equipment.getAgeCategory().getEndAge().equals(typePersonne.getEndAge()) ; 
			
			boolean minimumHeightCorrect = true ;
			if (personheight != null){
				minimumHeightCorrect = equipment.getMinimumHeight()<=personheight ; 
			}
			
			boolean shoesEquals = true ;
			if (shoesSize != null){
				shoesEquals = shoesSize.equals(equipment.getSize()) ; 
			}
			boolean agesEquals = startAgeEquals && endAgeEquals ; 
			boolean aboutEquipmentCorresponding = minimumHeightCorrect && shoesEquals ; 
			
			boolean canAddEquipment = nameEquals && agesEquals  &&  aboutEquipmentCorresponding; 
			if(canAddEquipment){
				listeEquipmentOk.add(equipment);
			}
		}
		return listeEquipmentOk;
	}

	/**
	 * Get total amounts for all equipments selected
	 * @param equipmentsSelected
	 * @return
	 */
	@Override
	public Float getEquipmentsPrice(List<Equipment> equipmentsSelected) {
		Float totalPrice =  (float) 0;
		for (Equipment equipment : equipmentsSelected){
			Price price=equipment.getPrice();
			totalPrice+=price.getPrice();
		}
		return totalPrice;
	}

	/**
	 * Recupere la liste des types de forfaits mecaniques existants
	 * - Les forfaits ski alpin
	 * - les forfaits ski nordique
	 * - le télésiège
	 * @return la liste des types de forfaits mecaniques existants
	 */
	@Override
	public List<Pass> getAllTrackAvailable() {
		return passDao.findAll();
	}


	/**
	 * Recupere la liste des ages categories
	 * de la bdd
	 * @return la liste des ages categories
	 */
	@Override
	public List<AgeCategory> getAllAgeCategory() {
		return this.ageCategoryDAO.findAll();
	}	
	
	
	
	@Override
	/** {@inheritDoc}**/
	public List<AgeCategory> findByNameAgeCategory(String ageCategoryName) {
		List<AgeCategory> all = ageCategoryDao.findAll();
		List<AgeCategory> result = new ArrayList<AgeCategory>();
		for (AgeCategory ageCategory : all) {
			if (ageCategory.getName().equalsIgnoreCase(ageCategoryName)){
				result.add(ageCategory);
			}
		}
		return result;
	}
	
	
	/**
	 * Cette méthode doit lier pour un guest appartenant à un booking son pass 
	 * - dans la modélisation actuelle 1 guest peut avoir 0 ou 1 forfait
	 */
	@Override
	public Pass createPassBooking(Booking booking, Guest guest,Pass pass) {
		guest.setPass(pass);
		guestDao.save(guest);
		Collection<Guest> collectionGuest = booking.getGuests();
		collectionGuest.add(guest);
		booking.setGuests(collectionGuest);
		bookingDao.save(booking);
		return guest.getPass();
	}





	@Override
	public List<Option> getOptionsById(long[] optionsId) {
		List<Option> optionsSelected = new ArrayList<Option>();
		if (optionsId != null){
			for (long optionIdSelected : optionsId){
				Option option = optionDao.findById(optionIdSelected);
				if(option != null){
					optionsSelected.add(option);
				}
			}
		}
		return optionsSelected;
	}

	@Override
	public Booking findBookingById(Long id) {
		return bookingDao.findById(id);
	}

	@Override
	public Booking cancelBooking(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("null booking");
		}
		
		booking.setCanceled(true);
		
		return bookingDao.save(booking);
	}
	
	
	@Override
	public List<TrainingCourse> getAllTrainingCourse() {
		return trainingCourseDao.findAll() ;
	}

	
	@Override
	public List<Pass> getAllPass() {
		return passDao.findAll() ;
	}

	@Override
	public Guest setLinkGuest(String name ,String[] equipmentChoice, String passChoice, String trainingCourseChoice) {
		Guest guest = new Guest();
		guest.setName(name);
		Set<GuestEquipment> guestEquipments = new HashSet<GuestEquipment>();
		if (equipmentChoice != null) {
			for (int i = 0; i < equipmentChoice.length; i++) {
				GuestEquipment guestEquipment = new GuestEquipment();
				Equipment equipment = equipementDao.findById(Long.valueOf(equipmentChoice[i]));
				guestEquipment.setEquipment(equipment);
				guestEquipment.setGuest(guest);
				guestEquipments.add(guestEquipment);
			}
		}
		guest.setGuestEquipments(guestEquipments);

		
		if (passChoice != null){
			Long passId = Long.parseLong(passChoice);
			Pass pass = passDao.findById(passId);
			guest.setPass(pass);
		}else{
			guest.setPass(null);
		}
		
		if (trainingCourseChoice != null){
			Long trainingCourseId = Long.parseLong(trainingCourseChoice);
			TrainingCourse trainingCourse = trainingCourseDao.findById(trainingCourseId);
			guest.setTrainingCourse(trainingCourse);
		}else{
			guest.setTrainingCourse(null);
		}
		guest = guestDao.save(guest);
		return guest;
	}


	@Override
	public Flat findById(Long idFlat) {
		return flatDao.findById(idFlat);
	}	

}