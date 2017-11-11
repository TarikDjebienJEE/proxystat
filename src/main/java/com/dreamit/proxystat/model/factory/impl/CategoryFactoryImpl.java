package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.factory.ICategoryFactory;

/**
 * Category factory simple implementation
 * @author acraske
 *
 */
@Component(value = "categoryFactory")
public class CategoryFactoryImpl implements ICategoryFactory {

	@Override
	public Category createCategory(String name, String description) {
		Category category = new Category();
		category.setName(name);
		category.setDescription(description);
		
		return category;
	}

}
