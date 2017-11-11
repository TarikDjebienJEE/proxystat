package com.dreamit.proxystat.model.entities;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Classe representant un Pass
 * @author RAKOTOBE Sitraka Eric
 */

@Entity
@DiscriminatorValue("Pass")
public class Pass extends PeriodService implements Serializable {
		
	
	private static final long serialVersionUID = 1L;
	
	private Boolean cautionReturned;
	
	private Float cautionPrice;
	
	
	@OneToOne(cascade={CascadeType.ALL})
	private Track track; 
	
	@OneToOne(cascade={CascadeType.ALL})
	private Duration duration; 
	
	@OneToOne(cascade={CascadeType.ALL})
	private AgeCategory ageCategory; 
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	private MechanicPartner mechanicPartner ;


	/**
	 * Constructeur par defaut
	 */
	public Pass() {
		super();
	}


	/**
	 * @param track
	 */
	public Pass(Track track) {
		super();
		this.track = track;
	}


	/**
	 * @param duration
	 */
	public Pass(Duration duration) {
		super();
		this.duration = duration;
	}


	/**
	 * @param ageCategory
	 */
	public Pass(AgeCategory ageCategory) {
		super();
		this.ageCategory = ageCategory;
	}

	/**
	 * @return the cautionReturned
	 */
	public Boolean getCautionReturned() {
		return cautionReturned;
	}


	/**
	 * @param cautionReturned the cautionReturned to set
	 */
	public void setCautionReturned(Boolean cautionReturned) {
		this.cautionReturned = cautionReturned;
	}


	/**
	 * @return the cautionPrice
	 */
	public Float getCautionPrice() {
		return cautionPrice;
	}


	/**
	 * @param cautionPrice the cautionPrice to set
	 */
	public void setCautionPrice(Float cautionPrice) {
		this.cautionPrice = cautionPrice;
	}


	/**
	 * @return the track
	 */
	public Track getTrack() {
		return track;
	}


	/**
	 * @param track the track to set
	 */
	public void setTrack(Track track) {
		this.track = track;
	}


	/**
	 * @return the duration
	 */
	public Duration getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}


	/**
	 * @return the ageCategory
	 */
	public AgeCategory getAgeCategory() {
		return ageCategory;
	}


	/**
	 * @param ageCategory the ageCategory to set
	 */
	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}


	/**
	 * @return the mechanicPartner
	 */
	public MechanicPartner getMechanicPartner() {
		return mechanicPartner;
	}


	/**
	 * @param mechanicPartner the mechanicPartner to set
	 */
	public void setMechanicPartner(MechanicPartner mechanicPartner) {
		this.mechanicPartner = mechanicPartner;
	}

	
}	