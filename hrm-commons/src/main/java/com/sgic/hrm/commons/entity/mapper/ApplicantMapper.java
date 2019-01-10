package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.ApplicantData;
import com.sgic.hrm.commons.entity.Applicant;

public class ApplicantMapper {
	
	public static ApplicantData applicantMapper(Applicant applicant) {
		ApplicantData applicantData = new ApplicantData();

		if (applicant != null) {
			applicantData.setId(applicant.getId());
			applicantData.setFullName(applicant.getFullName());
			applicantData.setNic(applicant.getNic());
			applicantData.setEmail(applicant.getEmail());
			applicantData.setDateOfBirth(applicant.getDateOfBirth());
			applicantData.setAddress(applicant.getAddress());
			applicantData.setCvFile(applicant.getCvFile());
			
			applicantData.setJob(JobMapper.jobMapper(applicant.getJob()));
			applicantData.setHighestQualification(HighestQualificationMapper.highestQualificationMapper(applicant.getHighestQualification()));
			//applicantData.setDistrictid(DistrictMapper.districtMapper(applicant.getDistrictid()));
			
			
			
			return applicantData;
		}
		return null;

	}


}
