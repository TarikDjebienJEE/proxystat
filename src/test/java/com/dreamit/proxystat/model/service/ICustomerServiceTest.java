package com.dreamit.proxystat.model.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IAdressDAO;
import com.dreamit.proxystat.model.dao.ICustomerDAO;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.impl.CustomerServiceImpl;

/**
 * Classe de test pour le service de création de compte
 * @author Melody MASCOT, Rudy Stienne (tests pour la methode Customer findByNameAndSurname(String name, String surname) 
 */
@RunWith(MockitoJUnitRunner.class)
public class ICustomerServiceTest {
	
	@InjectMocks 
	private CustomerServiceImpl service;
	
	@Mock
	private ICustomerDAO customerDao;
	
	@Mock
	private IAdressDAO adressDao;
	

//	@Test
	public void testCannCreateCustomertWithCorrectArgument() throws IllegalArgumentException, MissingRequiredInformationException {	
		Customer customer = new Customer();
		
		customer = service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", "adressePays",
								"password", "password");
		
		verify(customerDao).save(customer);		
	}
	
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateCustomertWithNullName() throws MissingRequiredInformationException {	
		
		service.createCustomer(null, "surname","email","adresseRue","adresseCP", "adresseVille", "adressePays",
								"password", "password");
		
	}
	
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullSurname() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", null,"email","adresseRue","adresseCP", "adresseVille", "adressePays",
				"password", "password");
		
	}
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithEmptyAdresseRue() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","","adresseCP", "adresseVille", "adressePays",
				"password", "password");
		
	}	
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithEmptyAdresseCp() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue","", "adresseVille", "adressePays",
				"password", "password");
		
	}
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullAdresseVille() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", null, "adressePays",
				"password", "password");
		
	}
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithEmptyAdressePays() throws MissingRequiredInformationException{	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", "",
				"password", "password");
		
	}
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithEmptyAdressePassword() throws MissingRequiredInformationException{	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", "adressePays",
				"", "password");
		
	}
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithEmptyAdressePasswordC() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", "adressePays",
				"password", "");
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullAdressePassword() throws MissingRequiredInformationException{	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", "adressePays",
				null, "password");
		
	}
	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullAdressePasswordC() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", "adressePays",
				"password", null);
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullAddress() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email",null,"adresseCP", "adresseVille", "adressePays",
				"password", "password");
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullCp() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue",null, "adresseVille", "adressePays",
				"password", "password");
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullAddressVille() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", null, "adressePays",
				"password", "password");
		
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateAccountWithNullAddressPays() throws MissingRequiredInformationException {	
		
		service.createCustomer("name", "surname","email","adresseRue","adresseCP", "adresseVille", null,
				"password", "password");
		
	}
	
	
	@Test (expected=IllegalArgumentException.class)
	public void testCannotCreateAccountWithInvalidEamil() throws IllegalArgumentException {	
		
		service.validateEmail("dreamit.proxystat");
	
	}
	
	
	@Test (expected=IllegalArgumentException.class)
	public void testCannotCreateAccountWithDifferentPassword() throws IllegalArgumentException {	
		
		service.compareTwoPassword("password", "differentPassword");
	
	}
	


////Vérifier que la DAO est bien appelée
	@Test
    public void testServiceValidateRegisterCallDAO(){
		
		service.findAll();
		
		verify(customerDao).findAll();
	}

	@Test
	public void testFindCustomerWithNameAndSurnameInBdd(){
		String name="john";
		String surname="doe";
		
		service.findByNameAndSurname(name, surname);

		verify(customerDao).findCustomerByNameAndSurname(name, surname);
	}
	
	@Test
	public void testFindCustomerWithNameNull(){
		String name="";
		String surname="doe";
		
		List<Customer> customer= service.findByNameAndSurname(name, surname);

		assertTrue(customer==null);
	}
	
	@Test
	public void testFindCustomerWithSurnameNull(){
		String name="john";
		String surname="";
		
		List<Customer> customer= service.findByNameAndSurname(name, surname);

		assertTrue(customer==null);
	}
	
	@Test
	public void testFindCustomerWithNameAndSurnameNotInBdd(){
		String name="faux client name";
		String surname="faux client surname";
		
		List<Customer> customer= service.findByNameAndSurname(name, surname);

		assertTrue(customer.size()<=0);
	}
}
