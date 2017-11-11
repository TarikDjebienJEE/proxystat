package com.dreamit.proxystat.model.dao.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Guest;

/**
 * CRUD Implementation AgeCategory
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class AgeCategoryDAOImpl extends GenericJpaDataAccessObject<AgeCategory, Long> implements IAgeCategoryDAO {

	@Override
	public Map<AgeCategory, Integer> loadGuestAgeBreakDown() {
		Map<AgeCategory, Integer> result = new HashMap<AgeCategory, Integer>();
		
		@SuppressWarnings("unchecked")
		List<AgeCategory> allAgeCategory =  getHibernateSession().createCriteria(AgeCategory.class).list() ; 
		for (AgeCategory ageCategory : allAgeCategory) {
			result.put(ageCategory, 0);
		}	
		
		
		@SuppressWarnings("unchecked")
		List<Guest> allGuest =  getHibernateSession().createCriteria(Guest.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list() ; 
		for (Guest guest : allGuest) {
			AgeCategory guestAgeCategory = guest.getAgeCategory() ; 
			if (guestAgeCategory != null  && result.containsKey(guestAgeCategory)){
				int valueToIncrement = result.get(guestAgeCategory) ; 
				valueToIncrement ++ ; 
				result.put(guestAgeCategory, valueToIncrement);
			}			
		}			
		
		return result;
	}
	
	
	
}
