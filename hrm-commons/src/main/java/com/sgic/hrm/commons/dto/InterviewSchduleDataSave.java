package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class InterviewSchduleDataSave {
	private Integer id;
	private Integer applicant;
	private String interviewVenue;
	private String interviewTime;
	private Date interviewDate;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getApplicant() {
		return applicant;
	}
	public void setApplicant(Integer applicant) {
		this.applicant = applicant;
	}
	public String getInterviewVenue() {
		return interviewVenue;
	}
	public void setInterviewVenue(String interviewVenue) {
		this.interviewVenue = interviewVenue;
	}
	public String getInterviewTime() {
		return interviewTime;
	}
	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
