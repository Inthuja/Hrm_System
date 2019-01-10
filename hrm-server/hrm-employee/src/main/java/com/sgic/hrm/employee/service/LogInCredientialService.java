package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.LogInCrediential;

public interface LogInCredientialService {


	boolean addLogInCrediential(LogInCrediential logInCrediential);
	List<LogInCrediential> getAllLogInCrediential();
	Optional<LogInCrediential> getLogInCredientialById(int id);
}
