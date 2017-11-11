package com.dreamit.proxystat.model.dao;
import java.util.Map;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.entities.AgeCategory;


/**
 * DAO IAgeCategoryDAO
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface IAgeCategoryDAO extends GenericDataAccessObject<AgeCategory, Long>{
	
	/**
	 * Methode permettant de charger la repartition des ages des differents invites
	 * @return une map contenant la repartition des ages des differents invites
	 */
	Map<AgeCategory, Integer> loadGuestAgeBreakDown();
	
}
