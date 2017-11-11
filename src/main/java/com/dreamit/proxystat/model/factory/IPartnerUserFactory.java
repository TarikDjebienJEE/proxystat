package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.User;

/**
 * PartnerUser factory for controllers
 * @author tarik djebien
 *
 */
public interface IPartnerUserFactory {
	
	/**
	 * PartnerUser method, don't persist the object
	 * @return a new instance of a PartnerUser
	 */
	PartnerUser createPartnerUser(String name, String surname, String jobtitle, User user);

}
