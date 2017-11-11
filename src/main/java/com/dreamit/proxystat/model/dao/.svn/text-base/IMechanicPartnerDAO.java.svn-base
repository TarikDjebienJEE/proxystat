package com.dreamit.proxystat.model.dao;
import java.util.Date;
import java.util.List;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.dto.MechanicPartnerListing;
import com.dreamit.proxystat.model.entities.MechanicPartner;


/**
 * DAO IMechanicPartnerDAO
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface IMechanicPartnerDAO extends GenericDataAccessObject<MechanicPartner, Long>{
	
	
	/**
	 * Retrieve partner listing between two dates
	 * @param startDate required
	 * @param endDate required
	 * @return list of corresponding listing or empty list if no result
	 */
	List<MechanicPartnerListing> getMechanicPartnerListingBetween(Date startDate, Date endDate);
	
	
}
