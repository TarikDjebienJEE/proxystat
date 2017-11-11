package com.dreamit.proxystat.model.service;

import java.util.List;

import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;

/**
 * Interface de service 
 * pour le service de commentaires
 * et de notations
 * @author RAKOTOBE Sitraka Eric
 */
public interface IRatingService {

	/**
	 * Retourne la liste des Rating 
	 * qui n’ont pas de lien avec un service
	 * @return la liste des ratings sans service
	 */
	List<Rating> getHomeRatings();
	
	/**
	 * Retourne la liste des Rating 
	 * qui n’ont pas de lien avec un service
	 * La liste est restreinte a nbRatings
	 * @param nbRatings : le nombre de ratings a afficher
	 * @return la liste des nbRatings premiers ratings sans service
	 */
	List<Rating> getHomeRatingsRestrict(int nbRatings);

	/**
	 * 
	 * @return all ratings
	 */
	List<Rating> findAllRatings();
	
	/**
	 * Sauvegarder un commentaire pour un client sur la homepage
	 * Il n’y a pas de lien avec un service 
	 * car c’est un commentaire global
	 * @param rating : le rating a sauvegarder
	 * @return rating : le rating apres insertion
	 */
	Rating saveHomeRating(Rating rating);
	
	/**
	 * 
	 * @param id
	 * @return service found or null
	 */
	Service findServiceById(Long id);
	
	/**
	 * 
	 * @param service
	 * @return list of ratings for the corresponding service
	 */
	List<Rating> findRatingsForService(Service service);
	
	/**
	 * Remove rating from persistence layer
	 * @param rating
	 */
	void deleteRating(Rating rating);
	
	/**
	 * 
	 * @param id
	 * @return found rating or null
	 */
	Rating findRatingById(Long id);
	
}
