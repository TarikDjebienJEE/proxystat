package com.dreamit.proxystat.model.dao;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Pass;

/**
 * Classe de test pour les DAO Booking
 * @author RAKOTOBE Sitraka Eric
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IBookingDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private IBookingDAO bookingDao;
	
	private Date startDateTest ; 
	
	private Date endDateTest;
	
	


	private void setUpDateTest(int yearBegin, int yearEnd) {
		Calendar calendar = Calendar.getInstance();
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
	}			
		
	
	
	
	
	@Test
	public void testFindRatingLinkToServiceResultIsGreaterThanOne() {
		int yearBegin = 1989;
		int yearEnd = 1991;
		setUpDateTest(yearBegin,yearEnd);	
		
		Integer result = bookingDao.getCountBookingBetween(startDateTest, endDateTest);
		
		assert(result>0);
	}
	
	
	
	
	@Test
	public void testLoadNumberOfBookingPredictionResultIsGreaterThanOne() {
		
		Integer result = bookingDao.loadNumberOfBookingPrediction();
		
		assert(result>0);
	}	
	
	
	
	@Test
	public void testLoadAmountOfBookingOrderReturnGoodResult() {
		
		Integer result = bookingDao.loadAmountOfBookingOrder();
		
		assert(result>0);
	}	
	
	
	
	
	@Test
	public void testGetCountBookingBetweenDateReturnAtLeastOneResult() {
		int yearBegin = 1989;
		int yearEnd = 1991;
		setUpDateTest(yearBegin,yearEnd);	
		
		Integer result = bookingDao.getCountBookingBetween(startDateTest, endDateTest);
		
		assert(result>0);
	}		
	
	
	
	
	
	@Test
	public void testGetBookingTurnOverBetweenDateReturnOneResultMinimum() {
		int yearBegin = 1989;
		int yearEnd = 1991;
		setUpDateTest(yearBegin,yearEnd);	
		
		Integer result = bookingDao.getBookingTurnOverBetween(startDateTest, endDateTest);
		
		assert(result>0);
	}


	
	@Test
	public void testLoadMarginDataIsGreaterThanOne() {
		int yearBegin = 1989;
		int yearEnd = 1991;
		setUpDateTest(yearBegin,yearEnd);	
		
		Integer result = bookingDao.getBookingMarginBetween(startDateTest, endDateTest);
		
		assert(result>0);
	}		

	
	
	
	@Test
	public void testLoadFlatTypeBookedDataResultOk() {
		Map<FlatType, Integer>  result = bookingDao.loadFlatTypeBookedData();
		
		assert(result.size()>0);
	}	
	
	
	
	@Test
	public void testLoadEquipmentTypeDataResultOk() {
		Map<Equipment, Integer>  result = bookingDao.loadEquipmentTypeData();
		
		assert(result.size()>0);
	}		

	
	
	
	@Test
	public void testLoadPassTypeDataResultOk() {
		Map<Pass, Integer>  result = bookingDao.loadPassTypeData();
		
		assert(result.size()>0);
	}		
	
	
	
	
	@Test
	public void testLoadRatingServiceDataResultOk() {
		Map<String, Integer>  result = bookingDao.loadRatingServiceData();
		
		assert(result.size()>0);
	}			
	
	
	
	
	
	@Test
	public void testGetNumberOfCustomersBetweenDateReturnAtLeastOneResult() {
		int yearBegin = 1989;
		int yearEnd = 1991;
		setUpDateTest(yearBegin,yearEnd);	
		
		Integer result = bookingDao.getNumberOfCustomersBetween(startDateTest, endDateTest);
		
		assert(result>0);
	}		
}