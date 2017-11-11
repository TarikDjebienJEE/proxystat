package com.dreamit.proxystat.model.dao.impl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Guest;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Rating;
import com.dreamit.proxystat.model.entities.Service;

/**
 * CRUD Implementation Booking
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class BookingDAOImpl extends GenericJpaDataAccessObject<Booking, Long> implements IBookingDAO {


	@Override
	public Integer loadNumberOfBookingPrediction() {
		Date today = Calendar.getInstance().getTime() ; 
		Long result = (Long) getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.gt("bookingDate", today))
		.setProjection(Projections.rowCount()).uniqueResult();
		return (int) (long) result;
	}
	

	@Override
	public Integer loadAmountOfBookingOrder() {
		Float result = 0f ; 
		List<Booking> allBookings = findAll() ; 
		for (Booking booking : allBookings) {
			result += booking.getTotalPrice() ; 
		}
		int nbBooking =  allBookings.size();
		return (int) (float) result/nbBooking;
	}
	
	
	
	@Override
	public Integer getCountBookingBetween(Date startDate, Date endDate) {
		Long result = (Long) getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.between("bookingDate", startDate, endDate))
		.setProjection(Projections.rowCount()).uniqueResult();
		return (int) (long) result;
	}
	

	@Override
	public Integer getBookingTurnOverBetween(Date startDate, Date endDate) {
		Float result = 0f ; 
		@SuppressWarnings("unchecked")
		List<Booking> allBookingsBetweenDate =  getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.eq("canceled", false))
		.add(Restrictions.between("bookingDate", startDate, endDate))
		.list() ; 
		for (Booking booking : allBookingsBetweenDate) {
			result += booking.getTotalPrice() ; 
		}
		return (int) (float) result;
	}


	@Override
	public Integer getBookingMarginBetween(Date startDate, Date endDate) {
		Float result = 0f ; 
		@SuppressWarnings("unchecked")
		List<Booking> allBookingsBetweenDate =  getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.eq("canceled", false))
		.add(Restrictions.between("bookingDate", startDate, endDate))
		.list() ; 
		for (Booking booking : allBookingsBetweenDate) {
			result += booking.getTotalMargin() ; 
		}
		return (int) (float) result;		
	}
	
	
	
	
	@Override
	public Map<FlatType, Integer>loadFlatTypeBookedData() {
		Map<FlatType, Integer> result = new HashMap<FlatType, Integer>();
		
		@SuppressWarnings("unchecked")
		List<FlatType> allFlatType =  getHibernateSession().createCriteria(FlatType.class).list() ; 
		Map <String, Boolean> checkExistingServiceNameInMap = new HashMap<String, Boolean>();
		for (FlatType flatType : allFlatType) {
			if (flatType.getService() != null && flatType.getService().getName() != null){
				String serviceName = flatType.getService().getName() ; 
				if ((!checkExistingServiceNameInMap.containsKey(serviceName)) || (!checkExistingServiceNameInMap.get(serviceName))){
					result.put(flatType, 0);
					checkExistingServiceNameInMap.put(serviceName, true);
				}
			}
		}			
		
		@SuppressWarnings("unchecked")
		List<Booking> allBooking =  getHibernateSession().createCriteria(Booking.class).list() ; 
		for (Booking booking : allBooking) {
			if (booking.getFlat()!=null && booking.getFlat().getFlatType()!=null){
				FlatType flatTypeRef =  booking.getFlat().getFlatType() ; 
				if (flatTypeRef != null  && result.containsKey(flatTypeRef)){
					int valueToIncrement = result.get(flatTypeRef) ; 
					valueToIncrement ++ ; 
					result.put(flatTypeRef, valueToIncrement);
				}
			}
		}
		return result ; 
	}


	
	@Override
	public Map<Equipment, Integer> loadEquipmentTypeData() {
		Map<Equipment, Integer> result = new HashMap<Equipment, Integer>();
		
		@SuppressWarnings("unchecked")
		List<Equipment> allEquipment =  getHibernateSession().createCriteria(Equipment.class).list() ; 
		Map <String, Boolean> checkExistingServiceNameInMap = new HashMap<String, Boolean>();
		for (Equipment equipment : allEquipment) {
			if (equipment.getService() != null && equipment.getService().getName() != null){
				String serviceName = equipment.getService().getName() ; 
				if ((!checkExistingServiceNameInMap.containsKey(serviceName)) || (!checkExistingServiceNameInMap.get(serviceName))){
					result.put(equipment, 0);
					checkExistingServiceNameInMap.put(serviceName, true);
				}
			}
		}		
		
		@SuppressWarnings("unchecked")
		List<Booking> allBooking =  getHibernateSession().createCriteria(Booking.class).list() ; 
		for (Booking booking : allBooking) {
			Collection<Guest> guests = booking.getGuests() ;
			for (Guest guest : guests) {
				Collection<GuestEquipment> guestEquipments = guest.getGuestEquipments();
				for (GuestEquipment guestEquipment : guestEquipments) {
					Equipment equipmentOfGuest = guestEquipment.getEquipment() ; 
					if (equipmentOfGuest != null  && result.containsKey(equipmentOfGuest)){
						int valueToIncrement = result.get(equipmentOfGuest) ; 
						valueToIncrement ++ ; 
						result.put(equipmentOfGuest, valueToIncrement);
					}
				}
			}
		}
		return result ; 
	}


	@Override
	public Map<Pass, Integer> loadPassTypeData() {
		Map<Pass, Integer> result = new HashMap<Pass, Integer>();
		
		@SuppressWarnings("unchecked")
		List<Pass> allPass =  getHibernateSession().createCriteria(Pass.class).list() ; 
		Map <String, Boolean> checkExistingServiceNameInMap = new HashMap<String, Boolean>();
		for (Pass pass : allPass) {
			if (pass.getService() != null && pass.getService().getName() != null){
				String serviceName = pass.getService().getName() ; 
				if ((!checkExistingServiceNameInMap.containsKey(serviceName)) || (!checkExistingServiceNameInMap.get(serviceName))){					
					result.put(pass, 0);
					checkExistingServiceNameInMap.put(serviceName, true);
				}
			}
		}
		
		@SuppressWarnings("unchecked")
		List<Booking> allBooking =  getHibernateSession().createCriteria(Booking.class).list() ; 
		for (Booking booking : allBooking) {
			Collection<Guest> guests = booking.getGuests() ;
			for (Guest guest : guests) {
				Pass guestPass = guest.getPass();
				if (guestPass != null && result.containsKey(guestPass)){
					int valueToIncrement = result.get(guestPass) ; 
					valueToIncrement ++ ; 
					result.put(guestPass, valueToIncrement);
				}
			}
		}
		return result ;
	}


	@Override
	public Map<String, Integer> loadRatingServiceData() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		
		Map<Service, Integer> ratingValueOfService = new HashMap<Service, Integer>();
		Map<Service, Integer> serviceMapTotalRatings = new HashMap<Service, Integer>();
		@SuppressWarnings("unchecked")
		List<Service> allServices =  getHibernateSession().createCriteria(Service.class).list() ; 
		for (Service service : allServices) {
			String serviceName = service.getName() ; 
			result.put(serviceName , 0) ; 
			serviceMapTotalRatings.put(service , 0) ;
			ratingValueOfService.put(service , 0) ;
		}
		
		
		@SuppressWarnings("unchecked")
		List<Rating> allRatings =  getHibernateSession().createCriteria(Rating.class).list() ; 		
		for (Rating rating : allRatings) {
			Service ratingService = rating.getService() ; 
			Integer ratingValue = rating.getNotation() ; 
			if (serviceMapTotalRatings.containsKey(ratingService)){
				Integer valueToIncrement = serviceMapTotalRatings.get(ratingService);
				valueToIncrement ++ ; 
				serviceMapTotalRatings.put(ratingService , valueToIncrement) ;
			}

			if (ratingValueOfService.containsKey(ratingService)){
				Integer ratingValueToIncrement = ratingValueOfService.get(ratingService);
				ratingValueToIncrement += ratingValue ; 
				ratingValueOfService.put(ratingService , ratingValueToIncrement) ;
			}			
		}
		
		
		for (Service service : allServices) {
			Integer ratingValue = ratingValueOfService.get(service);
			Integer totalValueOfRating = serviceMapTotalRatings.get(service);
			String serviceName = service.getName();
			if (totalValueOfRating == 0) {
				totalValueOfRating = 1;
			}
			result.put(serviceName, ratingValue / totalValueOfRating);
		}
		return result ; 
	}


	@Override
	public Integer getNumberOfCustomersBetween(Date startDate, Date endDate) {
		Integer result = 0 ; 
		
		List<Customer> oldCustomersList = new ArrayList<Customer>();
		@SuppressWarnings("unchecked")
		List<Booking> bookingBeforeDate = getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.lt("bookingDate", startDate))
		.list() ;		
		for (Booking booking : bookingBeforeDate) {
			Customer oldCustomer = booking.getCustomer();
			oldCustomersList.add(oldCustomer);
		}
		
		
		@SuppressWarnings("unchecked")
		List<Booking> bookingInCriteria = getHibernateSession().createCriteria(Booking.class)
		.add(Restrictions.between("bookingDate", startDate, endDate))
		.list() ; 
		
		List<Customer> customersList = new ArrayList<Customer>();
		for (Booking booking : bookingInCriteria) {
			Customer newCustomer = booking.getCustomer(); 
			if (!customersList.contains(newCustomer) && !oldCustomersList.contains(newCustomer) ){
				customersList.add(newCustomer);
				result ++ ;
			}
		}
		
		return result ; 
	}	
	
}
