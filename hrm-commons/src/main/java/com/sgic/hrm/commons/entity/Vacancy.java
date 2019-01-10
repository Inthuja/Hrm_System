package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(schema="employee", name="vacancy")
public class Vacancy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8213173494157503310L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
//	private String hiring_officer;
	private Integer noOfVacancy;
	private Integer salaryScale;
	private Date vacancyOpenDate;
	private Date vacancyCloseDate;
	private Date interviewDate;
	private String keyRecuitment;

	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "recuitment_id")
	private RecruitmentType recruitmentType;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public RecruitmentType getRecruitmentType() {
		return recruitmentType;
	}

	public void setRecruitmentType(RecruitmentType recruitmentType) {
		this.recruitmentType = recruitmentType;
	}

	
	

}
