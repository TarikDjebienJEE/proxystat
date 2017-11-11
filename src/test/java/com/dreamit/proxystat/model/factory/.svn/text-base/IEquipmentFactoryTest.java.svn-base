package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.factory.impl.EquipmentFactoryImpl;

/**
 * Equipment factory test
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IEquipmentFactoryTest {

	@InjectMocks
	private EquipmentFactoryImpl factory;
	
	@Mock private Service service;
	@Mock private Category category;
	@Mock private AgeCategory ageCategory;
	@Mock private Period period;
	@Mock private Price price;
	
	@Test
	public void testCanCreateEquipmentUsingFactory() {
		Equipment expected = new Equipment();
		Equipment result;
		int minimumHeight = 0;
		int stockQuantity = 0;
		String quality = "test";
		int size = 0;
		expected.setService(service);
		expected.setMinimumHeight(minimumHeight);
		expected.setQuality(quality);
		expected.setSize(size);
		expected.setStockQuantity(stockQuantity);
		expected.setCategory(category);
		expected.setAgeCategory(ageCategory);
		expected.setPeriod(period);
		expected.setPrice(price);
		
		result = factory.createEquipment(service, minimumHeight, quality, size, stockQuantity, category, ageCategory, period, price);
		
		assertEquals(result.getService(),			expected.getService());
		assertEquals(result.getMinimumHeight(),		expected.getMinimumHeight());
		assertEquals(result.getQuality(),			expected.getQuality());
		assertEquals(result.getSize(),				expected.getSize());
		assertEquals(result.getStockQuantity(),		expected.getStockQuantity());
		assertEquals(result.getCategory(),			expected.getCategory());
		assertEquals(result.getAgeCategory(),		expected.getAgeCategory());
		assertEquals(result.getPeriod(),			expected.getPeriod());
		assertEquals(result.getPrice(),				expected.getPrice());
	}
	
}
