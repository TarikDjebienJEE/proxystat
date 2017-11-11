package com.dreamit.proxystat.model.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.User;

/**
 * Test class for customer DAO
 * @author acraske, rudy stienne
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class ICustomerDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private ICustomerDAO customerDao;
	
	@Test
	public void testCanFindCustomerWithExistingUser() {
		User user = new User();
		user.setId( new Long(1) );
		user.setLogin("test");
		user.setPassword("test");
		user.setEnabled(true);
		Customer result;
		Long expectedCustomerId = new Long(1);
		
		result = customerDao.findCustomerByUser(user);
		
		assertNotNull(result);
		assertEquals(expectedCustomerId, result.getId());
	}
	
	@Test
	public void testCannotFindCustomerWithUnexistingUser() {
		User user = new User();
		user.setId( new Long(-1) );
		Customer result;
		
		result = customerDao.findCustomerByUser(user);
		
		assertNull(result);
	}
	
	@Test
	public void testCanFindCustomerWithNameAndSurnameInBdd() {
		String name = "agathe";
		String surname = "deblues";
		List<Customer> result;
		Long expectedCustomerId = new Long(2);
		
		result = customerDao.findCustomerByNameAndSurname(name,surname);
		
		assertTrue(result.size()>0);
		assertEquals(expectedCustomerId, result.get(0).getId());
	}
	
//	@Test
//	public void testCanFindCustomerWithNameAndSurnameInBddWithTwoResult() {
//		String name = "john";
//		String surname = "doe";
//		List<Customer> result;
//
//		result = customerDao.findCustomerByNameAndSurname(name,surname);
//
//		assertTrue(result.size()==2);
//	}
	
	@Test
	public void testCanFindCustomerWithNameAndSurnameNotInBdd() {
		String name = "test_name_notInBdd";
		String surname = "test_surname_notInBdd";
		List<Customer> result;

		result = customerDao.findCustomerByNameAndSurname(name,surname);
		
		assertTrue(result.size()==0);
	}
	
}
