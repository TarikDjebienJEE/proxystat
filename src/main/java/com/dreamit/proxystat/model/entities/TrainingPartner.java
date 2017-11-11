package com.dreamit.proxystat.model.entities;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Classe pour les TrainingPartner
 * @author RAKOTOBE Sitraka Eric
 */
@Entity
@DiscriminatorValue("TrainingPartner")
public class TrainingPartner extends Partner implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@OneToMany(mappedBy="trainingPartner")
	private Collection<TrainingCourse> trainingCourses ;

	public TrainingPartner() {
		super();
	}

	/**
	 * @return the trainingCourses
	 */
	public Collection<TrainingCourse> getTrainingCourses() {
		return trainingCourses;
	}


	/**
	 * @param trainingCourses the trainingCourses to set
	 */
	public void setTrainingCourses(Collection<TrainingCourse> trainingCourses) {
		this.trainingCourses = trainingCourses;
	}

	
}