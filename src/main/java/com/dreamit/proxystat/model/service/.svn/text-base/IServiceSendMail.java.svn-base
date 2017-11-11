package com.dreamit.proxystat.model.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import com.dreamit.proxystat.model.dto.MessageMail;

public interface IServiceSendMail {

	boolean checkMail(String surname,String name,String email,String category,String message);
	
	boolean sendMail(MessageMail mail) throws  UnsupportedEncodingException, MessagingException;
	
	List<String> fieldsInError(MessageMail mail);
	
}
