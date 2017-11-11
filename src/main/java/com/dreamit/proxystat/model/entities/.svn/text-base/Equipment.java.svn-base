package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Classe representant un Equipment
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("Equipment")
public class Equipment extends PeriodService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String quality;
	
	private Integer size ; 
	
	private Integer minimumHeight ; 
	
	private Integer stockQuantity ; 
	
	@OneToOne(cascade={CascadeType.ALL})
	private AgeCategory ageCategory; 
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	private SportPartner sportPartner ;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Category category ;


	@OneToMany(mappedBy="equipment")
	private Collection<GuestEquipment> guestEquipments ;
	
	/**
	 * Constructeur par defaut
	 */
	public Equipment() {
		super();
	}


	/**
	 * @param ageCategory
	 */
	public Equipment(AgeCategory ageCategory) {
		super();
		this.ageCategory = ageCategory;
	}


	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}


	/**
	 * @param quality the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
	}


	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}


	/**
	 * @return the minimumHeight
	 */
	public Integer getMinimumHeight() {
		return minimumHeight;
	}


	/**
	 * @param minimumHeight the minimumHeight to set
	 */
	public void setMinimumHeight(Integer minimumHeight) {
		this.minimumHeight = minimumHeight;
	}


	/**
	 * @return the stockQuantity
	 */
	public Integer getStockQuantity() {
		return stockQuantity;
	}


	/**
	 * @param stockQuantity the stockQuantity to set
	 */
	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
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
	 * @return the sportPartner
	 */
	public SportPartner getSportPartner() {
		return sportPartner;
	}


	/**
	 * @param sportPartner the sportPartner to set
	 */
	public void setSportPartner(SportPartner sportPartner) {
		this.sportPartner = sportPartner;
	}


	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
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
	public void setGuestEquipments(Collection<GuestEquipment> guestEquipments) {
		this.guestEquipments = guestEquipments;
	}
	
	
}	