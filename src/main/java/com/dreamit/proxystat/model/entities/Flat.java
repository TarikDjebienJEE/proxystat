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
 * Classe representant un Flat
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class Flat implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String roomNumber;
	
	private String floor;
	
	private Boolean handicapAccess;
	
	private String status;
	
	private Boolean avalaible;

	@ManyToOne(fetch=FetchType.EAGER)
	private FlatType flatType ;
	
	@OneToOne(cascade={CascadeType.ALL})
	private Booking booking; 
	
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
	 * @return the roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the handicapAccess
	 */
	public Boolean getHandicapAccess() {
		return handicapAccess;
	}

	/**
	 * @param handicapAccess the handicapAccess to set
	 */
	public void setHandicapAccess(Boolean handicapAccess) {
		this.handicapAccess = handicapAccess;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the avalaible
	 */
	public Boolean getAvalaible() {
		return avalaible;
	}

	/**
	 * @param avalaible the avalaible to set
	 */
	public void setAvalaible(Boolean avalaible) {
		this.avalaible = avalaible;
	}

	
	
	/**
	 * @return the flatType
	 */
	public FlatType getFlatType() {
		return flatType;
	}

	/**
	 * @param flatType the flatType to set
	 */
	public void setFlatType(FlatType flatType) {
		this.flatType = flatType;
	}

	/**
	 * @return the booking
	 */
	public Booking getBooking() {
		return booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String passageLigne = "<br />";
		StringBuffer sb = new StringBuffer()
		.append(passageLigne)
		.append("Room Number: ").append(roomNumber).append(passageLigne)
		.append("Floor: ").append(floor).append(passageLigne)
		.append("Handicap Access : ").append(handicapAccess).append(passageLigne)
		.append("Status: ").append(status).append(passageLigne);
		return sb.toString();		
	}
	
	
	
	
	
}	