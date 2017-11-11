package com.dreamit.proxystat.model.service;

import java.util.Date;
import java.util.List;

import com.dreamit.proxystat.model.dto.SportPartnerListing;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;

/**
 * Services d'administration réservés aux partenaires sport
 * @author acraske
 *
 */
public interface IAdministrationSportPartnerService {

	/**
	 * Save or update an equipment category
	 * @param category to save
	 * @return the object saved
	 * @throws MissingRequiredInformationException 
	 */
	Category saveEquipmentCategory(Category category) throws MissingRequiredInformationException;
	
	/**
	 * Delete the corresponding category from persistence
	 * @param category to delete
	 * @throws MissingRequiredInformationException 
	 */
	void deleteEquipmentCategory(Category category) throws MissingRequiredInformationException;
	
	/**
	 * Find the corresponding category in the persistence layer
	 * @param id
	 * @return found category or null object
	 */
	Category findCategoryById(Long id);
	
	/**
	 * Retrieve all categories
	 * @return list of categories
	 */
	List<Category> findAllCategory();
	
	/**
	 * Save or upate a sport equipment
	 * @param equipment object to save
	 * @return the object saved
	 */
	Equipment saveEquipment(Equipment equipment) throws MissingRequiredInformationException;;
	
	/**
	 * Delete the corresponding category from persistence 
	 * @param equipment to delete
	 */
	void deleteEquipment(Equipment e);
	 
	/**
	 * Retrieve all equipments
	 * @return list of equipments
	 */
	List<Equipment> findAllEquipment();
	
	/**
	 * Find the corresponding equipment in the persistence layer
	 * @param id
	 * @return found equipment or null object
	 */
	Equipment findEquipmentById(Long id);

	/**
	 * si startDate null, appelle getSportPartnerListingTo()
	 * si endDate null, appele getSportPartnerListingFrom()
	 * @param startDate
	 * @param endDate
	 * @return la quantité de matériel de sport à préparer par date
	 */
	List<SportPartnerListing> getSportPartnerListingBetween(Date startDate, Date endDate);
	
	/**
	 * si startDate null, appelle getSportPartnerListingForComingWeek()
	 * @param startDate
	 * @return la quantité de matériel de sport à préparer par date
	 * à partir de @startDate à J+7
	 */
	List<SportPartnerListing> getSportPartnerListingFrom(Date startDate);
	
	/**
	 * si endDate null, appelle getSportPartnerListingForComingWeek()
	 * @param endDate
	 * @return la quantité de matériel de sport à préparer par date
	 * à partir d’aujourd’hui inclus à @endDate
	 */
	List<SportPartnerListing> getSportPartnerListingTo(Date endDate);
	
	/**
	 * 
	 * @return retourne la quantité de matériel de sport à préparer par date
	 * à partir d’aujourd’hui inclus à J+7
	 */
	List<SportPartnerListing> getSportPartnerListingForComingWeek();

	/**
	 * Save booking
	 * @param booking
	 * @return persistent saved booking
	 */
	Booking saveBooking(Booking booking);
	
	/**
	 * Search booking by id
	 * @param id
	 * @return booking found or null
	 */
	Booking findBookingById(Long id);
	
	/**
	 * Find all bookings
	 * @return all bookings
	 */
	List<Booking> findAllBookings();
	
	/**
	 * Save guest equipment
	 * @param guest equipment
	 * @return persistent saved guest equipment
	 */
	GuestEquipment saveGuestEquipment(GuestEquipment equipment);
	
	/**
	 * Search guest equipment by id
	 * @param id
	 * @return guest equipment found or null
	 */
	GuestEquipment findGuestEquipmentById(Long id);
	
}