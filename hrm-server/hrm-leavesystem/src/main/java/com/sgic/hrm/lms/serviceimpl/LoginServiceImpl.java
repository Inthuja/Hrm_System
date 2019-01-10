package com.sgic.hrm.lms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.LoginRepository;
import com.sgic.hrm.lms.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

  @Autowired
  LoginRepository loginRepository;
  @Override
  
  public User getUser(String userName) {
    return loginRepository.findByUserName(userName).getUser();    
  }

  
}
