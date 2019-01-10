package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(schema = "employee", name = "jobRoleTemplate")
public class JobRoleTemplate implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4770597162316237006L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String overView;
	private String responsibility;
	private String experience;
	private String specificSkill;
	private String licences;
	private String physicalAbility;
	private String personalCheracteristics;
	private String certification;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;

	@ManyToOne
	@JoinColumn(name = "highestQualification_id")
	private HighestQualification highestQualification;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOverView() {
		return overView;
	}

	public void setOverView(String overView) {
		this.overView = overView;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSpecificSkill() {
		return specificSkill;
	}

	public void setSpecificSkill(String specificSkill) {
		this.specificSkill = specificSkill;
	}

	public String getLicences() {
		return licences;
	}

	public void setLicences(String licences) {
		this.licences = licences;
	}

	public String getPhysicalAbility() {
		return physicalAbility;
	}

	public void setPhysicalAbility(String physicalAbility) {
		this.physicalAbility = physicalAbility;
	}

	public String getPersonalCheracteristics() {
		return personalCheracteristics;
	}

	public void setPersonalCheracteristics(String personalCheracteristics) {
		this.personalCheracteristics = personalCheracteristics;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public HighestQualification getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(HighestQualification highestQualification) {
		this.highestQualification = highestQualification;
	}

	
	
}
