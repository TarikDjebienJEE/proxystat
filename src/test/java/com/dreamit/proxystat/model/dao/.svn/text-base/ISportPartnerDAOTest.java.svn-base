package com.dreamit.proxystat.model.dao;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamit.proxystat.model.dto.SportPartnerListing;

/**
 * Test class for sport partner
 * @author acraske
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class ISportPartnerDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired 
	private ISportPartnerDAO dao;

	@Test
	public void testNoMatchingListingReturnEmptyList() throws ParseException {
		List<SportPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("1000-01-01");
		Date endDate = ft.parse("1000-01-07");
		int expected = 0;
		int result;
		
		listing = dao.getSportPartnerListingBetween(startDate, endDate);
		result = listing.size();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testIfOneMatchingBookingReturnOneListing() throws ParseException {
		List<SportPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("2013-01-01");
		Date endDate = ft.parse("2013-01-07");
		int expected = 1;
		int result;
		
		listing = dao.getSportPartnerListingBetween(startDate, endDate);
		result = listing.size();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testOneBookingWithOneGuestAndTwoEquipmentsReturnTwo() throws ParseException {
		List<SportPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("2014-01-01");
		Date endDate = ft.parse("2014-01-07");
		int expected = 2;
		int result;
		
		listing = dao.getSportPartnerListingBetween(startDate, endDate);
		result = listing.size();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testOneBookingWithTwoGuestsAndSameEquipmentReturnOneRowAndTwoQuantity() throws ParseException {
		List<SportPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("2015-01-01");
		Date endDate = ft.parse("2015-01-07");
		Long expectedQuantity = new Long(2);
		int expected = 1;
		Long resultQuantity;
		int result;
		
		listing = dao.getSportPartnerListingBetween(startDate, endDate);
		resultQuantity = listing.get(0).getQuantity();
		result = listing.size();
		
		assertEquals(expectedQuantity, resultQuantity);
		assertEquals(expected, result);
	}
	
	@Test
	public void testTwoBookingsWithOneGuestsHavingSameEquipmentAndOneAdditionnalForOneReturnTwoEquipmentOneWithQuantityOneAndCommonWithTwo() throws ParseException {
		List<SportPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("2016-01-01");
		Date endDate = ft.parse("2016-01-07");
		Long expectedQuantity = new Long(3);
		int expected = 2;
		Long resultQuantity = new Long(0);
		int result;
		
		listing = dao.getSportPartnerListingBetween(startDate, endDate);
		for (SportPartnerListing row : listing) {
			resultQuantity += row.getQuantity();
		}
		result = listing.size();
		
		assertEquals(expectedQuantity, resultQuantity);
		assertEquals(expected, result);
	}
	
}