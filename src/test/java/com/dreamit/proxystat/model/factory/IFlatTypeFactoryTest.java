package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.factory.impl.FlatTypeFactoryImpl;

/**
 * FlatType factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IFlatTypeFactoryTest {

	@InjectMocks
	private FlatTypeFactoryImpl factory;
	
	@Test
	public void testCanCreateFlatTypeUsingFactory() {
		FlatType result;
		FlatType expected = new FlatType();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description);
		Integer numberOfBeds = 2;
		expected.setNumberOfBeds(numberOfBeds);
		Integer size = 64;
		expected.setSize(size);
		
		result = factory.createFlatType(name, description, numberOfBeds, size);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getDescription(), 		result.getDescription());
		assertEquals(expected.getNumberOfBeds(), 		result.getNumberOfBeds());
		assertEquals(expected.getSize(), 		result.getSize());
		
	}
	
}
