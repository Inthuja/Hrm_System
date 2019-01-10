package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ApplicantData;
import com.sgic.hrm.commons.dto.ApplicantDataSave;
import com.sgic.hrm.commons.entity.Applicant;
import com.sgic.hrm.commons.entity.HighestQualification;
import com.sgic.hrm.commons.entity.Job;

public class ApplicantDataMapper {
	public ApplicantDataMapper() {

	}

	public static Applicant applicantDataMapper(ApplicantData applicantData) {
		Applicant applicant = new Applicant();

		applicant.setId(applicantData.getId());
		applicant.setFullName(applicantData.getFullName());
		applicant.setNic(applicantData.getNic());
		applicant.setEmail(applicantData.getEmail());
		applicant.setDateOfBirth(applicantData.getDateOfBirth());
		applicant.setAddress(applicantData.getAddress());
		applicant.setCvFile(applicantData.getCvFile());

		applicant.setHighestQualification(
				HighestQualificationDataMapper.highestQualificationDataMapper(applicantData.getHighestQualification()));
		applicant.setDistrict(DistrictDataMapper.districtDataMapper(applicantData.getDistrict()));
		applicant.setJob(JobDataMapper.jobDataMapper(applicantData.getJob()));

		return applicant;
	}

	public static Applicant applicantDataSaveMapper(ApplicantDataSave applicantDataSave) {
		Applicant applicant = new Applicant();
		HighestQualification hightqulification = new HighestQualification();
		Job job = new Job();

		applicant.setId(applicantDataSave.getId());
		applicant.setFullName(applicantDataSave.getFullName());
		applicant.setNic(applicantDataSave.getNic());
		applicant.setEmail(applicantDataSave.getEmail());
		applicant.setDateOfBirth(applicantDataSave.getDateOfBirth());
		applicant.setAddress(applicantDataSave.getAddress());
		applicant.setCvFile(applicantDataSave.getCvFile());

		hightqulification.setId(applicantDataSave.getHighestQualificationId());
		applicant.setHighestQualification(hightqulification);

		job.setId(applicantDataSave.getJobId());
		applicant.setJob(job);

		return applicant;
	}

}
