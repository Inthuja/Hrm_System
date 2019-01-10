package com.sgic.hrm.commons.dto;

import java.io.File;
import java.sql.Date;

public class ApplicantDataSave {
	private Integer id;
	private Integer highestQualificationId;
	private Integer jobId;	
	private String fullName;
	private String nic;
	private String email;
	private Date dateOfBirth;
	private String address;
	private File cvFile;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHighestQualificationId() {
		return highestQualificationId;
	}
	public void setHighestQualificationId(Integer highestQualificationId) {
		this.highestQualificationId = highestQualificationId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public File getCvFile() {
		return cvFile;
	}
	public void setCvFile(File cvFile) {
		this.cvFile = cvFile;
	} 

}
