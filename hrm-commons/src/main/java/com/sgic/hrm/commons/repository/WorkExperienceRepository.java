package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;
@Repository
public interface WorkExperienceRepository  extends JpaRepository<WorkExperience, Integer>{
	List<WorkExperience>findWorkExperienceByUser(User user);
}
