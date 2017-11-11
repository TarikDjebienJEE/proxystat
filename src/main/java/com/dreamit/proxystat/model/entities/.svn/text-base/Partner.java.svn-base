package com.dreamit.proxystat.model.entities;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Classe abstraite pour les Partner
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Partner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id ;	
	
	protected String name ;
	
	protected String description;
	
	
	@OneToMany(mappedBy="partner")
	protected Collection<PartnerUser> partnerUser ;


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
	 * @return the partnerUser
	 */
	public Collection<PartnerUser> getPartnerUser() {
		return partnerUser;
	}


	/**
	 * @param partnerUser the partnerUser to set
	 */
	public void setPartnerUser(Collection<PartnerUser> partnerUser) {
		this.partnerUser = partnerUser;
	}
	
	
}