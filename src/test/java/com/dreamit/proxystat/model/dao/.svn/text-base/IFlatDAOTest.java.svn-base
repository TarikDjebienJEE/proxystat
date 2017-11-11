package com.dreamit.proxystat.model.dao;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Classe de test pour les DAO Flat
 * @author RAKOTOBE Sitraka Eric
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IFlatDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private IFlatDAO flatDAO;
	
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
	public void testLoadMarginDataIsGreaterThanOne() {
		int yearBegin = 2013;
		int yearEnd = 2016;
		setUpDateTest(yearBegin,yearEnd);	
		
		Integer result = flatDAO.getRateOccupancyBetween(startDateTest, endDateTest);
		
		assert(result>=0);
	}		


}