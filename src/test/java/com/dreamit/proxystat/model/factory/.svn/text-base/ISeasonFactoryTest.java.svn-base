package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.Season;
import com.dreamit.proxystat.model.factory.impl.SeasonFactoryImpl;

/**
 * Season factory test
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ISeasonFactoryTest {

	@InjectMocks
	private SeasonFactoryImpl factory;
	
	@Test
	public void testCanCreateSeasonUsingFactory() {
		Season result;
		Season expected = new Season();
		String name = "a";
		Date startDate = new Date();
		Date endDate = new Date();
		expected.setName(name);
		expected.setStartDate(startDate);
		expected.setEndDate(endDate);
		
		result = factory.createSeason(name, startDate, endDate);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getStartDate(), 	result.getStartDate());
		assertEquals(expected.getEndDate(), 	result.getEndDate());
	}
	
}
