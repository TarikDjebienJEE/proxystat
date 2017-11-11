package com.dreamit.proxystat.model.dao.impl;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IFlatDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Flat;

/**
 * CRUD Implementation Flat
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class FlatDAOImpl extends GenericJpaDataAccessObject<Flat, Long> implements IFlatDAO {

	@Override
	public Integer getRateOccupancyBetween(Date startDate, Date endDate) {
		List<Flat> allFlat = findAll() ;
		int sizeAllFlat = allFlat.size() ; 
		
		@SuppressWarnings("unchecked")
		List<Booking> allBookingCorresponding =  getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.eq("canceled", false))
		.add(Restrictions.between("bookingDate", startDate, endDate))
		.list() ; 
		
		int nbFlatInBooking = 0 ; 
		for (Booking booking : allBookingCorresponding) {
			Flat f = booking.getFlat() ;
			if (f != null){
				nbFlatInBooking ++ ; 
			}
		}
		return  nbFlatInBooking/sizeAllFlat;	
	}
	

}
