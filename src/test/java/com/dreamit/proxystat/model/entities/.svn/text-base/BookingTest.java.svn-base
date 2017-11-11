package com.dreamit.proxystat.model.entities;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * Test for transient properties
 * @author acraske
 *
 */
public class BookingTest {

	@Test
	public void testStartDateAfterInTwoWeeksReturnFalse() {
		int delay = 15;
		boolean expected = false;
		Booking booking = new Booking();
		Date startDate = getCurrentDateWithDelay(delay);
		
		booking.setStartDate(startDate);
		
		assertEquals(expected, booking.getBeforeTwoWeeks());
	}
	
	@Test
	public void testStartDateBeforeInTwoWeeksReturneTrue() {
		int delay = 1;
		boolean expected = true;
		Booking booking = new Booking();
		Date startDate = getCurrentDateWithDelay(delay);
		
		booking.setStartDate(startDate);
		
		assertEquals(expected, booking.getBeforeTwoWeeks());
	}
	
	@Test
	public void testPassedDateReturneFalse() {
		int delay = -1;
		boolean expected = false;
		Booking booking = new Booking();
		Date startDate = getCurrentDateWithDelay(delay);
		
		booking.setStartDate(startDate);
		
		assertEquals(expected, booking.getBeforeTwoWeeks());
	}
	
	private Date getCurrentDateWithDelay(int delay) {
		Calendar cal = Calendar.getInstance();  
		cal.add(Calendar.DATE, delay);  
	
		return cal.getTime();
	}
	
}
