package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.JobRoleTemplateData;
import com.sgic.hrm.commons.entity.JobRoleTemplate;

public class JobRoleTemplateMapper {
	
	public static JobRoleTemplateData jobRoleTemplateMapper(JobRoleTemplate jobRoleTemplate) {
		JobRoleTemplateData jobRoleTemplateData = new JobRoleTemplateData();

		if (jobRoleTemplate != null) {
			
			jobRoleTemplateData.setId(jobRoleTemplateData.getId());
			jobRoleTemplateData.setOverView(jobRoleTemplate.getOverView());
			jobRoleTemplateData.setResponsibility(jobRoleTemplate.getResponsibility());
			jobRoleTemplateData.setExperience(jobRoleTemplate.getExperience());
			jobRoleTemplateData.setSpecificSkill(jobRoleTemplate.getSpecificSkill());
			jobRoleTemplateData.setLicences(jobRoleTemplate.getLicences());
			jobRoleTemplateData.setPhysicalAbility(jobRoleTemplate.getPhysicalAbility());
			jobRoleTemplateData.setPersonalCheracteristics(jobRoleTemplate.getPersonalCheracteristics());
			jobRoleTemplateData.setCertification(jobRoleTemplate.getCertification());
			
			jobRoleTemplateData.setJob(JobMapper.jobMapper(jobRoleTemplate.getJob()));
			jobRoleTemplateData.setHighestQualification(HighestQualificationMapper.highestQualificationMapper(jobRoleTemplate.getHighestQualification()));
			
			return jobRoleTemplateData;
		}
		return null;

	}
}
