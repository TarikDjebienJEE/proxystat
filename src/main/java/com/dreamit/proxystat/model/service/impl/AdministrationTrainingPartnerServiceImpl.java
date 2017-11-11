package com.dreamit.proxystat.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.ITrainingCourseDAO;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.IAdministrationTrainingPartnerService;


/**
 * 
 * @author Mélody Mascot
 *
 */
@Service(value = "administrationTrainingPartnerService")
@Transactional
public class AdministrationTrainingPartnerServiceImpl implements IAdministrationTrainingPartnerService{
	
	@Autowired
	private ITrainingCourseDAO trainingCourseDao;

	@Override
	public TrainingCourse saveCourse(TrainingCourse course)throws MissingRequiredInformationException{
		checkCourseValidity(course);
		return trainingCourseDao.save(course);
	}
	
	private void checkCourseValidity(TrainingCourse course)
			throws MissingRequiredInformationException {
		if (course == null) {
			throw new IllegalArgumentException();
		}

		AgeCategory ageCategory = course.getAgeCategory();
		checkForNullAgeCategory(ageCategory);

		Price price = course.getPrice();
		checkForNullPrice(price);
		
		// Sert à vérifier qu'un pass est bien attaché au cours sle niveau est supérieur ou négal à 4
		Integer level = course.getCourseLevel();
		Pass pass = course.getPass();
		if(level == null || level >= 4){
			checkForNullPass(pass);
		}

	}
	
	
	private void checkForNullPass(Pass pass){
		if (pass == null) {
			throw new IllegalArgumentException();
		}
	}
	
	private void checkForNullAgeCategory(AgeCategory ageCategory){
		if (ageCategory == null) {
			throw new IllegalArgumentException();
		}
	}

	private void checkForNullPrice(Price price){
		if (price == null) {
			throw new IllegalArgumentException();
		}
	}
	

	@Override
	public void deleteCourse(TrainingCourse course) {
		trainingCourseDao.delete(course);
	}

	@Override
	public List<TrainingCourse> findAllCourse() {
		return trainingCourseDao.findAll();
	}

	@Override
	public List<TrainingCourse> findAllCourseByTrainingPartner(TrainingPartner trainingPartner){
		List<TrainingCourse> listCourse = trainingCourseDao.findAll();
		List<TrainingCourse> listCourseReturn = new ArrayList<TrainingCourse>();

		for (TrainingCourse course : listCourse) {
			if(course.getTrainingPartner()!=null && trainingPartner.getId().equals(course.getTrainingPartner().getId())) {
				listCourseReturn.add(course);
			}
		}
		
		return listCourseReturn;
	}
	
	

	@Override
	public TrainingCourse findCourseById(Long id) {
		return trainingCourseDao.findById(id);
	}

}
