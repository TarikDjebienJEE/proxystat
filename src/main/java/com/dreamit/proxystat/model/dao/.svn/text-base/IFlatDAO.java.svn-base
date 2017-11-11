package com.dreamit.proxystat.model.dao;
import java.util.Date;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.entities.Flat;


/**
 * DAO IFlatDAO
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface IFlatDAO extends GenericDataAccessObject<Flat, Long>{
	
	
	/**
	 * Methode permettant de retourner le taux d'occupation
	 * d'un appartement, ie count(flat in booking) / count(* flat)
	 * a condition que bookings n'aient pas ete annules
	 * @param startDate : la date de debut
	 * @param endDate : la date de fin
	 * @return le taux d'occupation
	 */
	Integer getRateOccupancyBetween(Date startDate, Date endDate);		
	
	
	
	
}
