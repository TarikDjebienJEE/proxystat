package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Classe representant les Bookings
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class Booking implements Serializable {

	private static final int TWO_WEEKS_IN_DAYS = 14;

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date startDate ;
	
	@Temporal(TemporalType.DATE)
	private Date endDate ;	
	
	@Temporal(TemporalType.DATE)
	private Date bookingDate;		
	
	@Transient
	private Integer numberOfPersons;
	
	@Transient
	private Float totalPrice;
	
	@Transient
	private Float taxPrice;
	
	@Transient
	private Float totalMargin;
	
	private Boolean advancePaid;
	
	private Float amountPaid ;
	
	private Boolean canceled;

	
	@ManyToOne(fetch=FetchType.EAGER)
	private Customer customer ;
	
	
	@OneToMany(mappedBy="booking")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Option> options ;
	
	
	@OneToMany(mappedBy="booking", fetch=FetchType.EAGER)
	private Collection<Guest> guests ;
	
	@OneToOne(cascade={CascadeType.ALL})
	private Flat flat; 
	
	
	@OneToMany(mappedBy="booking")
	private Collection<Payment> payments ;
	
	@Transient
	private Boolean beforeTwoWeeks;
	
	/**
	 * Constructeur par defaut
	 */
	public Booking() {
		super();
	}
	

	/**
	 * @param flat
	 */
	public Booking(Flat flat) {
		super();
		this.flat = flat;
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
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}
	


	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the numberOfPersons
	 */
	public Integer getNumberOfPersons() {
		return numberOfPersons;
	}

	/**
	 * @param numberOfPersons the numberOfPersons to set
	 */
	public void setNumberOfPersons(Integer numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	/**
	 * Le prix total est egale a :
	 * flat.flatType.price.price
	 * + for options : option => option.price.price
	 * + for guests : guest => pass.price.price
	 * + for guests : guest => for guestequipment : ge => ge.equipment.price.price
	 * @return the totalPrice
	 */
	public Float getTotalPrice() {
		Float total = 0f ; 
		Float flatPrice = 0f ;
		Float totalOptionPrice = 0f ; 
		Float guestPrice = 0f ; 
		Float guestEquipmentPrice = 0f ; 
		
		if (flat != null && flat.getFlatType()!= null && flat.getFlatType().getPrice() != null){
			flatPrice = flat.getFlatType().getPrice().getPrice() ;
		}
		
		if (options != null ){
			for (Option option : options) {
				if ( option.getPrice() != null){
					totalOptionPrice += option.getPrice().getPrice() ;
				}
			}
		}

		if (guests != null ){
			for (Guest guest : guests) {
				if (guest.getPass() != null && guest.getPass().getPrice() != null){
					guestPrice += guest.getPass().getPrice().getPrice() ;
				}
			}
		
		
			for (Guest guest : guests) {
				Collection<GuestEquipment> guestEquipments = guest.getGuestEquipments();
				for (GuestEquipment guestEquipment : guestEquipments) {
					if (guestEquipment.getEquipment() != null && guestEquipment.getEquipment().getPrice() != null){
						guestEquipmentPrice += guestEquipment.getEquipment().getPrice().getPrice();
					}
				}
			}
		}
		total = flatPrice + totalOptionPrice + guestPrice + guestEquipmentPrice ; 
		this.totalPrice = total;
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice ; 
	}

	/**
	 * @return the taxPrice
	 */
	public Float getTaxPrice() {
		return taxPrice;
	}

	/**
	 * @param taxPrice the taxPrice to set
	 */
	public void setTaxPrice(Float taxPrice) {
		this.taxPrice = taxPrice;
	}

	/**
	 * La marge est egale a : 
	 * flat.flatType.price.discountPrice
	 * + for options : option => option.price.discountPrice
	 * + for guests : guest => pass.price.discountPrice
	 * + for guests : guest => for guestequipment : ge => ge.equipment.price.discountPrice
	 * @return the totalMargin
	 */
	public Float getTotalMargin() {
		
		Float total = 0f ; 
		Float flatTypeDiscountPrice = 0f ;
		Float totalOptionDiscountPrice = 0f ; 
		Float guestDiscountPrice = 0f ; 
		Float guestEquipmentDiscountPrice = 0f ; 
		
		if (flat != null && flat.getFlatType()!= null && flat.getFlatType().getPrice() != null){
			flatTypeDiscountPrice = flat.getFlatType().getPrice().getDiscountPrice() ;
		}
		
		if (options != null ){
			for (Option option : options) {
				if ( option.getPrice() != null){
					totalOptionDiscountPrice += option.getPrice().getDiscountPrice();
				}
			}
		}

		if (guests != null ){
			for (Guest guest : guests) {
				if (guest.getPass() != null && guest.getPass().getPrice() != null){
					guestDiscountPrice += guest.getPass().getPrice().getDiscountPrice();
				}
			}
		
		
			for (Guest guest : guests) {
				Collection<GuestEquipment> guestEquipments = guest.getGuestEquipments();
				for (GuestEquipment guestEquipment : guestEquipments) {
					if (guestEquipment.getEquipment() != null && guestEquipment.getEquipment().getPrice() != null){
						guestEquipmentDiscountPrice += guestEquipment.getEquipment().getPrice().getDiscountPrice();
					}
				}
			}
		}
		total = flatTypeDiscountPrice + totalOptionDiscountPrice + guestDiscountPrice + guestEquipmentDiscountPrice ; 
		this.totalMargin = total;
		return totalMargin;
	}

	
	
	
	
	/**
	 * @param totalMargin the totalMargin to set
	 */
	public void setTotalMargin(Float totalMargin) {
		this.totalMargin = totalMargin;
	}

	/**
	 * @return the advancePaid
	 */
	public Boolean getAdvancePaid() {
		return advancePaid;
	}

	/**
	 * @param advancePaid the advancePaid to set
	 */
	public void setAdvancePaid(Boolean advancePaid) {
		this.advancePaid = advancePaid;
	}

	/**
	 * @return the amountPaid
	 */
	public Float getAmountPaid() {
		return amountPaid;
	}

	/**
	 * @param amountPaid the amountPaid to set
	 */
	public void setAmountPaid(Float amountPaid) {
		this.amountPaid = amountPaid;
	}

	/**
	 * @return the canceled
	 */
	public Boolean getCanceled() {
		return canceled;
	}

	/**
	 * @param canceled the canceled to set
	 */
	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the options
	 */
	public Collection<Option> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(Collection<Option> options) {
		this.options = options;
	}


	/**
	 * @return the guests
	 */
	public Collection<Guest> getGuests() {
		return guests;
	}


	/**
	 * @param guests the guests to set
	 */
	public void setGuests(Collection<Guest> guests) {
		this.guests = guests;
	}


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
	 * @return the payments
	 */
	public Collection<Payment> getPayments() {
		return payments;
	}


	/**
	 * @param payments the payments to set
	 */
	public void setPayments(Collection<Payment> payments) {
		this.payments = payments;
	}	
	
	/**
	 * 
	 * @return true if the booking starts before 2 weeks
	 */
	public Boolean getBeforeTwoWeeks() {
		Calendar cal = Calendar.getInstance();  
		Date currentDate = cal.getTime();
		
		cal.add(Calendar.DATE, TWO_WEEKS_IN_DAYS);  
		Date earlierPossibleDate = cal.getTime(); 
		
	    return startDate.before(earlierPossibleDate) && startDate.after(currentDate); 
	}	
	
}