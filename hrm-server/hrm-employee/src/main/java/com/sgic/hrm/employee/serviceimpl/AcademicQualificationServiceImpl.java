package com.sgic.hrm.employee.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.AcademicQualificationRepository;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.employee.service.AcademicQualificationService;


@Service
public class AcademicQualificationServiceImpl implements AcademicQualificationService {
	@Autowired
	private AcademicQualificationRepository academicQualificationRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<AcademicQualification> getAllAcademicQualification() {
		
		return academicQualificationRepository.findAll();
	}

	@Override
	public boolean editAcademicQualification(AcademicQualification academicQualification, Integer id) {
		boolean editsucess=false;
		if(academicQualificationRepository.getOne(id) != null) {
			academicQualification.setId(id);
			academicQualificationRepository.save(academicQualification);
			editsucess=true;
		}
		return editsucess;
	}

	@Override
	public boolean deleteAcademicQualification(Integer id) {
		AcademicQualification academicQualification=academicQualificationRepository.getOne(id);
		if(academicQualification.getId()== id) {
			academicQualificationRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	@Override
	public AcademicQualification getAcademicQualificationById(int id) {
		// TODO Auto-generated method stub
		return academicQualificationRepository.getOne(id);
	}

	@Override
	public List<AcademicQualification> getAcademicQualificationByUserId(Integer uid) {
		// TODO Auto-generated method stub
		User userObj=userRepository.findUserById(uid);
		
		return academicQualificationRepository.findAcademicQualificationByUser(userObj);
	}

	@Override
	public boolean addAcademicQualification(AcademicQualification academicqualification, ExamType examType, User user) {
		academicqualification.setUser(user);
		academicqualification.setExamType(examType);
		academicQualificationRepository.save(academicqualification);
		return true;
	}
	
}

