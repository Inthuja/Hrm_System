

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

import com.sgic.hrm.commons.dto.AcademicQualificationDTO;
import com.sgic.hrm.commons.dto.mapper.AcademicQualificationDTOToAcademicQualification;
import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.AcademicQualificationService;
import com.sgic.hrm.employee.service.ExamTypeService;
import com.sgic.hrm.employee.service.UserService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AcademicQualificationController{
	@Autowired
	private AcademicQualificationService academicQualificationService;
	@Autowired
	private UserService userService;
	@Autowired
	private ExamTypeService examTypeService;
	
	@PostMapping("/academicQualification")
	public HttpStatus addAcademicQualification(@Valid @RequestBody AcademicQualificationDTO academicQualificationDTO) {
		User userobj=userService.findByUserId(academicQualificationDTO.getUser());
		ExamType examTypeObj=examTypeService.findByExamTypeId(academicQualificationDTO.getExamTypeId());
		AcademicQualification academicQualification=AcademicQualificationDTOToAcademicQualification.map(academicQualificationDTO);
		
		boolean test = academicQualificationService.addAcademicQualification(academicQualification, examTypeObj,userobj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
		@GetMapping("/academicQualification")
		public ResponseEntity <List<AcademicQualification>> getAcademicQualification()
		{
			List<AcademicQualification> academicquali = academicQualificationService.getAllAcademicQualification();
			return new ResponseEntity<>(academicquali, HttpStatus.OK);
			
		}
		@GetMapping("/academicQualification/{uid}")
		public  ResponseEntity<List<AcademicQualification>>findAcademicQualificationByUserId(@PathVariable("uid") Integer id)
		{
			List<AcademicQualification> 
			academicQualifications = academicQualificationService.getAcademicQualificationByUserId(id);
			return new ResponseEntity<>(academicQualifications,HttpStatus.OK);
		}

		
		@PutMapping("/academicQualification/{id}")
		public HttpStatus editAcademicQualification(@PathVariable Integer id,@RequestBody AcademicQualification academicQualification) {
			boolean editTest=academicQualificationService.editAcademicQualification(academicQualification, id);
			if(editTest) {
				return HttpStatus.ACCEPTED;
			}
			return HttpStatus.BAD_REQUEST;
		}
		
		@DeleteMapping("/academicQualification/{id}")
		public HttpStatus deleteAcademicQualification(@PathVariable Integer id,@RequestBody AcademicQualification academicQualification) {
			boolean deleteTest=academicQualificationService.deleteAcademicQualification(id);
			if(deleteTest) {
				return HttpStatus.ACCEPTED;
			}
			return HttpStatus.BAD_REQUEST;
		}
	}
	

