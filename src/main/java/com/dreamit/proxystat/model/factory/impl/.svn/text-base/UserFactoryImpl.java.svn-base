package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.factory.IUserFactory;

@Component
public class UserFactoryImpl implements IUserFactory {

	@Override
	public User createUser(String login, String password, Boolean enabled) {
		User user = new User();
		user.setLogin(login);
		user.setPassword(password);
		user.setEnabled(enabled);
		return user;
	}

	

}
