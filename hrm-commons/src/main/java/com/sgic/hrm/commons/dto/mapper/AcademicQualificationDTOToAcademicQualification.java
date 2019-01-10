package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.AcademicQualificationDTO;
import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;

public class AcademicQualificationDTOToAcademicQualification {
	public static AcademicQualification map(AcademicQualificationDTO academicQualificationDto)
	{
		AcademicQualification academicQualification = new AcademicQualification();
		User user= new User();
		ExamType examType = new ExamType();
		academicQualification.setExaminationYear(academicQualificationDto.getExaminationYear());
		academicQualification.setCreatedAt(academicQualificationDto.getCreatedAt());
		academicQualification.setUpdatedAt(academicQualificationDto.getUpdatedAt());
		academicQualification.setPeriodYearFrom(academicQualificationDto.getPeriodYearFrom());
		academicQualification.setPeriodYearTo(academicQualificationDto.getPeriodYearTo());
		academicQualification.setResult(academicQualificationDto.getResult());
		academicQualification.setSchoolName(academicQualificationDto.getSchoolName());
		user.setId(academicQualificationDto.getUser());
		examType.setId(academicQualificationDto.getExamTypeId());
		return academicQualification;
	}
}
