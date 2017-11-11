package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * Classe pour les SportPartner
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("SportPartner")
public class SportPartner extends Partner implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="sportPartner")
	private Collection<Equipment> equipment ;

	public SportPartner() {
		super();
	}
	
	/**
	 * @return the equipment
	 */
	public Collection<Equipment> getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(Collection<Equipment> equipment) {
		this.equipment = equipment;
	}
	
	
	
}