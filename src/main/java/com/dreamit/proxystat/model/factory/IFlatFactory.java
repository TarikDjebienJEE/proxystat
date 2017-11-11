package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.Flat;


/**
 * Flat factory for controllers
 * @author tarik djebien
 *
 */
public interface IFlatFactory {

	/**
	 * factory method, don't persist the object
	 * @return a new instance of a flat
	 */
	Flat createFlat(String roomNumber, String floor, Boolean handicapAccess, String status, Boolean avalaible);
	
}
