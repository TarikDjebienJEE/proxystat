package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.factory.impl.CourseFactoryImpl;

/**
 * 
 * @author Mélody Mascot
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class ICourseFactoryTest {
	
	@InjectMocks
	private CourseFactoryImpl factory;
	
	@Test
	public void testCanCreateCourseUsingFactory() {
		TrainingCourse result;
		TrainingCourse expected = new TrainingCourse();
		Service service=null;
		
		Integer courseLevel = null;
		Integer numberOfHalfDay= null;
		Integer totalHourDuration=null;
		Pass pass=null;
		AgeCategory ageCategory=null;
		Price price=null;
		Period period=null;
		TrainingPartner trainingPartner=null;
		
		
		expected.setService(service);
		expected.setCourseLevel(courseLevel);
		expected.setNumberOfHalfDay(numberOfHalfDay);
		expected.setTotalHourDuration(totalHourDuration);
		expected.setPass(pass);
		expected.setAgeCategory(ageCategory);
		expected.setPrice(price);
		expected.setPeriod(period);
		expected.setTrainingPartner(trainingPartner);
		
		
		result = factory.createCourse(service, courseLevel, totalHourDuration, numberOfHalfDay, pass, ageCategory, price, period, trainingPartner);
		
		assertEquals(expected.getService(), result.getService());
		assertEquals(expected.getCourseLevel(), result.getCourseLevel());
		assertEquals(expected.getNumberOfHalfDay(), result.getNumberOfHalfDay());
		assertEquals(expected.getTotalHourDuration(), result.getTotalHourDuration());
		assertEquals(expected.getPass(), result.getPass());
		assertEquals(expected.getAgeCategory(), result.getAgeCategory());
		assertEquals(expected.getPrice(), result.getPrice());
		assertEquals(expected.getPeriod(), result.getPeriod());
		assertEquals(expected.getTrainingPartner(), result.getTrainingPartner());
	}

}
