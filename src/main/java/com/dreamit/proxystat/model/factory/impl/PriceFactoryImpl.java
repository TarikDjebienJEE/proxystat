package com.dreamit.proxystat.model.factory.impl;


import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.factory.IPriceFactory;

@Component
public class PriceFactoryImpl implements IPriceFactory {

	@Override
	public Price createPrice(Float price, Float margin, Float discountPrice,
			Boolean discounted, Float taxRate) {
		Price priceToCreate = new Price();
		priceToCreate.setPrice(price);
		priceToCreate.setMargin(margin);
		priceToCreate.setDiscountPrice(discountPrice);
		priceToCreate.setDiscounted(discounted);
		priceToCreate.setTaxRate(taxRate);
		return priceToCreate;
	}


}
