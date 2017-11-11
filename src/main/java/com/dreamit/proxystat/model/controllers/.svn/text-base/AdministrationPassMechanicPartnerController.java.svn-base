package com.dreamit.proxystat.model.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamit.proxystat.model.dto.MechanicPartnerListing;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Duration;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.factory.IPassFactory;
import com.dreamit.proxystat.model.factory.ITrackFactory;
import com.dreamit.proxystat.model.service.IAdministrationCommonService;
import com.dreamit.proxystat.model.service.IAdministrationPassMechanicPartnerService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Admin Pass For MechanicPartner Controller
 * @author rudy stienne
 *
 */
@Controller
@RequestMapping(value = "*.adminMechanicPartner")
@Scope(value = "singleton")
public class AdministrationPassMechanicPartnerController {
	
	@Autowired IAdministrationPassMechanicPartnerService administrationPassMechanicPartnerService;
	
	@Autowired IAdministrationCommonService administrationCommonService;
	
	@Autowired
	private ITrackFactory trackFactory;
	
	@Autowired
	private IPassFactory passFactory;
	
	
	
	/**
	 * 
	 * @return mechanic partner homepage
	 */
	@RequestMapping(value="/home")
	public String returnMechanicAdminHomepage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_HOME;
    }
	
	/**
	 * 
	 * @return mechanic partner admin track
	 */
	@RequestMapping(value="/track")
	public String returnMechanicAdminTrackpage(HttpServletRequest request, ModelMap model) {
		/* ici au lancement de la page envoie des tracks dispos en base */
		List<Track> tracksAvailable = administrationPassMechanicPartnerService.findAll();		
		model.put("tracksAvailable", tracksAvailable);
			return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_TRACKPAGE;
    }
	
	
	/**
	 * 
	 * @return mechanic partner admin pass
	 */
	@RequestMapping(value="/pass")
	public String returnMechanicAdminPasspage(HttpServletRequest request, ModelMap model) {
		/* ici au lancement de la page envoie des pass dispos en base */
		// todo : à modifier pour le mechanic partner a passe en param
		MechanicPartner mechanicPartner = new MechanicPartner();
		mechanicPartner.setId(Long.valueOf(3));
		mechanicPartner.setDescription("Partenaire forfait A");
		mechanicPartner.setName("Remontee pro");
		List<Pass> passAvailable = administrationPassMechanicPartnerService.findAllPassByMechanicPartner(mechanicPartner);		
		model.put("passAvailable", passAvailable);
			return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_PASSPAGE;
    }
	
	
	@RequestMapping(value="/returnViewAdminMechanicPartnerToAddTrack")
	public String returnViewAdminMechanicPartnerToAddTrack() {
		
		return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_ADD_TRACK;
    }
	
	
	
	private void loadDataToPass( ModelMap model){
		// je dois retourner la liste des age categories, des durations, des périodes et des tracks existants
		List<Track> tracksAvailable = administrationPassMechanicPartnerService.findAll();		
		model.put("tracksAvailable", tracksAvailable);
		List<AgeCategory> ageCategoryAvailable = administrationCommonService.findAllAgeCategory();		
		model.put("ageCategoryAvailable", ageCategoryAvailable);
		List<Duration> durationAvailable = administrationCommonService.getAllDurations();	
		model.put("durationAvailable", durationAvailable);
		List<Period> periodAvailable = administrationCommonService.findAllPeriod();
		model.put("periodAvailable", periodAvailable);
		List<Price> pricesAvailable = administrationCommonService.findAllPrice();	
		model.put("pricesAvailable", pricesAvailable);
	}
	
	
	@RequestMapping(value="/returnViewAdminMechanicPartnerToAddPass")
	public String returnViewAdminMechanicPartnerToAddPass(HttpServletRequest request, ModelMap model) {
			loadDataToPass(model);
		
		return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_ADD_PASS;
    }
	
	@RequestMapping(value = "/createTrack", method = RequestMethod.POST)
	public String createTrack(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "trackname", required = true) String trackname,
			@RequestParam(value = "trackdomain", required = true) String trackdomain,
			@RequestParam(value = "tracktype", required = true) String tracktype
			) throws MissingRequiredInformationException{
		
		Track track = trackFactory.createTrack(trackname, trackdomain, tracktype);
		
		try {
			administrationPassMechanicPartnerService.saveTrack(track);
			model.put("messageOk", "Forfait ajouté dans la base");
		} catch (MissingRequiredInformationException e) {
			model.put("messageKo", "Forfait non ajouté dans la base, un ou plusieurs champs non renseignés");
		}
		return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_ADD_TRACK;
	}
	
	@RequestMapping(value = "/modifyTrack", method = RequestMethod.POST)
	public String modifyTrack(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "idTrack", required = false) Long idTrack,
			@RequestParam(value = "trackname", required = true) String trackname,
			@RequestParam(value = "trackdomain", required = true) String trackdomain,
			@RequestParam(value = "tracktype", required = true) String tracktype
			) throws MissingRequiredInformationException{
		Track trackToModify = administrationPassMechanicPartnerService.getTrackById(idTrack);	
		trackToModify.setDomain(trackdomain);
		trackToModify.setName(trackname);
		trackToModify.setType(tracktype);
		model.put("trackToModify", trackToModify);
		
		try {
			administrationPassMechanicPartnerService.saveTrack(trackToModify);
			model.put("messageOk", "Forfait modifié dans la base");
		}catch (MissingRequiredInformationException e) {
			model.put("messageKo", "Forfait non modifié dans la base, un ou plusieurs champs non renseignés");
		}	
			
		
	return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_MODIFY_TRACK;
	}
	
	@RequestMapping(value = "/createPass", method = RequestMethod.POST)
	public String createPass(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "trackidChoice", required = true) Long trackidChoice,
			@RequestParam(value = "priceChoice", required = true) Long priceChoice,
			@RequestParam(value = "periodChoice", required = true) Long periodChoice,
			@RequestParam(value = "durationChoice", required = true) Long durationChoice,
			@RequestParam(value = "ageCategoryChoice", required = true) Long ageCategoryChoice
			) throws MissingRequiredInformationException{
	// inserer service forfait remontée mécanique, id = 6, todo a changer pour param en dur
		Service service = administrationCommonService.findServiceById(Long.valueOf(6));
		Track track = administrationPassMechanicPartnerService.getTrackById(trackidChoice);
		Period period = administrationCommonService.findPeriodById(periodChoice);
		Duration duration = administrationCommonService.getDurationById(durationChoice);
		AgeCategory ageCategory = administrationCommonService.findAgeCategoryById(ageCategoryChoice);
		Price price = administrationCommonService.findPriceById(priceChoice);
		// todo : à modifier pour le mechanic partner a passe en param
		MechanicPartner mechanicPartner = new MechanicPartner();
		mechanicPartner.setId(Long.valueOf(3));
		mechanicPartner.setDescription("Partenaire forfait A");
		mechanicPartner.setName("Remontee pro");
		Pass pass = passFactory.createPass(service,track,duration,ageCategory,price,period,mechanicPartner,true,(float) 2);
		
		try {
			administrationPassMechanicPartnerService.savePass(pass);
			model.put("messageOk", "Tarif pour forfait ajouté dans la base");
		}catch (MissingRequiredInformationException e) {
			model.put("messageKo", "Tarif pour forfait non ajouté dans la base, un ou plusieurs champs non renseignés");
		}
				
			
		return returnViewAdminMechanicPartnerToAddPass(request,model);
	}
	
	
	@RequestMapping(value = "/modifyPass", method = RequestMethod.POST)
	public String modifyPass(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "idPass", required = false) Long idPass,
			@RequestParam(value = "trackidChoice", required = true) Long trackidChoice,
			@RequestParam(value = "priceChoice", required = true) Long priceChoice,
			@RequestParam(value = "periodChoice", required = true) Long periodChoice,
			@RequestParam(value = "durationChoice", required = true) Long durationChoice,
			@RequestParam(value = "ageCategoryChoice", required = true) Long ageCategoryChoice
			) throws MissingRequiredInformationException{
		Pass passToModify = administrationPassMechanicPartnerService.getPassById(idPass);
		// inserer service forfait remontée mécanique, id = 6, todo a changer pour param en dur
				Service service = administrationCommonService.findServiceById(Long.valueOf(6));
				Track track = administrationPassMechanicPartnerService.getTrackById(trackidChoice);
				Period period = administrationCommonService.findPeriodById(periodChoice);
				Duration duration = administrationCommonService.getDurationById(durationChoice);
				AgeCategory ageCategory = administrationCommonService.findAgeCategoryById(ageCategoryChoice);
				Price price = administrationCommonService.findPriceById(priceChoice);
			// todo : à modifier pour le mechanic partner a passe en param
			MechanicPartner mechanicPartner = new MechanicPartner();
			mechanicPartner.setId(Long.valueOf(3));
			mechanicPartner.setDescription("Partenaire forfait A");
			mechanicPartner.setName("Remontee pro");
			passToModify.setService(service);
			passToModify.setAgeCategory(ageCategory);
			passToModify.setCautionPrice((float) 2);
			passToModify.setCautionReturned(true);
			passToModify.setDuration(duration);
			passToModify.setMechanicPartner(mechanicPartner);
			passToModify.setPeriod(period);
			passToModify.setPrice(price);
			passToModify.setTrack(track);
		model.put("passToModify", passToModify);
		
		try {
			administrationPassMechanicPartnerService.savePass(passToModify);
			model.put("messageOk", "Tarif pour forfait modifié dans la base");
		}catch (MissingRequiredInformationException e) {
			model.put("messageKo", "Tarif pour Forfait non modifié dans la base, un ou plusieurs champs non renseignés");
		}	
		loadDataToPass(model);
	return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_MODIFY_PASS;
	}
	
	
	private void deleteATrack(Long idTrack, ModelMap model){
		Track track = administrationPassMechanicPartnerService.getTrackById(idTrack);
		try{
			administrationPassMechanicPartnerService.deleteTrack(track);
		 } catch (DataIntegrityViolationException d) {
			 model.put("messageKoDeleteTrack", "Forfait non supprimé dans la base car un tarif lui est attaché");
	        }
		List<Track> tracksAvailable = administrationPassMechanicPartnerService.findAll();		
		model.put("tracksAvailable", tracksAvailable);
	}
	
	private void deleteAPass(Long idPass, ModelMap model){
		Pass pass = administrationPassMechanicPartnerService.getPassById(idPass);
				try{
					administrationPassMechanicPartnerService.deletePass(pass);
				 } catch (DataIntegrityViolationException d) {
					 model.put("messageKoDeletePass", "Tarif non supprimé dans la base car un forfait acheté par un client lui est attaché");
			     }
				// todo : à modifier pour le mechanic partner a passe en param
				MechanicPartner mechanicPartner = new MechanicPartner();
				mechanicPartner.setId(Long.valueOf(3));
				mechanicPartner.setDescription("Partenaire forfait A");
				mechanicPartner.setName("Remontee pro");
			List<Pass> passAvailable = administrationPassMechanicPartnerService.findAllPassByMechanicPartner(mechanicPartner);		
			model.put("passAvailable", passAvailable);
	}
	
	 
	private String modifyATrack(Long idTrack, ModelMap model){
		Track trackToModify = administrationPassMechanicPartnerService.getTrackById(idTrack);	
		model.put("trackToModify", trackToModify);
		
		return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_MODIFY_TRACK;
	}
	
	private String modifyAPass(Long idPass, ModelMap model){
		Pass passToModify = administrationPassMechanicPartnerService.getPassById(idPass);	
		model.put("passToModify", passToModify);
		loadDataToPass(model);
		return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_MODIFY_PASS;
	}
	

	@RequestMapping(value = "/modifyOrDeleteTrack", method = RequestMethod.POST)
	public String modifyOrDeleteTrack(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "trackChoiceToModify", required = false) String trackChoiceToModify,
			@RequestParam(value = "trackChoiceToDelete", required = false) String trackChoiceToDelete,
			@RequestParam(value = "idTrack", required = false) Long idTrack
			){
			if(trackChoiceToModify!=null){
				return modifyATrack(idTrack,model);
			}
				
			if(trackChoiceToDelete!=null){
				deleteATrack(idTrack,model);
			}
			
		return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_TRACKPAGE;
	}
	
	@RequestMapping(value = "/modifyOrDeletePass", method = RequestMethod.POST)
	public String modifyOrDeletePass(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "passChoiceToModify", required = false) String passChoiceToModify,
			@RequestParam(value = "passChoiceToDelete", required = false) String passChoiceToDelete,
			@RequestParam(value = "idPass", required = false) Long idPass
			){
			if(passChoiceToModify!=null){
				return modifyAPass(idPass,model);
			}
				
			if(passChoiceToDelete!=null){
				deleteAPass(idPass,model);
			}
		return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_PASSPAGE;
	}
	
	
	/* partie concernant la liste des forfaits à préparer */
	
	@RequestMapping(value="/listing")
	public String initialListing(HttpServletRequest request, ModelMap model) {
		List<MechanicPartnerListing> listings = administrationPassMechanicPartnerService.getMechanicPartnerListingForComingWeek();
		model.put("listings", listings);
		
		return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_LISTING;
    }
	
	@RequestMapping(value="/fullListing")
	public String fullListing(HttpServletRequest request, ModelMap model) throws ParseException {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		Date startDate = ft.parse("1000-01-01");
		Date endDate = ft.parse("4000-01-01");
		List<MechanicPartnerListing> listings = administrationPassMechanicPartnerService.getMechanicPartnerListingBetween(startDate, endDate);
		model.put("listings", listings);
		
		return  SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_LISTING;
    }
}