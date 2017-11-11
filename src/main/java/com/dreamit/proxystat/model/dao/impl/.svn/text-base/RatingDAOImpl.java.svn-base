package com.dreamit.proxystat.model.dao.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.IRatingDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;

/**
 * CRUD Implementation Rating
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class RatingDAOImpl extends GenericJpaDataAccessObject<Rating, Long> implements IRatingDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Rating> findRatingsForService(Service service) {
		StringBuilder query = new StringBuilder();
		query.append(" from  Rating r ");
		query.append(" where r.service = :service");
		
		List<Rating> ratings = ((List<Rating>) getHibernateSession().createQuery( query.toString() )
			.setParameter("service", service)
			.list());
		
		return ratings;
	}

}