package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.SalaryDetailsDto;
import com.sgic.hrm.commons.entity.mapper.SalaryDetailsEntityMapper;
import com.sgic.hrm.employee.remuneration.service.SalaryDetailsHRViewService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SalaryDetailsHRViewController {

	@Autowired
	SalaryDetailsHRViewService salaryDetailsHRViewService;

	@GetMapping("/salarydetailsHRview")
	public List<SalaryDetailsDto> getSalaryDetails() {
		return SalaryDetailsEntityMapper
				.mapSalaryDetailsEntityListToSalaryDetailsDtoList(salaryDetailsHRViewService.viewSalaryDetails());
	}
}
