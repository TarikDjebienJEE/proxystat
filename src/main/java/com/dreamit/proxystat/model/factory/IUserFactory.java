package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.User;

/**
 * User factory for controllers
 * @author tarik djebien
 *
 */
public interface IUserFactory {
	
	/**
	 * factory method, don't persist the object
	 * @return a new instance of a User
	 */
	User createUser(String login, String password, Boolean enabled);

}
