package com.dreamit.proxystat.model.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;

/**
 * Test class for customer DAO
 * @author acraske
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IRatingDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private IRatingDAO ratingDao;
	
	@Test
	public void testFindRatingLinkToService() {
		Service service = new Service();
		Long id = new Long(1);
		service.setId( id );
		List<Rating> ratings;
		
		ratings = ratingDao.findRatingsForService(service);
		
		for (Rating rating : ratings) {
			assertEquals(id, rating.getService().getId());
		}
	}
	
	@Test
	public void testDontReturnRatingsLinkToAnyService() {
		Service service = new Service();
		Long id = new Long(-1);
		service.setId( id );
		List<Rating> ratings;
		int expectedSize = 0;
		
		ratings = ratingDao.findRatingsForService(service);
		
		assertEquals(expectedSize, ratings.size());
	}
	
}