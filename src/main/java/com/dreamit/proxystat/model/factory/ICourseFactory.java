package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.TrainingCourse;
import com.dreamit.proxystat.model.entities.TrainingPartner;


/**
 * 
 * @author Mélody Mascot
 *
 */
public interface ICourseFactory {

	/**
	 * instancie un objet Course
	 * @return un objet Course
	 */
	TrainingCourse createCourse(Service service,Integer courseLevel,Integer totalHourDuration,Integer numberOfHalfDay,Pass pass, AgeCategory ageCategory,Price price,Period period,TrainingPartner trainingPartner);
}
