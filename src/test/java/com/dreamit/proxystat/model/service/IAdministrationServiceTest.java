package com.dreamit.proxystat.model.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.never;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.IFlatDAO;
import com.dreamit.proxystat.model.dao.IFlatTypeDAO;
import com.dreamit.proxystat.model.dao.IOptionDAO;
import com.dreamit.proxystat.model.dao.IPartnerDAO;
import com.dreamit.proxystat.model.dao.IPartnerUserDAO;
import com.dreamit.proxystat.model.dao.IPeriodDAO;
import com.dreamit.proxystat.model.dao.IPriceDAO;
import com.dreamit.proxystat.model.dao.IRatingDAO;
import com.dreamit.proxystat.model.dao.ISeasonDAO;
import com.dreamit.proxystat.model.dao.IUserDAO;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.HolidayPeriod;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Season;
import com.dreamit.proxystat.model.entities.SportPartner;
import com.dreamit.proxystat.model.entities.StandardPeriod;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.exceptions.EndDateBeforeStartDateException;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.exceptions.TimeframeAlreadyUseException;
import com.dreamit.proxystat.model.service.impl.AdministrationServiceImpl;

/**
 * admin sport test class
 * @author acraske
 * @author tarik DJEBIEN
 */
@RunWith(MockitoJUnitRunner.class)
public class IAdministrationServiceTest {
	
	@InjectMocks 
	private AdministrationServiceImpl service;
	
	@Mock
	private IUserDAO userDao;
	
	@Mock
	private ISeasonDAO seasonDao;
	
	@Mock
	private IPeriodDAO periodDAO;
	
	@Mock
	private IPriceDAO priceDAO;
	
	@Mock
	private IBookingDAO bookingDAO;
	
	@Mock
	private IRatingDAO ratingDAO;
	
	@Mock
	private IFlatDAO flatDAO;
	
	@Mock
	private IFlatTypeDAO flatTypeDAO;
	
	@Mock
	private IOptionDAO optionDAO;
	
	@Mock
	private IPartnerDAO partnerDAO;
	
	@Mock
	private IPartnerUserDAO partnerUserDAO;
	
	@Mock
	private IUserDAO userDAO;

	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullSeasonThrowsException() throws Exception {
		Season season = null;
		
		service.saveSeason(season);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullPeriodThrowsException() throws Exception {
		Period period = null;
		
		service.savePeriod(period,false);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullFlatThrowsException() throws Exception {
		Flat flat = null;
		
		service.saveFlat(flat, false);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullFlatTypeThrowsException() throws Exception {
		FlatType flatType = null;
		
		service.saveFlatType(flatType, false);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullOptionThrowsException() throws Exception {
		Option option = null;
		
		service.saveOption(option, false);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullPartnerThrowsException() throws Exception {
		Partner partner = null;
		
		service.savePartner(partner, false);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullPartnerUserThrowsException() throws Exception {
		PartnerUser partnerUser = null;
		
		service.savePartnerUser(partnerUser, false);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaveNullPriceThrowsException() throws Exception {
		Price price = null;
		
		service.savePrice(price, false);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullPeriodThrowsException() throws Exception {
		Period period = null;
		
		service.savePeriod(period,true);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullPriceThrowsException() throws Exception {
		Price price = null;
		
		service.savePrice(price,true);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullFlatThrowsException() throws Exception {
		Flat flat = null;
		
		service.saveFlat(flat,true);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullFlatTypeThrowsException() throws Exception {
		FlatType flatType = null;
		
		service.saveFlatType(flatType,true);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullOptionThrowsException() throws Exception {
		Option option = null;
		
		service.saveOption(option,true);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullPartnerThrowsException() throws Exception {
		Partner partner = null;
		
		service.savePartner(partner,true);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUpdateNullPartnerUserThrowsException() throws Exception {
		PartnerUser partnerUser = null;
		
		service.savePartnerUser(partnerUser, true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullSeasonThrowsException() throws Exception {
		Season season = null;
		
		service.deleteSeason(season);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullPeriodThrowsException() throws Exception {
		Period period = null;
		
		service.deletePeriod(period);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullFlatThrowsException() throws Exception {
		Flat flat = null;
		
		service.deleteFlat(flat);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullFlatTypeThrowsException() throws Exception {
		FlatType flatType = null;
		
		service.deleteFlatType(flatType);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullOptionThrowsException() throws Exception {
		Option option = null;
		
		service.deleteOption(option);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullPartnerThrowsException() throws Exception {
		Partner partner = null;
		
		service.deletePartner(partner);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullPartnerUserThrowsException() throws Exception {
		PartnerUser partnerUser = null;
		
		service.deletePartnerUser(partnerUser);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteNullPriceThrowsException() throws Exception {
		Price price = null;
		
		service.deletePrice(price);
	}

	@Test
	public void testFindSeasonByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findSeasonById(id);
		
		verify(seasonDao).findById(id);
	}
	
	@Test
	public void testFindPeriodByIdCallPersistenceLayer() {
		Long id = new Long(2);
		
		service.findPeriodById(id);
		
		verify(periodDAO).findById(id);
	}
	
	@Test
	public void testFindFlatByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findFlatById(id);
		
		verify(flatDAO).findById(id);
	}
	
	@Test
	public void testFindFlatTypeByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findFlatTypeById(id);
		
		verify(flatTypeDAO).findById(id);
	}
	
	@Test
	public void testFindOptionByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findOptionById(id);
		
		verify(optionDAO).findById(id);
	}
	
	@Test
	public void testFindPriceByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findPriceById(id);
		
		verify(priceDAO).findById(id);
	}
	
	@Test
	public void testFindPartnerByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findPartnerById(id);
		
		verify(partnerDAO).findById(id);
	}
	
	@Test
	public void testFindPartnerUserByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findPartnerUserById(id);
		
		verify(partnerUserDAO).findById(id);
	}
	
	@Test
	public void testFindAllSeasonCallPersistenceLayer() {
		
		service.findAllSeasons();
		
		verify(seasonDao).findAll();
	}
	
	@Test
	public void testFindAllPeriodsCallPersistenceLayer() {
		
		service.findAllPeriods();
		
		verify(periodDAO).findAll();
	}
	
	@Test
	public void testFindAllFlatsCallPersistenceLayer() {
		
		service.findAllFlats();
		
		verify(flatDAO).findAll();
	}
	
	@Test
	public void testFindAllFlatTypesCallPersistenceLayer() {
		
		service.findAllFlatTypes();
		
		verify(flatTypeDAO).findAll();
	}
	
	@Test
	public void testFindAllOptionsCallPersistenceLayer() {
		
		service.findAllOptions();
		
		verify(optionDAO).findAll();
	}
	
	@Test
	public void testFindAllPartnersCallPersistenceLayer() {
		
		service.findAllPartners();
		
		verify(partnerDAO).findAll();
	}
	
	@Test
	public void testFindAllPartnerUsersCallPersistenceLayer() {
		
		service.findAllPartnerUsers();
		
		verify(partnerUserDAO).findAll();
	}
	
	@Test
	public void testFindAllPricesCallPersistenceLayer() {
		
		service.findAllPrices();
		
		verify(priceDAO).findAll();
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveSeasonWithoutAttributesThrowsException() throws Exception {
		Season season = new Season();
		
		service.saveSeason(season);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveStandardPeriodWithoutAttributesThrowsException() throws Exception {
		Period standardPeriod = new StandardPeriod();
		
		service.savePeriod(standardPeriod, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveHolidayPeriodWithoutAttributesThrowsException() throws Exception {
		Period holidayPeriod = new HolidayPeriod();
		
		service.savePeriod(holidayPeriod, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSavePriceWithoutAttributesThrowsException() throws Exception {
		Price price = new Price();
		
		service.savePrice(price, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveFlatWithoutAttributesThrowsException() throws Exception {
		Flat flat = new Flat();
		
		service.saveFlat(flat, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveFlatTypeWithoutAttributesThrowsException() throws Exception {
		FlatType flatType = new FlatType();
		
		service.saveFlatType(flatType, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveMechanicPartnerWithoutAttributesThrowsException() throws Exception {
		MechanicPartner mechanicPartner = new MechanicPartner();
		
		service.savePartner(mechanicPartner, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveSportPartnerWithoutAttributesThrowsException() throws Exception {
		SportPartner sportPartner = new SportPartner();
		
		service.savePartner(sportPartner, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSaveTrainingPartnerWithoutAttributesThrowsException() throws Exception {
		TrainingPartner trainingPartner = new TrainingPartner();
		
		service.savePartner(trainingPartner, false);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testSavePartnerUserWithoutAttributesThrowsException() throws Exception {
		PartnerUser userPartner = new PartnerUser();
		
		service.savePartnerUser(userPartner, false);
		
	}
	
	@Test
	public void testSaveSeasonCallPersistenceLayer() throws Exception {
		Season season = new Season();
		season.setName("test");
		season.setStartDate(new Date());
		season.setEndDate(new Date());
		
		service.saveSeason(season);
		
		verify(seasonDao).save(season);
	}
	
	@Test
	public void testCreateFlatCallPersistenceLayer() throws Exception {
		Flat expected = new Flat();
		String roomNumber = "23";
		String floor = "2";
		Boolean handicapAccess = true;
		String status = "status";
		Boolean avalaible = true;
		expected.setRoomNumber(roomNumber);
		expected.setFloor(floor);
		expected.setHandicapAccess(handicapAccess );
		expected.setStatus(status);
		expected.setAvalaible(avalaible );
		
		service.saveFlat(expected, false);
		
		verify(flatDAO).save(expected);
	}
	
	@Test
	public void testUpdateFlatCallPersistenceLayer() throws Exception {
		Flat expected = new Flat();
		String roomNumber = "23";
		String floor = "2";
		Boolean handicapAccess = true;
		String status = "status";
		Boolean avalaible = true;
		expected.setRoomNumber(roomNumber);
		expected.setFloor(floor);
		expected.setHandicapAccess(handicapAccess );
		expected.setStatus(status);
		expected.setAvalaible(avalaible );
		
		service.saveFlat(expected, true);
		
		verify(flatDAO).save(expected);
	}
	
	@Test
	public void testCreatePeriodCallPersistenceLayer() throws Exception {
		Period period = new StandardPeriod();
		period.setName("test standard period");
		period.setStartDate(new Date());
		period.setEndDate(new Date());
		
		service.savePeriod(period, false);
		
		verify(periodDAO).save(period);
	}
	
	@Test
	public void testUpdatePeriodCallPersistenceLayer() throws Exception {
		Period period = new HolidayPeriod();
		period.setName("test holiday period");
		period.setStartDate(new Date());
		period.setEndDate(new Date());
		
		service.savePeriod(period, true);
		
		verify(periodDAO).save(period);
	}
	
	@Test
	public void testCreateFlatTypeCallPersistenceLayer() throws Exception {
		FlatType expected = new FlatType();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description);
		Integer numberOfBeds = 2;
		expected.setNumberOfBeds(numberOfBeds);
		Integer size = 64;
		expected.setSize(size);
		
		service.saveFlatType(expected, false);
		
		verify(flatTypeDAO).save(expected);
	}
	
	@Test
	public void testUpdateFlatTypeCallPersistenceLayer() throws Exception {
		FlatType expected = new FlatType();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description);
		Integer numberOfBeds = 2;
		expected.setNumberOfBeds(numberOfBeds);
		Integer size = 64;
		expected.setSize(size);
		
		service.saveFlatType(expected, true);
		
		verify(flatTypeDAO).save(expected);
	}
	
	@Test
	public void testCreateOptionCallPersistenceLayer() throws Exception {
		Option expected = new Option();
		Boolean perPerson = true;
		expected.setPerPerson(perPerson);
		Float pricePercentage = new Float(34.0);
		expected.setPricePercentage(pricePercentage);
		
		service.saveOption(expected, false);
		
		verify(optionDAO).save(expected);
	}
	
	@Test
	public void testUpdateOptionCallPersistenceLayer() throws Exception {
		Option expected = new Option();
		Boolean perPerson = true;
		expected.setPerPerson(perPerson);
		Float pricePercentage = new Float(34.0);
		expected.setPricePercentage(pricePercentage);
		
		service.saveOption(expected, true);
		
		verify(optionDAO).save(expected);
	}
	
	@Test
	public void testCreatePartnerMechanicCallPersistenceLayer() throws Exception {
		MechanicPartner expected = new MechanicPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		service.savePartner(expected, false);
		
		verify(partnerDAO).save(expected);
	}
	
	@Test
	public void testUpdatePartnerMechanicCallPersistenceLayer() throws Exception {
		MechanicPartner expected = new MechanicPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		service.savePartner(expected, true);
		
		verify(partnerDAO).save(expected);
	}
	
	@Test
	public void testCreatePartnerSportCallPersistenceLayer() throws Exception {
		SportPartner expected = new SportPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		service.savePartner(expected, false);
		
		verify(partnerDAO).save(expected);
	}
	
	@Test
	public void testUpdatePartnerSportCallPersistenceLayer() throws Exception {
		SportPartner expected = new SportPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		service.savePartner(expected, true);
		
		verify(partnerDAO).save(expected);
	}
	
	@Test
	public void testCreatePartnerTrainingCallPersistenceLayer() throws Exception {
		TrainingPartner expected = new TrainingPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		service.savePartner(expected, false);
		
		verify(partnerDAO).save(expected);
	}
	
	@Test
	public void testUpdatePartnerTrainingCallPersistenceLayer() throws Exception {
		TrainingPartner expected = new TrainingPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		service.savePartner(expected, true);
		
		verify(partnerDAO).save(expected);
	}
	
	@Test
	public void testCreatePartnerUserCallPersistenceLayer() throws Exception {
		PartnerUser expected = new PartnerUser();
		String name = "name";
		expected.setName(name);
		String surname = "surname";
		expected.setSurname(surname);
		String jobtitle = "jobtitle";
		expected.setJobtitle(jobtitle);
		User user = null;
		expected.setUser(user);
		
		service.savePartnerUser(expected, false);
		
		verify(partnerUserDAO).save(expected);
	}
	
	@Test
	public void testUpdatePartnerUserCallPersistenceLayer() throws Exception {
		PartnerUser expected = new PartnerUser();
		String name = "name";
		expected.setName(name);
		String surname = "surname";
		expected.setSurname(surname);
		String jobtitle = "jobtitle";
		expected.setJobtitle(jobtitle);
		User user = null;
		expected.setUser(user);
		
		service.savePartnerUser(expected, true);
		
		verify(partnerUserDAO).save(expected);
	}
	
	@Test
	public void testDeleteSeasonCallPersistenceLayer() {
		Season season = new Season();
		
		service.deleteSeason(season);
		
		verify(seasonDao).delete(season);
	}
	
	@Test
	public void testDeletePeriodCallPersistenceLayer() {
		Period period = new HolidayPeriod();
		
		service.deletePeriod(period);
		
		verify(periodDAO).delete(period);
	}
	
	@Test
	public void testDeleteFlatCallPersistenceLayer() {
		Flat flat = new Flat();
		
		service.deleteFlat(flat);
		
		verify(flatDAO).delete(flat);
	}
	
	@Test
	public void testDeleteFlatTypeCallPersistenceLayer() {
		FlatType flatType = new FlatType();
		
		service.deleteFlatType(flatType);
		
		verify(flatTypeDAO).delete(flatType);
	}
	
	@Test
	public void testDeleteOptionCallPersistenceLayer() {
		Option option = new Option();
		
		service.deleteOption(option);
		
		verify(optionDAO).delete(option);
	}
	
	@Test
	public void testDeletePartnerMechanicCallPersistenceLayer() {
		Partner partner = new MechanicPartner();
		
		service.deletePartner(partner);
		
		verify(partnerDAO).delete(partner);
	}
	
	@Test
	public void testDeletePartnerSportCallPersistenceLayer() {
		Partner partner = new SportPartner();
		
		service.deletePartner(partner);
		
		verify(partnerDAO).delete(partner);
	}
	
	@Test
	public void testDeletePartnerTrainingCallPersistenceLayer() {
		Partner partner = new TrainingPartner();
		
		service.deletePartner(partner);
		
		verify(partnerDAO).delete(partner);
	}
	
	@Test
	public void testDeletePartnerUserCallPersistenceLayer() {
		PartnerUser partnerUser = new PartnerUser();
		
		service.deletePartnerUser(partnerUser);
		
		verify(partnerUserDAO).delete(partnerUser);
	}
	
	@Test
	public void testDeletePriceCallPersistenceLayer() {
		Price price = new Price();
		
		service.deletePrice(price);
		
		verify(priceDAO).delete(price);
	}
	
	@Test
	public void testDeleteUserCallPersistenceLayer() {
		User user = new User();
		
		service.deleteUser(user);
		
		verify(userDAO).delete(user);
	}
	
	@Test(expected=EndDateBeforeStartDateException.class)
	public void testSaveSeasonWithEndDateBeforeStartDateThrowsException() throws Exception {
		Season season = createSeasonWithStartAndEndDelays(0, -1);
		
		service.saveSeason(season);
		
	}
	
	@Test(expected=EndDateBeforeStartDateException.class)
	public void testSavePeriodWithEndDateBeforeStartDateThrowsException() throws Exception {
		Period period = createPeriodWithStartAndEndDelays(0, -1);
		
		service.savePeriod(period, false);
		
	}
	
	@Test(expected=TimeframeAlreadyUseException.class)
	public void testSaveSeasonWithStartDateInExistingSeasonThrowsException() throws Exception {
		Season season 			= createSeasonWithStartAndEndDelays(0, 14);
		Season existingSeason 	= createSeasonWithStartAndEndDelays(-7, 7);
		arrangeFindAllToReturnExistingSeason(existingSeason);
		
		service.saveSeason(season);
		
	}
	
	@Test(expected=TimeframeAlreadyUseException.class)
	public void testSavePeriodWithStartDateInExistingPeriodThrowsException() throws Exception {
		Period period 			= createPeriodWithStartAndEndDelays(0, 14);
		Period existingPeriod 	= createPeriodWithStartAndEndDelays(-7, 7);
		arrangeFindAllToReturnExistingPeriod(existingPeriod);
		
		service.savePeriod(period, false);
		
	}

	@Test(expected=TimeframeAlreadyUseException.class)
	public void testSaveSeasonWithEndDateInExistingSeasonThrowsException() throws Exception {
		Season season 			= createSeasonWithStartAndEndDelays(-14, 0);
		Season existingSeason 	= createSeasonWithStartAndEndDelays(-7, 7);
		arrangeFindAllToReturnExistingSeason(existingSeason);
		
		service.saveSeason(season);
		
	}
	
	@Test(expected=TimeframeAlreadyUseException.class)
	public void testSavePeriodWithEndDateInExistingPeriodThrowsException() throws Exception {
		Period period 			= createPeriodWithStartAndEndDelays(-14, 0);
		Period existingPeriod 	= createPeriodWithStartAndEndDelays(-7, 7);
		arrangeFindAllToReturnExistingPeriod(existingPeriod);
		
		service.savePeriod(period, false);
		
	}
	
	@Test
	public void testDontPurgeBookingWithLessThanThreeYearsOfHistory() {
		Booking booking = buildBookingWithDate(new Date());
		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(booking);
		when(bookingDAO.findAll()).thenReturn(bookings);
		
		service.purgeData();
		
		verify(bookingDAO, never()).delete(booking);
	}
	
	@Test
	public void testPurgeBookingWithMoreThanThreeYearsOfHistory() {
		Booking booking = buildOutOfHistoryBooking();
		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(booking);
		when(bookingDAO.findAll()).thenReturn(bookings);
		
		service.purgeData();
		
		verify(bookingDAO).delete(booking);
	}
	
	@Test
	public void testPurgeTwoBookingsWithMoreThanThreeYearsOfHistory() {
		Booking booking = buildOutOfHistoryBooking();
		Booking secondBooking = buildOutOfHistoryBooking();
		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(booking);
		bookings.add(secondBooking);
		when(bookingDAO.findAll()).thenReturn(bookings);
		
		service.purgeData();
		
		verify(bookingDAO).delete(booking);
		verify(bookingDAO).delete(secondBooking);
	}
	
	@Test
	public void testDontPurgeRatingWithLessThanThreeYearsOfHistory() {
		Rating rating = buildRatingWithDate(new Date());
		List<Rating> ratings = new ArrayList<Rating>();
		ratings.add(rating);
		when(ratingDAO.findAll()).thenReturn(ratings);
		
		service.purgeData();
		
		verify(ratingDAO, never()).delete(rating);
	}
	
	@Test
	public void testPurgeRatingWithMoreThanThreeYearsOfHistory() {
		Rating rating = buildOutOfHistoryRating();
		List<Rating> ratings = new ArrayList<Rating>();
		ratings.add(rating);
		when(ratingDAO.findAll()).thenReturn(ratings);
		
		service.purgeData();
		
		verify(ratingDAO).delete(rating);
	}
	
	@Test
	public void testPurgeTwoRatingWithMoreThanThreeYearsOfHistory() {
		Rating rating = buildOutOfHistoryRating();
		Rating secondRating = buildOutOfHistoryRating();
		List<Rating> ratings = new ArrayList<Rating>();
		ratings.add(rating);
		ratings.add(secondRating);
		when(ratingDAO.findAll()).thenReturn(ratings);
		
		service.purgeData();
		
		verify(ratingDAO).delete(rating);
		verify(ratingDAO).delete(secondRating);
	}
	
	private Date createDateWithDaysDelayFromToday(int daysDelay) {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, daysDelay);

		return cal.getTime();
	}
	
	private Season createSeasonWithStartAndEndDelays(int startDaysDelay, int endDaysDelay) {
		Season season = new Season();
		season.setName("test");
		season.setStartDate(createDateWithDaysDelayFromToday( startDaysDelay ));
		season.setEndDate(createDateWithDaysDelayFromToday( endDaysDelay ));
		
		return season;
	}
	
	private Period createPeriodWithStartAndEndDelays(int startDaysDelay, int endDaysDelay) {
		Period period = new HolidayPeriod();
		period.setName("test");
		period.setStartDate(createDateWithDaysDelayFromToday( startDaysDelay ));
		period.setEndDate(createDateWithDaysDelayFromToday( endDaysDelay ));
		
		return period;
	}
	
	private void arrangeFindAllToReturnExistingSeason(Season existingSeason) {
		List<Season> seasons = new ArrayList<Season>();
		seasons.add(existingSeason);
		when(seasonDao.findAll()).thenReturn(seasons);
	}
	
	private void arrangeFindAllToReturnExistingPeriod(Period existingPeriod) {
		List<Period> periods = new ArrayList<Period>();
		periods.add(existingPeriod);
		when(periodDAO.findAll()).thenReturn(periods);
	}
	
	private Booking buildOutOfHistoryBooking() {
		return buildBookingWithDate(buildDateAfterHistoryLimit());
	}
	
	private Booking buildBookingWithDate(Date date) {
		Booking booking = new Booking();
		booking.setBookingDate(date);
		
		return booking;
	}
	
	private Rating buildOutOfHistoryRating() {
		return buildRatingWithDate(buildDateAfterHistoryLimit());
	}
	
	private Rating buildRatingWithDate(Date date) {
		Rating rating = new Rating();
		rating.setDate(date);
		
		return rating;
	}
	
	private Date buildDateAfterHistoryLimit() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.YEAR, -4);
		
		return cal.getTime();
	}
	
}
