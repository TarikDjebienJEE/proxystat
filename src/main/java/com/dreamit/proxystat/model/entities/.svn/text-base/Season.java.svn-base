package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe representant un Season
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class Season implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	
	@Temporal(TemporalType.DATE)
	private Date endDate;

	@OneToMany(mappedBy="season")
	private Collection<Period> periods ;
	
	
	
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
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}


	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}


	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	/**
	 * @return the periods
	 */
	public Collection<Period> getPeriods() {
		return periods;
	}


	/**
	 * @param periods the periods to set
	 */
	public void setPeriods(Collection<Period> periods) {
		this.periods = periods;
	}
	

}	