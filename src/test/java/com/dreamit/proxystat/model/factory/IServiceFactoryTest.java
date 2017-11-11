package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.factory.impl.ServiceFactoryImpl;

/**
 * Category factory test
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IServiceFactoryTest {

	@InjectMocks
	private ServiceFactoryImpl factory;
	
	@Test
	public void testCanCreateServiceUsingFactory() {
		Service result;
		Service expected = new Service();
		String name = "a";
		String description = "a";
		expected.setName(name);
		expected.setDescription(description);
		
		result = factory.createService(name, description);
		
		assertEquals(expected.getName(), result.getName());
		assertEquals(expected.getDescription(), result.getDescription());
	}
	
}
