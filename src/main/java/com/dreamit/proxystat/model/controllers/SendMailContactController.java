package com.dreamit.proxystat.model.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.Logger;

import com.dreamit.proxystat.model.dto.MessageMail;
import com.dreamit.proxystat.model.factory.IMessageMailFactory;
import com.dreamit.proxystat.model.service.IServiceSendMail;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;


@Controller
@RequestMapping(value = "*.contact")
@Scope(value = "singleton")
public class SendMailContactController {

	@Autowired
	private IServiceSendMail serviceSendMail;

	@Autowired
	private IMessageMailFactory messageMailFactory;

	private static Logger logger = Logger.getLogger(SendMailContactController.class);
	
	@RequestMapping(value="/returnViewContact")
	public String returnViewContact() {
		return  SpringViewResolutionConstants.VIEW_CONTACT;
	}


	@RequestMapping(value = "/sendMail", method = RequestMethod.POST)
	public String sendMail(HttpServletRequest httpServletRequest, ModelMap model,
			@RequestParam(value = "contactname", required = true) String contactname,
			@RequestParam(value = "contactsurname", required = true) String contactsurname,
			@RequestParam(value = "mail", required = true) String mail,
			@RequestParam(value = "categoryChoice", required = true) String categoryChoice,
			@RequestParam(value = "message", required = true) String message
			) {

		MessageMail messageAEnvoyer = messageMailFactory.createMessageMail(contactsurname, contactname, mail, categoryChoice, message);

		try {
			if(serviceSendMail.sendMail(messageAEnvoyer)) {
				model.put("messageOk", "Votre message a bien été envoyé");
			}
			else { 
				List<String> fieldsInError = serviceSendMail.fieldsInError(messageAEnvoyer);
				String messageReturn;
				StringBuffer msg = new StringBuffer();
				for (String field : fieldsInError) {
					msg.append(field);
					msg.append(" ");
				}	
				messageReturn = msg.toString();
				
				model.put("messageKo", "Message non envoyé car champs erronnés : " + messageReturn);
			}
		} catch (UnsupportedEncodingException e) {
			logger.error("exception UnsupportedEncodingException levée dans controller SendMailContactController");
		} catch (MessagingException e) {
			logger.error("exception MessagingException levée dans controller SendMailContactController");
		}

		return SpringViewResolutionConstants.VIEW_CONTACT;
	}

}