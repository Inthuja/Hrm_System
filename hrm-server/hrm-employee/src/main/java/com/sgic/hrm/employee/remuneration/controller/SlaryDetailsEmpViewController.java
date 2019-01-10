package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.SalaryDetailsEmpViewEntity;
import com.sgic.hrm.employee.remuneration.service.SalaryDetailsEmpViewService;

@RestController
public class SlaryDetailsEmpViewController {

	@Autowired
	SalaryDetailsEmpViewService salaryDetailsEmpViewService;

	@GetMapping("/salarydetailsempview")
	public List<SalaryDetailsEmpViewEntity> viewSalaryDetails() {
		return salaryDetailsEmpViewService.getSalarydetails();
	}
}
