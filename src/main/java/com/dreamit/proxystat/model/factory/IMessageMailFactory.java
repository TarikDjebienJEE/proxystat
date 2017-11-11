package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.dto.MessageMail;

/**
 * fabrique de message mail (pour service de contact)
 * @author rudy stienne
 *
 */

public interface IMessageMailFactory {

	/**
	 * instancie un objet MessageMail
	 * @return un objet MessageMail
	 */
	MessageMail createMessageMail(String surname, String name,String email, String category,String message);

}
