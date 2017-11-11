package com.dreamit.proxystat.model.dao;
import java.util.List;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.User;


/**
 * Classe D'acces aux donnees pour les Customers
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface ICustomerDAO extends GenericDataAccessObject<Customer, Long>{
	
	/**
	 * allow to search a customer by User object
	 * @param user
	 * @return found Customer or null
	 */
	Customer findCustomerByUser(User user);
	
	/**
	 * @author : rudy stienne
	 * @param name nom du client
	 * @param surname prenom du client
	 * @return found List<Customer> (en cas de doublon) or null
	 */
	List<Customer> findCustomerByNameAndSurname(String name,String surname);
}
