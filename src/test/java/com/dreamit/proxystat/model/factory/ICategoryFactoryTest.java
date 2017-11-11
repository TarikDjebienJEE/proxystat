package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.factory.impl.CategoryFactoryImpl;

/**
 * Category factory test
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ICategoryFactoryTest {

	@InjectMocks
	private CategoryFactoryImpl factory;
	
	@Test
	public void testCanCreateCategoryUsingFactory() {
		Category result;
		Category expected = new Category();
		String name = "a";
		String description = "a";
		expected.setName(name);
		expected.setDescription(description);
		
		result = factory.createCategory(name, description);
		
		assertEquals(expected.getName(), result.getName());
		assertEquals(expected.getDescription(), result.getDescription());
	}
	
}
