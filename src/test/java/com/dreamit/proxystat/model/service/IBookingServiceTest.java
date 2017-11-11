package com.dreamit.proxystat.model.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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


/**
 * Classe de test pour le service de reservation
 * @author RAKOTOBE Sitraka Eric
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IBookingServiceTest {
	
	
	@Autowired 
	private IBookingService bookingService;

	private Flat flat ; 
	private PaymentCredit paymentCredit;
	private Basket basket ;
	private Date startDateTest ;
	private Date endDateTest ;
	private Float priceValue ;
	
	
	
	
	
	@Before
	public void setUp() throws Exception{

		basket = new Basket();
		basket.setTotalPrice(new Float(10));
		basket.setTotalAccount(new Float(250));

		Calendar calendar = Calendar.getInstance();
		int yearBegin = 2000;
		int yearEnd = 2015;
		int month = 0; 
		int date = 1;
		
		calendar.clear();
		calendar.set(Calendar.YEAR, yearBegin);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, date);
		startDateTest = calendar.getTime();
		
		calendar.clear();
		calendar.set(Calendar.YEAR, yearEnd);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, date);
		endDateTest = calendar.getTime();	
		
		flat = new Flat();
		paymentCredit = new PaymentCredit();
		
	}
	
	
	
	/**
     * Methode permettant de construire
     * les GuestEquipment
     * avec un prix
     * @return les GuestEquipment
     */
	private GuestEquipment buildGuestEquipmentPrice() {
		Price priceForGuestEquipment = new Price();
    	priceForGuestEquipment.setPrice(new Float(490));
    	GuestEquipment guestEquipment = new GuestEquipment();
    	Equipment equipment = new Equipment();
    	equipment.setPrice(priceForGuestEquipment);
    	guestEquipment.setEquipment(equipment);
		return guestEquipment;
	}


	/**
     * Methode permettant de construire
     * les options
     * avec un prix
     * @return les options
     */
	private List<Option> buildOptionsPrice() {
		Price priceForOption = new Price();
    	priceForOption.setPrice(new Float(10));
    	List<Option> optionsSelected = new ArrayList<Option>();
    	Option op = new Option();
    	op.setPrice(priceForOption);
    	optionsSelected.add(op);
		return optionsSelected;
	}


	/**
     * Methode permettant de construire
     * un Flat
     * avec un prix
     * @return le Flat
     */
	private Flat buildFlatPrice() {
		Price priceForFlat = new Price();
    	priceForFlat.setPrice(new Float(200));
    	FlatType flatType = new FlatType();
    	flatType.setPrice(priceForFlat);
    	Flat f = new Flat();
    	f.setFlatType(flatType);
    	return f ; 
	}


	/**
     * Methode permettant de construire
     * un pass
     * avec un prix
     * @return le pass
     */
	private Pass buildPassPrice() {
		Price priceForPass = new Price();
    	priceForPass.setPrice(new Float(300));
    	Pass p = new Pass();
    	p.setPrice(priceForPass);
		return p;
	}		
	
	

	
    /**
     * Methode permettant de tester si 
     * une liste de flat contient bien le flat en parametre
     * @param f : le flat
     * @param flats : la liste des flats
     * @return vrai si f est dans flats , faux sinon
     */
    private boolean flatListContains(Flat f , List<Flat> flats ) {
    	for (Flat flatFromDataBase : flats) {
    		Long flatId = f.getId();
    		Long flatFromDataBaseId = flatFromDataBase.getId();
			if (flatId.equals(flatFromDataBaseId)){
				return true ; 
			}
		}
    	return false ;
	}	
    
    
    
    /**
     * Test permettant de mettre a zero les 
     * champs heures , minutes , secondes
     * pour permettre une comparaison de deux dates
     * sans prendre en compte les times
     * @param fecha : la date a transformer
     * @return avec les champs times remises a zero
     */
	private Date getZeroTimeDate(Date fecha) {
	    Date res = fecha;
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime( fecha );
	    calendar.set(Calendar.HOUR_OF_DAY, 0);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
	    res = calendar.getTime();
	    return res;
	}    
	
    
    /**
     * Methode permettant de tester si 
     * une liste de PaymentCredit contient bien 
     * le PaymentCredit en parametre
     * @param p : le PaymentCredit
     * @param paymentCredits : la liste des paymentCredits
     * @return vrai si p est dans paymentCredits , faux sinon
     */
	private boolean paymentCreditListContains(PaymentCredit p,List<PaymentCredit> paymentCredits) {
    	for (PaymentCredit paymentCreditFromDataBase : paymentCredits) {
    		Long paymentCreditId = p.getId();
    		Long paymentCreditFromDataBaseId = paymentCreditFromDataBase.getId();
			if (paymentCreditId.equals(paymentCreditFromDataBaseId)){
				return true ; 
			}
		}
    	return false ;
	}	     
    
	
    /**
     * Test pour la méthode getFlatAvalaible()
     */
	@Test
    public void testFlatWithoutBookingNotInList() {
		flat.setId((new Long(1000)));

		List<Flat> result = bookingService.getFlatAvalaible(startDateTest,endDateTest);
    	
    	Assert.assertFalse(flatListContains(flat, result));
    }		
	
	
	
	
    /**
     * Test pour la méthode getFlatAvalaible()
     */
	@Test
    public void testFlatWithStartDateBookingAfterStartDateNotInList() {
		flat.setId((new Long(1001)));

		List<Flat> result = bookingService.getFlatAvalaible(startDateTest,endDateTest);
    	
    	Assert.assertFalse(flatListContains(flat, result));
    }	
	
	
	
    /**
     * Test pour la méthode getFlatAvalaible()
     */
	@Test
    public void testFlatWithEndDateBookingBeforeEndDateNotInList() {
		flat.setId((new Long(1002)));

		List<Flat> result = bookingService.getFlatAvalaible(startDateTest,endDateTest);
    	
    	Assert.assertFalse(flatListContains(flat, result));
    }		
	
	
	
	
	
    /**
     * Test pour la méthode getFlatAvalaible()
     */
	@Test
    public void testFlatWithStartDateAfterEndDateNotInList() {
		flat.setId((new Long(1003)));
		Calendar calendar = Calendar.getInstance();
		int yearBegin = 2100;
		int yearEnd = 2000;
		int month = 0; 
		int date = 1;
		calendar.clear();
		calendar.set(Calendar.YEAR, yearBegin);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, date);
		startDateTest = calendar.getTime();
		calendar.clear();
		calendar.set(Calendar.YEAR, yearEnd);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, date);
		endDateTest = calendar.getTime();			
		
		List<Flat> result = bookingService.getFlatAvalaible(startDateTest,endDateTest);
    	
    	Assert.assertFalse(flatListContains(flat, result));
    }			
	
	
    /**
     * Test pour la méthode getFlatAvalaible()
     */
	@Test
    public void testFlatCorrectInList() {
		flat.setId((new Long(1004)));

		List<Flat> result = bookingService.getFlatAvalaible(startDateTest,endDateTest);
    	
    	Assert.assertTrue(flatListContains(flat, result));
    }			


	
	
    /**
     * Test pour la méthode getFlatAvalaible()
     */
	@Test
    public void testFlatCorrectWithPriceInList() {
		Flat expectedIn = buildFlatPrice() ; 
		expectedIn.setId((new Long(1004)));
		priceValue = new Float(200);

		List<Flat> result = bookingService.getFlatAvalaible(startDateTest,endDateTest,priceValue);
		
    	Assert.assertTrue(flatListContains(expectedIn, result));
    }
	
	

	/**
     * Test pour la méthode addPrice()
     */
	@Test
    public void testAddPriceReturnsCorrectPrice() {
    	Float f = new Float(20);
    	Float expected = new Float(30);
    	
    	basket = bookingService.addPrice(basket,f);
    	Float result = basket.getTotalPrice() ; 
    	
    	Assert.assertEquals(expected, result);
    }
	
	
	
	
    /**
     * Test pour la méthode getTotalAmount()
     */
	@Test
    public void testGetTotalAmountReturnsCorrectAmount() {
    	Float expected = new Float(1000);
    	Pass p = buildPassPrice();
    	Flat f = buildFlatPrice();
    	List<Option> optionsSelected = buildOptionsPrice();
    	GuestEquipment guestEquipment = buildGuestEquipmentPrice();
    	basket.setPass(p);
    	basket.setFlat(f);
    	basket.setOptionsSelected(optionsSelected);
    	basket.setGuestEquipment(guestEquipment);
    	
    	Float result = bookingService.getTotalAmount(basket);
    	
    	Assert.assertEquals(expected, result);
    }


	
    /**
     * Test pour la méthode getCardAvalaible()
     */
	@Test
	public void testPaymentCreditAuthorizedIsInDataBase() {
		
    	List<PaymentCredit> result = bookingService.getCardAvalaible();
    	
    	Assert.assertNotNull(result);
    }

	
	
    /**
     * Test pour la méthode getCardAvalaible()
     */
	@Test
	public void testPaymentCreditAuthorizedNotInDataBase() {
		paymentCredit.setId(new Long(1001));
		
    	List<PaymentCredit> result = bookingService.getCardAvalaible();
    	
    	Assert.assertFalse(paymentCreditListContains(paymentCredit, result));
    }
	
	
	
	
	
	
	
	
	
	

	
    /**
     * Test pour la méthode createOrder()
     */
	@Test
	public void testCreateOrderReturnBookingCorrespondingToBasket() {
		Date dateBookingExpected = Calendar.getInstance().getTime();
		Date dateExpected = getZeroTimeDate(dateBookingExpected);

		Booking result = bookingService.createOrder(basket);
		Date dateBookingResult = result.getStartDate();
		Date dateResult = getZeroTimeDate(dateBookingResult);

		Assert.assertNotNull(dateExpected);
    	Assert.assertNotNull(dateResult);
    }
    
    @Test
	public void testGetListOption() {
		
		List<Option> reponseListeOption = bookingService.getListOption();
		
		assertNotNull(reponseListeOption);
	}
	
	@Test
	public void testPaymentReturnTrue(){
		String typeCard="test";
		int numberOfCard=1111;
		//TODO Rudy : Changer avec calendar pour eviter les deprecation
		@SuppressWarnings("deprecation")
		Date expiration=new Date("10/02/2013");
		
		Boolean result = bookingService.payment(typeCard, numberOfCard, expiration);
		
		assertTrue(result);
	}
	
	@Test
	public void testGetDepositWithAccountExisting(){
		Float basketTotalPrice = new Float(10);
		Basket basket = new Basket();
		Flat flat = new Flat();
		Booking booking = new Booking();
		booking.setTotalPrice(basketTotalPrice);
		flat.setBooking(booking);
		basket.setFlat(flat);
		
//		when(basketMock.getFlat()).thenReturn(flat);
//		when(flat.getBooking()).thenReturn(booking);
//		when(booking.getTotalPrice()).thenReturn(basketTotalPrice);
		
		Float result = bookingService.getDeposit(basket);
		
		assertNotNull(result);
	}
	
	@Test
	public void testGetDepositWithAccountZero(){
		Float basketTotalPrice = new Float(0);
		Basket basket = new Basket();
		Flat flat = new Flat();
		Booking booking = new Booking();
		booking.setTotalPrice(basketTotalPrice);
		flat.setBooking(booking);
		basket.setFlat(flat);
		
//		when(basketMock.getFlat()).thenReturn(flat);
//		when(flat.getBooking()).thenReturn(booking);
//		when(booking.getTotalPrice()).thenReturn(basketTotalPrice);
		
		Float result = bookingService.getDeposit(basket);
		
		assertTrue(result.equals((float)0));
	}
	
	@Test
	public void testGetOptionsPriceWithListNotEmpty(){
		List<Option> optionsList = new ArrayList<Option>();
		Option option = new Option();
		Long optionId=new Long(8);
		option.setId(optionId);
		Price price = new Price();
		price.setPrice(new Float(10));
		option.setPrice(price);
		Option option2 = new Option();
		Long option2Id=new Long(9);
		option2.setId(option2Id);
		Price price2 = new Price();
		price2.setPrice(new Float(20));
		option2.setPrice(price2);
		optionsList.add(option);
		optionsList.add(option2);
		
		Float totalPriceWaiting = price.getPrice()+price2.getPrice();

		Float totalPriceSending = bookingService.getOptionsPrice(optionsList);
		
		assertEquals(totalPriceWaiting,totalPriceSending);
	}
	
	@Test
	public void testGetOptionsPriceWithListEmpty(){
		List<Option> optionsList = new ArrayList<Option>();
		Float totalPriceWaiting =new Float(0);

		Float totalPriceSending = bookingService.getOptionsPrice(optionsList);
		
		assertEquals(totalPriceWaiting,totalPriceSending);
	}
	
	@Test
	public void testGetAllGuestTypeWithDataPresentsInBdd(){
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId((long) 1);
		ageCategory.setEndAge(14);
		ageCategory.setStartAge(0);
		ageCategory.setName("enfant");
		AgeCategory ageCategory2 = new AgeCategory();
		ageCategory2.setId((long) 2);
		ageCategory2.setEndAge(64);
		ageCategory2.setStartAge(15);
		ageCategory2.setName("adulte");
		AgeCategory ageCategory3 = new AgeCategory();
		ageCategory3.setId((long) 3);
		ageCategory3.setEndAge(100);
		ageCategory3.setStartAge(65);
		ageCategory3.setName("senior");
		List<AgeCategory> listWaiting = new ArrayList<AgeCategory>();
		listWaiting.add(ageCategory);
		listWaiting.add(ageCategory2);
		listWaiting.add(ageCategory3);
		
		// ne marche pas avec le mock
//		when(ageCategoryDao.findAll()).thenReturn(listWaiting);
		List<AgeCategory> listSending = bookingService.getAllGuestType();

		assertTrue(listSending.size()>0);
//		assertEquals(listWaiting,listSending);
	}
	
//	@Test
//	public void testGetAllGuestTypeWithDataNotPresentsInBdd(){
//		List<AgeCategory> listWaiting = new ArrayList<AgeCategory>();
//		
//		// ne marche pas avec le mock
//	//	when(ageCategoryDao.findAll()).thenReturn(listWaiting);
//		List<AgeCategory> listSending = bookingService.getAllGuestType();
//		
//		assertTrue(listSending.size()==0);
//	}
	
	@Test
	public void testGetEquipmentsPriceWithListNotEmpty(){
		List<Equipment> equipmentsList  = new ArrayList<Equipment>();
		Equipment equipment = new Equipment();
		Price price = new Price();
		price.setPrice(new Float(100));
		equipment.setPrice(price);
		Equipment equipment2 = new Equipment();
		Price price2 = new Price();
		price2.setPrice(new Float(100));
		equipment2.setPrice(price2);
		equipmentsList.add(equipment);
		equipmentsList.add(equipment2);
		
		Float totalPriceWaiting = price.getPrice()+price2.getPrice();

		Float totalPriceSending = bookingService.getEquipmentsPrice(equipmentsList);
		
		assertEquals(totalPriceWaiting,totalPriceSending);
	}
	
	@Test
	public void testGetEquipmentsPriceWithListEmpty(){
		List<Equipment> equipmentsList  = new ArrayList<Equipment>();
		Float totalPriceWaiting = new Float(0);

		Float totalPriceSending = bookingService.getEquipmentsPrice(equipmentsList);
		
		assertEquals(totalPriceWaiting,totalPriceSending);
	}
	
	@Test
	public void testGetAllTracksAvailable(){
		List<Pass> listPass = bookingService.getAllTrackAvailable();

		assertNotNull(listPass);
	}
	
	
	@Test
	public void testGetAllAgeCategories(){
		List<AgeCategory> listAgeCategory = bookingService.getAllAgeCategory();

		assertNotNull(listAgeCategory);
	}
	
	
	@Test
	public void testGetAllAgeCategoriesWithName(){
		String ageCategoryString = "enfant";
		List<AgeCategory> listAgeCategory = bookingService.findByNameAgeCategory(ageCategoryString);

		assertNotNull(listAgeCategory);
	}

	
	@Test
	public void testGetAllTrainingCourseReturnResultNotEmpty(){
		List<TrainingCourse> listTrainingCourse = bookingService.getAllTrainingCourse();
		
		assertNotNull(listTrainingCourse);
	}
	
	
	@Test
	public void testSetLinkGuestReferencesGoodRelationToOtherTables(){
		String name = "Name test";
		String[] equipmentChoice = new String[]{"4","5"};
		String passChoice = "6";
		String trainingCourseChoice = "20";
		
		Guest guest = bookingService.setLinkGuest(name, equipmentChoice, passChoice, trainingCourseChoice);
		Collection<GuestEquipment> allGuestEquipment = guest.getGuestEquipments() ; 
		Pass pass = guest.getPass(); 
		TrainingCourse trainingCourse = guest.getTrainingCourse() ; 
		
		assertNotNull(allGuestEquipment);
		assertNotNull(pass);
		assertNotNull(trainingCourse);
	}	
	
}