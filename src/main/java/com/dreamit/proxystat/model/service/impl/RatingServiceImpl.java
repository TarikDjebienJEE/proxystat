package com.dreamit.proxystat.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IRatingDAO;
import com.dreamit.proxystat.model.dao.IServiceDAO;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.service.IRatingService;

/**
 * Classe de service 
 * pour le service de commentaires
 * et de notations
 * @author RAKOTOBE Sitraka Eric
 */
@Service(value = "ratingService")
@Transactional
public class RatingServiceImpl implements IRatingService{
	
	@Autowired 
	private IRatingDAO ratingDao;
	
	@Autowired
	private IServiceDAO serviceDao;
	
	/**
	 * Methode retournant la liste de tous 
	 * les ratings sans service
	 * @return la liste de tous les ratings sans service
	 */
	private List<Rating> findAllRatingsWithoutService() {
		List<Rating> ratingWithoutService = new ArrayList<Rating>();
		List<Rating> all = ratingDao.findAll();
		for (Rating rating : all) {
			ratingWithoutService.add(rating);
		}
		return ratingWithoutService;
	}		
	
	@Override
	public List<Rating> getHomeRatings(){
		return findAllRatingsWithoutService();
	}

	@Override
	public List<Rating> getHomeRatingsRestrict(int nbRatings){
		List<Rating> ratingWithoutService = findAllRatingsWithoutService();
		List<Rating> lastRatingsWithoutService;
		int sizeAllRatingWithoutService = ratingWithoutService.size();
		if (sizeAllRatingWithoutService > nbRatings){
			lastRatingsWithoutService = ratingWithoutService.subList(0, nbRatings) ;
			return lastRatingsWithoutService ; 
		}
		return ratingWithoutService ; 
	}
	
	@Override
	public Rating saveHomeRating(Rating rating){
		return ratingDao.save(rating);
	}

	@Override
	public com.dreamit.proxystat.model.entities.Service findServiceById(Long id) {
		return serviceDao.findById(id);
	}

	@Override
	public List<Rating> findRatingsForService(com.dreamit.proxystat.model.entities.Service service) {
		if (service == null) {
			throw new IllegalArgumentException("null service");
		}
		
		return ratingDao.findRatingsForService(service);
	}

	@Override
	public void deleteRating(Rating rating) {
		if (rating == null) {
			throw new IllegalArgumentException("rating to remove is null");
		}
		
		ratingDao.delete(rating);
	}

	@Override
	public Rating findRatingById(Long id) {
		return ratingDao.findById(id);
	}

	@Override
	public List<Rating> findAllRatings() {
		return ratingDao.findAll();
	}	
	
}
