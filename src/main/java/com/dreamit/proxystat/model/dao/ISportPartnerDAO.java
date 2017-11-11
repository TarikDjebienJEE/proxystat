package com.dreamit.proxystat.model.dao;
import java.util.Date;
import java.util.List;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.dto.SportPartnerListing;
import com.dreamit.proxystat.model.entities.SportPartner;


/**
 * DAO ISportPartnerDAO
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface ISportPartnerDAO extends GenericDataAccessObject<SportPartner, Long> {
	
	/**
	 * Retrieve partner listing between two dates
	 * @param startDate required
	 * @param endDate required
	 * @return list of corresponding listing or empty list if no result
	 */
	List<SportPartnerListing> getSportPartnerListingBetween(Date startDate, Date endDate);
	
}
