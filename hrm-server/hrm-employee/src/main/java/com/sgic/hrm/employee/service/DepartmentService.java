package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Department;



public interface DepartmentService {

	boolean addDepartment(Department department);
	List<Department> getDepartment();
	boolean editDepartment(Department department,Integer id);
//	Optional<Department> getDepartmentId(Integer id);
	boolean deleteDepartment(Integer id);
	Department findByDepartmentId(Integer id);
}
