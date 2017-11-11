package com.dreamit.proxystat.model.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamit.proxystat.model.dto.SportPartnerListing;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Category;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.GuestEquipment;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.factory.ICategoryFactory;
import com.dreamit.proxystat.model.factory.IEquipmentFactory;
import com.dreamit.proxystat.model.factory.IServiceFactory;
import com.dreamit.proxystat.model.service.IAdministrationCommonService;
import com.dreamit.proxystat.model.service.IAdministrationSportPartnerService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Sport partner controller
 * @author acraske
 *
 */
@Controller
@RequestMapping(value = "*.adminSportPartner")
@Scope(value = "singleton")
public class AdministrationSportPartnerController {
	
	/**
	 * Main controller service
	 */
	@Autowired 
	private IAdministrationSportPartnerService service;
	
	/**
	 * Common administration service
	 */
	@Autowired
	private IAdministrationCommonService commonService;
	
	/**
	 * Category factory
	 */
	@Autowired
	private ICategoryFactory categoryFactory;
	
	/**
	 * Service factory
	 */
	@Autowired
	private IServiceFactory serviceFactory;
	
	/**
	 * Equipment factory
	 */
	@Autowired
	private IEquipmentFactory equipmentFactory;
	
	/**
	 * 
	 * @return sport partner homepage
	 */
	@RequestMapping(value="/home")
	public String returnSportAdminHomepage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_HOME;
    }
	
	/**
	 * list categories
	 * @param request
	 * @param model
	 * @return to category listing
	 */
	@RequestMapping(value="/category")
	public String manageSportAdminCategory(HttpServletRequest request, ModelMap model) {
		List<Category> categories = service.findAllCategory();
		model.put("categories", categories);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_CATEGORY;
    }
	
	/**
	 * 
	 * @return to category creation form
	 */
	@RequestMapping(value="/createCategory")
	public String returnCreateCategoryPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_CATEGORY_CREATE;
    }
	
	/**
	 * create category by calling service
	 * @param request
	 * @param model
	 * @param name
	 * @param description
	 * @return to category listing
	 */
	@RequestMapping(value="/createNewCategory")
	public String createCategory(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "description", required = true) String description) {

		Category category = categoryFactory.createCategory(name, description);
		
		try {
			service.saveEquipmentCategory(category);
			model.put("messageOk", true);
		} catch (MissingRequiredInformationException e) {
			model.put("messageKo", true);
			model.put("name", name);
			model.put("description", description);
			
			return SpringViewResolutionConstants.VIEW_ADMIN_SPORT_CATEGORY_CREATE;
		}
		
		return  manageSportAdminCategory(request, model);
	}
	
	/**
	 * Update category selected
	 * @param request
	 * @param model
	 * @param id
	 * @param name
	 * @param description
	 * @return to category listing
	 */
	@RequestMapping(value="/updateCategory", method = RequestMethod.POST)
	public String updateCategory(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", required = true)   Long id,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "desc", required = true) String description) {
		
		Category category = categoryFactory.createCategory(name, description);
		category.setId(id);
		
		try {
			service.saveEquipmentCategory(category);
			model.put("messageOk", true);
		} catch (MissingRequiredInformationException e) {
			model.put("messageKo", true);
		} 
		
		return  manageSportAdminCategory(request, model);
	}
	
	/**
	 * Delete the category
	 * If category still referenced, can't perform deletion
	 * @param request
	 * @param model
	 * @param id
	 * @return to category listing
	 */
	@RequestMapping(value="/deleteCategory", method = RequestMethod.POST)
	public String deleteCategory(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", required = true)   Long id) {
		
		try {
			Category category = service.findCategoryById(id);
			
			service.deleteEquipmentCategory(category);
					
			model.put("messageOk", true);
		} catch (MissingRequiredInformationException e) {
			model.put("messageKo", true);
		} catch (Exception ex) {
			model.put("messageKoFk", true);
		}
		
		return  manageSportAdminCategory(request, model);
	}
	
	/**
	 * Load sport partners equipments and display offer listing
	 * @param request
	 * @param model
	 * @return offer listing
	 */
	@RequestMapping(value="/offer")
	public String manageSportAdminOffer(HttpServletRequest request, ModelMap model) {
		//TODO: antoine recuperer uniquement listing de ce partenaire
		loadOffer(model);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_OFFER;
    }

	/**
	 * 
	 * @return to sport offer creation form
	 */
	@RequestMapping(value="/createOffer")
	public String returnCreateOfferPage(HttpServletRequest request, ModelMap model) {
		loadOffer(model);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_OFFER_CREATE;
    }

	private void loadOffer(ModelMap model) {
		List<Equipment> equipments = service.findAllEquipment();		
		model.put("equipments", equipments);
		
		List<Period> periods = commonService.findAllPeriod();
		model.put("periods", periods);
		
		List<AgeCategory> ageCategories = commonService.findAllAgeCategory();
		model.put("ageCategories", ageCategories);
		
		List<Price> prices = commonService.findAllPrice();
		model.put("prices", prices);
		
		List<Category> categories = service.findAllCategory();
		model.put("categories",categories);
	}
	
	/**
	 * create equipment by calling service
	 * @param request
	 * @param model
	 * @param name
	 * @param description
	 * @return to offer listing
	 */
	@RequestMapping(value="/createNewOffer")
	public String createEquipment(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name",		   required = true) 	String name,
			@RequestParam(value = "desc",   	   required = true) 	String description,
			@RequestParam(value = "minHeight", 	   required = false) 	Integer minHeight,
			@RequestParam(value = "quality", 	   required = false) 	String quality,
			@RequestParam(value = "size", 		   required = false) 	Integer size,
			@RequestParam(value = "stock", 	 	   required = false) 	Integer stock,
			@RequestParam(value = "category",      required = true) 	Long categoryId,
			@RequestParam(value = "ageCategory",   required = true) 	Long ageCategoryId,
			@RequestParam(value = "period", 	   required = true) 	Long periodId,
			@RequestParam(value = "price",         required = true) 	Long priceId
			) {
		Equipment equipment;
		try {
			equipment = findEquipmentsLinksAndBuildEquipment(categoryId, ageCategoryId, periodId, priceId, description, name, minHeight, quality, size, stock);
			service.saveEquipment(equipment);
			
			model.put("messageOk", true);

		} catch (Exception ex) {
			model.put("messageKo", true);
			model.put("name", name);
			model.put("desc", description);
			model.put("minHeight", minHeight);
			model.put("quality", quality);
			model.put("size", size);
			model.put("stock", stock);
			
			return returnCreateOfferPage(request, model);
		}
		
		return  manageSportAdminOffer(request, model);
	}
	
	/**
	 * create equipment by calling service
	 * @param request
	 * @param model
	 * @param name
	 * @param description
	 * @return to offer listing
	 */
	@RequestMapping(value="/updateOffer")
	public String updateEquipment(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name",		   required = true) 	String name,
			@RequestParam(value = "desc",   	   required = true) 	String description,
			@RequestParam(value = "minHeight", 	   required = false) 	Integer minHeight,
			@RequestParam(value = "quality", 	   required = false) 	String quality,
			@RequestParam(value = "size", 		   required = false) 	Integer size,
			@RequestParam(value = "stock", 	 	   required = false) 	Integer stock,
			@RequestParam(value = "category",      required = true) 	Long categoryId,
			@RequestParam(value = "ageCategory",   required = true) 	Long ageCategoryId,
			@RequestParam(value = "period", 	   required = true) 	Long periodId,
			@RequestParam(value = "price",         required = true) 	Long priceId,
			@RequestParam(value = "id",            required = true) 	Long id
			) {
		Equipment equipment;
		try {
			equipment = findEquipmentsLinksAndBuildEquipment(categoryId, ageCategoryId, periodId, priceId, description, name, minHeight, quality, size, stock);
			equipment.setId(id);
			service.saveEquipment(equipment);
			
			model.put("messageOk", true);
		
		} catch (Exception ex) {
			model.put("messageKo", true);
		}
		
		return  manageSportAdminOffer(request, model);
	}
	
	private Equipment findEquipmentsLinksAndBuildEquipment(Long categoryId, Long ageCategoryId, Long periodId, Long priceId, String description, String name, Integer minHeight, String quality, Integer size, Integer stock) {
		Category category 	= service.findCategoryById(categoryId);
		AgeCategory ageCategory = commonService.findAgeCategoryById(ageCategoryId);
		Period period		= commonService.findPeriodById(periodId);
		Price price 		= commonService.findPriceById(priceId);
		
		Service serviceDef = serviceFactory.createService(name, description);
		Service serviceSaved = commonService.saveService(serviceDef);
		
		return equipmentFactory.createEquipment(serviceSaved, minHeight, quality, size, stock, category, ageCategory, period, price);
	}
	
	/**
	 * Delete the sport offer
	 * If offer or service still referenced, can't perform deletion
	 * @param request
	 * @param model
	 * @param id
	 * @return to offer listing
	 */
	@RequestMapping(value="/deleteOffer", method = RequestMethod.POST)
	public String deleteOffer(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "serviceId", required = true)   Long serviceId,
			@RequestParam(value = "id", required = true)   Long id) {
		
		Equipment equipment;
		Service serviceToRemove;
		
		try {
			equipment 		= service.findEquipmentById(id);
			serviceToRemove = commonService.findServiceById(id);
			
			commonService.deleteService(serviceToRemove);
			service.deleteEquipment(equipment);
					
			model.put("messageOk", true);
		} catch (Exception ex) {
			model.put("messageKoFk", true);
		}
		
		return  manageSportAdminOffer(request, model);
	}
	
	@RequestMapping(value="/listing")
	public String initialListing(HttpServletRequest request, ModelMap model) {
		List<SportPartnerListing> listings = service.getSportPartnerListingForComingWeek();
		model.put("listings", listings);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_LISTING;
    }
	
	@RequestMapping(value="/fullListing")
	public String fullListing(HttpServletRequest request, ModelMap model) throws ParseException {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("1000-01-01");
		Date endDate = ft.parse("4000-01-01");
		List<SportPartnerListing> listings = service.getSportPartnerListingBetween(startDate, endDate);
		model.put("listings", listings);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_LISTING;
    }
	
	@RequestMapping(value="/returnList")
	public String returnBookingList(HttpServletRequest request, ModelMap model) {
		List<Booking> bookings = service.findAllBookings();
		model.put("bookings", bookings);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_RETURN_LIST;
    }
	
	@RequestMapping(value="/returnBookingDetail")
	public String returnBookingDetail(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", required = true)   Long id) {
		setBookingAttribute(model, id);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_RETURN_BOOKING;
	}

	private void setBookingAttribute(ModelMap model, Long id) {
		Booking booking = service.findBookingById(id);
		model.put("booking", booking);
	}

	@RequestMapping(value="/updateGuestEquipment")
	public String updateGuestEquipment(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "bookingId", required = true)   			Long bookingId,
			@RequestParam(value = "id", required = true)   					Long id,
			@RequestParam(value = "returnDate", required = false)   		String returnDate,
			@RequestParam(value = "returnStateAccepted", required = false)  Boolean returnStateAccepted,
			@RequestParam(value = "returnComments", required = false)   	String returnComments
			) {
		
		GuestEquipment guestEquipment = service.findGuestEquipmentById(id);

		Date returnDateParsed;
		try {
			returnDateParsed = DateUtils.parseDate(returnDate, new String[]{"MM/dd/yyyy"});
		} catch (ParseException e) {
			model.put("messageKo", true);
			
			return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_RETURN_BOOKING;
		}
		
		guestEquipment.setReturnDate(returnDateParsed);
		guestEquipment.setReturnStateAccepted(returnStateAccepted);
		guestEquipment.setReturnComments(returnComments);
		
		service.saveGuestEquipment(guestEquipment);
		
		setBookingAttribute(model, bookingId);
		
		model.put("messageOk", true);
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_SPORT_RETURN_BOOKING;
	}
	
}