package com.dreamit.proxystat.model.service;

import java.util.List;

import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;

/**
 * Services d'administration réservé aux partenaires training
 * @author Mélody Mascot
 *
 */
public interface IAdministrationTrainingPartnerService {
	
	/**
	 * Save or upate a training course
	 * @param course object to save
	 * @return the object saved
	 */
	TrainingCourse saveCourse(TrainingCourse course) throws MissingRequiredInformationException;;
	
	/**
	 * Delete the training course 
	 * @param equipment to delete
	 */
	void deleteCourse(TrainingCourse course);
	 
	/**
	 * Retrieve all course
	 * @return list of course
	 */
	List<TrainingCourse> findAllCourse();
	
	/**
	 * Retrieve course of partner training
	 * @return list of course
	 */
	List<TrainingCourse> findAllCourseByTrainingPartner(TrainingPartner trainingPartner);
	
	/**
	 * Find the corresponding course in the persistence layer
	 * @param id
	 * @return found course or null object
	 */
	TrainingCourse findCourseById(Long id);

}
