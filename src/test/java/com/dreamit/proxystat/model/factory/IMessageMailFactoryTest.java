package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dto.MessageMail;
import com.dreamit.proxystat.model.factory.impl.MessageMailFactoryImpl;



/**
 * 
 * @author rudy stienne
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class IMessageMailFactoryTest {
	
	@InjectMocks
	private MessageMailFactoryImpl factory;
	
	@Test
	public void testCanCreateMessageMailUsingFactory() {
		MessageMail result;
		MessageMail expected = new MessageMail();
		String surname = "a";
		String name = "a";
		String email = "a";
		String category = "a";
		String message = "a";
		expected.setSurname(surname);
		expected.setName(name);
		expected.setEmail(email);
		expected.setCategory(category);
		expected.setMessage(message);
		
		result = factory.createMessageMail(surname, name,email, category, message);
		
		assertEquals(expected.getName(), result.getName());
		assertEquals(expected.getSurname(), result.getSurname());
		assertEquals(expected.getEmail(), result.getEmail());
		assertEquals(expected.getCategory(), result.getCategory());
		assertEquals(expected.getMessage(), result.getMessage());
	}
}
