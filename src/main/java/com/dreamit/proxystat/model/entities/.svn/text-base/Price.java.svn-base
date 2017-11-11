package com.dreamit.proxystat.model.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe representant un Price
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
public class Price implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Float price ;
	
	private Float margin ;
	
	private Float discountPrice ;
	
	private Boolean discounted;
	
	private Float taxRate;

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
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the margin
	 */
	public Float getMargin() {
		return margin;
	}

	/**
	 * @param margin the margin to set
	 */
	public void setMargin(Float margin) {
		this.margin = margin;
	}

	/**
	 * @return the discountPrice
	 */
	public Float getDiscountPrice() {
		return discountPrice;
	}

	/**
	 * @param discountPrice the discountPrice to set
	 */
	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	/**
	 * @return the discounted
	 */
	public Boolean getDiscounted() {
		return discounted;
	}

	/**
	 * @param discounted the discounted to set
	 */
	public void setDiscounted(Boolean discounted) {
		this.discounted = discounted;
	}

	/**
	 * @return the taxRate
	 */
	public Float getTaxRate() {
		return taxRate;
	}

	/**
	 * @param taxRate the taxRate to set
	 */
	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Price :");
		buffer.append(price);
		buffer.append("€ /");
		buffer.append("Margin : ");
		buffer.append(margin);
		buffer.append("€ /");
		buffer.append("Discount : ");
		buffer.append(discountPrice);
		buffer.append("€ /");
		buffer.append("Active discount : ");
		buffer.append(discounted);
		buffer.append(" / ");
		buffer.append("Tax rate : ");
		buffer.append(taxRate);
		buffer.append("%");
		
		return buffer.toString();
	}

}	