package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.DepartmentData;
import com.sgic.hrm.commons.dto.DepartmentDto;
import com.sgic.hrm.commons.entity.Department;

public class DepartmentMapper {

	public static DepartmentData departmentMapper(Department department) {

		DepartmentData departmentData = new DepartmentData();

		if (department != null) {
			departmentData.setId(department.getId());
			departmentData.setDepartmentName(department.getDepartmentName());

			return departmentData;
		}
		return null;

	}

	public static DepartmentDto mapDepartmentToDepartmentDto(Department department) {
		DepartmentDto departmentDto = new DepartmentDto();

		departmentDto.setId(department.getId());
		departmentDto.setDepartmentName(department.getDepartmentName());

		return departmentDto;
	}

	public static List<DepartmentDto> mapDepartmentDtoListToDepartmentList(List<Department> departmentList) {
		List<DepartmentDto> departmentDtoList = new ArrayList<DepartmentDto>();

		if (departmentList != null) {
			for (Department department : departmentList) {
				departmentDtoList.add(mapDepartmentToDepartmentDto(department));
			}
		}
		return departmentDtoList;
	}
}
