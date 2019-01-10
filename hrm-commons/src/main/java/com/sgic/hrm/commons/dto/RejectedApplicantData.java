package com.sgic.hrm.commons.dto;



public class RejectedApplicantData {
	
	private Integer id;
	private ApplicantData applicant;
	private String reason;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	

}
