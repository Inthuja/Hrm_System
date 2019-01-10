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
@Table(name="professional_qualification",schema="employee")
public class ProfessionalQualification implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -783618122291051997L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String courseName;
	private String courseType; 
	private Integer periodYearFrom;
	private Integer periodYearTo;
	private Integer examinationYear;
	private String insituteName;
	private String result;
	private Float gpa;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public Integer getPeriodYearFrom() {
		return periodYearFrom;
	}
	public void setPeriodYearFrom(Integer periodYearFrom) {
		this.periodYearFrom = periodYearFrom;
	}
	public Integer getPeriodYearTo() {
		return periodYearTo;
	}
	public void setPeriodYearTo(Integer periodYearTo) {
		this.periodYearTo = periodYearTo;
	}
	public Integer getExaminationYear() {
		return examinationYear;
	}
	public void setExaminationYear(Integer examinationYear) {
		this.examinationYear = examinationYear;
	}
	public String getInsituteName() {
		return insituteName;
	}
	public void setInsituteName(String insituteName) {
		this.insituteName = insituteName;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Float getGpa() {
		return gpa;
	}
	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}
	

}
