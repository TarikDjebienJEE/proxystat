package com.dreamit.proxystat.model.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.service.IBookingService;
import com.dreamit.proxystat.model.service.ICustomerService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Proxystat Account Controller
 *
 * @author Melody MASCOT, Rudy Stienne (pour les methodes fiches clients et booking)
 */
@Controller
@RequestMapping(value = "*.customer")
@Scope(value = "singleton")
public class AccountController {
	
	/**
	 * Use for customer operations
	 */
	@Autowired
	private ICustomerService customerService;
	
	
	/**
	 * Use for booking operations
	 */
	@Autowired
	private IBookingService bookingService;
	
	/**
	 * 
	 * @return the JSP createAccount.jsp
	 */
	@RequestMapping("/creation")
	public String gotoCreateCustomer() {
		
		return SpringViewResolutionConstants.VIEW_CREATION_ACCOUNT;
	}
	
	/**
	 * @author : rudy stienne
	 * @return the JSP adminResearchCustomer.jsp
	 */
	@RequestMapping("/research")
	public String gotoResearchCustomer() {
		
		return SpringViewResolutionConstants.VIEW_ADMIN_RESEARCHCUSTOMER;
	}
	
	/**
	 * @author : rudy stienne
	 * @return the JSP adminBookingOfCustomer.jsp
	 */
	@RequestMapping(value="/researchBookingByCustomer")
	@Transactional
	public String researchBookingByCustomer(HttpServletRequest request, ModelMap model,
		@RequestParam(value = "idCustomer", required = true) Long idCustomer){
		Customer customer = customerService.findById(idCustomer);
		
		customer.getBookings().size();				
		model.put("bookings", customer.getBookings());

		return SpringViewResolutionConstants.VIEW_ADMIN_LISTBOOKINGCUSTOMER;
	}
	
	/**
	 * 
	 * @return the booking history
	 */
	@RequestMapping("/history")
	@Transactional
	public String goToBookingHistory(HttpServletRequest request, ModelMap model) {
		addCustomerBookingsToModel(request, model);
		
		return SpringViewResolutionConstants.VIEW_BOOKING_HISTORY;
	}

	/**
	 * Cancel booking
	 * @param request
	 * @param model
	 * @param j_name
	 * @param j_surname
	 * @return to booking history page
	 */
	@RequestMapping("/cancelBooking")
	@Transactional
	public String createCustomer(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", required = true) Long id) {
		
		cancelBooking(model, id);
		
		addCustomerBookingsToModel(request, model);
		
		return SpringViewResolutionConstants.VIEW_BOOKING_HISTORY;
	}
		
	/**
	 * Store customer account after form submitted
	 * @param request
	 * @param model
	 * @param name
	 * @param surname
	 * @param email
	 * @param adresseRue
	 * @param adresseCp
	 * @param adresseVille
	 * @param adressePays
	 * @param password
	 * @param passwordC
	 * @return
	 */
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String createCustomer(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "j_name", required = true) String name,
			@RequestParam(value = "j_surname", required = true) String surname,
			@RequestParam(value = "j_email", required = true) String email,
			@RequestParam(value = "j_adresse_rue", required = true) String adresseRue,
			@RequestParam(value = "j_adresse_cp", required = true) String adresseCp,
			@RequestParam(value = "j_adresse_ville", required = true) String adresseVille,
			@RequestParam(value = "j_adresse_pays", required = true) String adressePays,
			@RequestParam(value = "j_password", required = true) String password,
			@RequestParam(value = "j_passwordC", required = true) String passwordC){
		
		
		//Verifier que les données sont bien renseignées
		try {
			
			customerService.createCustomer(name,surname,email,adresseRue,adresseCp, adresseVille,
					adressePays,password, passwordC);
			
			model.put("messageOk", "Votre compte vient d'être créé" );

			
		} catch (Exception e) {
			
			model.put("champIncomplet", true);
			model.put("j_name", name);
			model.put("j_surname", surname);
			model.put("j_email", email);
			model.put("j_adresse_rue", adresseRue);
			model.put("j_adresse_cp", adresseCp);
			model.put("j_adresse_ville", adresseVille);
			model.put("j_adresse_pays", adressePays);
			
			if("Argument is empty".equalsIgnoreCase(e.getMessage())){
				model.put("messageKo", "Les champs ne sont pas tous renseignés");
			}
			
			if("Mot de passe incorrect".equalsIgnoreCase(e.getMessage())){
				model.put("messageKo", "Les mots de passe ne sont pas identiques");
			}
			
			if("email invalide".equalsIgnoreCase(e.getMessage())){
				model.put("messageKo", "Le champs email est incorrect");
			}
			
		}
		return SpringViewResolutionConstants.VIEW_CREATION_ACCOUNT;
	}

	/**
	 * to avoid duplication
	 * @param request
	 * @param model
	 */
	private void addCustomerBookingsToModel(HttpServletRequest request, ModelMap model) {
		HttpSession session = (HttpSession) request.getSession();
		Customer customer = (Customer) session.getAttribute(("customer"));
		Customer freshCustomer = customerService.findById(customer.getId());
		
		// force loading of collections because already mapped as eager in booking
		freshCustomer.getBookings().size();
		
		model.put("bookings", freshCustomer.getBookings());
	}
	
	/**
	 * Cancel booking and set notifications messages
	 * @param model
	 * @param id
	 */
	private void cancelBooking(ModelMap model, Long id) {
		Booking booking = bookingService.findBookingById(id);
		bookingService.cancelBooking(booking);

		model.put("messageOk", true);
	}
	
	
	/**
	 * @author : rudy stienne
	 * @param request
	 * @param model
	 * @param name
	 * @param surname
	 * @return
	 */
	@RequestMapping(value="/researchCustomer", method = RequestMethod.POST)
	public String researchCustomer(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "customername", required = true) String name,
			@RequestParam(value = "customersurname", required = true) String surname){
		
		List<Customer> customersReturn = customerService.findByNameAndSurname(name, surname);
		if(customersReturn==null){
			model.put("messageKo", "Client non trouvé");
		}
		else{
			model.put("customersReturn", customersReturn);
		}
		return SpringViewResolutionConstants.VIEW_ADMIN_RESEARCHCUSTOMER;
	}
	
	@RequestMapping(value="/researchInfosCustomer", method = RequestMethod.POST)
	public String researchInfosCustomer(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "idCustomer", required = true) Long idCustomer){
		
		Customer customerReturn = customerService.findById(idCustomer);
		if(customerReturn==null){
			model.put("messageKo", "Client non trouvé");
		}
		else{
			model.put("customerReturn", customerReturn);
		}
		return SpringViewResolutionConstants.VIEW_ADMIN_RESEARCHCUSTOMER;
	}
	
}
