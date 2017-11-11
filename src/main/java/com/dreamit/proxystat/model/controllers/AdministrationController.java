package com.dreamit.proxystat.model.controllers;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Partner;
import com.dreamit.proxystat.model.entities.PartnerUser;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Season;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.factory.IFlatFactory;
import com.dreamit.proxystat.model.factory.IFlatTypeFactory;
import com.dreamit.proxystat.model.factory.IOptionFactory;
import com.dreamit.proxystat.model.factory.IPartnerFactory;
import com.dreamit.proxystat.model.factory.IPartnerUserFactory;
import com.dreamit.proxystat.model.factory.IPeriodFactory;
import com.dreamit.proxystat.model.factory.IPriceFactory;
import com.dreamit.proxystat.model.factory.ISeasonFactory;
import com.dreamit.proxystat.model.factory.IUserFactory;
import com.dreamit.proxystat.model.service.IAdministrationService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;


/**
 * Admin controller
 * @author acraske
 * @author tdjebien
 *
 */
@Controller
@RequestMapping(value = "*.admin")
@Scope(value = "singleton")
public class AdministrationController {
	
	private static final String FRONT_DATE_PATTERN = "yyyy-MM-dd";
	public static final String FRONT_PERIOD_STANDARD = "standardPeriod";
	public static final String FRONT_PERIOD_HOLIDAY = "holidayPeriod";
	public static final String FRONT_PARTNER_MECHANIC = "mechanicPartner";
	public static final String FRONT_PARTNER_SPORT = "sportPartner";
	public static final String FRONT_PARTNER_TRAINING = "trainingPartner";
	public static final String FRONT_CRUD_CHECKED = "on";
	public static final String FRONT_CRUD_UNCHECKED = "off";
	
	/**
	 * Main controller service
	 */
	@Autowired 
	private IAdministrationService service;
	
	@Autowired
	private ISeasonFactory seasonFactory;
	
	@Resource(name = "StandardPeriodFactory")
	private IPeriodFactory standardPeriodFactory;
	
	@Resource(name = "HolidayPeriodFactory")
	private IPeriodFactory holidayPeriodFactory;
	
	@Autowired
	private IPriceFactory priceFactory;
	
	@Autowired
	private IFlatFactory flatFactory;
	
	@Autowired
	private IFlatTypeFactory flatTypeFactory;
	
	@Autowired
	private IOptionFactory optionFactory;
	
	@Autowired
	private IPartnerUserFactory partnerUserFactory;
	
	@Resource(name = "MechanicPartnerFactory")
	private IPartnerFactory mechanicPartnerFactory;
	
	@Resource(name = "SportPartnerFactory")
	private IPartnerFactory sportPartnerFactory;
	
	@Resource(name = "TrainingPartnerFactory")
	private IPartnerFactory trainingPartnerFactory;
	
	@Autowired
	private IUserFactory userFactory;
	
	/**
	 * 
	 * @return sport partner homepage
	 */
	@RequestMapping(value="/home")
	public String returnAdminHomepage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_HOME;
    }
	
	/**
	 * season administration
	 * @param request
	 * @param model
	 * @return season admin page
	 */
	@RequestMapping(value="/season")
	public String manageSportAdminCategory(HttpServletRequest request, ModelMap model) {
		loadSeasonsInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON;
	}
	
	/**
	 * period administration
	 * @param request
	 * @param model
	 * @return period admin page
	 */
	@RequestMapping(value="/period")
	public String managePeriodAdmin(HttpServletRequest request, ModelMap model) {
		loadPeriodsInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD;
	}
	
	/**
	 * price administration
	 * @param request
	 * @param model
	 * @return period admin page
	 */
	@RequestMapping(value="/price")
	public String managePriceAdmin(HttpServletRequest request, ModelMap model) {
		loadPricesInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE;
	}
	
	/**
	 * flat administration
	 * @param request
	 * @param model
	 * @return flat admin page
	 */
	@RequestMapping(value="/flat")
	public String manageFlatAdmin(HttpServletRequest request, ModelMap model) {
		loadFlatsInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT;
	}
	
	/**
	 * flat type administration
	 * @param request
	 * @param model
	 * @return flat type admin page
	 */
	@RequestMapping(value="/flatType")
	public String manageFlatTypeAdmin(HttpServletRequest request, ModelMap model) {
		loadFlatTypesInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE;
	}
	
	/**
	 * option administration
	 * @param request
	 * @param model
	 * @return option admin page
	 */
	@RequestMapping(value="/option")
	public String manageOptionAdmin(HttpServletRequest request, ModelMap model) {
		loadOptionsInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION;
	}
	
	/**
	 * partner administration
	 * @param request
	 * @param model
	 * @return partner admin page
	 */
	@RequestMapping(value="/partner")
	public String managePartnerAdmin(HttpServletRequest request, ModelMap model) {
		loadPartnersInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER;
	}
	
	/**
	 * partner user administration
	 * @param request
	 * @param model
	 * @return partner user admin page
	 */
	@RequestMapping(value="/user")
	public String managePartnerUserAdmin(HttpServletRequest request, ModelMap model) {
		loadPartnerUsersInModel(model);
	
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER;
	}
	
	/**
	 * 
	 * @return sport partner homepage
	 */
	@RequestMapping(value="/createSeason")
	public String returnSeasonCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON_ADD;
    }
	
	/**
	 * 
	 * @return period admin creation page
	 */
	@RequestMapping(value="/createPeriod")
	public String returnPeriodCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD_ADD;
    }
	
	/**
	 * 
	 * @return price admin creation page
	 */
	@RequestMapping(value="/createPrice")
	public String returnPriceCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE_ADD;
    }
	
	/**
	 * 
	 * @return flat admin creation page
	 */
	@RequestMapping(value="/createFlat")
	public String returnFlatCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_ADD;
    }
	
	/**
	 * 
	 * @return flat type admin creation page
	 */
	@RequestMapping(value="/createFlatType")
	public String returnFlatTypeCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE_ADD;
    }
	
	/**
	 * 
	 * @return option admin creation page
	 */
	@RequestMapping(value="/createOption")
	public String returnOptionCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION_ADD;
    }
	
	/**
	 * 
	 * @return user admin creation page
	 */
	@RequestMapping(value="/createUser")
	public String returnUserCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER_ADD;
    }
	
	/**
	 * 
	 * @return partner admin creation page
	 */
	@RequestMapping(value="/createPartner")
	public String returnPartnerCreationPage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER_ADD;
    }
	
	/**
	 * Create a new useason
	 * @param request
	 * @param model
	 * @param name
	 * @param startDate
	 * @param endDate
	 * @return to season list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewSeason")
	public String createNewSeason(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "startDate", 	required = true) String startDate,
			@RequestParam(value = "endDate", 	required = true) String endDate
			) {
		
		Date newStartDate = null;
		Date newEndDate = null;
		
		try {
			newStartDate = DateUtils.parseDate(startDate, new String[]{FRONT_DATE_PATTERN});
			newEndDate = DateUtils.parseDate(endDate, new String[]{FRONT_DATE_PATTERN});
		} catch (ParseException e) {
			return manageErrorAndReturnToSeasonAddPage(model, name, startDate, endDate, e);
		}
		
		Season season = seasonFactory.createSeason(name, newStartDate, newEndDate);
	
		try {
			service.saveSeason(season);
		} catch (Exception e) {
			return manageErrorAndReturnToSeasonAddPage(model, name, startDate, endDate, e);
		}
		
		loadSeasonsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON;
	}
	
	/**
	 * Create a new period
	 * @param request
	 * @param model
	 * @param name
	 * @param startDate
	 * @param endDate
	 * @return to period list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewPeriod")
	public String createNewPeriod(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "startDate", 	required = true) String startDate,
			@RequestParam(value = "endDate", 	required = true) String endDate,
			@RequestParam(value = "periodType", required = true) String periodType
			) {
		
		Date newStartDate = null;
		Date newEndDate = null;
		Period period = null;
		
		try {
			newStartDate = DateUtils.parseDate(startDate, new String[]{FRONT_DATE_PATTERN});
			newEndDate = DateUtils.parseDate(endDate, new String[]{FRONT_DATE_PATTERN});
		} catch (ParseException e) {
			return manageErrorAndReturnToPeriodAddPage(model, name, startDate, endDate, e);
		}
		
		if(periodType.equals(FRONT_PERIOD_HOLIDAY)){
			period = holidayPeriodFactory.createPeriod(name, newStartDate, newEndDate);
		}else if(periodType.equals(FRONT_PERIOD_STANDARD)){
			period = standardPeriodFactory.createPeriod(name, newStartDate, newEndDate);
		}else{
			return manageErrorAndReturnToPeriodAddPage(model, name, startDate, endDate, null);
		}
	
		try {
			service.savePeriod(period, false);
		} catch (Exception e) {
			return manageErrorAndReturnToPeriodAddPage(model, name, startDate, endDate, e);
		}
		
		loadPeriodsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD;
	}
	
	/**
	 * Create a new price
	 * @param request
	 * @param model
	 * @param price
	 * @param margin
	 * @param discountPrice
	 * @param discounted
	 * @param taxRate
	 * @return to price list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewPrice")
	public String createNewPrice(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "price", 		required = true) String price,
			@RequestParam(value = "margin", 	required = true) String margin,
			@RequestParam(value = "discountPrice", 	required = true) String discountPrice,
			@RequestParam(value = "discounted", 	required = false) String discounted,
			@RequestParam(value = "taxRate", required = true) String taxRate
			) {
		
		Float priceValue = null;
		Float marginValue = null;
		Float discountPriceValue = null;
		Boolean discountedValue = null;
		Float taxRateValue = null;
		Price newPrice = null;
		
		try {
			priceValue = Float.parseFloat(price);
			marginValue = Float.parseFloat(margin);
			discountPriceValue = Float.parseFloat(discountPrice);
			discountedValue = isSelected(discounted);
			taxRateValue = Float.parseFloat(taxRate);
			newPrice = priceFactory.createPrice(priceValue, marginValue, discountPriceValue, discountedValue, taxRateValue);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToPriceAddPage(model, price, margin, discountPrice, discounted, taxRate, e);
		}
	
		try {
			service.savePrice(newPrice, false);
		} catch (Exception e) {
			return manageErrorAndReturnToPriceAddPage(model, price, margin, discountPrice, discounted, taxRate, e);
		}
		
		loadPricesInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE;
	}
	
	/**
	 * Create a new flat
	 * @param request
	 * @param model
	 * @param roomNumber
	 * @param floor
	 * @param handicapAccess
	 * @param status
	 * @param avalaible
	 * @return to flat list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewFlat")
	public String createNewFlat(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "roomNumber", 		required = true) String roomNumber,
			@RequestParam(value = "floor", 	required = true) String floor,
			@RequestParam(value = "handicapAccess", 	required = false) String handicapAccess,
			@RequestParam(value = "status", 	required = true) String status,
			@RequestParam(value = "avalaible", required = false) String avalaible
			) {
		
		String roomNumberValue = null;
		String floorValue = null;
		Boolean handicapAccessValue = null;
		String statusValue = null;
		Boolean avalaibleValue = null;
		Flat newFlat = null;
		
		try {
			roomNumberValue = roomNumber.trim();
			floorValue = floor.trim();
			handicapAccessValue = isSelected(handicapAccess);
			statusValue = status.trim();
			avalaibleValue = isSelected(avalaible);
			newFlat = flatFactory.createFlat(roomNumberValue, floorValue, handicapAccessValue, statusValue, avalaibleValue);
		} catch (Exception e) {
			return manageErrorAndReturnToFlatAddPage(model, roomNumber, floor, handicapAccess, status, avalaible, e);
		}
	
		try {
			service.saveFlat(newFlat, false);
		} catch (Exception e) {
			return manageErrorAndReturnToFlatAddPage(model, roomNumber, floor, handicapAccess, status, avalaible, e);
		}
		
		loadFlatsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT;
	}
	
	/**
	 * Create a new flat type
	 * @param request
	 * @param model
	 * @param name
	 * @param description
	 * @param numberOfBeds
	 * @param size
	 * @return to flat type list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewFlatType")
	public String createNewFlatType(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "description", 	required = true) String description,
			@RequestParam(value = "numberOfBeds", 	required = true) String numberOfBeds,
			@RequestParam(value = "size", required = true) String size
			) {
		
		String nameValue = null;
		String descriptionValue = null;
		Integer numberOfBedsValue = null;
		Integer sizeValue = null;
		FlatType newFlatType = null;
		
		try {
			nameValue = name.trim();
			descriptionValue = description.trim();
			numberOfBedsValue = Integer.parseInt(numberOfBeds);
			sizeValue = Integer.parseInt(size);
			newFlatType = flatTypeFactory.createFlatType(nameValue, descriptionValue, numberOfBedsValue, sizeValue);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToFlatTypeAddPage(model, name, description, numberOfBeds, size, e);
		}
	
		try {
			service.saveFlatType(newFlatType, false);
		} catch (Exception e) {
			return manageErrorAndReturnToFlatTypeAddPage(model, name, description, numberOfBeds, size, e);
		}
		
		loadFlatTypesInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE;
	}
	
	/**
	 * Create a new Option
	 * @param request
	 * @param model
	 * @param perPerson
	 * @param pricePercentage
	 * @return to option list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewOption")
	public String createNewOption(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "perPerson", 		required = false) String perPerson,
			@RequestParam(value = "pricePercentage", 	required = true) String pricePercentage
			) {
		
		Boolean perPersonValue = null;
		Float pricePercentageValue = null;
		Option newOption = null;
		
		try {
			perPersonValue = isSelected(perPerson);
			pricePercentageValue = Float.parseFloat(pricePercentage.trim());
			newOption = optionFactory.createOption(perPersonValue, pricePercentageValue);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToOptionAddPage(model, perPerson, pricePercentage, e);
		}
	
		try {
			service.saveOption(newOption, false);
		} catch (Exception e) {
			return manageErrorAndReturnToOptionAddPage(model, perPerson, pricePercentage, e);
		}
		
		loadOptionsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION;
	}
	
	/**
	 * Create a new User Partner
	 * @param request
	 * @param model
	 * @param name
	 * @param surname
	 * @param jobtitle
	 * @return to user list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewUser")
	public String createNewUser(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "surname", 	required = true) String surname,
			@RequestParam(value = "jobtitle", 	required = true) String jobtitle,
			@RequestParam(value = "login", 	required = true) String login,
			@RequestParam(value = "password", 	required = true) String password,
			@RequestParam(value = "enabled", 	required = false) String enabled
			) {
		
		String nameValue = null;
		String surnameValue = null;
		String jobtitleValue = null;
		String loginValue = null;
		String passwordValue = null;
		Boolean enabledValue = null;
		User userValue = null;
		PartnerUser newUser = null;
		
		try {
			nameValue = name.trim();
			surnameValue = surname.trim();
			jobtitleValue = jobtitle.trim();
			loginValue = login.trim();
			passwordValue = password.trim();
			enabledValue = isSelected(enabled);
			userValue = userFactory.createUser(loginValue, passwordValue, enabledValue);
			newUser = partnerUserFactory.createPartnerUser(nameValue, surnameValue, jobtitleValue, userValue);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToPartnerUserAddPage(model, name, surname, jobtitle, login, password, enabled, e);
		}
	
		try {
			service.savePartnerUser(newUser, false);
		} catch (Exception e) {
			return manageErrorAndReturnToPartnerUserAddPage(model, name, surname, jobtitle, login, password, enabled, e);
		}
		
		loadPartnerUsersInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER;
	}
	
	/**
	 * Create a new Partner
	 * @param request
	 * @param model
	 * @param name
	 * @param description
	 * @param partnerType
	 * @return to user list page if success or to add page if error
	 */
	@RequestMapping(value="/createNewPartner")
	public String createNewPartner(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "description", 	required = true) String description,
			@RequestParam(value = "partnerType", 	required = true) String partnerType
			) {
		
		String nameValue = null;
		String descriptionValue = null;
		Partner newPartner = null;
		
		nameValue = name.trim();
		descriptionValue = description.toLowerCase();

		if(partnerType.equals(FRONT_PARTNER_MECHANIC)){
			newPartner = mechanicPartnerFactory.createPartner(nameValue, descriptionValue);
		}else if(partnerType.equals(FRONT_PARTNER_SPORT)){
			newPartner = sportPartnerFactory.createPartner(nameValue, descriptionValue);
		}else if(partnerType.equals(FRONT_PARTNER_TRAINING)){
			newPartner = trainingPartnerFactory.createPartner(nameValue, descriptionValue);
		}else {
			return manageErrorAndReturnToPartnerAddPage(model, name, description, null);
		}

		try {
			service.savePartner(newPartner, false);
		} catch (Exception e) {
			return manageErrorAndReturnToPartnerAddPage(model, name, description, e);
		}
		
		loadPartnersInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER;
	}
	
	private boolean isSelected(String isChecked){
		return isChecked != null;
	}
	
	/**
	 * Update season
	 * @param request
	 * @param model
	 * @param id
	 * @param name
	 * @param startDate
	 * @param endDate
	 * @return to season admin page
	 */
	@RequestMapping(value="/updateSeason")
	public String createNewSeason(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "startDate", 	required = true) String startDate,
			@RequestParam(value = "endDate", 	required = true) String endDate
			) {
		
		Date newStartDate = null;
		Date newEndDate = null;
		
		try {
			newStartDate = DateUtils.parseDate(startDate, new String[]{FRONT_DATE_PATTERN});
			newEndDate = DateUtils.parseDate(endDate, new String[]{FRONT_DATE_PATTERN});
		} catch (ParseException e) {
			return manageErrorAndReturnToSeasonAdminPage(model, name, startDate, endDate, e);
		}
		
		Season season = service.findSeasonById(id);
		season.setName(name);
		season.setStartDate(newStartDate);
		season.setEndDate(newEndDate);
	
		try {
			service.saveSeason(season);
		} catch (Exception e) {
			return manageErrorAndReturnToSeasonAdminPage(model, name, startDate, endDate, e);
		}
		
		loadSeasonsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON;
	}
	
	/**
	 * Update price
	 * @param request
	 * @param model
	 * @param price
	 * @param margin
	 * @param discountPrice
	 * @param discounted
	 * @param taxRate
	 * @return to price admin page
	 */
	@RequestMapping(value="/updatePrice")
	public String updatePrice(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "price", 		required = true) String price,
			@RequestParam(value = "margin", 	required = true) String margin,
			@RequestParam(value = "discountPrice", 	required = true) String discountPrice,
			@RequestParam(value = "discounted", 	required = false) String discounted,
			@RequestParam(value = "taxRate", required = true) String taxRate
			) {
		
		Float priceValue = null;
		Float marginValue = null;
		Float discountPriceValue = null;
		Boolean discountedValue = null;
		Float taxRateValue = null;
		
		try {
			priceValue = Float.parseFloat(price);
			marginValue = Float.parseFloat(margin);
			discountPriceValue = Float.parseFloat(discountPrice);
			discountedValue = isSelected(discounted);
			taxRateValue = Float.parseFloat(taxRate);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToPriceAdminPage(model, price, margin, discountPrice, discounted, taxRate, e);
		}
		
		Price priceUpdated = service.findPriceById(id);
		priceUpdated.setPrice(priceValue);
		priceUpdated.setMargin(marginValue);
		priceUpdated.setDiscountPrice(discountPriceValue);
		priceUpdated.setDiscounted(discountedValue);
		priceUpdated.setTaxRate(taxRateValue);
	
		try {
			service.savePrice(priceUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToPriceAdminPage(model, price, margin, discountPrice, discounted, taxRate, e);
		}
		
		loadPricesInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE;
	}
	
	/**
	 * Update period
	 * @param request
	 * @param model
	 * @param id
	 * @param name
	 * @param startDate
	 * @param endDate
	 * @return to period admin page
	 */
	@RequestMapping(value="/updatePeriod")
	public String updatePeriod(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "startDate", 	required = true) String startDate,
			@RequestParam(value = "endDate", 	required = true) String endDate
			) {
		
		Date newStartDate = null;
		Date newEndDate = null;
		
		try {
			newStartDate = DateUtils.parseDate(startDate, new String[]{FRONT_DATE_PATTERN});
			newEndDate = DateUtils.parseDate(endDate, new String[]{FRONT_DATE_PATTERN});
		} catch (ParseException e) {
			return manageErrorAndReturnToPeriodAdminPage(model, name, startDate, endDate, e);
		}
		
		Period periodUpdated = service.findPeriodById(id);
		periodUpdated.setName(name);
		periodUpdated.setStartDate(newStartDate);
		periodUpdated.setEndDate(newEndDate);
	
		try {
			service.savePeriod(periodUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToPeriodAdminPage(model, name, startDate, endDate, e);
		}
		
		loadPeriodsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD;
	}
	
	/**
	 * Update flat
	 * @param request
	 * @param model
	 * @param id
	 * @param roomNumber
	 * @param floor
	 * @param handicapAccess
	 * @param status
	 * @param avalaible
	 * @return to flat admin page
	 */
	@RequestMapping(value="/updateFlat")
	public String updateFlat(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "roomNumber", 		required = true) String roomNumber,
			@RequestParam(value = "floor", 	required = true) String floor,
			@RequestParam(value = "handicapAccess", 	required = false) String handicapAccess,
			@RequestParam(value = "status", 	required = true) String status,
			@RequestParam(value = "avalaible", required = false) String avalaible
			) {
		
		String roomNumberValue = null;
		String floorValue = null;
		Boolean handicapAccessValue = null;
		String statusValue = null;
		Boolean avalaibleValue = null;
		
		try {
			roomNumberValue = roomNumber.trim();
			floorValue = floor.trim();
			handicapAccessValue = isSelected(handicapAccess);
			statusValue = status.trim();
			avalaibleValue = isSelected(avalaible);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToFlatAdminPage(model, roomNumber, floor, handicapAccess, status, avalaible, e);
		}
		
		Flat flatUpdated = service.findFlatById(id);
		flatUpdated.setRoomNumber(roomNumberValue);
		flatUpdated.setFloor(floorValue);
		flatUpdated.setHandicapAccess(handicapAccessValue);
		flatUpdated.setStatus(statusValue);
		flatUpdated.setAvalaible(avalaibleValue);
	
		try {
			service.saveFlat(flatUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToFlatAdminPage(model, roomNumber, floor, handicapAccess, status, avalaible, e);
		}
		
		loadFlatsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT;
	}
	
	/**
	 * Update flat type
	 * @param request
	 * @param model
	 * @param price
	 * @param margin
	 * @param discountPrice
	 * @param discounted
	 * @param taxRate
	 * @return to price admin page
	 */
	@RequestMapping(value="/updateFlatType")
	public String updateFlatType(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "description", 	required = true) String description,
			@RequestParam(value = "numberOfBeds", 	required = true) String numberOfBeds,
			@RequestParam(value = "size", required = true) String size
			) {
		
		String nameValue = null;
		String descriptionValue = null;
		Integer numberOfBedsValue = null;
		Integer sizeValue = null;
		
		try {
			nameValue = name.trim();
			descriptionValue = description.trim();
			numberOfBedsValue = Integer.parseInt(numberOfBeds);
			sizeValue = Integer.parseInt(size);
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToFlatTypeAdminPage(model, name, description, numberOfBeds, size, e);
		}
		
		FlatType flatTypeUpdated = service.findFlatTypeById(id);
		flatTypeUpdated.setName(nameValue);
		flatTypeUpdated.setDescription(descriptionValue);
		flatTypeUpdated.setNumberOfBeds(numberOfBedsValue);
		flatTypeUpdated.setSize(sizeValue);
	
		try {
			service.saveFlatType(flatTypeUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToFlatTypeAdminPage(model, name, description, numberOfBeds, size, e);
		}
		
		loadFlatTypesInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE;
	}
	
	/**
	 * Update option
	 * @param request
	 * @param model
	 * @param id
	 * @param perPerson
	 * @param pricePercentage
	 * @return to option admin page
	 */
	@RequestMapping(value="/updateOption")
	public String updateOption(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "perPerson", 		required = false) String perPerson,
			@RequestParam(value = "pricePercentage", 	required = true) String pricePercentage
			) {
		
		Boolean perPersonValue = null;
		Float pricePercentageValue = null;
		
		try {
			perPersonValue = isSelected(perPerson);
			pricePercentageValue = Float.parseFloat(pricePercentage.trim());
		} catch (NumberFormatException e) {
			return manageErrorAndReturnToOptionAdminPage(model, perPerson, pricePercentage, e);
		}
		
		Option optionUpdated = service.findOptionById(id);
		optionUpdated.setPerPerson(perPersonValue);
		optionUpdated.setPricePercentage(pricePercentageValue);
	
		try {
			service.saveOption(optionUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToOptionAdminPage(model, perPerson, pricePercentage, e);
		}
		
		loadOptionsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION;
	}
	
	/**
	 * Update partner user
	 * @param request
	 * @param model
	 * @param id
	 * @param name
	 * @param surname
	 * @param jobtitle
	 * @return to partner user admin page
	 */
	@RequestMapping(value="/updateUser")
	public String updateUser(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "surname", 	required = true) String surname,
			@RequestParam(value = "jobtitle", 	required = true) String jobtitle,
			@RequestParam(value = "login", 	required = true) String login,
			@RequestParam(value = "password", 	required = true) String password,
			@RequestParam(value = "enabled", 	required = false) String enabled,
			@RequestParam(value = "idUser", 	required = true) Long idUser
			) {
		
		String nameValue = null;
		String surnameValue = null;
		String jobtitleValue = null;
		String loginValue = null;
		String passwordValue = null;
		Boolean enabledValue = null;
		User userValue = null;
		
		nameValue = name.trim();
		surnameValue = surname.trim();
		jobtitleValue = jobtitle.trim();
		loginValue = login.trim();
		passwordValue = password.trim();
		enabledValue = isSelected(enabled);
		userValue = service.findUserById(idUser);
		userValue.setLogin(loginValue);
		userValue.setPassword(passwordValue);
		userValue.setEnabled(enabledValue);

		PartnerUser userUpdated = service.findPartnerUserById(id);
		userUpdated.setName(nameValue);
		userUpdated.setSurname(surnameValue);
		userUpdated.setJobtitle(jobtitleValue);
		userUpdated.setUser(userValue);
	
		try {
			service.savePartnerUser(userUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToPartnerUserAdminPage(model, name, surname, jobtitle, login, password, enabled, e);
		}
		
		loadPartnerUsersInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER;
	}
	
	/**
	 * Update partner
	 * @param request
	 * @param model
	 * @param id
	 * @param name
	 * @param description
	 * @return to partner admin page
	 */
	@RequestMapping(value="/updatePartner")
	public String updatePartner(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id,
			@RequestParam(value = "name", 		required = true) String name,
			@RequestParam(value = "description", 	required = true) String description
			) {
		
		String nameValue = null;
		String descriptionValue = null;
		
		nameValue = name.trim();
		descriptionValue = description.toLowerCase();

		Partner partnerUpdated = service.findPartnerById(id);
		partnerUpdated.setName(nameValue);
		partnerUpdated.setDescription(descriptionValue);
	
		try {
			service.savePartner(partnerUpdated, true);
		} catch (Exception e) {
			return manageErrorAndReturnToPartnerAdminPage(model, name, description, e);
		}
		
		loadPartnersInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER;
	}
	
	/**
	 * Delete season
	 * @param request
	 * @param model
	 * @param id
	 * @return to season admin page
	 */
	@RequestMapping(value="/deleteSeason")
	public String createNewSeason(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		Season season = service.findSeasonById(id);
		
		service.deleteSeason(season);
		
		loadSeasonsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON;
	}
	
	/**
	 * Delete period
	 * @param request
	 * @param model
	 * @param id
	 * @return to period admin page
	 */
	@RequestMapping(value="/deletePeriod")
	public String deletePeriod(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		Period periodToDelete = service.findPeriodById(id);
		
		service.deletePeriod(periodToDelete);
		
		loadPeriodsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD;
	}
	
	/**
	 * Delete price
	 * @param request
	 * @param model
	 * @param id
	 * @return to price admin page
	 */
	@RequestMapping(value="/deletePrice")
	public String deletePrice(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		Price priceToDelete = service.findPriceById(id);
		
		service.deletePrice(priceToDelete);
		
		loadPricesInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE;
	}
	
	/**
	 * Delete flat
	 * @param request
	 * @param model
	 * @param id
	 * @return to flat admin page
	 */
	@RequestMapping(value="/deleteFlat")
	public String deleteFlat(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		Flat flatToDelete = service.findFlatById(id);
		
		service.deleteFlat(flatToDelete);
		
		loadFlatsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT;
	}
	
	/**
	 * Delete flat type
	 * @param request
	 * @param model
	 * @param id
	 * @return to flat type admin page
	 */
	@RequestMapping(value="/deleteFlatType")
	public String deleteFlatType(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		FlatType flatTypeToDelete = service.findFlatTypeById(id);
		
		service.deleteFlatType(flatTypeToDelete);
		
		loadFlatTypesInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE;
	}
	
	/**
	 * Delete option
	 * @param request
	 * @param model
	 * @param id
	 * @return to option admin page
	 */
	@RequestMapping(value="/deleteOption")
	public String deleteOption(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		Option optionToDelete = service.findOptionById(id);
		
		service.deleteOption(optionToDelete);
		
		loadOptionsInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION;
	}
	
	/**
	 * Delete partner user
	 * @param request
	 * @param model
	 * @param id
	 * @return to partner user admin page
	 */
	@RequestMapping(value="/deleteUser")
	public String deleteUser(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		PartnerUser partnerUserToDelete = service.findPartnerUserById(id);
		
		service.deletePartnerUser(partnerUserToDelete);
		
		loadPartnerUsersInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER;
	}
	
	/**
	 * Delete partner 
	 * @param request
	 * @param model
	 * @param id
	 * @return to partner admin page
	 */
	@RequestMapping(value="/deletePartner")
	public String deletePartner(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "id", 		required = true) Long id
			) {
		
		Partner partnerToDelete = service.findPartnerById(id);
		
		service.deletePartner(partnerToDelete);
		
		loadPartnersInModel(model);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER;
	}

	private String manageErrorAndReturnToSeasonAddPage(ModelMap model,
			String name, String startDate, String endDate, Exception e) {
		feedSeasonModelAfterError(model, name, startDate, endDate, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON_ADD;
	}
	
	private String manageErrorAndReturnToPeriodAddPage(ModelMap model,
			String name, String startDate, String endDate, Exception e) {
		feedPeriodModelAfterError(model, name, startDate, endDate, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD_ADD;
	}
	
	private String manageErrorAndReturnToPriceAddPage(ModelMap model,
			String price, String margin, String discountPrice,
			String discounted, String taxRate, Exception e) {
		feedPriceModelAfterError(model, price, margin, discountPrice, discounted, taxRate, e);
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE_ADD;
	}
	
	private String manageErrorAndReturnToFlatAddPage(ModelMap model,
			String roomNumber, String floor, String handicapAccess,
			String status, String avalaible, Exception e) {
		feedFlatModelAfterError(model, roomNumber, floor, handicapAccess, status, avalaible, e);
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_ADD;
	}
	
	private String manageErrorAndReturnToFlatTypeAddPage(ModelMap model,
			String name, String description, String numberOfBeds,
			String size, Exception e) {
		feedFlatTypeModelAfterError(model, name, description, numberOfBeds, size, e);
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE_ADD;
	}
	
	private String manageErrorAndReturnToOptionAddPage(ModelMap model,
			String perPerson, String pricePercentage,
			Exception e) {
		feedOptionModelAfterError(model, perPerson, pricePercentage, e);
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION_ADD;
	}
	
	private String manageErrorAndReturnToPartnerUserAddPage(ModelMap model,
			String name, String surname, String jobtitle, String login, String password, String enabled,
			Exception e) {
		feedPartnerUserModelAfterError(model, name, surname, jobtitle, login, password, enabled, e);
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER_ADD;
	}
	
	private String manageErrorAndReturnToPartnerAddPage(ModelMap model,
			String name, String description,
			Exception e) {
		feedPartnerModelAfterError(model, name, description, e);
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER_ADD;
	}
	
	private String manageErrorAndReturnToSeasonAdminPage(ModelMap model,
			String name, String startDate, String endDate, Exception e) {
		feedSeasonModelAfterError(model, name, startDate, endDate, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_SEASON;
	}
	
	private String manageErrorAndReturnToPeriodAdminPage(ModelMap model,
			String name, String startDate, String endDate, Exception e) {
		feedPeriodModelAfterError(model, name, startDate, endDate, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PERIOD;
	}
	
	private String manageErrorAndReturnToPriceAdminPage(ModelMap model,
			String price, String margin, String discountPrice,
			String discounted, String taxRate, Exception e) {
		feedPriceModelAfterError(model, price, margin, discountPrice, discounted, taxRate, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PRICE;
	}
	
	private String manageErrorAndReturnToFlatAdminPage(ModelMap model,
			String roomNumber, String floor, String handicapAccess,
			String status, String avalaible, Exception e) {
		feedFlatModelAfterError(model, roomNumber, floor, handicapAccess, status, avalaible, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT;
	}
	
	private String manageErrorAndReturnToFlatTypeAdminPage(ModelMap model,
			String name, String description, String numberOfBeds,
			String size, Exception e) {
		feedFlatTypeModelAfterError(model, name, description, numberOfBeds, size, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_FLAT_TYPE;
	}
	
	private String manageErrorAndReturnToOptionAdminPage(ModelMap model,
			String perPerson, String pricePercentage,
			Exception e) {
		feedOptionModelAfterError(model, perPerson, pricePercentage, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_OPTION;
	}
	
	private String manageErrorAndReturnToPartnerUserAdminPage(ModelMap model,
			String name, String surname, String jobtitle, String login, String password, String enabled,
			Exception e) {
		feedPartnerUserModelAfterError(model, name, surname, jobtitle, login, password, enabled, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_USER;
	}
	
	private String manageErrorAndReturnToPartnerAdminPage(ModelMap model,
			String name, String description,
			Exception e) {
		feedPartnerModelAfterError(model, name, description, e);
		
		return SpringViewResolutionConstants.VIEW_ADMIN_CRUD_PARTNER;
	}

	private void feedSeasonModelAfterError(ModelMap model, String name,
			String startDate, String endDate, Exception e) {
		model.put("messageKo", true);
		model.put("name", name);
		model.put("startDate", startDate);
		model.put("endDate", endDate);
		model.put("exception", e);
	}
	
	private void feedPeriodModelAfterError(ModelMap model, String name,
			String startDate, String endDate, Exception e) {
		model.put("messageKo", true);
		model.put("name", name);
		model.put("startDate", startDate);
		model.put("endDate", endDate);
		model.put("exception", e);
	}
	
	private void feedPriceModelAfterError(ModelMap model, String price,
			String margin, String discountPrice, String discounted,
			String taxRate, Exception e) {
		model.put("messageKo", true);
		model.put("price", price);
		model.put("margin", margin);
		model.put("discountPrice", discountPrice);
		model.put("discounted", discounted);
		model.put("taxRate", taxRate);
		model.put("exception", e);
	}
	
	private void feedFlatModelAfterError(ModelMap model, String roomNumber,
			String floor, String handicapAccess, String status,
			String avalaible, Exception e) {
		model.put("messageKo", true);
		model.put("roomNumber", roomNumber);
		model.put("floor", floor);
		model.put("handicapAccess", handicapAccess);
		model.put("status", status);
		model.put("avalaible", avalaible);
		model.put("exception", e);
	}
	
	private void feedFlatTypeModelAfterError(ModelMap model, String name,
			String description, String numberOfBeds, String size,
			Exception e) {
		model.put("messageKo", true);
		model.put("name", name);
		model.put("description", description);
		model.put("numberOfBeds", numberOfBeds);
		model.put("size", size);
		model.put("exception", e);
	}
	
	private void feedOptionModelAfterError(ModelMap model, 
			String perPerson, String pricePercentage,
			Exception e) {
		model.put("messageKo", true);
		model.put("perPerson", perPerson);
		model.put("pricePercentage", pricePercentage);
		model.put("exception", e);
	}
	
	private void feedPartnerUserModelAfterError(ModelMap model, 
			String name, String surname, String jobtitle, String login, String password, String enabled,
			Exception e) {
		model.put("messageKo", true);
		model.put("name", name);
		model.put("surname", surname);
		model.put("jobtitle", jobtitle);
		model.put("login", login);
		model.put("password", password);
		model.put("enabled", enabled);
		model.put("exception", e);
	}
	
	private void feedPartnerModelAfterError(ModelMap model, 
			String name, String description,
			Exception e) {
		model.put("messageKo", true);
		model.put("name", name);
		model.put("description", description);
		model.put("exception", e);
	}
	
	private void loadSeasonsInModel(ModelMap model) {
		List<Season> seasons = service.findAllSeasons();
		model.put("seasons", seasons);
	}
	
	private void loadPeriodsInModel(ModelMap model) {
		List<Period> periods = service.findAllPeriods();
		model.put("periods", periods);
	}
	
	private void loadPricesInModel(ModelMap model) {
		List<Price> prices = service.findAllPrices();
		model.put("prices", prices);
	}
	
	private void loadFlatsInModel(ModelMap model) {
		List<Flat> flats = service.findAllFlats();
		model.put("flats", flats);
	}
	
	private void loadFlatTypesInModel(ModelMap model) {
		List<FlatType> flatTypes = service.findAllFlatTypes();
		model.put("flatTypes", flatTypes);
	}
	
	private void loadOptionsInModel(ModelMap model) {
		List<Option> options = service.findAllOptions();
		model.put("options", options);
	}
	
	private void loadPartnerUsersInModel(ModelMap model) {
		List<PartnerUser> partnerUsers = service.findAllPartnerUsers();
		model.put("users", partnerUsers);
	}
	
	private void loadPartnersInModel(ModelMap model) {
		List<Partner> partners = service.findAllPartners();
		model.put("partners", partners);
	}
	
}