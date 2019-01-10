package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.WorkExperienceDTO;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;

public class WorkExperienceDTOToWorkExperience {
	
	public static WorkExperience map(WorkExperienceDTO workExperienceDTO) {
		WorkExperience workExperience =new WorkExperience();
		User user=new User();
		workExperience.setDesignation(workExperienceDTO.getDesignation());
		workExperience.setId(workExperienceDTO.getId());
		workExperience.setLeavingSalary(workExperienceDTO.getLeavingSalary());
		workExperience.setPeriodYearFrom(workExperienceDTO.getPeriodYearFrom());
		workExperience.setPeriodYearTo(workExperienceDTO.getPeriodYearTo());
		workExperience.setReasonForLeaving(workExperienceDTO.getReasonForLeaving());
		workExperience.setWorkName(workExperienceDTO.getWorkName());
		workExperience.setWorkPlace(workExperienceDTO.getWorkPlace());
		workExperience.setWorkType(workExperienceDTO.getWorkType());
		user.setId(workExperienceDTO.getUser());
		return workExperience;
		
	}

}
