package com.dreamit.proxystat.model.controllers;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.service.ICustomerService;
import com.dreamit.proxystat.model.service.IRatingService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Classe de controller 
 * pour le service de commentaires
 * et de notations
 * @author RAKOTOBE Sitraka Eric
 */
@Controller
@RequestMapping(value = "*.rate")
@Scope(value = "singleton")
public class RatingHomeController {

	@Autowired 
	private IRatingService ratingService;
	
	@Autowired 
	private ICustomerService customerService;
	
	private static final int NB_RATINGS_TO_SHOW = 5 ; 
	
	/**
	 * Methode permettant de chercher
	 * un client selon son nom
	 * @param userName
	 * @return le client avec le nom en parametre
	 */
	//TODO eric : un service+dao pour ca - pas de parse complet
	private Customer searchCustomerByName(String userName) {
		Customer customer = new Customer() ;
		List<Customer> all = customerService.findAll();
		for (Customer c : all) {
			User userCustomer = c.getUser() ; 
			if (userCustomer != null){
				String userNameDb = userCustomer.getLogin();
				if (userName.equalsIgnoreCase(userNameDb)){
					customer = c ;
				}				
			}

		}
		return customer;
	}	
	
	/**
	 * Handler pour poster un rating 
	 * @param request
	 * @param model
	 * @return la page d'accueil home
	 */
	@RequestMapping(value = "/postRating", method = RequestMethod.POST)
	public String postRating
			(HttpServletRequest reqOSuest, ModelMap model,
			 @RequestParam(value = "comments", required = true) String comments,
			 @RequestParam(value = "notation", required = false) String notation
			) 
	{
		
		int notationValue = Integer.valueOf(notation);
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		Customer customer = searchCustomerByName(userName);
		
		Date today = Calendar.getInstance().getTime();
		Rating rating = new Rating();
		rating.setDate(today);
		rating.setNotation(notationValue);
		rating.setComment(comments);
		rating.setCustomer(customer);
		rating = ratingService.saveHomeRating(rating);
		
		List<Rating> ratingsWithoutServices = ratingService.getHomeRatings();
		model.put("ratingSaved", rating);
		model.put("ratings", ratingsWithoutServices);
		
		return SpringViewResolutionConstants.VIEW_FEEDBACK;
	}

	/**
	 * Handler pour montrer tous les 
	 * ratings de la bdd en affichage
	 * @param request
	 * @param model
	 * @return la page d'accueil home
	 */
	@RequestMapping(value = "/showAllRatings", method = RequestMethod.GET)
	public String showAllRatings (HttpServletRequest request, ModelMap model) {
		List<Rating> ratingsWithoutServices = ratingService.getHomeRatings();
		model.put("areAllShown", "true");
		model.put("ratings", ratingsWithoutServices);
		
		return SpringViewResolutionConstants.VIEW_FEEDBACK;
	}	
	
	/**
	 * Handler pour montrer tous les 
	 * ratings de la bdd en affichage
	 * @param request
	 * @param model
	 * @return la page d'accueil home
	 */
	@RequestMapping(value = "/showFirstsRatings", method = RequestMethod.GET)
	public String showFirstsRatings (HttpServletRequest request, ModelMap model) {
		List<Rating> ratingsWithoutServices = ratingService.getHomeRatingsRestrict(NB_RATINGS_TO_SHOW);
		model.put("areAllShown", "false");
		model.put("ratings", ratingsWithoutServices);
		
		return SpringViewResolutionConstants.VIEW_FEEDBACK;
	}		
	
	@RequestMapping(value = "/showServiceRatings", method = RequestMethod.GET)
	public String showServiceRatings(HttpServletRequest request, ModelMap model,
			 @RequestParam(value = "id", required = true) Long id ) {
		
		Service service = ratingService.findServiceById(id);
		
		List<Rating> ratings = ratingService.findRatingsForService(service);
		
		model.put("service", service);
		model.put("ratings", ratings);
		
		return SpringViewResolutionConstants.VIEW_SERVICE_RATING;
	}
	
	@RequestMapping(value = "/adminRatings", method = RequestMethod.GET)
	public String showAdminRatings(HttpServletRequest request, ModelMap model) {
		loadAllRatingsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_RATING;
	}

	@RequestMapping(value = "/deleteRating", method = RequestMethod.POST)
	public String deleteRating(HttpServletRequest request, ModelMap model,
			 @RequestParam(value = "id", required = true) Long id ) {
		
		Rating rating = ratingService.findRatingById(id);
		
		try {
			ratingService.deleteRating(rating);
			
			model.put("messageOk", true);
		} catch (Exception ex) {
			model.put("messageKo", true);
		}
		
		loadAllRatingsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_RATING;
	}
	
	private void loadAllRatingsInModel(ModelMap model) {
		List<Rating> ratings = ratingService.findAllRatings();
		model.put("ratings", ratings);
	}
	
}
