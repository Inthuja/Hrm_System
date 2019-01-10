package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.UserData;
import com.sgic.hrm.commons.dto.mapper.UserDataMapper;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public HttpStatus AddUser(@RequestBody User user) {
		boolean test = userService.addUser(user);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	} 
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> GetUser() {
		List<User> user = userService.getUser();
		ResponseEntity<List<User>> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;
	}
//	@PutMapping("user/{id}")
//	public HttpStatus ModifyUser(@PathVariable Integer id,@RequestBody User user) {
//		boolean test=userService.editUser(user, id);
//		if(test) {
//			return HttpStatus.ACCEPTED;
//		}
//		return HttpStatus.BAD_REQUEST;
//	}
	@PutMapping("/user/{id}")
	public ResponseEntity<String> updateUser(@PathVariable(name="id") Integer id,@RequestBody UserData userData){
		User user=UserDataMapper.userDataMapper(userData);
		if(userService.editUser(user, id))
		{
			return new ResponseEntity<>("updated",HttpStatus.OK);
		}
		return new ResponseEntity<>("upadte failed", HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("user/{id}")
	public HttpStatus DeleteUser(@PathVariable Integer id) {
		boolean user=userService.deleteUser(id);
		if(user) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	} 
}