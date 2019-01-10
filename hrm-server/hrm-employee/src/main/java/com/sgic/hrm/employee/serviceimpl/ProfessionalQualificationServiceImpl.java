package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.ProfessionalQualificationRepository;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.employee.service.ProfessionalQualificationService;


@Service
public class ProfessionalQualificationServiceImpl implements ProfessionalQualificationService {
	
	@Autowired
	private ProfessionalQualificationRepository professionalQualificationRepository;
	@Autowired
	private UserRepository userRepository ;
	@Override
	public boolean addProfessionalQualification(ProfessionalQualification professionalQualification,User user) {
		professionalQualification.setUser(user);
		professionalQualificationRepository.save(professionalQualification);
		return true;
		
	}

	@Override
	public List<ProfessionalQualification> getAllProfessionalQualifications() {
		
		return professionalQualificationRepository.findAll();
	}

	@Override
	public boolean editProfessionalQualification(ProfessionalQualification professionalQualification, Integer id) {
		if(professionalQualificationRepository.getOne(id)!=null) {
			professionalQualification.setId(id);
			professionalQualificationRepository.save(professionalQualification);
			return true;
		}
		return false;
	}

	@Override
	public Optional<ProfessionalQualification> getProfessionalQualificationById(int id) {
		// TODO Auto-generated method stub
		return professionalQualificationRepository.findById(id);
	}

	@Override
	public boolean deleteProfessionalQualification(Integer id) {
		if(professionalQualificationRepository.getOne(id) !=null) {
			professionalQualificationRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<ProfessionalQualification> getProfessionalQualificationByUserId(Integer uid) {
		User userObj=userRepository.findUserById(uid);
		return professionalQualificationRepository.findProfessionalQualificationByUser(userObj) ;
	}
}
