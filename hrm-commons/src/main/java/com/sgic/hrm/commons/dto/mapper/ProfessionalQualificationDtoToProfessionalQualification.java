package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ProfessionalQualificationDto;
import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;

public class ProfessionalQualificationDtoToProfessionalQualification {

	public static ProfessionalQualification map(ProfessionalQualificationDto professionalQualificationDto) {
		
		ProfessionalQualification professionalQualification=new ProfessionalQualification();
		User user = new User();
		professionalQualification.setCourseName(professionalQualificationDto.getCourseName());
		professionalQualification.setCourseType(professionalQualificationDto.getCourseType());
		professionalQualification.setExaminationYear(professionalQualificationDto.getExaminationYear());
		professionalQualification.setId(professionalQualificationDto.getId());
		professionalQualification.setGpa(professionalQualificationDto.getGpa());
		professionalQualification.setPeriodYearFrom(professionalQualificationDto.getPeriodYearFrom());
		professionalQualification.setPeriodYearTo(professionalQualificationDto.getPeriodYearTo());;
		professionalQualification.setResult(professionalQualificationDto.getResult());
		professionalQualification.setInsituteName(professionalQualificationDto.getInsituteName());
		user.setId(professionalQualificationDto.getUser());
		return professionalQualification;
		
	}
}
