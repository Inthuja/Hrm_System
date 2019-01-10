package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.RecruitmentTypeData;
import com.sgic.hrm.commons.entity.RecruitmentType;

public class RecruitmentTypeMapper {
	
	public static RecruitmentTypeData recruitmentMapper(RecruitmentType recruitment) {
		RecruitmentTypeData recruitmentData = new RecruitmentTypeData();

		if (recruitment != null) {
			recruitmentData.setId(recruitment.getId());
			recruitmentData.setRecruitmentType(recruitment.getRecruitmentType());
			
			return recruitmentData;
		}
		return null;

	}
}
