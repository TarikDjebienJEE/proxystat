package com.dreamit.proxystat.model.service;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IRatingDAO;
import com.dreamit.proxystat.model.dao.IServiceDAO;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.service.impl.RatingServiceImpl;

/**
 * admin common test class
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IRatingServiceIsolationTest {
	
	@InjectMocks 
	private RatingServiceImpl ratingService;
	
	@Mock
	private IRatingDAO ratingDao;

	@Mock
	private IServiceDAO serviceDao;
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowExceptionWhenTryToFindRatingsForNullService() {
		Service service = null;
		
		ratingService.findRatingsForService(service);
		
	}
	
	@Test
	public void testCallPersistanceLayerToFindRatingsForNotNullService() {
		Service service = new Service();
		
		ratingService.findRatingsForService(service);
		
		verify(ratingDao).findRatingsForService(service);
	}
	
	@Test
	public void testCallPersistanceLayerToFindService() {
		Long id = new Long(1);
		
		ratingService.findServiceById(id);
		
		verify(serviceDao).findById(id);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDeleteRatingThrowsExceptionIfRatingIsNull() {
		Rating rating = null;
		
		ratingService.deleteRating(rating);
	}
	
	@Test
	public void testDeleteRatingCallPersistenceLayer() {
		Rating rating = new Rating();
		
		ratingService.deleteRating(rating);
		
		verify(ratingDao).delete(rating);
	}
	
	@Test
	public void testFindRatingByIdCallPersistenceLayer() {
		Long id = new Long(1);
		
		ratingService.findRatingById(id);
		
		verify(ratingDao).findById(id);
	}
	
	@Test
	public void testFindAllRatingsCallPersistenceLayer() {
		
		ratingService.findAllRatings();
		
		verify(ratingDao).findAll();
	}
	
}