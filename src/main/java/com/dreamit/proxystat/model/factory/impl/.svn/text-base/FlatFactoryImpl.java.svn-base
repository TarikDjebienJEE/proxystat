package com.dreamit.proxystat.model.factory.impl;


import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.factory.IFlatFactory;

@Component
public class FlatFactoryImpl implements IFlatFactory {

	@Override
	public Flat createFlat(String roomNumber, String floor,
			Boolean handicapAccess, String status, Boolean avalaible) {
		Flat flatToCreate = new Flat();
		flatToCreate.setRoomNumber(roomNumber);
		flatToCreate.setFloor(floor);
		flatToCreate.setHandicapAccess(handicapAccess);
		flatToCreate.setStatus(status);
		flatToCreate.setAvalaible(avalaible);
		return flatToCreate;
	}


}
