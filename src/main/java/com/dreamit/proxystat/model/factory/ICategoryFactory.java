package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.Category;

/**
 * Category factory for controllers
 * @author acraske
 *
 */
public interface ICategoryFactory {

	/**
	 * factory method, don't persist the object
	 * @param name
	 * @param description
	 * @return a new instance of a category
	 */
	Category createCategory(String name, String description);
	
}
