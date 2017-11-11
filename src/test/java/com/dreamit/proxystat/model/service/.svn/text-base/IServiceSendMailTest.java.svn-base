package com.dreamit.proxystat.model.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dto.MessageMail;
import com.dreamit.proxystat.model.service.impl.ServiceSendMailImpl;


@RunWith(MockitoJUnitRunner.class)
public class IServiceSendMailTest {

	@InjectMocks
	private ServiceSendMailImpl serviceSendMail;
	
	
	@Test
	public void testSendMailWithCorrectFields() throws UnsupportedEncodingException, MessagingException {
		Boolean reponseReturn=false;
		MessageMail mess = new MessageMail();
		mess.setName("stienne");
		mess.setSurname("rudy");
		mess.setEmail("com.miage.dreamit@gmail.com");
		mess.setCategory("test");
		mess.setMessage("test");
		
		reponseReturn=serviceSendMail.sendMail(mess);

		assertTrue(reponseReturn);
	}
	
	@Test
	public void testSendMailWithFieldSurnameEmpty() throws UnsupportedEncodingException, MessagingException {
		Boolean reponseReturn=false;
		MessageMail mess = new MessageMail();
		mess.setName("stienne");
		mess.setSurname("");
		mess.setEmail("com.miage.dreamit@gmail.com");
		mess.setCategory("test");
		mess.setMessage("test");
		
		reponseReturn=serviceSendMail.sendMail(mess);

		assertFalse(reponseReturn);
	}
	
	@Test
	public void testSendMailWithFieldNameEmpty() throws UnsupportedEncodingException, MessagingException {
		Boolean reponseReturn=false;
		MessageMail mess = new MessageMail();
		mess.setName("");
		mess.setSurname("rudy");
		mess.setEmail("com.miage.dreamit@gmail.com");
		mess.setCategory("test");
		mess.setMessage("test");
		
		reponseReturn=serviceSendMail.sendMail(mess);

		assertFalse(reponseReturn);
	}
	
	@Test
	public void testSendMailWithFieldEmailEmpty() throws UnsupportedEncodingException, MessagingException {
		Boolean reponseReturn=false;
		MessageMail mess = new MessageMail();
		mess.setName("stienne");
		mess.setSurname("rudy");
		mess.setEmail("");
		mess.setCategory("test");
		mess.setMessage("test");
		
		reponseReturn=serviceSendMail.sendMail(mess);

		assertFalse(reponseReturn);
	}
	
	@Test
	public void testSendMailWithFieldEmailMalFormed() throws UnsupportedEncodingException, MessagingException {
		Boolean reponseReturn=false;
		MessageMail mess = new MessageMail();
		mess.setName("stienne");
		mess.setSurname("rudy");
		mess.setEmail("com.miage.dreamitgmail.com");
		mess.setCategory("test");
		mess.setMessage("test");
		
		reponseReturn=serviceSendMail.sendMail(mess);

		assertFalse(reponseReturn);
	}
	
	@Test
	public void testSendMailWithFieldMessageEmpty() throws UnsupportedEncodingException, MessagingException {
		Boolean reponseReturn=false;
		MessageMail mess = new MessageMail();
		mess.setName("stienne");
		mess.setSurname("rudy");
		mess.setEmail("com.miage.dreamitgmail.com");
		mess.setCategory("test");
		mess.setMessage("");
		
		reponseReturn=serviceSendMail.sendMail(mess);

		assertFalse(reponseReturn);
	}
}
