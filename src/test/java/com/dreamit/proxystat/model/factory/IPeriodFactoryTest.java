package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.HolidayPeriod;
import com.dreamit.proxystat.model.entities.StandardPeriod;
import com.dreamit.proxystat.model.factory.impl.HolidayPeriodFactoryImpl;
import com.dreamit.proxystat.model.factory.impl.StandardPeriodFactoryImpl;

/**
 * Period factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IPeriodFactoryTest {

	@InjectMocks
	private HolidayPeriodFactoryImpl factoryHolidayPeriod;
	
	@InjectMocks
	private StandardPeriodFactoryImpl factoryStandardPeriod;
	
	@Test
	public void testCanCreateHolidayPeriodUsingFactory() {
		HolidayPeriod result;
		HolidayPeriod expected = new HolidayPeriod();
		String name = "name";
		expected.setName(name );
		Date startDate = new Date();
		expected.setStartDate(startDate);
		Date endDate = new Date();
		expected.setEndDate(endDate);
		
		result = (HolidayPeriod) factoryHolidayPeriod.createPeriod(name, startDate, endDate);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getStartDate(), 	result.getStartDate());
		assertEquals(expected.getEndDate(), 	result.getEndDate());
	}
	
	@Test
	public void testCanCreateStandardPeriodUsingFactory() {
		StandardPeriod result;
		StandardPeriod expected = new StandardPeriod();
		String name = "name";
		expected.setName(name );
		Date startDate = new Date();
		expected.setStartDate(startDate);
		Date endDate = new Date();
		expected.setEndDate(endDate);
		
		result = (StandardPeriod) factoryStandardPeriod.createPeriod(name, startDate, endDate);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getStartDate(), 	result.getStartDate());
		assertEquals(expected.getEndDate(), 	result.getEndDate());
	}
	
}
