//package com.sgic.hrm.employee.controller;
//
//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sgic.hrm.commons.dto.DirectoryDto;
//import com.sgic.hrm.commons.dto.DirectorySearchDto;
//import com.sgic.hrm.commons.dto.mapper.EntityToDirectoryDto;
//import com.sgic.hrm.commons.entity.User;
//import com.sgic.hrm.employee.service.DirectoryService;
//import com.sgic.hrm.employee.service.UserService;
//
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
//@RestController
//public class DirectoryController {
//
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private DirectoryService directoryService;
//
//	@GetMapping("/directory")
//	public List<DirectoryDto> getAllUserDetails() {
//		List<DirectoryDto> userDtoList = new ArrayList<>();
//		for (User user : userService.getUser()) {
//			DirectoryDto userDto = EntityToDirectoryDto.entityToUserDtoMapping(user);
//			userDtoList.add(userDto);
//		}
//		return userDtoList;
//	}
//
//	@PostMapping("/directory")
//	public List<DirectoryDto> getUsersByFullName(@RequestBody DirectorySearchDto directorySearchDto) {
//
//		String name = directorySearchDto.getFullName();
//		String designation = directorySearchDto.getDesignation();
//		Date date = directorySearchDto.getAppointmentDate();
//
//		List<DirectoryDto> userDtoList = new ArrayList<>();
//		List<User> users = new ArrayList<>();
//
////		if (name == null && designation == null && date == null) {
////			users =  userService.getUser();
////		} else if (name != null && designation == null && date == null) {
////			users = directoryService.getUserByFullName(name);
////		} else if (name == null && designation != null && date == null) {
////			users = directoryService.getUserByDesignationName(designation);
////		} else if (name == null && designation == null && date != null) {
////			users = directoryService.getUserByAppoinmentDate(date);
////		} else if (name != null && designation != null && date == null) {
////			users = directoryService.getUserByDesignationNameAndName(designation, name);
////		} else if (name != null && designation == null && date != null) {
////			users = directoryService.getUserByAppoinmentDateAndName(date, name);
////		} else if (name == null && designation != null && date != null) {
////			users = directoryService.getUserByDesignationNameAndAppointmentDate(designation, date);
////		} else if (name != null && designation != null && date != null) {
////			users = directoryService.getUserByAllThreeFeilds(name, date, designation);
////		}
//
//		for (User user : users) {
//			DirectoryDto userDto = EntityToDirectoryDto.entityToUserDtoMapping(user);
//			userDtoList.add(userDto);
//		}
//		
//		return  userDtoList;
//
//	}
//
//}
