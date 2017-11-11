package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe representant un PaymentCredit
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("PaymentCredit")
public class PaymentCredit extends Payment implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer cardNumber;
	
	private String type;
	
	@Temporal(TemporalType.DATE)
	private Date expirationDate;
	
	private Boolean authorized;


	/**
	 * @return the cardNumber
	 */
	public Integer getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the authorized
	 */
	public Boolean getAuthorized() {
		return authorized;
	}

	/**
	 * @param authorized the authorized to set
	 */
	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}
	
	
}	