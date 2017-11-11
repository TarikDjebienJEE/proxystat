package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * Classe pour les MechanicPartner
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("MechanicPartner")
public class MechanicPartner extends Partner implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@OneToMany(mappedBy="mechanicPartner")
	private Collection<Pass> passes ;

	public MechanicPartner() {
		super();
	}

	/**
	 * @return the passes
	 */
	public Collection<Pass> getPasses() {
		return passes;
	}


	/**
	 * @param passes the passes to set
	 */
	public void setPasses(Collection<Pass> passes) {
		this.passes = passes;
	}
	
	
	
}