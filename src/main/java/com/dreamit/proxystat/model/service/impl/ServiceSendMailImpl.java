package com.dreamit.proxystat.model.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.dreamit.proxystat.model.dto.MessageMail;
import com.dreamit.proxystat.model.service.IServiceSendMail;


@Service(value = "serviceSendMail")
public class ServiceSendMailImpl implements IServiceSendMail{
	
	private static final int SMTP_PORT = 465;
	// contiendra les données du fichier de propriété smtp.properties
	private static ResourceBundle smtpBundle = ResourceBundle.getBundle("smtp");
	
	
	public List<String> fieldsInError(MessageMail mail){
		List<String> fields = new ArrayList<String>();
		if(mail.getSurname().equals("")){
			fields.add("prenom");
		}
		if(mail.getName().equals("")){
			fields.add("nom");
		}
		if(mail.getEmail().equals("")){
			fields.add("mail");
		}
		else{
			if(!Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", mail.getEmail())){
				fields.add("mail");
			}
		}
		
		if(mail.getMessage().equals("")){
			fields.add("message");
			}
	return fields;
	}
	
	
	@Override
	public boolean checkMail(String surname, String name, String email, String category, String message) {
		if(surname.equals("") || name.equals("") || email.equals("") || message.equals("")){
			return false;
		}
		// pattern verifiant la validité d'un mail
		// si ******@****.com : true ou *****.*****@****.com true sinon false
		if(Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email)){
			return true;
		}
		return false;
	}

	@Override
	public boolean sendMail(MessageMail mail) throws UnsupportedEncodingException, MessagingException {
		
		if(checkMail(mail.getSurname(),mail.getName(),mail.getEmail(),mail.getCategory(),mail.getMessage())){
        Properties propsSSL = new Properties();

       // utilise le protocole smtps
        propsSSL.put("mail.transport.protocol", smtpBundle.getString("mail.smtp.protocol"));
       // utilise le protocole smtp de google (gmail)
        propsSSL.put("mail.smtps.host", smtpBundle.getString("mail.smtp.host"));

        // cela indique qu'il faut une authentification (login + password)
        propsSSL.put("mail.smtps.auth", "true");

        // instancie une session ssl et met en route le mode debug
        Session sessionSSL = Session.getInstance(propsSSL);
        sessionSSL.setDebug(true);

        // construction du message à envoyer
        Message messageSSL = new MimeMessage(sessionSSL);
        // l'emetteur du message, 1er paramètre :adresse mail de l'emetteur 2ème paramètre : nom de l'emetteur, celui qui s'affichera juste à coté du mail
        messageSSL.setFrom(new InternetAddress(mail.getEmail(), mail.getName() + " " + mail.getSurname()));
        // destinataire du message, ici le gérant de proxystation
        messageSSL.setRecipients(Message.RecipientType.TO, InternetAddress.parse(smtpBundle.getString("mail.session.user.email"))); 
        // objet du message
        messageSSL.setSubject(mail.getCategory());
        // enfin le corps du mail
        messageSSL.setText(mail.getMessage());
        
        // permet l'envoie du mail
        Transport transportSSL = sessionSSL.getTransport();
        // ici on indique le proctocole utilisé, le port, et l'authentification requise : login + password
        transportSSL.connect(smtpBundle.getString("mail.smtp.host"), SMTP_PORT, smtpBundle.getString("mail.session.user"), smtpBundle.getString("mail.session.pass")); 
        transportSSL.sendMessage(messageSSL, messageSSL.getAllRecipients());
        transportSSL.close();
        return true;
		}
		
		return false;
	}
	
	

}
