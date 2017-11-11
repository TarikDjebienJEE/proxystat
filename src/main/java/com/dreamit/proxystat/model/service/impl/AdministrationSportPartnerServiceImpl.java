package com.dreamit.proxystat.model.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.ICategoryDAO;
import com.dreamit.proxystat.model.dao.IEquipmentDAO;
import com.dreamit.proxystat.model.dao.IGuestEquipmentDAO;
import com.dreamit.proxystat.model.dao.ISportPartnerDAO;
import com.dreamit.proxystat.model.dto.SportPartnerListing;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.IAdministrationSportPartnerService;

@Service(value = "administrationSportPartnerService")
@Transactional
public class AdministrationSportPartnerServiceImpl implements IAdministrationSportPartnerService {

	private static final int NEXT_WEEK_DAY_COUNTER = 7;

	@Autowired
	private ICategoryDAO categoryDao;
	
	@Autowired
	private IEquipmentDAO equipmentDao;
	
	@Autowired
	private ISportPartnerDAO sportPartnerDao;
	
	@Autowired
	private IBookingDAO bookingDao;
	
	@Autowired
	private IGuestEquipmentDAO guestEquipmentDao;
	
	@Override
	public Category saveEquipmentCategory(Category category) throws MissingRequiredInformationException {
		checkCategoryValidity(category);
		
		return categoryDao.save(category);
	}

	@Override
	public void deleteEquipmentCategory(Category category) throws MissingRequiredInformationException {
		checkCategoryValidity(category);
		
		categoryDao.delete(category);
	}

	@Override
	public List<Category> findAllCategory() {
		return categoryDao.findAll();
	}
	
	@Override
	public Category findCategoryById(Long id) {
		return categoryDao.findById(id);
	}
	
	private void checkCategoryValidity(Category category)
			throws MissingRequiredInformationException {
		if (category == null) {
			throw new IllegalArgumentException();
		}
		
		String name = category.getName();
		checkForNullOrEmptyString(name);

		String description = category.getDescription();
		checkForNullOrEmptyString(description);

	}

	@Override
	public Equipment saveEquipment(Equipment equipment) throws MissingRequiredInformationException {
		checkForNull(equipment);
		
		String name = equipment.getService().getName();
		checkForNullOrEmptyString(name);
		
		String description = equipment.getService().getDescription();
		checkForNullOrEmptyString(description);
		
		setIntegerValuesToZeroIfNullOrLowerThanZero(equipment);
		
		return equipmentDao.save(equipment);
	}

	private void checkForNull(Equipment equipment) throws MissingRequiredInformationException {
		if (equipment == null) {
			throw new IllegalArgumentException();
		}
		if (equipment.getService() == null) {
			throw new MissingRequiredInformationException("object is null");
		}
	}
	
	private void checkForNullOrEmptyString(String value)
			throws MissingRequiredInformationException {
		if (value == null || value.isEmpty()) {
			throw new MissingRequiredInformationException("name or description is null or empty");
		}
	}

	private void setIntegerValuesToZeroIfNullOrLowerThanZero(Equipment equipment) {
		checkStockQuantity(equipment);
		checkMinimumHeight(equipment);
	}

	private void checkMinimumHeight(Equipment equipment) {
		if (equipment.getMinimumHeight() == null) {
			setDefaultEquipmentMinimumHeight(equipment);
		}
		if (equipment.getMinimumHeight() < 0) {
			setDefaultEquipmentMinimumHeight(equipment);
		}
	}

	private void checkStockQuantity(Equipment equipment) {
		if (equipment.getStockQuantity() == null) {
			setDefaultEquipmentStockQuantity(equipment);
		}
		if (equipment.getStockQuantity() < 0) {
			setDefaultEquipmentStockQuantity(equipment);
		}
	}
	
	private void setDefaultEquipmentStockQuantity(Equipment e) {
		e.setStockQuantity(0);
	}
	
	private void setDefaultEquipmentMinimumHeight(Equipment e) {
		e.setMinimumHeight(0);
	}

	@Override
	public void deleteEquipment(Equipment e) {
		equipmentDao.delete(e);
	}

	@Override
	public List<Equipment> findAllEquipment() {
		return equipmentDao.findAll();
	}

	@Override
	public Equipment findEquipmentById(Long id) {
		return equipmentDao.findById(id);
	}

	@Override
	public List<SportPartnerListing> getSportPartnerListingBetween(
			Date startDate, Date endDate) {
		if (startDate == null) {
			getSportPartnerListingTo(endDate);
		}
		if (endDate == null) {
			getSportPartnerListingFrom(startDate);
		}
		
		return sportPartnerDao.getSportPartnerListingBetween(startDate, endDate);
	}

	@Override
	public List<SportPartnerListing> getSportPartnerListingFrom(Date startDate) {
		Date currentDate = new Date();
		
		return sportPartnerDao.getSportPartnerListingBetween(startDate, currentDate); 
	}

	@Override
	public List<SportPartnerListing> getSportPartnerListingTo(Date endDate) {
		Date currentDate = new Date();
		
		return sportPartnerDao.getSportPartnerListingBetween(currentDate, endDate); 
	}

	@Override
	public List<SportPartnerListing> getSportPartnerListingForComingWeek() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, NEXT_WEEK_DAY_COUNTER);
		Date nextWeekDate = cal.getTime();
		Date currentDate = new Date();
		
		return sportPartnerDao.getSportPartnerListingBetween(currentDate, nextWeekDate);
	}

	@Override
	public Booking saveBooking(Booking booking) {
		return bookingDao.save(booking);
	}

	@Override
	public Booking findBookingById(Long id) {
		return bookingDao.findById(id);
	}

	@Override
	public List<Booking> findAllBookings() {
		return bookingDao.findAll();
	}

	@Override
	public GuestEquipment saveGuestEquipment(GuestEquipment equipment) {
		return guestEquipmentDao.save(equipment);
	}

	@Override
	public GuestEquipment findGuestEquipmentById(Long id) {
		return guestEquipmentDao.findById(id);
	}

}
