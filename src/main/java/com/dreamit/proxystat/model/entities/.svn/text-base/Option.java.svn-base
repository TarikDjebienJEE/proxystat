package com.dreamit.proxystat.model.entities;
import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Classe representant un Option
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("Option")
public class Option extends PeriodService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Boolean perPerson;
		
	private Float pricePercentage;

	@ManyToOne(fetch=FetchType.EAGER)
	private Booking booking ;
	
	
	
	/**
	 * @return the perPerson
	 */
	public Boolean getPerPerson() {
		return perPerson;
	}

	/**
	 * @param perPerson the perPerson to set
	 */
	public void setPerPerson(Boolean perPerson) {
		this.perPerson = perPerson;
	}

	/**
	 * @return the pricePercentage
	 */
	public Float getPricePercentage() {
		return pricePercentage;
	}

	/**
	 * @param pricePercentage the pricePercentage to set
	 */
	public void setPricePercentage(Float pricePercentage) {
		this.pricePercentage = pricePercentage;
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
		String result = "Price Percentage: " ; 
		if (pricePercentage != null){
			result += pricePercentage + " %";
		}else{
			result += "0%";
		}
		
		return result;		
	}	
	
}
