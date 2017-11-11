package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.entities.SportPartner;
import com.dreamit.proxystat.model.factory.IPartnerFactory;

@Component(value = "SportPartnerFactory")
public class SportPartnerFactoryImpl implements IPartnerFactory {

	@Override
	public Partner createPartner(String name, String description) {
		Partner sportPartner = new SportPartner();
		sportPartner.setName(name);
		sportPartner.setDescription(description);
		return sportPartner;
	}

}
