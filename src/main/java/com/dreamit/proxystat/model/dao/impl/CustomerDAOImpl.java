package com.dreamit.proxystat.model.dao.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.ICustomerDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.User;

/**
 * CRUD Implementation Customer
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class CustomerDAOImpl extends GenericJpaDataAccessObject<Customer, Long> implements ICustomerDAO {

	@Override
	public Customer findCustomerByUser(User user) {
		Customer customer;
		
		StringBuilder query = new StringBuilder();
		query.append(" from  			Customer c ");
		query.append(" left join fetch 	c.bookings ");
		query.append(" where 			c.user = :user");
		
		customer = (Customer) getHibernateSession().createQuery( query.toString() )
			.setParameter("user", user)
			.uniqueResult();
		
		return customer;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findCustomerByNameAndSurname(String name, String surname) {
		
		StringBuilder query = new StringBuilder();
		query.append(" from  			Customer c ");
		query.append(" where 			c.name = :name");
		query.append(" and 			c.surname = :surname");
		
		
		List<Customer> customers = ((List<Customer>) getHibernateSession().createQuery( query.toString() )
				.setParameter("name", name)
				.setParameter("surname", surname)
				.list());
		
		return customers;
	}

	
	
}
