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

import com.sgic.hrm.commons.entity.AppointmentType;
import com.sgic.hrm.employee.service.AppointmentTypeService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AppointmentTypeController {
	@Autowired
	private AppointmentTypeService appointmentTypeService;
	
	@PostMapping("/appointmentType")
	public HttpStatus AddAppointmentType(@RequestBody AppointmentType appointmentType) 
	{
		boolean testadd= appointmentTypeService.addAppointmentType(appointmentType);
		if(testadd) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/appointmentType")
	public ResponseEntity <List<AppointmentType>> GetAppointmentType()
	{
		List<AppointmentType> appointmentType= appointmentTypeService.getAppointmentType();
		ResponseEntity<List<AppointmentType>> 
		response =  new ResponseEntity<>(appointmentType,HttpStatus.OK);
		return response;
		
	}
	
	@PutMapping("/appointmentType/{id}")
	public HttpStatus editAppointmentType(@PathVariable Integer id,@RequestBody AppointmentType appointmentType) {
		boolean editTest=appointmentTypeService.editAppointmentType(appointmentType, id);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/appointmentType/{id}")
	public HttpStatus deleteAppointmentType(@PathVariable Integer id,@RequestBody AppointmentType appointmentType) {
		boolean deleteTest=appointmentTypeService.deleteAppointmentType(id);
		if(deleteTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
