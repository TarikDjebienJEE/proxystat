package com.dreamit.proxystat.model.entities;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Classe representant un utilisateur
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class PartnerUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name ; 
	private String surname ; 
	private String jobtitle ;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Partner partner ;
	
	
	@OneToOne(cascade={CascadeType.ALL})
	private User user; 
	
	
	
	/**
	 * Constructeur par defaut
	 */
	public PartnerUser() {
		super();
	}
	
	
	/**
	 * @return the jobtitle
	 */
	public String getJobtitle() {
		return jobtitle;
	}


	/**
	 * @param jobtitle the jobtitle to set
	 */
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}


	/**
	 * @return the partner
	 */
	public Partner getPartner() {
		return partner;
	}


	/**
	 * @param partner the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}


	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}


	/**
	 * @param user
	 */
	public PartnerUser(User user) {
		super();
		this.user = user;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

}