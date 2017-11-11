package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;

/**
 * Equipment factory for controllers
 * @author acraske
 *
 */
public interface IEquipmentFactory {

	/**
	 * factory method, don't persist the object
	 * @param name
	 * @param description
	 * @return a new instance of an equipment
	 */
	Equipment createEquipment(Service service, Integer minimumHeight, String quality,
			Integer size, Integer stockQuantity, Category category,
			AgeCategory ageCategory, Period period, Price price);
	
}
