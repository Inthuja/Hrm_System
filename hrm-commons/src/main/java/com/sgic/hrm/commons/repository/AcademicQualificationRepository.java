package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.User;


public interface AcademicQualificationRepository extends JpaRepository<AcademicQualification,Integer>{
	List<AcademicQualification>findAcademicQualificationByUser(User user);
}
