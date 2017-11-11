package com.dreamit.proxystat.model.dto;

import java.util.List;

import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.Guest;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Payment;

/**
 * Data transient Object for a booking
 * @author Eric RAKOTOBE
 * @author tarik DJEBIEN
 *
 */
public class Basket {
	
	private Flat flat;
	
	private Float totalPrice;
	
	private Float totalAccount;
	
	private List<Option> optionsSelected;
	
	private List<Guest> guests;

	
	//TODO : enlever pass et guestEquipment, a gerer dans guests (corriger tests unitaires)
	private GuestEquipment guestEquipment;
	private Pass pass;
	
	
	
	private Payment payment;
	
	private String description;
	
	public Basket(){}

	/**
	 * @return the flat
	 */
	public Flat getFlat() {
		return flat;
	}

	/**
	 * @param flat the flat to set
	 */
	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	/**
	 * @return the totalPrice
	 */
	public Float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the totalAccount
	 */
	public Float getTotalAccount() {
		return totalAccount;
	}

	/**
	 * @param totalAccount the totalAccount to set
	 */
	public void setTotalAccount(Float totalAccount) {
		this.totalAccount = totalAccount;
	}

	/**
	 * @return the optionsSelected
	 */
	public List<Option> getOptionsSelected() {
		return optionsSelected;
	}

	/**
	 * @param optionsSelected the optionsSelected to set
	 */
	public void setOptionsSelected(List<Option> optionsSelected) {
		this.optionsSelected = optionsSelected;
	}

	/**
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * @param payment the payment to set
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	
	
	/**
	 * Methode retournant l'objet en parametre
	 * ou 'Non renseigne' si l'objet est nul
	 * @return the description
	 */
	public String returnObject(Object o) {
		if (o == null){
			return "Non renseigne" ; 
		}
		return o.toString();
	}
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		String passageLigne = "<br />";
		StringBuffer sb = new StringBuffer()
		.append(passageLigne)
		.append("- Flat selected : ").append(this.getFlat()).append(passageLigne) ; 
		
		if (this.optionsSelected != null){
			int sizeOfOptionsSelected = this.optionsSelected.size();
			sb.append("- Options selected : ").append(sizeOfOptionsSelected)
			.append(" options").append(passageLigne).append("(");
			for (Option o : this.optionsSelected){
				sb.append(returnObject(o)).append(", ");
			}
			sb.append(")").append(passageLigne);
		}

		
		sb
		.append("- Payment selected : ").append(returnObject(this.getPayment())).append(passageLigne)
		.append("- Total price order : ").append(this.getTotalPrice()).append(passageLigne)
		.append("- Account price order : ").append(this.getTotalAccount()).append(passageLigne);
		setDescription(sb.toString());
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the guests
	 */
	public List<Guest> getGuests() {
		return guests;
	}

	/**
	 * @param guests to set
	 */
	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	/**
	 * @return the guestEquipment
	 */
	public GuestEquipment getGuestEquipment() {
		return guestEquipment;
	}

	/**
	 * @param guestEquipment the guestEquipment to set
	 */
	public void setGuestEquipment(GuestEquipment guestEquipment) {
		this.guestEquipment = guestEquipment;
	}

	/**
	 * @return the pass
	 */
	public Pass getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(Pass pass) {
		this.pass = pass;
	};
	
}
