package com.dreamit.proxystat.model.controllers;

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

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.factory.ICourseFactory;
import com.dreamit.proxystat.model.service.IAdministrationCommonService;
import com.dreamit.proxystat.model.service.IAdministrationPassMechanicPartnerService;
import com.dreamit.proxystat.model.service.IAdministrationTrainingPartnerService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;


/**
 * Admin Course for training partner Controller
 * @author melody mascot
 *
 */
@Controller
@RequestMapping(value = "*.adminTrainingPartner")
@Scope(value = "singleton")
public class AdministrationTrainingPartnerController {
	
	@Autowired IAdministrationTrainingPartnerService administrationTrainingPartnerService;
	
	@Autowired IAdministrationPassMechanicPartnerService administrationPassMechanicPartnerService;

	
	@Autowired IAdministrationCommonService administrationCommonService;
	
	@Autowired
	private ICourseFactory courseFactory;
	
	
	/**
	 * 
	 * @return training partner homepage
	 */
	@RequestMapping(value="/home")
	public String returnTrainingAdminHomepage() {
		
		return  SpringViewResolutionConstants.VIEW_ADMINTRAININGPARTNER_HOME;
    }
	
	@RequestMapping(value="/course")
	public String returnViewAdminTrainingPartnerCourse(HttpServletRequest request, ModelMap model) {
		
		/* ici au lancement de la page envoie des courses dispos en base */
		TrainingPartner trainingPartner = new TrainingPartner();
		trainingPartner.setId(Long.valueOf(4));
		trainingPartner.setDescription("Partenaire cours A");
		trainingPartner.setName("Ecole de ski");
		List<TrainingCourse> courseAvailable = administrationTrainingPartnerService.findAllCourseByTrainingPartner(trainingPartner);		
		model.put("courseAvailable", courseAvailable);
		
		return  SpringViewResolutionConstants.VIEW_ADMINTRAININGPARTNER_COURSEPAGE;
    }
	
	
	private void loadDataToCourse( ModelMap model){
		// je dois retourner la liste des age categories, des prix et des périodes 
		List<AgeCategory> ageCategoryAvailable = administrationCommonService.findAllAgeCategory();		
		model.put("ageCategoryAvailable", ageCategoryAvailable);
	
		List<Period> periodAvailable = administrationCommonService.findAllPeriod();
		model.put("periodAvailable", periodAvailable);
		
		List<Price> pricesAvailable = administrationCommonService.findAllPrice();	
		model.put("pricesAvailable", pricesAvailable);
		
		List<Pass> passAvailable = administrationCommonService.findAllPass();	
		model.put("passAvailable", passAvailable);
	}

	
	@RequestMapping(value="/returnViewAdminTrainingPartnerToAddCourse")
	public String returnViewAdminTrainingPartnerToAddCourse(HttpServletRequest request, ModelMap model) {
		loadDataToCourse(model);
		
		return  SpringViewResolutionConstants.VIEW_ADMINTRAININGPARTNER_ADD_COURSE;
    }
	
	
	@RequestMapping(value = "/createCourse", method = RequestMethod.POST)
	public String createCourse(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "priceChoice", required = true) Long priceChoice,
			@RequestParam(value = "periodChoice", required = true) Long periodChoice,
			@RequestParam(value = "ageCategoryChoice", required = true) Long ageCategoryChoice,
			@RequestParam(value = "passidChoice", required = true) Long passidChoice,
			@RequestParam(value = "levelChoice", required = true) Integer levelChoice,
			@RequestParam(value = "durationChoice", required = true) Integer durationChoice,
			@RequestParam(value = "halfDayChoice", required = true) Integer halfDayChoice
			) throws MissingRequiredInformationException{
		Service service = administrationCommonService.findServiceById(Long.valueOf(6));
		Period period = administrationCommonService.findPeriodById(periodChoice);
		AgeCategory ageCategory = administrationCommonService.findAgeCategoryById(ageCategoryChoice);
		Price price = administrationCommonService.findPriceById(priceChoice);
		Pass pass = administrationCommonService.findPassById(passidChoice);

		
		TrainingPartner trainingPartner = new TrainingPartner();
		trainingPartner.setId(Long.valueOf(4));
		trainingPartner.setDescription("Partenaire cours A");
		trainingPartner.setName("Ecole de ski");
		TrainingCourse trainingCourse = courseFactory.createCourse(service, levelChoice, durationChoice, halfDayChoice, pass, ageCategory , price, period,trainingPartner);
		
		try {
			administrationTrainingPartnerService.saveCourse(trainingCourse);
			model.put("messageOk", "Course ajouté dans la base");
		}catch (MissingRequiredInformationException e) {
			model.put("messageKo", "Course non ajouté dans la base, un ou plusieurs champs non renseignés");
		}
				
			
		return returnViewAdminTrainingPartnerToAddCourse(request,model);
	}
	
	
	
	@RequestMapping(value = "/modifyCourse", method = RequestMethod.POST)
	public String modifyCourse(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "idCourse", required = false) Long idCourse,
			@RequestParam(value = "priceChoice", required = true) Long priceChoice,
			@RequestParam(value = "periodChoice", required = true) Long periodChoice,
			@RequestParam(value = "ageCategoryChoice", required = true) Long ageCategoryChoice,
			@RequestParam(value = "passidChoice", required = true) Long passidChoice,
			@RequestParam(value = "levelChoice", required = true) Integer levelChoice,
			@RequestParam(value = "durationChoice", required = true) Integer durationChoice,
			@RequestParam(value = "halfDayChoice", required = true) Integer halfDayChoice
			) throws MissingRequiredInformationException{
		TrainingCourse courseToModify = administrationTrainingPartnerService.findCourseById(idCourse);
		
		Service service = administrationCommonService.findServiceById(Long.valueOf(6));
		Period period = administrationCommonService.findPeriodById(periodChoice);
		AgeCategory ageCategory = administrationCommonService.findAgeCategoryById(ageCategoryChoice);
		Price price = administrationCommonService.findPriceById(priceChoice);
		Pass pass = administrationCommonService.findPassById(passidChoice);
		
		TrainingPartner trainingPartner = new TrainingPartner();
		trainingPartner.setId(Long.valueOf(4));
		trainingPartner.setDescription("Partenaire cours A");
		trainingPartner.setName("Ecole de ski");
		
		courseToModify.setAgeCategory(ageCategory);
		courseToModify.setCourseLevel(levelChoice);
		courseToModify.setNumberOfHalfDay(halfDayChoice);
		courseToModify.setPass(pass);
		courseToModify.setPeriod(period);
		courseToModify.setPrice(price);
		courseToModify.setService(service);
		courseToModify.setTotalHourDuration(durationChoice);
		courseToModify.setTrainingPartner(trainingPartner);
			
		model.put("courseToModify", courseToModify);
		
		try {
			administrationTrainingPartnerService.saveCourse(courseToModify);
			model.put("messageOk", "Course modifié dans la base");
		}catch (MissingRequiredInformationException e) {
			model.put("messageKo", "Course non modifié dans la base, un ou plusieurs champs non renseignés");
		}	
		loadDataToCourse(model);
	return SpringViewResolutionConstants.VIEW_ADMINTRAININGPARTNER_MODIFY_COURSE;
	}
	
	
	
	private void deleteACourse(Long idCourse, ModelMap model){
		TrainingCourse course = administrationTrainingPartnerService.findCourseById(idCourse);
				try{
					administrationTrainingPartnerService.deleteCourse(course);
				} catch (DataIntegrityViolationException d) {
					 model.put("messageKoDeleteCourse", "Course non supprimé dans la base");
			     }
				// todo : à modifier pour le mechanic partner a passe en param
				TrainingPartner trainingPartner = new TrainingPartner();
				trainingPartner.setId(Long.valueOf(4));
				trainingPartner.setDescription("Partenaire cours A");
				trainingPartner.setName("Ecole de ski");
				
			List<TrainingCourse> courseAvailable = administrationTrainingPartnerService.findAllCourseByTrainingPartner(trainingPartner);		
			model.put("courseAvailable", courseAvailable);
	}
	
	
	private String modifyACourse(Long idCourse, ModelMap model){
		TrainingCourse courseToModify = administrationTrainingPartnerService.findCourseById(idCourse);	
		model.put("courseToModify", courseToModify);
		loadDataToCourse(model);
		return SpringViewResolutionConstants.VIEW_ADMINTRAININGPARTNER_MODIFY_COURSE;
	}
	
	
	@RequestMapping(value = "/modifyOrDeleteCourse", method = RequestMethod.POST)
	public String modifyOrDeleteCourse(HttpServletRequest request, ModelMap model,
			@RequestParam(value = "courseChoiceToModify", required = false) String courseChoiceToModify,
			@RequestParam(value = "courseChoiceToDelete", required = false) String courseChoiceToDelete,
			@RequestParam(value = "idCourse", required = false) Long idCourse
			){
			if(courseChoiceToModify!=null){
				return modifyACourse(idCourse,model);
			}
				
			if(courseChoiceToDelete!=null){
				deleteACourse(idCourse,model);
			}
		return SpringViewResolutionConstants.VIEW_ADMINMECHANICPARTNER_PASSPAGE;
	}
	

}
