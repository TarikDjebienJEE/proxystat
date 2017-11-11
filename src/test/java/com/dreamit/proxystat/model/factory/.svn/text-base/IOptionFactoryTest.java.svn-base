package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.factory.impl.OptionFactoryImpl;

/**
 * Option factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IOptionFactoryTest {

	@InjectMocks
	private OptionFactoryImpl factory;
	
	@Test
	public void testCanCreateOptionUsingFactory() {
		Option result;
		Option expected = new Option();
		Boolean perPerson = true;
		expected.setPerPerson(perPerson);
		Float pricePercentage = new Float(34.0);
		expected.setPricePercentage(pricePercentage);
		
		result = factory.createOption(perPerson, pricePercentage);
		
		assertEquals(expected.getPerPerson(), 		result.getPerPerson());
		assertEquals(expected.getPricePercentage(), 		result.getPricePercentage());
	}
	
}
