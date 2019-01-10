package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.JobRoleTemplateData;
import com.sgic.hrm.commons.entity.JobRoleTemplate;

public class JobRoleTemplateDataMapper {
	private JobRoleTemplateDataMapper() {}
	public static JobRoleTemplate jobRoleTemplateDataMapper(JobRoleTemplateData jobRoleTemplateData) {
		JobRoleTemplate jobRoleTemplate = new JobRoleTemplate();

		jobRoleTemplate.setId(jobRoleTemplateData.getId());
		jobRoleTemplate.setOverView(jobRoleTemplateData.getOverView());
		jobRoleTemplate.setResponsibility(jobRoleTemplateData.getResponsibility());
		jobRoleTemplate.setExperience(jobRoleTemplateData.getExperience());
		jobRoleTemplate.setSpecificSkill(jobRoleTemplateData.getSpecificSkill());
		jobRoleTemplate.setLicences(jobRoleTemplateData.getLicences());
		jobRoleTemplate.setPhysicalAbility(jobRoleTemplateData.getPhysicalAbility());
		jobRoleTemplate.setPersonalCheracteristics(jobRoleTemplateData.getPersonalCheracteristics());
		jobRoleTemplate.setCertification(jobRoleTemplateData.getCertification());
		
		jobRoleTemplate.setJob(JobDataMapper.jobDataMapper(jobRoleTemplateData.getJob()));
		jobRoleTemplate.setHighestQualification(HighestQualificationDataMapper.highestQualificationDataMapper(jobRoleTemplateData.getHighestQualification()));
		
		return jobRoleTemplate;
		
	    
}
}
