package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.factory.impl.UserFactoryImpl;

/**
 * User factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IUserFactoryTest {

	@InjectMocks
	private UserFactoryImpl factory;
	
	@Test
	public void testCanCreateUserUsingFactory() {
		User result;
		User expected = new User();
		String login = "login";
		expected.setLogin(login);
		String password = "password";
		expected.setPassword(password);
		boolean enabled = true;
		expected.setEnabled(enabled);
		
		result = factory.createUser(login, password, enabled);
		
		assertEquals(expected.getLogin(), 		result.getLogin());
		assertEquals(expected.getPassword(), 	result.getPassword());
		assertEquals(expected.isEnabled(), 	result.isEnabled());
	}
	
}
