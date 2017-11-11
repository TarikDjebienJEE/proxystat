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

import com.dreamit.proxystat.model.dto.MechanicPartnerListing;




/**
 * 
 * @author rudy stienne
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IMechanicPartnerDAOTest extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired 
	private IMechanicPartnerDAO dao;
	
	@Test
	public void testNoMatchingListingReturnEmptyList() throws ParseException {
		List<MechanicPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("1000-01-01");
		Date endDate = ft.parse("1000-01-07");
		int expected = 0;
		int result;
		
		listing = dao.getMechanicPartnerListingBetween(startDate, endDate);
		result = listing.size();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testIfOneMatchingBookingReturnOneListing() throws ParseException {
		List<MechanicPartnerListing> listing;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("2013-01-01");
		Date endDate = ft.parse("2013-01-07");
		int expected = 1;
		int result;
		
		listing = dao.getMechanicPartnerListingBetween(startDate, endDate);
		result = listing.size();
		
		assertEquals(expected, result);
	}
	
	
}
