package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe representant un GuestEquipment
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class GuestEquipment implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date leaseDate;
	
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	private Boolean returnStateAccepted;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Equipment equipment ;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Guest guest ;

	private String returnComments;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLeaseDate() {
		return leaseDate;
	}

	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Boolean getReturnStateAccepted() {
		return returnStateAccepted;
	}

	public void setReturnStateAccepted(Boolean returnStateAccepted) {
		this.returnStateAccepted = returnStateAccepted;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public String getReturnComments() {
		return returnComments;
	}

	public void setReturnComments(String returnComments) {
		this.returnComments = returnComments;
	}
	
}	