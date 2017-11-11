package com.dreamit.proxystat.model.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Season;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.exceptions.EndDateBeforeStartDateException;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.exceptions.TimeframeAlreadyUseException;
import com.dreamit.proxystat.model.service.IAdministrationService;


/**
 * Proxystat Administration Service
 *
 * @author Melody MASCOT
 * @author Tarik DJEBIEN
 */
@Service(value = "administrationService")
@Transactional
public class AdministrationServiceImpl implements IAdministrationService{
	
	private static final int HISTORY_DEPTH_IN_YEARS = -3;

	@Autowired
	private IUserDAO userDAO;
	
	@Autowired
	private ISeasonDAO seasonDao;
	
	@Autowired
	private IPeriodDAO periodDAO;
	
	@Autowired
	private IPriceDAO priceDAO;
	
	@Autowired
	private IBookingDAO bookingDAO;
	
	@Autowired
	private IRatingDAO ratingDAO;
	
	@Autowired
	private IFlatDAO flatDAO;
	
	@Autowired
	private IFlatTypeDAO flatTypeDAO;
	
	@Autowired
	private IOptionDAO optionDAO;
	
	@Autowired
	private IPartnerUserDAO partnerUserDAO;
	
	@Autowired
	private IPartnerDAO partnerDAO;

	@Override
	public User createUser(User user) {
		return userDAO.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		return userDAO.findAll();
	}

	@Override
	public void deleteUser(User user) {
		userDAO.delete(user);
	}

	@Override
	public User findUserById(long id) {
		return userDAO.findById(id);
	}

	@Override
	public Season findSeasonById(Long id) {
		return seasonDao.findById(id);
	}
	
	@Override
	public Period findPeriodById(Long id) {
		return periodDAO.findById(id);
	}
	
	@Override
	public Price findPriceById(Long id) {
		return priceDAO.findById(id);
	}
	
	@Override
	public Flat findFlatById(Long id) {
		return flatDAO.findById(id);
	}
	
	@Override
	public FlatType findFlatTypeById(Long id) {
		return flatTypeDAO.findById(id);
	}
	
	@Override
	public Option findOptionById(Long id) {
		return optionDAO.findById(id);
	}

	@Override
	public PartnerUser findPartnerUserById(Long id) {
		return partnerUserDAO.findById(id);
	}

	@Override
	public Partner findPartnerById(Long id) {
		return partnerDAO.findById(id);
	}

	@Override
	public List<Season> findAllSeasons() {
		return seasonDao.findAll();
	}
	
	@Override
	public List<Period> findAllPeriods() {
		return periodDAO.findAll();
	}
	
	@Override
	public List<Price> findAllPrices() {
		return priceDAO.findAll();
	}
	
	@Override
	public List<Flat> findAllFlats() {
		return flatDAO.findAll();
	}
	
	@Override
	public List<FlatType> findAllFlatTypes() {
		return flatTypeDAO.findAll();
	}
	
	@Override
	public List<Option> findAllOptions() {
		return optionDAO.findAll();
	}

	@Override
	public List<PartnerUser> findAllPartnerUsers() {
		return partnerUserDAO.findAll();
	}

	@Override
	public List<Partner> findAllPartners() {
		return partnerDAO.findAll();
	}

	@Override
	public Season saveSeason(Season season) throws MissingRequiredInformationException, TimeframeAlreadyUseException, EndDateBeforeStartDateException {
		checkForNullSeason(season);
		checkForBadSeasonAttributes(season);
		checkSeasonDatesConsistency(season);
		
		return seasonDao.save(season);
	}
	
	@Override
	public Period savePeriod(Period period, boolean isAnUpdate) throws MissingRequiredInformationException, TimeframeAlreadyUseException, EndDateBeforeStartDateException {
		checkForNullPeriod(period);
		checkForBadPeriodAttributes(period);
		checkPeriodDatesConsistency(period, isAnUpdate);
		
		return periodDAO.save(period);
	}
	
	@Override
	public Price savePrice(Price newPrice, boolean isAnUpdate) throws MissingRequiredInformationException {
		checkForNullPrice(newPrice);
		checkForBadPriceAttributes(newPrice);
		
		return priceDAO.save(newPrice);
	}
	
	@Override
	public Flat saveFlat(Flat newFlat, boolean isAnUpdate) throws MissingRequiredInformationException {
		checkForNullFlat(newFlat);
		checkForBadFlatAttributes(newFlat);
		
		return flatDAO.save(newFlat);
	}
	
	@Override
	public FlatType saveFlatType(FlatType newFlatType, boolean isAnUpdate) throws MissingRequiredInformationException {
		checkForNullFlatType(newFlatType);
		checkForBadFlatTypeAttributes(newFlatType);
		
		return flatTypeDAO.save(newFlatType);
	}
	
	@Override
	public Option saveOption(Option newOption, boolean isAnUpdate)
			throws MissingRequiredInformationException {
		checkForNullOption(newOption);
		checkForBadOptionAttributes(newOption);
		
		return optionDAO.save(newOption);
	}

	@Override
	public PartnerUser savePartnerUser(PartnerUser newUser, boolean isAnUpdate)
			throws MissingRequiredInformationException {
		checkForNullPartnerUser(newUser);
		checkForBadPartnerUserAttributes(newUser);
		
		return partnerUserDAO.save(newUser);
	}

	@Override
	public Partner savePartner(Partner newPartner, boolean isAnUpdate)
			throws MissingRequiredInformationException {
		checkForNullPartner(newPartner);
		checkForBadPartnerAttributes(newPartner);
		
		return partnerDAO.save(newPartner);
	}
	
	private void checkForNullSeason(Season season) {
		if (season == null) {
			throw new IllegalArgumentException("season is null");
		}
	}
	
	private void checkForNullPeriod(Period period) {
		if (period == null) {
			throw new IllegalArgumentException("period is null");
		}
	}
	
	private void checkForNullPrice(Price priceToDelete) {
		if (priceToDelete == null) {
			throw new IllegalArgumentException("price is null");
		}
	}
	
	private void checkForNullFlat(Flat flatToDelete) {
		if (flatToDelete == null) {
			throw new IllegalArgumentException("flat is null");
		}
	}
	
	private void checkForNullFlatType(FlatType flatTypeToDelete) {
		if (flatTypeToDelete == null) {
			throw new IllegalArgumentException("flat type is null");
		}
	}
	
	private void checkForNullOption(Option optionToDelete) {
		if (optionToDelete == null) {
			throw new IllegalArgumentException("option is null");
		}
	}
	
	private void checkForNullPartnerUser(PartnerUser partnerUserToDelete) {
		if (partnerUserToDelete == null) {
			throw new IllegalArgumentException("partner user is null");
		}
	}
	
	private void checkForNullPartner(Partner partnerToDelete) {
		if (partnerToDelete == null) {
			throw new IllegalArgumentException("partner is null");
		}
	}
	
	private void checkForBadSeasonAttributes(Season season)
			throws MissingRequiredInformationException {
		if (season.getName() == null || season.getName().isEmpty()) {
			throw new MissingRequiredInformationException("name is null or empty");
		}
		if (season.getStartDate() == null) {
			throw new MissingRequiredInformationException("start date is null");
		}
		if (season.getEndDate() == null) {
			throw new MissingRequiredInformationException("end date is null");
		}
	}
	
	private void checkForBadPeriodAttributes(Period period)
			throws MissingRequiredInformationException {
		if (period.getName() == null || period.getName().isEmpty()) {
			throw new MissingRequiredInformationException("name is null or empty");
		}
		if (period.getStartDate() == null) {
			throw new MissingRequiredInformationException("start date is null");
		}
		if (period.getEndDate() == null) {
			throw new MissingRequiredInformationException("end date is null");
		}
	}
	
	private void checkForBadPriceAttributes(Price newPrice) 
			throws MissingRequiredInformationException {
		if (newPrice.getPrice() == null || newPrice.getPrice().isNaN()) {
			throw new MissingRequiredInformationException("price is null or not an number");
		}
		if (newPrice.getMargin() == null || newPrice.getMargin().isNaN()) {
			throw new MissingRequiredInformationException("margin is null or not an number");
		}
		if (newPrice.getDiscountPrice() == null || newPrice.getDiscountPrice().isNaN()) {
			throw new MissingRequiredInformationException("discount price is null or not an number");
		}
		if (newPrice.getTaxRate() == null || newPrice.getTaxRate().isNaN()) {
			throw new MissingRequiredInformationException("tax rate is null or not an number");
		}
		if (newPrice.getDiscounted() == null) {
			throw new MissingRequiredInformationException("discounted is null");
		}
	}
	
	private void checkForBadFlatAttributes(Flat newFlat) 
			throws MissingRequiredInformationException {
		if (newFlat.getRoomNumber() == null) {
			throw new MissingRequiredInformationException("room number is null");
		}
		if (newFlat.getFloor() == null) {
			throw new MissingRequiredInformationException("floor is null");
		}
		if (newFlat.getHandicapAccess() == null) {
			throw new MissingRequiredInformationException("handicap access is null");
		}
		if (newFlat.getStatus() == null) {
			throw new MissingRequiredInformationException("status is null");
		}
		if (newFlat.getAvalaible() == null) {
			throw new MissingRequiredInformationException("available is null");
		}
	}
	
	private void checkForBadFlatTypeAttributes(FlatType newFlatType) 
			throws MissingRequiredInformationException {
		if (newFlatType.getName() == null) {
			throw new MissingRequiredInformationException("name is null");
		}
		if (newFlatType.getDescription() == null) {
			throw new MissingRequiredInformationException("description is null");
		}
		if (newFlatType.getNumberOfBeds() == null || ((Float)Float.parseFloat(newFlatType.getNumberOfBeds().toString())).isNaN() ) {
			throw new MissingRequiredInformationException("number of beds is null or not an number");
		}
		if (newFlatType.getSize() == null || ((Float)Float.parseFloat(newFlatType.getSize().toString())).isNaN() ) {
			throw new MissingRequiredInformationException("size is null or not an number");
		}
	}
	
	private void checkForBadOptionAttributes(Option newOption) 
			throws MissingRequiredInformationException {
		if (newOption.getPerPerson() == null) {
			throw new MissingRequiredInformationException("per person is null");
		}
		if (newOption.getPricePercentage() == null || newOption.getPricePercentage().isNaN() ) {
			throw new MissingRequiredInformationException("price percentage is null or not an number");
		}
	}
	
	private void checkForBadPartnerUserAttributes(PartnerUser newPartnerUser) 
			throws MissingRequiredInformationException {
		if (newPartnerUser.getName() == null) {
			throw new MissingRequiredInformationException("name is null");
		}
		if (newPartnerUser.getSurname() == null) {
			throw new MissingRequiredInformationException("surname is null");
		}
		if (newPartnerUser.getJobtitle() == null) {
			throw new MissingRequiredInformationException("job title is null");
		}
	}
	
	private void checkForBadPartnerAttributes(Partner newPartner) 
			throws MissingRequiredInformationException {
		if (newPartner.getName() == null) {
			throw new MissingRequiredInformationException("name is null");
		}
		if (newPartner.getDescription() == null) {
			throw new MissingRequiredInformationException("description is null");
		}
	}
	
	

	private void checkSeasonDatesConsistency(Season season) throws EndDateBeforeStartDateException, TimeframeAlreadyUseException {
		checkNewSeasonDateConsistency(season);
		checkConsistencyWithinExistingSeasons(season);
	}
	
	private void checkPeriodDatesConsistency(Period period, boolean isAnUpdate) throws EndDateBeforeStartDateException, TimeframeAlreadyUseException {
		checkNewPeriodDateConsistency(period);
		checkConsistencyWithinExistingPeriods(period, isAnUpdate);
	}

	private void checkConsistencyWithinExistingSeasons(Season season)
			throws TimeframeAlreadyUseException {
		for (Season existingSeason : findAllSeasons()) {
			checkSeasonStartDateNotInExistingTimeframe(season, existingSeason);
			checkSeasonEndDateNotInExistingTimeframe(season, existingSeason);
		}
	}
	
	private void checkConsistencyWithinExistingPeriods(Period period, boolean isAnUpdate) 
			throws TimeframeAlreadyUseException {
		for (Period existingPeriod : findAllPeriods()) {
			if(isAnUpdate && existingPeriod.getId().equals(period.getId())){
				continue;
			}
			checkPeriodStartDateNotInExistingTimeframe(period, existingPeriod);
			checkPeriodEndDateNotInExistingTimeframe(period, existingPeriod);
		}
	}

	private void checkSeasonEndDateNotInExistingTimeframe(Season season,
			Season existingSeason) throws TimeframeAlreadyUseException {
		if (season.getEndDate().before(existingSeason.getEndDate()) && season.getEndDate().after(existingSeason.getStartDate())) {
			throw new TimeframeAlreadyUseException();
		}
	}
	
	private void checkPeriodEndDateNotInExistingTimeframe(Period period,
			Period existingPeriod) throws TimeframeAlreadyUseException {
		if (period.getEndDate().before(existingPeriod.getEndDate()) && period.getEndDate().after(existingPeriod.getStartDate())) {
			throw new TimeframeAlreadyUseException();
		}
	}

	private void checkSeasonStartDateNotInExistingTimeframe(Season season,
			Season existingSeason) throws TimeframeAlreadyUseException {
		if (season.getStartDate().after(existingSeason.getStartDate()) && season.getStartDate().before(existingSeason.getEndDate())) {
			throw new TimeframeAlreadyUseException();
		}
	}
	
	private void checkPeriodStartDateNotInExistingTimeframe(Period period,
			Period existingPeriod) throws TimeframeAlreadyUseException {
		if (period.getStartDate().after(existingPeriod.getStartDate()) && period.getStartDate().before(existingPeriod.getEndDate())) {
			throw new TimeframeAlreadyUseException();
		}
	}

	private void checkNewSeasonDateConsistency(Season season)
			throws EndDateBeforeStartDateException {
		if (season.getEndDate().before(season.getStartDate())) {
			throw new EndDateBeforeStartDateException();
		}
	}
	
	private void checkNewPeriodDateConsistency(Period period) 
			throws EndDateBeforeStartDateException {
		if (period.getEndDate().before(period.getStartDate())) {
			throw new EndDateBeforeStartDateException();
		}
	}

	@Override
	public void deleteSeason(Season season) {
		checkForNullSeason(season);
		
		seasonDao.delete(season);
	}
	
	@Override
	public void deletePeriod(Period periodToDelete) {
		checkForNullPeriod(periodToDelete);
		
		periodDAO.delete(periodToDelete);
	}

	@Override
	public void deletePrice(Price priceToDelete) {
		checkForNullPrice(priceToDelete);
		
		priceDAO.delete(priceToDelete);
	}
	
	@Override
	public void deleteFlat(Flat flatToDelete) {
		checkForNullFlat(flatToDelete);
		
		flatDAO.delete(flatToDelete);
	}
	
	@Override
	public void deleteFlatType(FlatType flatTypeToDelete) {
		checkForNullFlatType(flatTypeToDelete);
		
		flatTypeDAO.delete(flatTypeToDelete);
	}
	
	@Override
	public void deleteOption(Option optionToDelete) {
		checkForNullOption(optionToDelete);
		
		optionDAO.delete(optionToDelete);
	}

	@Override
	public void deletePartnerUser(PartnerUser partnerUserToDelete) {
		checkForNullPartnerUser(partnerUserToDelete);
		
		partnerUserDAO.delete(partnerUserToDelete);
	}

	@Override
	public void deletePartner(Partner partnerToDelete) {
		checkForNullPartner(partnerToDelete);
		
		partnerDAO.delete(partnerToDelete);
	}

	@Override
	public void purgeData() {
		Date purgeDate = definePurgeDate();
		
		purgeBookings(purgeDate);
		
		purgeRatings(purgeDate);
	}
	
	private Date definePurgeDate() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.YEAR, HISTORY_DEPTH_IN_YEARS);
		return cal.getTime();
	}
	
	private void purgeBookings(Date purgeDate) {
		for (Booking booking : bookingDAO.findAll()) {
			if (isDateAfterHistoryDepth(booking.getBookingDate(), purgeDate)) {
					bookingDAO.delete(booking);
			}
		}
	}

	private void purgeRatings(Date purgeDate) {
		for (Rating rating : ratingDAO.findAll()) {
			if (isDateAfterHistoryDepth(rating.getDate(), purgeDate)) {
				ratingDAO.delete(rating);
			}
		}
	}

	private boolean isDateAfterHistoryDepth(Date date, Date purgeDate) {
		return date.before(purgeDate);
	}

}
