package com.sgic.hrm.commons.dto;

import java.util.Date;

public class InterviewDto {

	private int id;
	private Integer jobId;
	private String interviewPanelNo;
	private Date date;
	private String startTime;
	private String endTime;
	private String userId;
	private Boolean reachedThroughtThePhoneCall;
	private Boolean attendence;
	private String scoreCard;
	private Boolean selectedStatus;
	private String reason;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getInterviewPanelNo() {
		return interviewPanelNo;
	}

	public void setInterviewPanelNo(String interviewPanelNo) {
		this.interviewPanelNo = interviewPanelNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getReachedThroughtThePhoneCall() {
		return reachedThroughtThePhoneCall;
	}

	public void setReachedThroughtThePhoneCall(Boolean reachedThroughtThePhoneCall) {
		this.reachedThroughtThePhoneCall = reachedThroughtThePhoneCall;
	}

	public Boolean getAttendence() {
		return attendence;
	}

	public void setAttendence(Boolean attendence) {
		this.attendence = attendence;
	}

	public String getScoreCard() {
		return scoreCard;
	}

	public void setScoreCard(String scoreCard) {
		this.scoreCard = scoreCard;
	}

	public Boolean getSelectedStatus() {
		return selectedStatus;
	}

	public void setSelectedStatus(Boolean selectedStatus) {
		this.selectedStatus = selectedStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
