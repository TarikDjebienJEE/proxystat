package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.factory.IPartnerFactory;

@Component(value = "MechanicPartnerFactory")
public class MechanicPartnerFactoryImpl implements IPartnerFactory {

	@Override
	public Partner createPartner(String name, String description) {
		Partner mechanicPartner = new MechanicPartner();
		mechanicPartner.setName(name);
		mechanicPartner.setDescription(description);
		return mechanicPartner;
	}

}
