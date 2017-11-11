package com.dreamit.proxystat.model.dao;
import java.util.List;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;


/**
 * DAO IRatingDAO
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface IRatingDAO extends GenericDataAccessObject<Rating, Long> {
	
	/**
	 * 
	 * @param service
	 * @return list of ratings for the corresponding service
	 */
	List<Rating> findRatingsForService(Service service);
	
}
