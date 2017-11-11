package com.dreamit.proxystat.model.service;

import java.util.Date;
import java.util.List;

import com.dreamit.proxystat.model.dto.MechanicPartnerListing;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;


/**
 * 
 * @author rudy stienne
 *
 */
public interface IAdministrationPassMechanicPartnerService {
	
	Pass savePass(Pass pass) throws MissingRequiredInformationException;

	void deletePass(Pass pass);

	/* pour le partenaire mécanique utilisateur en cours */
	List<Pass> findAllPassByMechanicPartner(MechanicPartner mechanicPartner);
	
	Track saveTrack(Track track) throws MissingRequiredInformationException;

	void deleteTrack(Track track);


	List<Track> findAll();
	
	Track getTrackById(Long idTrack);
	
	Pass getPassById(Long idPass);
	
	/**
	 * si startDate null, appelle getMechanicPartnerListingTo()
	 * si endDate null, appele getMechanicPartnerListingFrom()
	 * @param startDate
	 * @param endDate
	 * @return la liste de forfaits à préparer par date
	 */
	List<MechanicPartnerListing> getMechanicPartnerListingBetween(Date startDate, Date endDate);
	
	/**
	 * si startDate null, appelle getMechanicPartnerListingForComingWeek()
	 * @param startDate
	 * @return la liste de forfaits à préparer par date
	 * à partir de @startDate à J+7
	 */
	List<MechanicPartnerListing> getMechanicPartnerListingFrom(Date startDate);
	
	/**
	 * si endDate null, appelle getMechanicPartnerListingForComingWeek()
	 * @param endDate
	 * @return la liste de forfaits à préparer par date
	 * à partir d’aujourd’hui inclus à @endDate
	 */
	List<MechanicPartnerListing> getMechanicPartnerListingTo(Date endDate);
	
	/**
	 * 
	 * @return retourne la liste de forfaits à préparer par date
	 * à partir d’aujourd’hui inclus à J+7
	 */
	List<MechanicPartnerListing> getMechanicPartnerListingForComingWeek();
	
}
