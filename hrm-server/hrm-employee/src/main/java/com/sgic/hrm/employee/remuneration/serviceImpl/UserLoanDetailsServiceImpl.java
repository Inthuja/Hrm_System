package com.sgic.hrm.employee.remuneration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.UserLoanDetails;
import com.sgic.hrm.commons.repository.UserLoanDetailsRepository;
import com.sgic.hrm.employee.remuneration.service.UserLoanDetailsService;
@Service
public class UserLoanDetailsServiceImpl implements UserLoanDetailsService{
@Autowired
private UserLoanDetailsRepository userLoanDetailsRepository;
	@Override
	public List<UserLoanDetails> getAllUserLoanDetails() {
		return userLoanDetailsRepository.findAll();
	}
	@Override
	public List<UserLoanDetails> getSpecificUser(Integer id) {
		return userLoanDetailsRepository.findByUserId(id);
	}
	@Override
	public List<UserLoanDetails> getSpecificUserByName(String name) {
		// TODO Auto-generated method stub
		return userLoanDetailsRepository.findByUserName(name);
	}
	
	
	
}
