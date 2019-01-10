package com.sgic.hrm.commons.dto;


import java.sql.Date;
public class VacancyData {
	private Integer id;
	private Integer noOfVacancy;
	private Integer salaryScale;
	private Date vacancyOpenDate;
	private Date vacancyCloseDate;
	private Date interviewDate;
	private String keyRecuitment;
	
	private UserData user;
	private JobData job;
	private DepartmentData department;
	private RecruitmentTypeData recruitmentType;
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
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public JobData getJob() {
		return job;
	}
	public void setJob(JobData job) {
		this.job = job;
	}
	public DepartmentData getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentData department) {
		this.department = department;
	}
	public RecruitmentTypeData getRecruitmentType() {
		return recruitmentType;
	}
	public void setRecruitmentType(RecruitmentTypeData recruitmentType) {
		this.recruitmentType = recruitmentType;
	}
	
	
}
