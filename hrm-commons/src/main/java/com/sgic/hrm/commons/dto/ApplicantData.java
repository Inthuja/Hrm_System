package com.sgic.hrm.commons.dto;

import java.io.File;
import java.sql.Date;



import com.sgic.hrm.commons.dto.DistrictData;

public class ApplicantData {
	
	 Integer id;
	 HighestQualificationData highestQualification;
	 DistrictData district;
	 JobData job;
	 String fullName;
	 String nic;
	 String email;
	 Date dateOfBirth;
	 String address;
	 File cvFile;
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public HighestQualificationData getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(HighestQualificationData highestQualification) {
		this.highestQualification = highestQualification;
	}
	public DistrictData getDistrict() {
		return district;
	}
	public void setDistrict(DistrictData district) {
		this.district = district;
	}

	public JobData getJob() {
		return job;
	}
	public void setJob(JobData job) {
		this.job = job;
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
