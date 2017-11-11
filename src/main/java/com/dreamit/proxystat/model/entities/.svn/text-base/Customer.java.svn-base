package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe representant les customers
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String name ; 

	private String surname;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth ; 

	private Byte[]  photo ;

	private String profile ;


	@OneToOne
	private Adress adress ; 


	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private User user; 


	@OneToMany(mappedBy="customer")
	private Collection<Booking> bookings ;


	@OneToMany(mappedBy="customer")
	private Collection<Rating> ratings ;	

	/**
	 * Constructeur par defaut
	 */
	public Customer() {super();}	


	/**
	 * Constructeur pour un customer
	 * @param user
	 */
	public Customer(User user) {
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
	 * @return the ratings
	 */
	public Collection<Rating> getRatings() {
		return ratings;
	}


	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(Collection<Rating> ratings) {
		this.ratings = ratings;
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
	 * @param photo the photo to set
	 */
	public void setPhoto(Byte[] photo) {
		this.photo = Arrays.copyOf(photo, photo.length);
	}


	/**
	 * @return the photo
	 */
	public Byte[] getPhoto() {
		return photo;
	}

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @return the adress
	 */
	public Adress getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(Adress adress) {
		this.adress = adress;
	}	

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @return the bookings
	 */
	public Collection<Booking> getBookings() {
		return bookings;
	}


	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(Collection<Booking> bookings) {
		this.bookings = bookings;
	}

}