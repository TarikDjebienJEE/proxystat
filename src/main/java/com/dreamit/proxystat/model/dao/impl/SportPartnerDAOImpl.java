package com.dreamit.proxystat.model.dao.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.ISportPartnerDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.dto.SportPartnerListing;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.SportPartner;

/**
 * CRUD Implementation SportPartner
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class SportPartnerDAOImpl extends GenericJpaDataAccessObject<SportPartner, Long> implements ISportPartnerDAO {

	@Override
	public List<SportPartnerListing> getSportPartnerListingBetween(
			Date startDate, Date endDate) {
		List<SportPartnerListing> listings = new ArrayList<SportPartnerListing>();
		SportPartnerListing listing;
		Equipment equipment;
		Date date;
		Long quantity;
		
		StringBuilder query = new StringBuilder();
		query.append(" select e, b.startDate, count(ge) ");
		query.append(" from Booking b ");
		query.append(" inner join b.guests as g");
		query.append(" inner join g.guestEquipments as ge");
		query.append(" inner join ge.equipment as e");
		query.append(" where b.startDate between :startDate and :endDate");
		query.append(" group by e, b.startDate ");
		query.append(" order by b.startDate ");
		
		@SuppressWarnings("rawtypes")
		List list = getHibernateSession().createQuery( query.toString() )
			.setParameter("startDate", startDate)
			.setParameter("endDate",   endDate)
			.list();
		
		for (Object obj : list) {
			Object[] array = (Object[]) obj;

			equipment = (Equipment) array[0];
			date = (Date) array[1];
			quantity = (Long) array[2];

			//TODO: antoine - factory
			listing = new SportPartnerListing();
			listing.setEquipment(equipment);
			listing.setPreparationDate(date);
			listing.setQuantity(quantity);
			
			listings.add(listing);
		}

		return listings;
	}}
