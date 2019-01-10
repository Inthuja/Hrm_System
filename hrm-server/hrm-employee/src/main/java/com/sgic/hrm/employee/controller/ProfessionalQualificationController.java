package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.sgic.hrm.commons.dto.ProfessionalQualificationDto;
import com.sgic.hrm.commons.dto.mapper.ProfessionalQualificationDtoToProfessionalQualification;
import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.ProfessionalQualificationService;
import com.sgic.hrm.employee.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProfessionalQualificationController {

	@Autowired
	private ProfessionalQualificationService professionalQualificationService;
	
	@Autowired
	private UserService userService;

	@PostMapping("/professionalQualification")
	public HttpStatus addProfessionalQualification(@Valid @RequestBody ProfessionalQualificationDto professionalQualificationDto) {
		User userobj=userService.findByUserId(professionalQualificationDto.getUser());
		ProfessionalQualification professionalQualification=ProfessionalQualificationDtoToProfessionalQualification.map(professionalQualificationDto);
		
		boolean test = professionalQualificationService.addProfessionalQualification(professionalQualification, userobj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	 
	@GetMapping("/professionalQualification")
	public ResponseEntity<List<ProfessionalQualification>> GetProfessionalQualification(){
		List<ProfessionalQualification> professionalQualifications=professionalQualificationService.getAllProfessionalQualifications();
		ResponseEntity<List<ProfessionalQualification>> response=new ResponseEntity<>(professionalQualifications,HttpStatus.OK);
		return response;
	}
	@GetMapping("/professionalQualification/{uid}")
	public  ResponseEntity<List<ProfessionalQualification>>findProfessionalQualificationByUserId(@PathVariable("uid") Integer id)
	{
		List<ProfessionalQualification> 
		professionalQualifications = professionalQualificationService.getProfessionalQualificationByUserId(id);
		return new ResponseEntity<>(professionalQualifications,HttpStatus.OK);
	}
	@PutMapping("/professionalQualification/{id}")
	public HttpStatus ModifyProfessionalQualification(@PathVariable Integer id,@RequestBody ProfessionalQualification professionalQualification) {
		boolean editTest=professionalQualificationService.editProfessionalQualification(professionalQualification, id);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/professionalQualification/{id}")
	public HttpStatus DeleteProfessionalQualification(@PathVariable Integer id) {
		boolean test=professionalQualificationService.deleteProfessionalQualification(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
}
