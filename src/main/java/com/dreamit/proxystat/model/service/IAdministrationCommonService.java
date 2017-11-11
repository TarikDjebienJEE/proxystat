package com.dreamit.proxystat.model.service;

import java.util.List;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.Duration;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.User;

/**
 * Centralize all common services for administration of proxystation and partners
 * in order to avoid duplication
 * @author acraske
 *
 */
public interface IAdministrationCommonService {

	/**
	 * 
	 * @param id
	 * @return all periods
	 */
	List<Period> findAllPeriod();
	
	/**
	 * Search a period by id
	 * @param id
	 * @return period if found or null
	 */
	Period findPeriodById(Long id);
	
	/**
	 * Save the period
	 * @param period
	 * @return persistent period
	 */
	Period savePeriod(Period period);
	
	/**
	 * Delete the period if no FK
	 * @param period
	 */
	void deletePeriod(Period period);
	
	/**
	 * 
	 * @return all age categories
	 */
	List<AgeCategory> findAllAgeCategory();
	
	/**
	 * Search agecategory by id
	 * @param id
	 * @return agecategory if found or null
	 */
	AgeCategory findAgeCategoryById(Long id);
	
	/**
	 * Save the age category
	 * @param age category
	 * @return persistent age category
	 */
	AgeCategory saveAgeCategory(AgeCategory ageCategory);
	
	/**
	 * Delete the age category if no FK
	 * @param age category
	 */
	void deleteAgeCategory(AgeCategory ageCategory);
	
	/**
	 * 
	 * @return all prices
	 */
	List<Price> findAllPrice();
	
	/**
	 * Search price by id
	 * @param id
	 * @return
	 */
	Price findPriceById(Long id);

	/**
	 * Save a price
	 * @param price
	 * @return saved price from persistence layer
	 */
	Price savePrice(Price price);
	
	/**
	 * Delete the price if no FK
	 * @param price
	 */
	void deletePrice(Price price);
	
	/**
	 * 
	 * @return all services
	 */
	List<Service> findAllServices();
	
	/**
	 * Search service by id
	 * @param id
	 * @return service found or null
	 */
	Service findServiceById(Long id);
	
	/**
	 * Save the service
	 * @param service
	 * @return persistent service
	 */
	Service saveService(Service service);
	
	/**
	 * Delete the service if no FK
	 * @param service
	 */
	void deleteService(Service service);
	
	/**
	 * Search duration by id
	 * @param id
	 * @return duration found or null
	 */
	Duration getDurationById(Long idDuration);
	/**
	 * 
	 * @return all durations
	 */
	List<Duration> getAllDurations();
	
	/**
	 * In order for controller to retrieve and put user object in session
	 * @param sampleInstance
	 * @return users found by example
	 */
	List<User> findUserByExample(final User sampleInstance);

	/**
	 * In order for controller to retrieve and put user object in session
	 * @param user
	 * @return customer found or null
	 */
	Customer findCustomerByUser(User user);
	
	
	/**
	 * Search pass by id
	 * @param pass
	 * @return pass found or null
	 */
	Pass findPassById(Long id);

	List<Pass> findAllPass();
	
}