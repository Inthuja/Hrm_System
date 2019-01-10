package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;



public interface WorkExperienceService {
	boolean addWorkExperience(WorkExperience workExperience,User user);
	   List<WorkExperience> getAllWorkExperience();
	   boolean editWorkExperience(WorkExperience workExperience, Integer id);
	boolean deleteWorkExperience(Integer id);
	WorkExperience getWorkExperienceById(int id);
	
	List<WorkExperience> getWorkExperienceByUserId(Integer uid);
}
