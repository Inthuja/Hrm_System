package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;

@Repository
public interface ProfessionalQualificationRepository extends JpaRepository<ProfessionalQualification, Integer>{
	List<ProfessionalQualification>findProfessionalQualificationByUser(User user);
}
