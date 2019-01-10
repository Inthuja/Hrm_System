package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="profile_attachments",schema="employee")
public class ProfileAttachments implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private User userId;
	private byte[] jobApplication;
	private byte[] profilePhoto;
	private byte[] recruitmentSource;
	private byte[] carriculamVitac;
	private byte[] nicCopy;
	private byte[] birthCertificate;
	private byte[] marriageCertificate;
	private byte[] jobOfferLetter;
	private byte[] jobDocs;
	private byte[] agreementsAndContracts;
	private byte[] jobAcknoledgementLetter;
	private byte[] interviewResult;
	private byte[] medicalReport;
	private byte[] salary;
	private byte[] qualifications;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public byte[] getJobApplication() {
		return jobApplication;
	}
	public void setJobApplication(byte[] jobApplication) {
		this.jobApplication = jobApplication;
	}
	public byte[] getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(byte[] profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public byte[] getRecruitmentSource() {
		return recruitmentSource;
	}
	public void setRecruitmentSource(byte[] recruitmentSource) {
		this.recruitmentSource = recruitmentSource;
	}
	public byte[] getCarriculamVitac() {
		return carriculamVitac;
	}
	public void setCarriculamVitac(byte[] carriculamVitac) {
		this.carriculamVitac = carriculamVitac;
	}
	public byte[] getNicCopy() {
		return nicCopy;
	}
	public void setNicCopy(byte[] nicCopy) {
		this.nicCopy = nicCopy;
	}
	public byte[] getBirthCertificate() {
		return birthCertificate;
	}
	public void setBirthCertificate(byte[] birthCertificate) {
		this.birthCertificate = birthCertificate;
	}
	public byte[] getMarriageCertificate() {
		return marriageCertificate;
	}
	public void setMarriageCertificate(byte[] marriageCertificate) {
		this.marriageCertificate = marriageCertificate;
	}
	public byte[] getJobOfferLetter() {
		return jobOfferLetter;
	}
	public void setJobOfferLetter(byte[] jobOfferLetter) {
		this.jobOfferLetter = jobOfferLetter;
	}
	public byte[] getJobDocs() {
		return jobDocs;
	}
	public void setJobDocs(byte[] jobDocs) {
		this.jobDocs = jobDocs;
	}
	public byte[] getAgreementsAndContracts() {
		return agreementsAndContracts;
	}
	public void setAgreementsAndContracts(byte[] agreementsAndContracts) {
		this.agreementsAndContracts = agreementsAndContracts;
	}
	public byte[] getJobAcknoledgementLetter() {
		return jobAcknoledgementLetter;
	}
	public void setJobAcknoledgementLetter(byte[] jobAcknoledgementLetter) {
		this.jobAcknoledgementLetter = jobAcknoledgementLetter;
	}
	public byte[] getInterviewResult() {
		return interviewResult;
	}
	public void setInterviewResult(byte[] interviewResult) {
		this.interviewResult = interviewResult;
	}
	public byte[] getMedicalReport() {
		return medicalReport;
	}
	public void setMedicalReport(byte[] medicalReport) {
		this.medicalReport = medicalReport;
	}
	public byte[] getSalary() {
		return salary;
	}
	public void setSalary(byte[] salary) {
		this.salary = salary;
	}
	public byte[] getQualifications() {
		return qualifications;
	}
	public void setQualifications(byte[] qualifications) {
		this.qualifications = qualifications;
	}
	
	
	
}
