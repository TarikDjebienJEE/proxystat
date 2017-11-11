package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * Classe pour les periodes standards
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("StandardPeriod")
public class StandardPeriod extends Period implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public StandardPeriod(){
		super();
	}
	
}