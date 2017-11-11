package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.dto.MessageMail;
import com.dreamit.proxystat.model.factory.IMessageMailFactory;


/**
*
* @author rudy stienne
* fabrique qui implemente l'interface IMessageMailFactory
* elle cree un objet MessageMail
*/

@Component(value = "messageMailFactory")
public class MessageMailFactoryImpl implements IMessageMailFactory{

	@Override
	public MessageMail createMessageMail(String surname, String name,
			String email, String category, String message) {
		MessageMail newMail = new MessageMail();
		
		newMail.setSurname(surname);
		newMail.setName(name);
		newMail.setEmail(email);
		newMail.setCategory(category);
		newMail.setMessage(message);
		
		return newMail;
	}

}
