package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.LogInCrediential;
import com.sgic.hrm.commons.repository.LogInCredientialRepository;
import com.sgic.hrm.employee.service.LogInCredientialService;

@Service
public class LogInCredientialServiceImpl implements LogInCredientialService {

	@Autowired
	private LogInCredientialRepository logInCredientialRepository;
	@Override
	public boolean addLogInCrediential(LogInCrediential logInCrediential) {

		logInCredientialRepository.save(logInCrediential);	
		return false;
	}

	@Override
	public List<LogInCrediential> getAllLogInCrediential() {
		// TODO Auto-generated method stub
		return logInCredientialRepository.findAll();
	}

	@Override
	public Optional<LogInCrediential> getLogInCredientialById(int id) {
		// TODO Auto-generated method stub
		return logInCredientialRepository.findById(id);
		
	}

}
