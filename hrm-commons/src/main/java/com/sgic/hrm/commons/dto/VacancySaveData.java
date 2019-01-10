package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class VacancySaveData {
	private Integer id;
	private Integer noOfVacancy;
	private Integer salaryScale;
	private Date vacancyOpenDate;
	private Date vacancyCloseDate;
	private Date interviewDate;
	private String keyRecuitment;
	
	private Integer user;
	private Integer job;
	private Integer department;
	private Integer recruitment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNoOfVacancy() {
		return noOfVacancy;
	}
	public void setNoOfVacancy(Integer noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}
	public Integer getSalaryScale() {
		return salaryScale;
	}
	public void setSalaryScale(Integer salaryScale) {
		this.salaryScale = salaryScale;
	}
	
	public Date getVacancyOpenDate() {
		return vacancyOpenDate;
	}
	public void setVacancyOpenDate(Date vacancyOpenDate) {
		this.vacancyOpenDate = vacancyOpenDate;
	}
	public Date getVacancyCloseDate() {
		return vacancyCloseDate;
	}
	public void setVacancyCloseDate(Date vacancyCloseDate) {
		this.vacancyCloseDate = vacancyCloseDate;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getKeyRecuitment() {
		return keyRecuitment;
	}
	public void setKeyRecuitment(String keyRecuitment) {
		this.keyRecuitment = keyRecuitment;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public Integer getJob() {
		return job;
	}
	public void setJob(Integer job) {
		this.job = job;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	public Integer getRecruitment() {
		return recruitment;
	}
	public void setRecruitment(Integer recruitment) {
		this.recruitment = recruitment;
	}
	
	
	
}
