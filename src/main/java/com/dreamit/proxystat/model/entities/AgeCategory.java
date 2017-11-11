package com.dreamit.proxystat.model.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe representant un AgeCategory
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class AgeCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Integer startAge;
	
	private Integer endAge;

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
	 * @return the startAge
	 */
	public Integer getStartAge() {
		return startAge;
	}

	/**
	 * @param startAge the startAge to set
	 */
	public void setStartAge(Integer startAge) {
		this.startAge = startAge;
	}

	/**
	 * @return the endAge
	 */
	public Integer getEndAge() {
		return endAge;
	}

	/**
	 * @param endAge the endAge to set
	 */
	public void setEndAge(Integer endAge) {
		this.endAge = endAge;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		buffer.append(" : ");
		buffer.append(startAge);
		buffer.append(" - ");
		buffer.append(endAge);
		
		return buffer.toString();
	}
	
}	