package com.dreamit.proxystat.model.service;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.ICustomerDAO;
import com.dreamit.proxystat.model.dao.IDurationDAO;
import com.dreamit.proxystat.model.dao.IPeriodDAO;
import com.dreamit.proxystat.model.dao.IPriceDAO;
import com.dreamit.proxystat.model.dao.IServiceDAO;
import com.dreamit.proxystat.model.dao.IUserDAO;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.StandardPeriod;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.service.impl.AdministrationCommonServiceImpl;

/**
 * admin common test class
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IAdministrationCommonServiceTest {
	
	@InjectMocks 
	private AdministrationCommonServiceImpl service;
	
	@Mock
	private IPeriodDAO periodDao;
	
	@Mock
	private IAgeCategoryDAO ageCategoryDao;
	
	@Mock
	private IPriceDAO priceDao;
	
	@Mock
	private IServiceDAO serviceDao;
	
	@Mock
	private IDurationDAO durationDao;
	
	@Mock
	private IUserDAO userDao;
	
	@Mock
	private ICustomerDAO customerDao;
	
	@Test
	public void testfindAllPeriodCallPersistenceLayer() {

		service.findAllPeriod();

		verify(periodDao).findAll();
	}

	@Test
	public void testFindPeriodByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findPeriodById(id);

		verify(periodDao).findById(id);
	}
	
	@Test
	public void testSavePeriodCallPersistenceLayer() {
		Period period = new StandardPeriod();
		
		service.savePeriod(period);
		
		verify(periodDao).save(period);
	}
	
	@Test
	public void testDeletePeriodCallPersistenceLayer() {
		Period period = new StandardPeriod();
		
		service.deletePeriod(period);
		
		verify(periodDao).delete(period);
	}

	@Test
	public void testFindAllAgeCategoryCallPersistenceLayer() {
		
		service.findAllAgeCategory();

		verify(ageCategoryDao).findAll();
	}

	@Test
	public void testFindAgeCategoryByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findAgeCategoryById(id);

		verify(ageCategoryDao).findById(id);
	}
	
	@Test
	public void testSaveAgeCategoryCallPersistenceLayer() {
		AgeCategory ageCategory = new AgeCategory();
		
		service.saveAgeCategory(ageCategory);
		
		verify(ageCategoryDao).save(ageCategory);
	}

	@Test
	public void testDeleteAgeCategoryCallPersistenceLayer() {
		AgeCategory ageCategory = new AgeCategory();
		
		service.deleteAgeCategory(ageCategory);
		
		verify(ageCategoryDao).delete(ageCategory);
	}
	
	@Test
	public void testFindAllPriceCallPersistenceLayer() {
		
		service.findAllPrice();

		verify(priceDao).findAll();
	}

	@Test
	public void testFindPriceByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findPriceById(id);

		verify(priceDao).findById(id);
	}
	
	@Test
	public void testSavePriceCallPersistenceLayer() {
		Price price = new Price();
		
		service.savePrice(price);
		
		verify(priceDao).save(price);
	}
	
	@Test
	public void testDeletePriceCallPersistenceLayer() {
		Price price = new Price();
		
		service.deletePrice(price);
		
		verify(priceDao).delete(price);
	}
	
	@Test
	public void testFindAllServicesCallPersistenceLayer() {
		
		service.findAllServices();
		
		verify(serviceDao).findAll();
	}
	
	@Test
	public void testFindServiceByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.findServiceById(id);
		
		verify(serviceDao).findById(id);
	}
	
	@Test
	public void testSaveServiceCallPersistenceLayer() {
		Service serviceToSave = new Service();
		
		service.saveService(serviceToSave);
		
		verify(serviceDao).save(serviceToSave);
	}
	
	@Test
	public void testDeleteServiceCallPersistenceLayer() {
		Service serviceToSave = new Service();
		
		service.deleteService(serviceToSave);
		
		verify(serviceDao).delete(serviceToSave);
	}
	
	@Test
	public void testFindAllDurationsCallPersistenceLayer() {
		
		service.getAllDurations();
		
		verify(durationDao).findAll();
	}
	
	@Test
	public void testFindDurationByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		service.getDurationById(id);
		
		verify(durationDao).findById(id);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testThrowIllegalArgumentExceptionWhenSearchUserByNullExample() {
		User sampleInstance = null;
		
		service.findUserByExample(sampleInstance);
		
	}
	
	@Test
	public void testCallPersistenceLayerToGetUserByExample() {
		User sampleInstance = new User();
		
		service.findUserByExample(sampleInstance);
		
		verify(userDao).findByExample(sampleInstance);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowIllegalArgumentExceptionWhenSearchCustomerByNullUser() {
		User sampleInstance = null;
		
		service.findCustomerByUser(sampleInstance);
		
	}
	
	@Test
	public void testCallPersistenceLayerToGetCustomerWithUser() {
		User sampleInstance = new User();
		
		service.findCustomerByUser(sampleInstance);
		
		verify(customerDao).findCustomerByUser(sampleInstance);
	}
	
}