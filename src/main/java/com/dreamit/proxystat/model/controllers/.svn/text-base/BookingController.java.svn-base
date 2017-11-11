package com.dreamit.proxystat.model.controllers;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dreamit.proxystat.model.dto.Basket;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.Guest;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.PaymentCredit;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.service.IBookingService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Proxystat Booking Controller
 * @author tarik DJEBIEN
 * @author Eric RAKOTOBE
 */
@Controller
@RequestMapping(value = "*.booking")
@Scope(value = "singleton")
@SessionAttributes(value = {"basket" , "nbPersons" , "nbCurrentPerson" , "flatsAvailable", "trainingCourseAvailable", "passAvalaible"})
public class BookingController {

	private static final String FRONT_DATE_PATTERN = "MM/dd/yyyy";

	@Autowired
	private IBookingService bookingService;



	
	/**
	 * Methode permettant de charger tous les appartements
	 * disponibles pour une date, avec un nombre de personnes
	 * ainsi qu'un critere prix 
	 * @return la vue bookingAppartment.jsp 
	 * (appele deux fois : une fois a l'initialisation de la page,
	 * la deuxieme fois lors du click sur le bouton 'search'
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String getFlats(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "beginDate", required = true) String beginDate,
			@RequestParam(value = "finalDate", required = true) String finalDate,
			@RequestParam(value = "nbPersons", required = true) String nbPersons,
			@RequestParam(value = "price", required = true) String price
			) {

		Integer statutWorkflow = 1;
		int defaultValuePerson = 1 ; 
		Date startDate = null;
		Date endDate = null;
		List<Flat> flatsAvailable = new ArrayList<Flat>() ; 
		model.put("statutWorkflow", statutWorkflow);

		try {
			startDate = DateUtils.parseDate(beginDate, new String[]{FRONT_DATE_PATTERN});
			endDate = DateUtils.parseDate(finalDate, new String[]{FRONT_DATE_PATTERN});
			flatsAvailable = bookingService.getFlatAvalaible(startDate, endDate);
			model.put("flatsAvailable", flatsAvailable);
		} catch (ParseException e) {
			return SpringViewResolutionConstants.VIEW_WORKFLOW;
		}
		
		if (price != null && !"".trim().equalsIgnoreCase(price)){
			Float priceValue =  new Float(price) ; 
			flatsAvailable = bookingService.getFlatAvalaible(startDate, endDate, priceValue);
		}else{
			flatsAvailable = bookingService.getFlatAvalaible(startDate, endDate);
		}
		
		Basket basket = new Basket();
		basket.setTotalPrice(0.0f);
		
		Integer nbPersonValue= defaultValuePerson ; 
		try{
			 nbPersonValue = Integer.parseInt(nbPersons);
		} catch (NumberFormatException e) {
			 nbPersonValue = defaultValuePerson;
		}
		
		model.put("flatsAvailable", flatsAvailable);
		model.put("basket", basket);
		model.put("beginDate", beginDate);
		model.put("finalDate", finalDate);
		model.put("nbPersons", nbPersonValue);
		
		return SpringViewResolutionConstants.VIEW_WORKFLOW;
	}


	
	/**
	 * Methode appele apres que le choix
	 * de l'appartement ait ete effectue
	 * @return la vue bookingEquipmentAndPass.jsp
	 */
	@RequestMapping(value = "/chooseFlat", method = RequestMethod.POST)
	public String selectFlat(HttpServletRequest request, ModelMap model, 
			@RequestParam(value = "flatChoice", required = false) Long flatChoice) {
		
		if (flatChoice == null){
			Integer statutWorkflow = 1;
			Object flatsAvailable =  model.get("flatsAvailable");
			model.put("flatsAvailable", flatsAvailable);
			model.put("flatNotChoosen", true);
			model.put("statutWorkflow", statutWorkflow);
			return SpringViewResolutionConstants.VIEW_WORKFLOW;
		}
		
		Basket basket = (Basket) model.get("basket");
		Flat flat = bookingService.findById(flatChoice);
		
		flat.setAvalaible(false); 
		basket.setFlat(flat);
		
		// Update total Price
		Integer statutWorkflow = 2;
		Integer nbCurrentPerson = 1 ; 
		basket = bookingService.addPrice(basket, flat.getFlatType().getPrice().getPrice());
		List<AgeCategory> allAgeCategory = bookingService.getAllAgeCategory() ; 
		List<Pass> passAvalaible  = bookingService.getAllPass() ;  
		List<TrainingCourse> trainingCourseAvailable = bookingService.getAllTrainingCourse();
		List<Equipment> equipmentsAvailable = bookingService.getAllEquipments();
		
		model.put("basket", basket);
		model.put("statutWorkflow", statutWorkflow);
		model.put("nbCurrentPerson",nbCurrentPerson);
		model.put("allAgeCategory",allAgeCategory);
		model.put("passAvalaible", passAvalaible);
		model.put("trainingCourseAvailable", trainingCourseAvailable);
		model.put("equipmentsAvailable", equipmentsAvailable);
		
		return SpringViewResolutionConstants.VIEW_WORKFLOW;
	}

	
	/**
	 * Methode permettant de charger tous les appartements
	 * disponibles pour une date, avec un nombre de personnes
	 * ainsi qu'un critere prix 
	 * @return la vue bookingAppartment.jsp 
	 * (appele deux fois : une fois a l'initialisation de la page,
	 * la deuxieme fois lors du click sur le bouton 'search'
	 */
	@RequestMapping(value = "/searchEquipmentOrGoToNextPerson.booking", method = RequestMethod.POST, params = "searchEquipment")
	public String searchEquipment(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "guestTypeChoice", required = true) String guestTypeChoice,
			@RequestParam(value = "guestHeightValue", required = false) String guestHeightValue,
			@RequestParam(value = "guestShoesSizeValue", required = false) String guestShoesSizeValue
			) {
 
		List<AgeCategory> ageCategoryWithName = bookingService.findByNameAgeCategory(guestTypeChoice);
		AgeCategory typePersonne = ageCategoryWithName.get(0);
	
		boolean guestHeightEntered = (guestHeightValue!= null) && !("".equalsIgnoreCase(guestHeightValue)) ; 
		boolean guestShoesEntered = (guestShoesSizeValue!= null) && !("".equalsIgnoreCase(guestShoesSizeValue)) ; 
		Integer personheight = null ; 
		Integer shoesSize =  null ;
		if (guestHeightEntered){
			personheight = Integer.valueOf(guestHeightValue) ;
		}
		if (guestShoesEntered){
			shoesSize = Integer.valueOf(guestShoesSizeValue) ;
		}

		Integer statutWorkflow = 2;
		List<AgeCategory> allAgeCategory = bookingService.getAllAgeCategory() ; 
		List<Equipment> equipmentsAvailable = bookingService.getAllCorrespondingEquipments(typePersonne,personheight,shoesSize);
		
		model.put("statutWorkflow", statutWorkflow);
		model.put("allAgeCategory",allAgeCategory);
		model.put("equipmentsAvailable", equipmentsAvailable);
		return SpringViewResolutionConstants.VIEW_WORKFLOW;
	}
	
	
	/**
	 * Methode pour le choix de materiel et de forfait 
	 * pour le nombre de personnes indiques auparavant
	 * @return la vue bookingSummary.jsp
	 */
	@RequestMapping(value = "/searchEquipmentOrGoToNextPerson.booking", method = RequestMethod.POST)
	public String goToNextPerson(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "equipmentChoice", required = false) String [] equipmentChoice,
			@RequestParam(value = "passChoice", required = false) String passChoice,
			@RequestParam(value = "trainingCourseChoice", required = false) String trainingCourseChoice)
	{

		Integer statutWorkflow = 3;
		Integer nbPersons = (Integer) model.get("nbPersons") ; 
		Integer nbCurrentPerson = (Integer) model.get("nbCurrentPerson") ; 
		List<Option> options = bookingService.getListOption() ; 
		List<AgeCategory> allAgeCategory = bookingService.getAllAgeCategory() ; 
		
		
		String name = "Guest " + nbCurrentPerson ; 
		Guest guest = bookingService.setLinkGuest(name, equipmentChoice,passChoice,trainingCourseChoice );
		Basket basket = (Basket) model.get("basket");
		List<Guest> guestsBasket = basket.getGuests() ; 
		if (guestsBasket == null){
			guestsBasket = new ArrayList<Guest>() ;
		}
		guestsBasket.add(guest);
		basket.setGuests(guestsBasket);
		
		if (nbCurrentPerson < nbPersons){
			statutWorkflow = 2;
			nbCurrentPerson = nbCurrentPerson + 1 ; 
			model.put("nbCurrentPerson",nbCurrentPerson);
		}
		
		//Update total price
		Collection<GuestEquipment> guestEquipments = guest.getGuestEquipments() ; 
		for (GuestEquipment guestEquipment : guestEquipments) {
			if ( guestEquipment.getEquipment() != null && guestEquipment.getEquipment().getPrice() != null){
				Float priceToAdd = guestEquipment.getEquipment().getPrice().getPrice() ; 
				basket = bookingService.addPrice(basket, priceToAdd) ;
			}
		}
		
		Pass guestPass = guest.getPass() ; 
		if (guestPass != null && guestPass.getPrice() != null){
			Float priceToAdd = guestPass.getPrice().getPrice() ; 
			basket = bookingService.addPrice(basket, priceToAdd) ;
		}
		
		TrainingCourse guestTrainingCourse = guest.getTrainingCourse() ; 
		if (guestTrainingCourse != null && guestTrainingCourse.getPrice() != null){
			Float priceToAdd = guestTrainingCourse.getPrice().getPrice() ; 
			basket = bookingService.addPrice(basket, priceToAdd) ;
		}
		
		model.put("statutWorkflow", statutWorkflow);
		model.put("nbPersons", nbPersons);
		model.put("options", options);
		model.put("allAgeCategory",allAgeCategory);
		
		return SpringViewResolutionConstants.VIEW_WORKFLOW;
	}	
	
	
	/**
	 * Methode pour charger le choix des options
	 * et pour l'affichage des cartes de paiement disponibles
	 * @return la vue bookingPayment.jsp
	 */
	@RequestMapping(value = "/chooseOptions", method = RequestMethod.POST)
	public String selectOptions(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "optionsSelected", required = false) long[] optionsId
			){
		
		List<Option> optionsSelected = bookingService.getOptionsById(optionsId);
		
		// Basket
		Basket basket = (Basket) model.get("basket");
		basket.setOptionsSelected(optionsSelected);
		
		// Update total Price
		basket = bookingService.addPrice(basket, bookingService.getOptionsPrice(optionsSelected));
		model.put("basket", basket);
		
		// Payment method
		model.put("paymentMethods", bookingService.getCardAvalaible());
		
		// Workflow : etape BookingPayment
		Integer statutWorkflow = 4;
		model.put("statutWorkflow", statutWorkflow);

		return SpringViewResolutionConstants.VIEW_WORKFLOW;
	}
	
	/**
	 * Methode pour le payment de la reservation
	 * @return la vue bookingCongratulation.jsp
	 */
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public String payOrder(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "cardType", required = true) Long paymentId,
			@RequestParam(value = "cardNumber", required = true) Integer cardNumber,
			@RequestParam(value = "cardExpirationDate", required = true) String cardExpirationDate
			){
		
		Date expirationDate = null; 
		try {
			expirationDate = DateUtils.parseDate(cardExpirationDate, new String[]{FRONT_DATE_PATTERN});
		} catch (ParseException e) {
			return SpringViewResolutionConstants.VIEW_WORKFLOW;
		}
		
		// Basket
		Basket basket = (Basket) model.get("basket");
		PaymentCredit payment = new PaymentCredit();
		payment.setId(paymentId);
		payment.setExpirationDate(expirationDate);
		basket.setPayment(payment);
		
		// Create an Order and persist a booking in DataBase
		Booking booking = bookingService.createOrder(basket);
		model.put("booking", booking);
		
		// Workflow : etape BookingCongratulation
		Integer statutWorkflow = 5;
		model.put("statutWorkflow", statutWorkflow);
		model.put("flatsAvailable", new ArrayList<Flat>());
		
		return SpringViewResolutionConstants.VIEW_WORKFLOW;
	}

}
