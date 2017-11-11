package com.dreamit.proxystat.model.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 * Classe abstraite pour les periodes service
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PeriodService {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id ;	
	
	@OneToOne(cascade={CascadeType.ALL})
	protected Service service; 
	
	@OneToOne(cascade={CascadeType.ALL})
	protected Price price; 
	
	@OneToOne(cascade={CascadeType.ALL})
	protected Period period;


	/**
	 * Constructeur
	 */
	public PeriodService() {
		super();
	}


	/**
	 * @param service
	 */
	public PeriodService(Service service) {
		super();
		this.service = service;
	}



	/**
	 * @param period
	 */
	public PeriodService(Period period) {
		super();
		this.period = period;
	}


	/**
	 * @param price
	 */
	public PeriodService(Price price) {
		super();
		this.price = price;
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
	 * @return the service
	 */
	public Service getService() {
		return service;
	}


	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}


	/**
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(Price price) {
		this.price = price;
	}


	/**
	 * @return the period
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public void setPeriod(Period period) {
		this.period = period;
	}

}