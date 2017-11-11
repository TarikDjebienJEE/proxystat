package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.Price;


/**
 * Price factory for controllers
 * @author tarik
 *
 */
public interface IPriceFactory {

	/**
	 * factory method, don't persist the object
	 * @return a new instance of a price
	 */
	Price createPrice(Float price, Float margin, Float discountPrice, Boolean discounted, Float taxRate);
	
}
