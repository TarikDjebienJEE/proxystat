package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.factory.IEquipmentFactory;

@Component(value = "equipmentFactory")
public class EquipmentFactoryImpl implements IEquipmentFactory {

	@Override
	public Equipment createEquipment(Service service, Integer minimumHeight,
			String quality, Integer size, Integer stockQuantity,
			Category category, AgeCategory ageCategory, Period period,
			Price price) {
		Equipment equipment = new Equipment();
		
		equipment.setService(service);
		equipment.setMinimumHeight(minimumHeight);
		equipment.setQuality(quality);
		equipment.setSize(size);
		equipment.setStockQuantity(stockQuantity);
		equipment.setCategory(category);
		equipment.setAgeCategory(ageCategory);
		equipment.setPeriod(period);
		equipment.setPrice(price);
		
		return equipment;
	}

}
