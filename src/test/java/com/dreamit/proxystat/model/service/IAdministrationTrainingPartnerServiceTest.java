package com.dreamit.proxystat.model.service;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.ITrainingCourseDAO;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.impl.AdministrationTrainingPartnerServiceImpl;


/**
 * 
 * @author Mélody Mascot
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IAdministrationTrainingPartnerServiceTest {
	
	
	@InjectMocks 
	private AdministrationTrainingPartnerServiceImpl administrationTrainingPartnerService;
	
	@Mock
	private ITrainingCourseDAO trainingCourseDao;
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotCreateCourseWithoutLevel() throws MissingRequiredInformationException {
		TrainingCourse course = new TrainingCourse();
		Pass pass = new Pass();
		pass.setId(new Long(1));
		Integer numberOfHalfDay = new Integer(1);
		course.setNumberOfHalfDay(numberOfHalfDay);
		Integer totalHourDuration = new Integer(1);
		course.setTotalHourDuration(totalHourDuration);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		course.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		course.setPrice(price);
		
		administrationTrainingPartnerService.saveCourse(course);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotCreateCourseWithoutPassIfLevelSuperiorFour() throws MissingRequiredInformationException {
		TrainingCourse course = new TrainingCourse();
		Integer courseLevel = new Integer(4);
		course.setCourseLevel(courseLevel);
		Integer numberOfHalfDay = new Integer(1);
		course.setNumberOfHalfDay(numberOfHalfDay);
		Integer totalHourDuration = new Integer(1);
		course.setTotalHourDuration(totalHourDuration);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		course.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		course.setPrice(price);
		
		administrationTrainingPartnerService.saveCourse(course);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotCreateCourseWithoutAgeCategory() throws MissingRequiredInformationException {
		TrainingCourse course = new TrainingCourse();
		Pass pass = new Pass();
		pass.setId(new Long(1));
		Integer courseLevel = new Integer(1);
		course.setCourseLevel(courseLevel);
		Integer numberOfHalfDay = new Integer(1);
		course.setNumberOfHalfDay(numberOfHalfDay);
		Integer totalHourDuration = new Integer(1);
		course.setTotalHourDuration(totalHourDuration);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		course.setPrice(price);
		
		administrationTrainingPartnerService.saveCourse(course);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotCreateCourseWithoutPrice() throws MissingRequiredInformationException {
		TrainingCourse course = new TrainingCourse();
		Pass pass = new Pass();
		pass.setId(new Long(1));
		Integer numberOfHalfDay = new Integer(1);
		course.setNumberOfHalfDay(numberOfHalfDay);
		Integer totalHourDuration = new Integer(1);
		course.setTotalHourDuration(totalHourDuration);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		course.setAgeCategory(ageCategory);
		
		administrationTrainingPartnerService.saveCourse(course);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotSaveCourseWithNullCourse() throws MissingRequiredInformationException {
		
		administrationTrainingPartnerService.saveCourse(null);

	}
	
	
	@Test
	public void testCanSaveOrUpdate() throws MissingRequiredInformationException{
		TrainingCourse course = new TrainingCourse();
		Pass pass = new Pass();
		pass.setId(new Long(1));
		Integer courseLevel = new Integer(1);
		course.setCourseLevel(courseLevel);
		Integer numberOfHalfDay = new Integer(1);
		course.setNumberOfHalfDay(numberOfHalfDay);
		Integer totalHourDuration = new Integer(1);
		course.setTotalHourDuration(totalHourDuration);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		course.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		course.setPrice(price);
		
		administrationTrainingPartnerService.saveCourse(course);
		
		verify(trainingCourseDao).save(course);
	}
	
	
	@Test
	public void testCanListCourse(){
		TrainingPartner trainingPartner = new TrainingPartner();
		trainingPartner.setId(new Long(4));
		trainingPartner.setDescription("Partenaire cours A");
		trainingPartner.setName("Ecole de ski");
		
		
		administrationTrainingPartnerService.findAllCourseByTrainingPartner(trainingPartner);
	
		verify(trainingCourseDao).findAll();
	}
	
	
	@Test
	public void testCanDeleteCourse(){
		TrainingCourse course = new TrainingCourse();
		Pass pass = new Pass();
		pass.setId(new Long(1));
		Integer courseLevel = new Integer(1);
		course.setCourseLevel(courseLevel);
		Integer numberOfHalfDay = new Integer(1);
		course.setNumberOfHalfDay(numberOfHalfDay);
		Integer totalHourDuration = new Integer(1);
		course.setTotalHourDuration(totalHourDuration);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		course.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		course.setPrice(price);
		
		administrationTrainingPartnerService.deleteCourse(course);	
		
		verify(trainingCourseDao).delete(course);
	}

}
