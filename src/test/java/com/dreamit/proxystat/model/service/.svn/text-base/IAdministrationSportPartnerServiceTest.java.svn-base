package com.dreamit.proxystat.model.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.ICategoryDAO;
import com.dreamit.proxystat.model.dao.IEquipmentDAO;
import com.dreamit.proxystat.model.dao.IGuestEquipmentDAO;
import com.dreamit.proxystat.model.dao.ISportPartnerDAO;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.impl.AdministrationSportPartnerServiceImpl;

/**
 * admin sport test class
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IAdministrationSportPartnerServiceTest {
	
	@InjectMocks 
	private AdministrationSportPartnerServiceImpl service;
	
	@Mock
	private ICategoryDAO categoryDao;
	
	@Mock
	private IEquipmentDAO equipmentDao;
	
	@Mock
	private ISportPartnerDAO sportPartnerDao;
	
	@Mock
	private IBookingDAO bookingDao;
	
	@Mock
	private IGuestEquipmentDAO guestEquipmentDao;
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotSaveEquipmentCategoryWithNullCategory() throws MissingRequiredInformationException {
		
		service.saveEquipmentCategory(null);

	}

	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentCategoryWithNullName() throws MissingRequiredInformationException {
		Category category = createCategoryWithNullName();
		
		service.saveEquipmentCategory(category);

	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentCategoryWithEmptyName() throws MissingRequiredInformationException {
		Category category = createCategoryWithEmptyName();
		
		service.saveEquipmentCategory(category);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentCategoryWithNullDescription() throws MissingRequiredInformationException {
		Category category = createCategoryWithNullDescription();
		
		service.saveEquipmentCategory(category);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentCategoryWithEmptyDescription() throws MissingRequiredInformationException {
		Category category = createCategoryWithEmptyDescription();
		
		service.saveEquipmentCategory(category);
	}
	
	@Test
	public void testSaveEquipmentCategoryCallPersistenceLayer() throws MissingRequiredInformationException {
		Category category = createCorrectCategory();
		
		service.saveEquipmentCategory(category);
		
		verify(categoryDao).save(category);
	}

	@Test
	public void testCanListEquipmentCategoriesByCallingPersistenceLayer() {
		
		service.findAllCategory();
		
		verify(categoryDao).findAll();
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotDeleteEquipmentCategoryWithNullCategory() throws MissingRequiredInformationException {
		
		service.deleteEquipmentCategory(null);

	}

	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotDeleteEquipmentCategoryWithNullName() throws MissingRequiredInformationException {
		Category category = createCategoryWithNullName();
		
		service.deleteEquipmentCategory(category);

	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotDeleteEquipmentCategoryWithEmptyName() throws MissingRequiredInformationException {
		Category category = createCategoryWithEmptyName();
		
		service.deleteEquipmentCategory(category);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotDeleteEquipmentCategoryWithNullDescription() throws MissingRequiredInformationException {
		Category category = createCategoryWithNullDescription();
		
		service.deleteEquipmentCategory(category);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotDeleteEquipmentCategoryWithEmptyDescription() throws MissingRequiredInformationException {
		Category category = createCategoryWithEmptyDescription();
		
		service.deleteEquipmentCategory(category);
	}
	
	@Test
	public void testCanDeleteEquipmentCategoryByCallingPersistenceLayer() throws MissingRequiredInformationException {
		Category category = createCorrectCategory();
		
		service.deleteEquipmentCategory(category);
		
		verify(categoryDao).delete(category);
	}
	
	@Test
	public void testCanFindCategoryByIdByCallingPersistenceLayer() {
		Long id = new Long(1);
		
		service.findCategoryById(id);
		
		verify(categoryDao).findById(id);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotSaveNullEquipment() throws MissingRequiredInformationException {

		service.saveEquipment(null);
		
	}
	
	@Test
	public void testEquipmentStockQuantityIsSetToZeroIfNotFeededOnSave() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		Equipment saved;
		Integer expectedStockQuantity = 0;
		setUpEquipmentDao(equipment);
		
		saved = service.saveEquipment(equipment);
		
		assertEquals(expectedStockQuantity, saved.getStockQuantity());
	}
	
	
	
	@Test
	public void testEquipmentStockQuantityIsSetToZeroIfInferiorToZeroOnSave() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		equipment.setStockQuantity(-1);
		Equipment saved;
		Integer expectedStockQuantity = 0;
		setUpEquipmentDao(equipment);
		
		saved = service.saveEquipment(equipment);
		
		assertEquals(expectedStockQuantity, saved.getStockQuantity());
	}
	
	@Test
	public void testEquipmentMinimumHeightIsSetToZeroIfNotFeededOnSave() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		Equipment saved;
		Integer expectedMinimumHeight = 0;
		setUpEquipmentDao(equipment);
		
		saved = service.saveEquipment(equipment);
		
		assertEquals(expectedMinimumHeight, saved.getMinimumHeight());
	}
	
	@Test
	public void testEquipmentMinimumHeightIsSetToZeroIfInferiorToZeroOnSave() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		equipment.setMinimumHeight(-1);
		Equipment saved;
		Integer expectedMinimumHeight = 0;
		setUpEquipmentDao(equipment);
		
		saved = service.saveEquipment(equipment);
		
		assertEquals(expectedMinimumHeight, saved.getMinimumHeight());
	}
	
	@Test
	public void testCanSaveEquipmentByCallingPersistenceLayer() throws MissingRequiredInformationException {
		Equipment equipment =  createEquipmentWithService();
		
		service.saveEquipment(equipment);
		
		verify(equipmentDao).save(equipment);
	}
	
	@Test
	public void testCanDeleteEquipmentByCallingPersistenceLayer() {
		Equipment equipment = new Equipment();
		
		service.deleteEquipment(equipment);
		
		verify(equipmentDao).delete(equipment);
	}
	
	@Test
	public void testCanFindAllEquipmentByCallingPersistenceLayer() {
		
		service.findAllEquipment();
		
		verify(equipmentDao).findAll();
	}
	
	@Test
	public void testCanFindEquipmentByIdByCallingPersistenceLayer() {
		Long id = new Long(1);
		
		service.findEquipmentById(id);
		
		verify(equipmentDao).findById(id);
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentWithEmptyService() throws MissingRequiredInformationException {
		Equipment equipment = new Equipment();
		
		service.saveEquipment(equipment);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentWithNullServiceName() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		equipment.getService().setName(null);
		
		service.saveEquipment(equipment);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentWithEmptyServiceName() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		equipment.getService().setName("");
		
		service.saveEquipment(equipment);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentWithNullServiceDescription() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		equipment.getService().setDescription(null);
		
		service.saveEquipment(equipment);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotSaveEquipmentWithEmptyServiceDescriptin() throws MissingRequiredInformationException {
		Equipment equipment = createEquipmentWithService();
		equipment.getService().setDescription("");
		
		service.saveEquipment(equipment);
		
	}

	@Test
	public void testCallListingToWhenStartDateNull() {
		Date startDate = null;
		Date endDate = new Date();
		
		service.getSportPartnerListingBetween(startDate, endDate);
		
		verify(sportPartnerDao, times(2)).getSportPartnerListingBetween(any(Date.class), any(Date.class));
	}
	
	@Test
	public void testCallListingFromWhenEndDateNull() {
		Date startDate = new Date();
		Date endDate = null;
		
		service.getSportPartnerListingBetween(startDate, endDate);
		
		verify(sportPartnerDao, times(2)).getSportPartnerListingBetween(any(Date.class), any(Date.class));
	}

	@Test
	public void testListingForComingWeekFillterToNextWeek() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		
		service.getSportPartnerListingForComingWeek();
				
		verify(sportPartnerDao).getSportPartnerListingBetween(any(Date.class), any(Date.class));
	}
	
	@Test
	public void testIfStartDateAndEndDateFilledCallPersistenceWithThoseParameters() {
		Date startDate = new Date();
		Date endDate = new Date();
		
		service.getSportPartnerListingBetween(startDate, endDate);
		
		verify(sportPartnerDao).getSportPartnerListingBetween(startDate, endDate);
	}
	
	@Test
	public void testSaveBookingCallPersistenceLayer() {
		
		service.saveBooking(null);
		
		verify(bookingDao).save(null);
	}
	
	@Test
	public void testFindBookingByIdCallPersistenceLayer() {
		
		service.findBookingById(null);
		
		verify(bookingDao).findById(null);
	}
	
	@Test
	public void testFindAllBookingsCallPersistenceLayer() {
		
		service.findAllBookings();
		
		verify(bookingDao).findAll();
	}
	
	@Test
	public void testSaveGuestEquipmentCallPersistenceLayer() {
		
		service.saveGuestEquipment(null);
		
		verify(guestEquipmentDao).save(null);
	}
	
	@Test
	public void testFindGuestEquipmentByIdCallPersistenceLayer() {
		
		service.findGuestEquipmentById(null);
		
		verify(guestEquipmentDao).findById(null);
	}
	
	private Category createCategoryWithNullName() {
		Category category = new Category();
		category.setDescription("desc");
		
		return category;
	}
	
	private Category createCategoryWithEmptyName() {
		Category category = new Category();
		category.setDescription("desc");
		category.setName("");
		
		return category;
	}
	
	private Category createCategoryWithNullDescription() {
		Category category = new Category();
		category.setName("name");
		
		return category;
	}
	
	private Category createCategoryWithEmptyDescription() {
		Category category = new Category();
		category.setName("name");
		category.setDescription("");
		
		return category;
	}
	
	private Category createCorrectCategory() {
		Category category = new Category();
		category.setName("name");
		category.setDescription("description");
		
		return category;
	}
	
	private void setUpEquipmentDao(Equipment equipment) {
		when(equipmentDao.save(equipment)).thenReturn(equipment);
	}
	
	private Equipment createEquipmentWithService() {
		Service service = new Service();
		service.setName("test");
		service.setDescription("test");
		Equipment equipment = new Equipment();
		equipment.setService(service);
		
		return equipment;
	}
	
}
