package com.sgic.hrm.login.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/employee")
	@PreAuthorize("hasRole('EMPLOYEE') or hasRole('HR')")
	public String userAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/api/test/hr")
	@PreAuthorize("hasRole('HR')")
	public String projectManagementAccess() {
		return ">>> Project Management Board";
	}
}