package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class InterviewScheduleDataSave {
	private Integer id;
	private Integer applicantId;
	private String interviewVenue;
	private String interviewTime;
	private Date interviewDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
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
