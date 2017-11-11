package com.dreamit.proxystat.model.dto;

/**
 * 
 * @author rudy
 * classe non persistente
 * utile pour le serviceSendMail
 */
public class MessageMail {
	
	private String surname;
	private String name;
	private String email; 
	private String category;
	private String message;
	
	public MessageMail(){}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
