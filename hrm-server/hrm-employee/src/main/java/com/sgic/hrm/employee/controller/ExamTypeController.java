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

import com.sgic.hrm.commons.entity.ExamType;
import com.sgic.hrm.employee.service.ExamTypeService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ExamTypeController {
	@Autowired
	private ExamTypeService examTypeService;
	
	@PostMapping("/examtype")
	public HttpStatus createExamType(@Valid @RequestBody ExamType examtype)
	{
		boolean addextype= examTypeService.addExamType(examtype);
		if(addextype){
			return HttpStatus.CREATED;
			}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/examtype")
	public ResponseEntity <List<ExamType>> getExamType(){
		List<ExamType> examtype = examTypeService.getAllExamType();
		return new ResponseEntity<>(examtype, HttpStatus.OK);
		
	}
	@PutMapping("/examtype/{id}")
	public HttpStatus editExamType(@PathVariable Integer id,@RequestBody ExamType examtype) {
		boolean editTest=examTypeService.editExamType(examtype, id);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/examtype/{id}")
	public HttpStatus deleteExamType(@PathVariable Integer id,@RequestBody ExamType examtype) {
		boolean editTest=examTypeService.deleteExamType(id);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
}