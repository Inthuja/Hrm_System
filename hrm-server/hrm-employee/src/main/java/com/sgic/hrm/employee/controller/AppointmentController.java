package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.AppointmentDto;
import com.sgic.hrm.commons.dto.mapper.AppointmentDtoToAppointment;
import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.entity.AppointmentType;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.AppointmentService;
import com.sgic.hrm.employee.service.AppointmentTypeService;
import com.sgic.hrm.employee.service.DepartmentService;
import com.sgic.hrm.employee.service.DesignationService;
import com.sgic.hrm.employee.service.UserService;
@CrossOrigin(origins= "http://localhost:4200",maxAge=3600)
@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private UserService userService;
	@Autowired
	private AppointmentTypeService appointmentTypeService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private DesignationService designationService;
	
	@PostMapping("/appointment")
	public HttpStatus AddAppointment(@RequestBody AppointmentDto appointmentDto) {
	User userObj=userService.findByUserId(appointmentDto.getUserId());
	AppointmentType appointmentTypeObj=appointmentTypeService.findByAppointmentTypeId(appointmentDto.getAppointmentTypeId());
	Department departmentObj=departmentService.findByDepartmentId(appointmentDto.getDepartmentId());
	Designation designationObj=designationService.findByDesignationId(appointmentDto.getDesignationId());
	
	Appointment appointment=AppointmentDtoToAppointment.map(appointmentDto);
	
		boolean testadd= appointmentService.addAppointment(appointment, appointmentTypeObj, userObj, departmentObj, designationObj);
		if(testadd) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/appointment")
	public ResponseEntity <List<Appointment>> GetAppointment()
	{
		List<Appointment> appointment= appointmentService.getAppointment() ;
		ResponseEntity<List<Appointment>> 
		response =  new ResponseEntity<>(appointment,HttpStatus.OK);
		return response;
		
	}
	
}
