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

import com.sgic.hrm.commons.dto.ProfessionalMembershipDto;
import com.sgic.hrm.commons.dto.mapper.ProfessionalMembershipDtoToProfessionalMembership;
import com.sgic.hrm.commons.entity.ProfessionalMembership;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.ProfessionalMembershipService;
import com.sgic.hrm.employee.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProfessionalMembershipController {
	@Autowired
	private ProfessionalMembershipService professionalMembershipService;

	@Autowired
	private UserService userService;

	@PostMapping("/professionalMembership")
	public HttpStatus addProfessionalMembership(
			@Valid @RequestBody ProfessionalMembershipDto professionalMembershipDto) {
		User userObj = userService.findByUserId(professionalMembershipDto.getUser());
		ProfessionalMembership professionalMembership = ProfessionalMembershipDtoToProfessionalMembership
				.map(professionalMembershipDto);
		boolean test = professionalMembershipService.addProfessionalMembership(professionalMembership, userObj);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/professionalMembership")
	public ResponseEntity<List<ProfessionalMembership>> GetProfessionalMembership() {
		List<ProfessionalMembership> professionalMembership = professionalMembershipService
				.getAllProfessionalMembership();
		ResponseEntity<List<ProfessionalMembership>> response = new ResponseEntity<>(professionalMembership,
				HttpStatus.OK);
		return response;

	}

	@PutMapping("/professionalMembership/{uid}")
	public HttpStatus ModifyProfessionalMembership(@PathVariable Integer id,
			@RequestBody ProfessionalMembership professionalMembership) {
		boolean editTest = professionalMembershipService.editProfessionalMembership(professionalMembership, id);
		if (editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping("/professionalMembership/{id}")
	public HttpStatus DeleteProfessionalMembership(@PathVariable Integer id) {
		boolean test = professionalMembershipService.deleteProfessionalMembership(id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/professionalMembership/{uid}")
	public ResponseEntity<List<ProfessionalMembership>> findProfessionalMembershipByUserId(
			@PathVariable("uid") Integer id) {
		List<ProfessionalMembership> professionalMembership = professionalMembershipService
				.getProfessionalMembershipByUserId(id);
		return new ResponseEntity<>(professionalMembership, HttpStatus.OK);
	}
}
