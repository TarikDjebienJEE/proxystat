package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.FlatType;;


/**
 * Flat type factory for controllers
 * @author tarik
 *
 */
public interface IFlatTypeFactory {

	/**
	 * factory method, don't persist the object
	 * @return a new instance of a flat type
	 */
	FlatType createFlatType(String name, String description, Integer numberOfBeds, Integer size);
	
}
