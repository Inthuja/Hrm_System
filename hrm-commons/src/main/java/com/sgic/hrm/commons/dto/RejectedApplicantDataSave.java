package com.sgic.hrm.commons.dto;

public class RejectedApplicantDataSave {
	private Integer id;
	private Integer applicant;
	private String reason;
	
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	

}
