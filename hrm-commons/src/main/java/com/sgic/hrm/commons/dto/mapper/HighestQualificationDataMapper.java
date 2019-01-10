package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.HighestQualificationData;
import com.sgic.hrm.commons.entity.HighestQualification;

public class HighestQualificationDataMapper {
	private HighestQualificationDataMapper() {}
	public static HighestQualification highestQualificationDataMapper(HighestQualificationData highestQualificationData) {
		HighestQualification highestQualification = new HighestQualification();

		highestQualification.setId(highestQualificationData.getId());
		highestQualification.setHighestQualificationName(highestQualificationData.getHighestQualificationName());
		return highestQualification;
	}
}
