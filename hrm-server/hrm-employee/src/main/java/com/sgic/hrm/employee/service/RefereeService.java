package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;



public interface RefereeService {
	
	boolean addReferee(Referee referee,User user);
	List<Referee> getAllReferee();
	boolean editReferee(Referee referee,int id);
	Optional<Referee> getRefereeById(int id);
	boolean deleteReferee(int id);

	List<Referee> getRefereeByUserId(Integer uid);
}
