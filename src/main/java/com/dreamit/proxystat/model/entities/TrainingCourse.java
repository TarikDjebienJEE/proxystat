package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 * Classe pour les TrainingCourse
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("TrainingCourse")
public class TrainingCourse extends PeriodService  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer courseLevel;
	
	private Integer totalHourDuration;
	
	private Integer numberOfHalfDay;	
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	private TrainingPartner trainingPartner ;
	
	@OneToOne(cascade={CascadeType.ALL})
	private Pass pass;	
	
	@OneToOne(cascade={CascadeType.ALL})
	private AgeCategory ageCategory;

	/**
	 * @return the courseLevel
	 */
	public Integer getCourseLevel() {
		return courseLevel;
	}

	/**
	 * @param courseLevel the courseLevel to set
	 */
	public void setCourseLevel(Integer courseLevel) {
		this.courseLevel = courseLevel;
	}

	/**
	 * @return the totalHourDuration
	 */
	public Integer getTotalHourDuration() {
		return totalHourDuration;
	}

	/**
	 * @param totalHourDuration the totalHourDuration to set
	 */
	public void setTotalHourDuration(Integer totalHourDuration) {
		this.totalHourDuration = totalHourDuration;
	}

	/**
	 * @return the numberOfHalfDay
	 */
	public Integer getNumberOfHalfDay() {
		return numberOfHalfDay;
	}

	/**
	 * @param numberOfHalfDay the numberOfHalfDay to set
	 */
	public void setNumberOfHalfDay(Integer numberOfHalfDay) {
		this.numberOfHalfDay = numberOfHalfDay;
	}

	/**
	 * @return the trainingPartner
	 */
	public TrainingPartner getTrainingPartner() {
		return trainingPartner;
	}

	/**
	 * @param trainingPartner the trainingPartner to set
	 */
	public void setTrainingPartner(TrainingPartner trainingPartner) {
		this.trainingPartner = trainingPartner;
	}

	/**
	 * @return the pass
	 */
	public Pass getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(Pass pass) {
		this.pass = pass;
	}

	/**
	 * @return the ageCategory
	 */
	public AgeCategory getAgeCategory() {
		return ageCategory;
	}

	/**
	 * @param ageCategory the ageCategory to set
	 */
	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}		
	
	
}