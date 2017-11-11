package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.factory.IPartnerUserFactory;

@Component
public class PartnerUserFactoryImpl implements IPartnerUserFactory {

	@Override
	public PartnerUser createPartnerUser(String name, String surname,
			String jobtitle, User user) {
		PartnerUser partnerUser = new PartnerUser();
		partnerUser.setName(name);
		partnerUser.setSurname(surname);
		partnerUser.setJobtitle(jobtitle);
		partnerUser.setUser(user);
		return partnerUser;
	}

}
