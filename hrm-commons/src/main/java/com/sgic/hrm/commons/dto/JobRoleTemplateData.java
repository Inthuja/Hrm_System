package com.sgic.hrm.commons.dto;



public class JobRoleTemplateData {
	private Integer id;
	private String overView;
	private String responsibility;
	private String experience;
	private String specificSkill;
	private String licences;
	private String physicalAbility;
	private String personalCheracteristics;
	private String certification;
	
	private JobData job;
	private HighestQualificationData highestQualification;
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
	public JobData getJob() {
		return job;
	}
	public void setJob(JobData job) {
		this.job = job;
	}
	public HighestQualificationData getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(HighestQualificationData highestQualification) {
		this.highestQualification = highestQualification;
	}
	
	
	
}
