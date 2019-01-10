//package com.sgic.hrm.employee.serviceimpl;
////
////import java.sql.Date;
////import java.util.List;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import com.sgic.hrm.commons.entity.User;
////import com.sgic.hrm.commons.repository.UserRepository;
//import com.sgic.hrm.employee.service.DirectoryService;
////
////@Service
//public class DirectoryServiceImpl implements DirectoryService {
////
////	@Autowired
////	private UserRepository userRepository;
////
////
////	@Override
////	public List<User> getUserByDesignationName(String designation) {
////		return userRepository.findAllUsersByDesignation(designation);
////	}
////
////	@Override
////	public List<User> getUserByFullName(String name) {
////		return userRepository.findAllUsersByName(name);
////	}
////
////	@Override
////	public List<User> getUserByAppoinmentDateAndName(Date date, String name) {
////		return userRepository.findAllUsersByAppointmentDatenAndName(date, name);
////	}
////
////	@Override
////	public List<User> getUserByDesignationNameAndName(String designation, String name) {
////		return userRepository.findAllUsersByDesignationAndName(designation, name);
////	}
////
////	@Override
////	public List<User> getUserByDesignationNameAndAppointmentDate(String designation, Date date) {
////		return userRepository.findAllUsersByDesignationAndAppointmentDate(designation , date);
////	}
////
////	@Override
////	public List<User> getUserByAllThreeFeilds(String name, Date date, String designation) {
////		return userRepository.findAllUsersByAppointmentDatenAndNameAndDesignation(date, name, designation);
////	}
////
////	@Override
////	public List<User> getUserByAppoinmentDate(Date date) {
////		return userRepository.findUsersByAppointmentDate(date);
////	}
////
//}
