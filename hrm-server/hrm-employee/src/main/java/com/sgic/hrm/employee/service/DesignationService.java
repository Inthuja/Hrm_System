package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Designation;

public interface DesignationService {
	
	boolean addDesignation(Designation designation);
	List<Designation> getDesignation();
	boolean editDesignation(Designation designation,Integer id);
//	Optional<Designation> getDesignationId(Integer id);
	boolean deleteDesignation(Integer id);
	Designation findByDesignationId(Integer id);
	
}
