package com.dreamit.proxystat.model.dao.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IMechanicPartnerDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.dto.MechanicPartnerListing;
import com.dreamit.proxystat.model.entities.Guest;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;

/**
 * CRUD Implementation MechanicPartner
 * @author RAKOTOBE Sitraka Eric, Stienne Rudy
 */
@Repository
public class MechanicPartnerDAOImpl extends GenericJpaDataAccessObject<MechanicPartner, Long> implements IMechanicPartnerDAO {

	@Override
	public List<MechanicPartnerListing> getMechanicPartnerListingBetween(
			Date startDate, Date endDate) {
		List<MechanicPartnerListing> listings = new ArrayList<MechanicPartnerListing>();
		MechanicPartnerListing listing;
		Pass pass;
		Guest guest;
		Date date;
		
		StringBuilder query = new StringBuilder();
		query.append(" select p, b.startDate,g");
		query.append(" from Booking b ");
		query.append(" inner join b.guests as g");
		query.append(" inner join g.pass as p");
		query.append(" where b.startDate between :startDate and :endDate");
		query.append(" group by p, b.startDate,g ");
		query.append(" order by b.startDate ");
		
		@SuppressWarnings("rawtypes")
		List list = getHibernateSession().createQuery( query.toString() )
			.setParameter("startDate", startDate)
			.setParameter("endDate",   endDate)
			.list();
		
		for (Object obj : list) {
			Object[] array = (Object[]) obj;

			pass = (Pass) array[0];
			date = (Date) array[1];
			guest = (Guest) array[2];

			listing = new MechanicPartnerListing();
			listing.setGuest(guest);
			listing.setPreparationDate(date);
			listing.setPass(pass);
			
			listings.add(listing);
		}
		return listings;
	}
	

}
