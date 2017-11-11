package com.dreamit.proxystat.model.service;
import static org.mockito.Mockito.verify;

import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.IFlatDAO;
import com.dreamit.proxystat.model.service.impl.AdministrationReportingServiceImpl;

/**
 * Classe de test pour la partie reporting dans l'interface admin
 * @author RAKOTOBE Sitraka Eric
 */
@RunWith(MockitoJUnitRunner.class)
public class IAdministrationReportingServiceTest {
	
	
	@InjectMocks 
	private AdministrationReportingServiceImpl service;
	
	@Mock
	private IBookingDAO bookingDAO;
	
	
	@Mock
	private IFlatDAO flatDAO;
	
	
	@Mock
	private IAgeCategoryDAO ageCategoryDAO;
	
	
	@Test
	public void testLoadEventsWeekDataReturnsTrueResult() {
		Map<Integer, String> result = service.loadEventsWeekData();
		int length = result.size() ; 
		
		Assert.assertEquals(length, AdministrationReportingServiceImpl.NB_WEEKS + 1);
	}
	
	
	
	@Test
	public void loadNumberOfBookingPredictionCallsDao() {
		service.loadNumberOfBookingPrediction();
		
		verify(bookingDAO).loadNumberOfBookingPrediction();
	}		
	
	
	@Test
	public void loadAmountOfBookingOrderCallsDao() {
		service.loadAmountOfBookingOrder();
		
		verify(bookingDAO).loadAmountOfBookingOrder();
	}	
	
	
	@Test
	public void testLoadCountBookingDataReturnsTrueResult() {
		Map<Integer, Integer> result = service.loadCountBookingData();
		int length = result.size() ; 
		
		Assert.assertEquals(length, AdministrationReportingServiceImpl.NB_WEEKS + 1);
	}		
	
	
	@Test
	public void loadTurnOverDataCallsDao() {
		Map<Integer, Integer> result = service.loadTurnOverData();
		int length = result.size() ; 
		
		Assert.assertEquals(length, AdministrationReportingServiceImpl.NB_WEEKS + 1);
	}		
	
	
	
	
	@Test
	public void loadMarginDataCallsDao() {
		Map<Integer, Integer> result = service.loadMarginData();
		int length = result.size() ; 
		
		Assert.assertEquals(length, AdministrationReportingServiceImpl.NB_WEEKS + 1);
	}		
	
	
	
	@Test
	public void loadOccupancyRateDataCallsDao() {
		Map<Integer, Integer> result = service.loadOccupancyRateData();
		int length = result.size() ; 
		
		Assert.assertEquals(length, AdministrationReportingServiceImpl.NB_WEEKS + 1);
	}		
	
	
	@Test
	public void loadFlatTypeBookedDataCallsDao() {
		service.loadFlatTypeBookedData();
		
		verify(bookingDAO).loadFlatTypeBookedData();
	}		
	
	
	
	@Test
	public void loadEquipmentTypeDataCallsDao() {
		service.loadEquipmentTypeData();
		
		verify(bookingDAO).loadEquipmentTypeData();
	}
	
	
	
	
	@Test
	public void loadPassTypeDataCallsDao() {
		service.loadPassTypeData();
		
		verify(bookingDAO).loadPassTypeData();
	}	
	
	
	@Test
	public void loadRatingServiceDataCallsDao() {
		service.loadRatingServiceData();
		
		verify(bookingDAO).loadRatingServiceData();
	}		
	
	
	
	
	
	@Test
	public void testLoadNumberOfCustomersDataReturnsTrueResult() {
		Map<Integer, Integer> result = service.loadNumberOfCustomersData();
		int length = result.size() ; 
		
		Assert.assertEquals(length, AdministrationReportingServiceImpl.NB_WEEKS + 1);
	}	
	
	
	
	
	@Test
	public void testLoadGuestAgeBreakDownDataCallsDao() {
		service.loadGuestAgeBreakDownData();
		
		verify(ageCategoryDAO).loadGuestAgeBreakDown();
	}	
}