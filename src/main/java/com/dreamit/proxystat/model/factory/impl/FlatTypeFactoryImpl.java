package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.factory.IFlatTypeFactory;

@Component
public class FlatTypeFactoryImpl implements IFlatTypeFactory {

	@Override
	public FlatType createFlatType(String name, String description,
			Integer numberOfBeds, Integer size) {
		FlatType flatTypeToCreate = new FlatType();
		flatTypeToCreate.setName(name);
		flatTypeToCreate.setDescription(description);
		flatTypeToCreate.setNumberOfBeds(numberOfBeds);
		flatTypeToCreate.setSize(size);
		return flatTypeToCreate;
	}

}
