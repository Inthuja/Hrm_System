package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.HighestQualificationData;
import com.sgic.hrm.commons.entity.HighestQualification;

public class HighestQualificationMapper {

	public static HighestQualificationData highestQualificationMapper(HighestQualification highestQualification) {
		HighestQualificationData highestQualificationData = new HighestQualificationData();

		if (highestQualification != null) {
			highestQualificationData.setId(highestQualification.getId());
			highestQualificationData.setHighestQualificationName(highestQualification.getHighestQualificationName());
			
			return highestQualificationData;
		}
		return null;

	}
}
