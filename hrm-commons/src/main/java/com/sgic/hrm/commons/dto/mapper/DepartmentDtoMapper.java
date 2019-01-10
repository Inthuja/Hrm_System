package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.DepartmentDto;
import com.sgic.hrm.commons.entity.Department;

public class DepartmentDtoMapper {
  
  public static Department mapDepartmentDtoToDepartment(DepartmentDto departmentDto) {
    Department department = new Department();
    
    department.setId(departmentDto.getId());
    department.setDepartmentName(departmentDto.getDepartmentName());
    
    return department;
  }

}
