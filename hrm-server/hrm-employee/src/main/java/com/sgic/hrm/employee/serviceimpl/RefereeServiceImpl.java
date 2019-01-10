package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.RefereeRepository;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.employee.service.RefereeService;

@Service
public class RefereeServiceImpl implements RefereeService {

	@Autowired
	private RefereeRepository refereeRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean addReferee(Referee referee, User user) {
		referee.setUser(user);
		refereeRepository.save(referee);
		return true;
	}

	@Override
	public List<Referee> getAllReferee() {
		
		return refereeRepository.findAll();
	}

	@Override
	public boolean editReferee(Referee referee, int id) {
		if(refereeRepository.getOne(id)!=null) {
			referee.setId(id);
			refereeRepository.save(referee);
			return true;
		}
		return false;
	}

	@Override
	public Optional<Referee> getRefereeById(int id) {
		// TODO Auto-generated method stub
		return refereeRepository.findById(id);
	}

	@Override
	public boolean deleteReferee(int id) {
		if(refereeRepository.getOne(id)!=null) {
			refereeRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Referee> getRefereeByUserId(Integer uid) {
	User userObj =userRepository.findUserById(uid);
		
		return refereeRepository.findRefereeByUser(userObj);
	}
}
