package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.factory.IPartnerFactory;

@Component(value = "TrainingPartnerFactory")
public class TrainingPartnerFactoryImpl implements IPartnerFactory {

	@Override
	public Partner createPartner(String name, String description) {
		Partner trainingPartner = new TrainingPartner();
		trainingPartner.setName(name);
		trainingPartner.setDescription(description);
		return trainingPartner;
	}

}
