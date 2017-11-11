package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.Option;

/**
 * Option factory for controllers
 * @author tarik djebien
 *
 */
public interface IOptionFactory {
	
	/**
	 * option method, don't persist the object
	 * @return a new instance of a option
	 */
	Option createOption(Boolean perPerson, Float pricePercentage);

}
