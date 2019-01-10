package com.sgic.hrm.employee.service;

import java.util.List;


import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.UserEntity;



public interface UserService {
	public boolean addUser(User user);
	List<User> getUser();
	boolean editUser(User user,Integer id);
	
	boolean deleteUser(Integer id);
	public User findByUserId(Integer id);
}
