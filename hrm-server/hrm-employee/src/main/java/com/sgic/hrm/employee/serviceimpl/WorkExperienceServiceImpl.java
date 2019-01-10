package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WorkExperience;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.commons.repository.WorkExperienceRepository;
import com.sgic.hrm.employee.service.WorkExperienceService;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService{
	@Autowired
	private WorkExperienceRepository experienceRepository;
	@Autowired
	private UserRepository userRepository;
	@Override
	public boolean addWorkExperience(WorkExperience workExperience,User user) {
		workExperience.setUser(user);
		experienceRepository.save(workExperience);
		
		return true;
	}

	@Override
	public List<WorkExperience> getAllWorkExperience() {
		return experienceRepository.findAll();
	}

	@Override
	public boolean editWorkExperience(WorkExperience workExperience, Integer id) {
		boolean editworkex =false;
		if(experienceRepository.getOne(id) != null)
		{
			workExperience.setId(id);
			experienceRepository.save(workExperience);
			editworkex=true;
		}
		return editworkex;
	}

	@Override
	public boolean deleteWorkExperience(Integer id) {
		WorkExperience workExperience = experienceRepository.getOne(id);
		if(workExperience.getId()==id) {
			experienceRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public WorkExperience getWorkExperienceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkExperience> getWorkExperienceByUserId(Integer uid) {
		User userObj=userRepository.findUserById(uid);
		return experienceRepository.findWorkExperienceByUser(userObj);
	}
	
	
}
