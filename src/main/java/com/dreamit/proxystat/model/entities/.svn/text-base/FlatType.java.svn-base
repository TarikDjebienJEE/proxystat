package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Classe representant un FlatType
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("FlatType")
public class FlatType extends PeriodService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String description;
	
	private Integer numberOfBeds;
		
	private Integer size;
	
	public FlatType(){}

	@OneToMany(mappedBy="flatType")
	private Collection<Flat> flats ;	

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the numberOfBeds
	 */
	public Integer getNumberOfBeds() {
		return numberOfBeds;
	}

	/**
	 * @param numberOfBeds the numberOfBeds to set
	 */
	public void setNumberOfBeds(Integer numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
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
	 * @return the flats
	 */
	public Collection<Flat> getFlats() {
		return flats;
	}

	/**
	 * @param flats the flats to set
	 */
	public void setFlats(Collection<Flat> flats) {
		this.flats = flats;
	}
	
	
}	