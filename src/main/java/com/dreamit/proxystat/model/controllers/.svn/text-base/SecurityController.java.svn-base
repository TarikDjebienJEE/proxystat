package com.dreamit.proxystat.model.controllers;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.enumeration.ERole;
import com.dreamit.proxystat.model.service.IAdministrationCommonService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Spring Security Authentification Controller
 *
 * @author tarik DJEBIEN
 */
@Controller
@RequestMapping(value = "*.security")
@Scope(value = "singleton")
public class SecurityController {

	@Autowired
	private IAdministrationCommonService adminService;
	
	/**
	 * Handler for valid login
	 *
	 * @return the JSP home.jsp
	 */
	@RequestMapping("/home")
	public String getLogin() {
		return SpringViewResolutionConstants.VIEW_HOME;
	}

	/**
	 * Handler for invalid login
	 *
	 * @return the JSP home.jsp
	 * @author tarik
	 */
	@RequestMapping("/loginValid")
	public String authentificationSuccess(HttpServletRequest request, ModelMap model) {

		// GET USER
		UsernamePasswordAuthenticationToken userPrincipal = (UsernamePasswordAuthenticationToken) request.getUserPrincipal();

		String username = userPrincipal.getName();

		userPrincipal.getAuthorities();

		// CHECK SECURITY ROLE PERMISSION
		if (isUserInRoles(request)) {
			//TODO Tarik ajouter le user en session
			HttpSession session = (HttpSession) request.getSession();
			
			User user = findUserByLogin(username);
			
			session.setAttribute("username", username);			
			session.setAttribute("user", user);
			
			// If customer, retrieve customer object and add to session
			if(request.isUserInRole(ERole.USER.getAuthoritiesSpringSecurity())) {
				Customer customer = adminService.findCustomerByUser(user);
				session.setAttribute("customer", customer);
			}
			
			// If partner, redirect to sport admin page
			if(request.isUserInRole(ERole.PARTNER_SPORT.getAuthoritiesSpringSecurity())) {
				return SpringViewResolutionConstants.VIEW_ADMIN_SPORT_HOME;
			}
			
			// If partner pass, redirect to mechanic admin page
			if(request.isUserInRole(ERole.PARTNER_PASS.getAuthoritiesSpringSecurity())) {
					return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_HOME;
			}
			
			// If partner training, redirect to training admin page
			if(request.isUserInRole(ERole.PARTNER_TRAINING.getAuthoritiesSpringSecurity())) {
					return SpringViewResolutionConstants.VIEW_ADMINTRAININGPARTNER_HOME;
			}
			
			// If admin, redirect to admin homepage
			if(request.isUserInRole(ERole.ADMIN.getAuthoritiesSpringSecurity())) {
				return SpringViewResolutionConstants.VIEW_ADMIN_HOME;
			}			
			
			//TODO trouver un autre moyen pour acceder au workflow de reservation
			Integer statutWorkflow = 1;
			model.put("statutWorkflow", statutWorkflow);
			
			return SpringViewResolutionConstants.VIEW_WORKFLOW;
		} else {
			// Goto home page for hackers
			return SpringViewResolutionConstants.VIEW_HOME;
		}
	}

	private User findUserByLogin(String username) {
		List<User> users;
		User sampleInstance = new User();
		sampleInstance.setLogin(username);
		sampleInstance.setEnabled(true);
		
		users = adminService.findUserByExample(sampleInstance);
		
		return users.get(0);
	}
	
	/**
	 * @return the JSP login.jsp
	 * @author tarik
	 */
	@RequestMapping("/loginInvalid")
	public String authentificationFailure(HttpServletRequest request, ModelMap model) {
		
		String errorLogin = "Identifiants invalides";
		model.put("errorLogin", errorLogin);

		return SpringViewResolutionConstants.VIEW_HOME;
	}
	
	/**
	 * Check if user is authorized to connect
	 * @param request HTTP request
	 * @return TRUE if user can connect to ProxyStat , else FALSE.
	 */
	private boolean isUserInRoles(HttpServletRequest request){
		List<String> rolesExisting = new LinkedList<String>();
		for(ERole role : ERole.values()){
			rolesExisting.add(role.getAuthoritiesSpringSecurity());
		}
		for(String roleEnable : rolesExisting){
			if(request.isUserInRole(roleEnable)){
				return true;
			}
		}
		return false;
	}

}