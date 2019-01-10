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

import com.sgic.hrm.commons.dto.JobData;
import com.sgic.hrm.commons.dto.mapper.JobDataMapper;
import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.employee.service.JobService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class JobController {
	@Autowired
	private JobService jobService;
	
	@PostMapping("/job")
	public HttpStatus AddJob(@RequestBody JobData jobData)  {
		boolean test=jobService.addJob(JobDataMapper.jobDataMapper(jobData));
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@GetMapping("/job")
	public ResponseEntity<List<Job>>GetUser(){
		List<Job> job= jobService.getJob();
		ResponseEntity<List<Job>> responseEntity=new ResponseEntity<>(job , HttpStatus.OK);
		return responseEntity;
	}
//	@PutMapping("job/{id}")
//	public HttpStatus ModifyJob(@PathVariable Integer id,@RequestBody Job job) {
//		boolean test=jobService.editJob(job, id);
//		if(test) {
//			return HttpStatus.ACCEPTED;
//		}
//		return HttpStatus.BAD_REQUEST;
//	}
	@PutMapping("/job/{id}")
	public ResponseEntity<String> updateJob(@PathVariable(name="id") Integer id,@RequestBody JobData jobData){
		Job job=JobDataMapper.jobDataMapper(jobData);
		if(jobService.editJob(job, id))
		{
			return new ResponseEntity<>("updated",HttpStatus.OK);
		}
		return new ResponseEntity<>("upadte failed", HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("/job/{id}")
	public HttpStatus DeleteUser(@PathVariable Integer id) {
		boolean test=jobService.deleteJob(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
