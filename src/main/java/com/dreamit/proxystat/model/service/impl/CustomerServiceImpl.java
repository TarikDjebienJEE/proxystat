package com.dreamit.proxystat.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IAdressDAO;
import com.dreamit.proxystat.model.dao.ICustomerDAO;
import com.dreamit.proxystat.model.entities.Adress;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.IAdministrationService;
import com.dreamit.proxystat.model.service.ICustomerService;


/**
 * Proxystat Customer Service
 *
 * @author Melody MASCOT, RUDY STIENNE (recherche infos clients)
 */
@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO customerDAO;
	
	@Autowired
	private IAdressDAO adressDAO;
	
	@Autowired
	private IAdministrationService administrationService;
	
	@Override
	public Customer createCustomer(String name,String surname,String email,String adresseRue,
		String adresseCp, String adresseVille,String adressePays,String password, 
		String passwordC) throws MissingRequiredInformationException, IllegalArgumentException {
		
		if (adresseRue == null || adresseRue.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (adresseCp == null || adresseCp.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (adresseVille == null || adresseVille.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (adressePays == null || adressePays.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		
		//Composer l'adresse du customer par rapport aux paramètres
		Adress adress = new Adress();
		adress.setAdress(adresseRue);
		adress.setZipCode(adresseCp);
		adress.setTown(adresseVille);
		adress.setCountry(adressePays);
	
		//Creer l'adresse du customer
		Adress createdAdress = createAdress(adress);
		
		if (password == null || password.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (passwordC == null || passwordC.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (name == null || name.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (surname == null || surname.isEmpty()){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		
		//Creer le user avec le mot de passe
		User user = new User();
		user.setLogin(name);
		user.setPassword(password);
		
		try{
		compareTwoPassword(password, passwordC);
		} catch (IllegalArgumentException e){
			throw new IllegalArgumentException("Mot de passe incorrect", e.getCause());
		}
		
		User createUser = administrationService.createUser(user);
		
		//Recuperer les parametres d'un client
		Customer customer = new Customer();
		customer.setName(name);
		customer.setSurname(surname);
		customer.setAdress(createdAdress);
		customer.setUser(createUser);
		

		if (customer.getAdress() == null ){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		if (customer.getUser() == null ){
			throw new MissingRequiredInformationException("Argument is empty");
		}
		
		try{
			validateEmail(email);
		} catch (IllegalArgumentException e){
				throw new IllegalArgumentException("email invalide", e.getCause());
		}
		
		return customerDAO.save(customer);
	}
	
	@Override
	public List<Customer> findAll() {
		return customerDAO.findAll();
	}
	
	@Override
	public void deleteCustomer(Customer customer) {
		customerDAO.delete(customer);
	}

	@Override
	public Customer findById(long id) {
		return customerDAO.findById(id);
	}

	@Override
	public void validateEmail(String email)throws IllegalArgumentException {
		if(email.isEmpty() || !email.contains("@") || !email.contains(".fr") ){
			throw new IllegalArgumentException("email invalide");
		}
	}

	@Override
	public void compareTwoPassword(String password1, String password2) throws IllegalArgumentException {
		if(!password1.equals(password2)){
			throw new IllegalArgumentException("Mot de passe incorrect");
		}	
	}

	@Override
	public Adress createAdress(Adress adress) {
		return adressDAO.save(adress);
	}

	@Override
	public List<Customer> findByNameAndSurname(String name, String surname) {
		if(name==null || "".equalsIgnoreCase(name)  || surname==null || "".equalsIgnoreCase(surname)){
			return null;
		}
		return customerDAO.findCustomerByNameAndSurname(name, surname);
	}
	

}
