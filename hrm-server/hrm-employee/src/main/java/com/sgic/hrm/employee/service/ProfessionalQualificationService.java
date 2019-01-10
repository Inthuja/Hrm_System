package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;



public interface ProfessionalQualificationService {

	boolean addProfessionalQualification(ProfessionalQualification professionalQualification,User user);
	
	List<ProfessionalQualification> getAllProfessionalQualifications();
	
	boolean editProfessionalQualification(ProfessionalQualification professionalQualification,Integer id);
	
	Optional<ProfessionalQualification> getProfessionalQualificationById(int id);
	
	boolean deleteProfessionalQualification(Integer id);
	List<ProfessionalQualification> getProfessionalQualificationByUserId(Integer uid);
}
