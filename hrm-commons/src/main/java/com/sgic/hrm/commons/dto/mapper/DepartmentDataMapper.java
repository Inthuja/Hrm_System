package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.DepartmentData;
import com.sgic.hrm.commons.entity.Department;

public class DepartmentDataMapper {
	private DepartmentDataMapper() {}
	public static Department departmentDataMapper(DepartmentData departmentData) {
		Department department = new Department();

		department.setId(departmentData.getId());
		department.setDepartmentName(departmentData.getDepartmentName());
		return department;
	}
}
