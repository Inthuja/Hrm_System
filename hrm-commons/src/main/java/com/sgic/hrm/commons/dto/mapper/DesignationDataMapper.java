package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.DesignationData;
import com.sgic.hrm.commons.entity.Designation;

public class DesignationDataMapper {
	public static Designation designationDataMapper(DesignationData designationData) {
		Designation designation = new Designation();

		designation.setId(designationData.getId());
		designation.setDesignationName(designationData.getDesignationName());
		return designation;
	}
	
}
