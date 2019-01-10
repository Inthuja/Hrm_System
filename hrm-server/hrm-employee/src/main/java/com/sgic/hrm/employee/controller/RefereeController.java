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

import com.sgic.hrm.commons.dto.RefereesDto;
import com.sgic.hrm.commons.dto.mapper.RefeereeDtoToReferee;
import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.RefereeService;
import com.sgic.hrm.employee.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RefereeController {
	@Autowired
	private RefereeService refereeService;
	@Autowired
	private UserService userService;

	@PostMapping("/referee")
	public HttpStatus addReferee(@Valid @RequestBody RefereesDto refereesDto) {
		User userObj = userService.findByUserId(refereesDto.getUser());
		Referee referee = RefeereeDtoToReferee.map(refereesDto);
		boolean test = refereeService.addReferee(referee, userObj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/referee")
	public ResponseEntity<List<Referee>> GetReferee() {
		List<Referee> referee = refereeService.getAllReferee();
		ResponseEntity<List<Referee>> response = new ResponseEntity<>(referee, HttpStatus.OK);
		return response;
	}

	@PutMapping("/referee/{id}")
	public HttpStatus editReferee(@RequestBody Referee referee, @PathVariable("id") Integer id) {
		boolean test = refereeService.editReferee(referee, id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/referee/{id}")
	public HttpStatus deleteReferee(@PathVariable("id") Integer Id) {
		boolean test = refereeService.deleteReferee(Id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/referee/{uid}")
	public ResponseEntity<List<Referee>> findAcademicQualificationByUserId(@PathVariable("uid") Integer id) {
		List<Referee> referee = refereeService.getRefereeByUserId(id);
		return new ResponseEntity<>(referee, HttpStatus.OK);
	}
}
