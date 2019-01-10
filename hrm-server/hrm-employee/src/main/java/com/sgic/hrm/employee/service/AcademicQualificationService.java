package com.sgic.hrm.employee.service;

import java.util.List;
import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;

public interface AcademicQualificationService {
	boolean addAcademicQualification( AcademicQualification academicqualification,ExamType examType,User user);
	List<AcademicQualification> getAllAcademicQualification();
	boolean editAcademicQualification(AcademicQualification academicQualification, Integer id);
	boolean deleteAcademicQualification(Integer id);
	 AcademicQualification getAcademicQualificationById(int id);
	List<AcademicQualification> getAcademicQualificationByUserId(Integer uid);
}
