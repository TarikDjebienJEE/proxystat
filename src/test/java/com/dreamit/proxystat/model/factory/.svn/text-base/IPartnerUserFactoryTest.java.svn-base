package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.factory.impl.PartnerUserFactoryImpl;

/**
 * Partner User factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IPartnerUserFactoryTest {

	@InjectMocks
	private PartnerUserFactoryImpl factory;
	
	@Test
	public void testCanCreatePartnerUserUsingFactory() {
		PartnerUser result;
		PartnerUser expected = new PartnerUser();
		String name = "name";
		expected.setName(name);
		String surname = "surname";
		expected.setSurname(surname);
		String jobtitle = "jobtitle";
		expected.setJobtitle(jobtitle);
		User user = null;
		expected.setUser(user);
		
		result = factory.createPartnerUser(name, surname, jobtitle, user);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getSurname(), 		result.getSurname());
		assertEquals(expected.getJobtitle(), 		result.getJobtitle());
		assertEquals(expected.getUser(), 		result.getUser());
	}
	
}
