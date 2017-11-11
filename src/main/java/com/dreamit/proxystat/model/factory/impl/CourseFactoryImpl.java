package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.factory.ICourseFactory;

/**
 * 
 * @author Mélody Mascot
 *
 */
@Component(value = "courseFactory")
public class CourseFactoryImpl implements ICourseFactory{

	@Override
	public TrainingCourse createCourse(Service service, Integer courseLevel,
			Integer totalHourDuration, Integer numberOfHalfDay, Pass pass,
			 AgeCategory ageCategory, Price price,
			Period period, TrainingPartner trainingPartner) {
	
		TrainingCourse newCourse = new TrainingCourse();
		newCourse.setAgeCategory(ageCategory);
		newCourse.setCourseLevel(courseLevel);
		newCourse.setNumberOfHalfDay(numberOfHalfDay);
		newCourse.setPass(pass);
		newCourse.setPeriod(period);
		newCourse.setPrice(price);
		newCourse.setService(service);
		newCourse.setTotalHourDuration(totalHourDuration);
		newCourse.setTrainingPartner(trainingPartner);
		
		return newCourse;
	}


	


}
