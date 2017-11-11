package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe representant un Guest
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class Guest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String surname;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	private Integer height;
	
	private Integer shoesSize;
	
	@OneToMany(mappedBy="guest", fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private Set<GuestEquipment> guestEquipments ;
	
	@OneToOne(cascade={CascadeType.ALL})
	private AgeCategory ageCategory;

	@OneToOne(cascade={CascadeType.ALL})
	private Pass pass ; 
	
	@OneToOne(cascade={CascadeType.ALL})
	private TrainingCourse trainingCourse;	
	
	@ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private Booking booking ;
	
	/**
	 * Constructeurs par defaut
	 */
	public Guest() {
		super();
	}


	/**
	 * @param ageCategory
	 */
	public Guest(AgeCategory ageCategory) {
		super();
		this.ageCategory = ageCategory;
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


	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}


	/**
	 * @return the shoesSize
	 */
	public Integer getShoesSize() {
		return shoesSize;
	}


	/**
	 * @param shoesSize the shoesSize to set
	 */
	public void setShoesSize(Integer shoesSize) {
		this.shoesSize = shoesSize;
	}


	/**
	 * @return the guestEquipments
	 */
	public Collection<GuestEquipment> getGuestEquipments() {
		return guestEquipments;
	}


	/**
	 * @param guestEquipments the guestEquipments to set
	 */
	public void setGuestEquipments(Set<GuestEquipment> guestEquipments) {
		this.guestEquipments = guestEquipments;
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
	 * @return the pass
	 */
	public Pass getPass() {
		return pass;
	}


	/**
	 * @param pass the pass to set
	 */
	public void setPass(Pass pass) {
		this.pass = pass;
	}

	
	
	/**
	 * @return the trainingCourse
	 */
	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}


	/**
	 * @param trainingCourse the trainingCourse to set
	 */
	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
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
	
}	