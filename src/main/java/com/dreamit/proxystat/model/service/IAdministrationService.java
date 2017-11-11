package com.dreamit.proxystat.model.service;

import java.util.List;

import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Season;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.exceptions.EndDateBeforeStartDateException;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.exceptions.TimeframeAlreadyUseException;

/**
 * @author Mélody
 * @author tdjebien
 *
 */
public interface IAdministrationService {
	
	/** Permet de créer un User
	 * @param user
	 * @return user créé
	 */
	User createUser(User user);
    
	/** Permet de retourner tout les users
	 * @return liste de user
	 */
	List<User> findAllUsers() ;

	/** Permet de supprimer un user
	 * @param user à supprimer
	 */
	void deleteUser(User user);
	
	/** Permet de retourner un user grâce à un id
	 * @param id
	 * @return user
	 */
	User findUserById(long id);
	
	/**
	 * 
	 * @param id
	 * @return season found or null
	 */
	Season findSeasonById(Long id);
	
	/**
	 * @param id
	 * @return period found or null
	 */
	Period findPeriodById(Long id);
	
	/**
	 * 
	 * @return all seasons
	 */
	List<Season> findAllSeasons();
	
	/**
	 *
	 * @param season : exception if null
	 * @return season savec
	 * @throws MissingRequiredInformationException 
	 * @throws TimeframeAlreadyUseException 
	 * @throws EndDateBeforeStartDateException 
	 */
	Season saveSeason(Season season) throws MissingRequiredInformationException, TimeframeAlreadyUseException, EndDateBeforeStartDateException;
	
	/**
	 * 
	 * @param season to be deleted
	 */
	void deleteSeason(Season season);
	
	/**
	 * @param periodToDelete period to be deleted
	 */
	void deletePeriod(Period periodToDelete);

	/**
	 * @return all periods
	 */
	List<Period> findAllPeriods();

	/**
	 * @param period : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 * @throws TimeframeAlreadyUseException
	 * @throws EndDateBeforeStartDateException
	 */
	Period savePeriod(Period period, boolean isAnUpdate) throws MissingRequiredInformationException, TimeframeAlreadyUseException, EndDateBeforeStartDateException;

	/**
	 * @return all prices
	 */
	List<Price> findAllPrices();

	/**
	 * @param id
	 * @return price found or null
	 */
	Price findPriceById(Long id);

	/**
	 * 
	 * @param price to be deleted
	 */
	void deletePrice(Price priceToDelete);

	/**
	 * @param price : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 */
	Price savePrice(Price newPrice, boolean isAnUpdate) throws MissingRequiredInformationException;

	/**
	 * Purge data with a defined years scope
	 * Remove from database bookings and ratings
	 * Data must be archived with database functionalilty before
	 */
	void purgeData();

	/**
	 * @param flat : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 */
	Flat saveFlat(Flat newFlat, boolean isAnUpdate) throws MissingRequiredInformationException;

	/**
	 * @param flatType : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 */
	FlatType saveFlatType(FlatType newFlatType, boolean isAnUpdate) throws MissingRequiredInformationException;

	/**
	 * @param newOption : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 */
	Option saveOption(Option newOption, boolean isAnUpdate) throws MissingRequiredInformationException;
	
	/**
	 * @param newUser : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 */
	PartnerUser savePartnerUser(PartnerUser newUser, boolean isAnUpdate) throws MissingRequiredInformationException;
	
	/**
	 * @param newPartner : exception if null
	 * @param isAnUpdate : true if it's an updating operation and not a creation
	 * @return
	 * @throws MissingRequiredInformationException
	 */
	Partner savePartner(Partner newPartner, boolean isAnUpdate) throws MissingRequiredInformationException;
	
	/**
	 * @param id
	 * @return flat found or null
	 */
	Flat findFlatById(Long id);

	/**
	 * @param id
	 * @return flat type found or null
	 */
	FlatType findFlatTypeById(Long id);
	
	/**
	 * @param id
	 * @return Option found or null
	 */
	Option findOptionById(Long id);

	/**
	 * @param id
	 * @return Partner user found or null
	 */
	PartnerUser findPartnerUserById(Long id);
	
	/**
	 * @param id
	 * @return Partner found or null
	 */
	Partner findPartnerById(Long id);
	
	/**
	 * 
	 * @param flat to be deleted
	 */
	void deleteFlat(Flat flatToDelete);

	/**
	 * 
	 * @param flat type to be deleted
	 */
	void deleteFlatType(FlatType flatTypeToDelete);
	
	/**
	 * 
	 * @param option to be deleted
	 */
	void deleteOption(Option optionToDelete);
	
	/**
	 * @param partner User to be deleted
	 */
	void deletePartnerUser(PartnerUser partnerUserToDelete);
	
	/**
	 * @param partner to be deleted
	 */
	void deletePartner(Partner partnerToDelete);

	/**
	 * @return all flats
	 */
	List<Flat> findAllFlats();
	
	/**
	 * @return all flat types
	 */
	List<FlatType> findAllFlatTypes();

	/**
	 * @return all Options
	 */
	List<Option> findAllOptions();

	/**
	 * @return all Partner users
	 */
	List<PartnerUser> findAllPartnerUsers();

	/**
	 * @return all Partners
	 */
	List<Partner> findAllPartners();

}
