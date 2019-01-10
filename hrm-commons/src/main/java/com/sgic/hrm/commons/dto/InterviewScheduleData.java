package com.sgic.hrm.commons.dto;

import java.sql.Date;



public class InterviewScheduleData {
	
	private Integer id;
	private ApplicantData applicant;
	private String interviewVenue;
	private String interviewTime;
	private Date interviewDate;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public ApplicantData getApplicant() {
		return applicant;
	}
	public void setApplicant(ApplicantData applicant) {
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

	
}
