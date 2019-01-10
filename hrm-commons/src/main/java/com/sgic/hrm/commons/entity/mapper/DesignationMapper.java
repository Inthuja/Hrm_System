package com.sgic.hrm.commons.entity.mapper;


import com.sgic.hrm.commons.dto.DesignationData;
import com.sgic.hrm.commons.entity.Designation;

public class DesignationMapper {

	public static DesignationData designationMapper(Designation designation) {
		DesignationData designationData = new DesignationData();

		if (designation != null) {
			designationData.setId(designation.getId());
			designationData.setDesignationName(designation.getDesignationName());

			return designationData;
		}
		return null;
	}
}
