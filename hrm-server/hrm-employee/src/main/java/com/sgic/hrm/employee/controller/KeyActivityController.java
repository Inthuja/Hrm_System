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

import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.employee.service.KeyActivityService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class KeyActivityController {
	@Autowired
	private KeyActivityService keyActivityService;
	
	@PostMapping("/keyactivity")
	public HttpStatus AddKeyActivity(@RequestBody KeyActivity keyActivity) {
		boolean test=keyActivityService.addKeyActivity(keyActivity);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@GetMapping("/keyactivity")
	public ResponseEntity<List<KeyActivity>>GetKeyActivity(){
		List<KeyActivity> keyActivity= keyActivityService.getKeyActivity();
		ResponseEntity<List<KeyActivity>> responseEntity=new ResponseEntity<>(keyActivity , HttpStatus.OK);
		return responseEntity;
	}
	@PutMapping("/keyactivity/{id}")
	public HttpStatus ModifyKeyActivity(@RequestBody KeyActivity keyActivity,@PathVariable Integer id) {
		boolean test=keyActivityService.editKeyActivity(keyActivity, id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/keyactivity/{id}")
	public HttpStatus deleteKeyActivity(@PathVariable Integer id) {
		boolean test=keyActivityService.deleteKeyActivity(id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
