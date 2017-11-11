package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.factory.impl.PriceFactoryImpl;

/**
 * Price factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IPriceFactoryTest {

	@InjectMocks
	private PriceFactoryImpl factory;
	
	@Test
	public void testCanCreatePriceUsingFactory() {
		Price result;
		Price expected = new Price();
		Float price = new Float(23.0);
		expected.setPrice(price);
		Float margin = new Float(34.9);
		expected.setMargin(margin);
		Float discountPrice = new Float(14.0);
		expected.setDiscountPrice(discountPrice);
		Boolean discounted = false;
		expected.setDiscounted(discounted);
		Float taxRate = new Float(35.0);
		expected.setTaxRate(taxRate);
		
		result = factory.createPrice(price, margin, discountPrice, discounted, taxRate);
		
		assertEquals(expected.getPrice(), 		result.getPrice());
		assertEquals(expected.getMargin(), 		result.getMargin());
		assertEquals(expected.getTaxRate(), 	result.getTaxRate());
		assertEquals(expected.getDiscounted(), 	result.getDiscounted());
		assertEquals(expected.getDiscountPrice(), 	result.getDiscountPrice());
	}
	
}
