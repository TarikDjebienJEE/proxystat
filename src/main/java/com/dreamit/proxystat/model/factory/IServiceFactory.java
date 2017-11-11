package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.Service;

/**
 * Service factory for controllers
 * @author acraske
 *
 */
public interface IServiceFactory {

	/**
	 * factory method, don't persist the object
	 * @param name
	 * @param description
	 * @return a new instance of a category
	 */
	Service createService(String name, String description);
	
}
