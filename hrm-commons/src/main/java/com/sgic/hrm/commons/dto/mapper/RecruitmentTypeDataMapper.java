package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.RecruitmentTypeData;
import com.sgic.hrm.commons.entity.RecruitmentType;

public class RecruitmentTypeDataMapper {
	private RecruitmentTypeDataMapper() {}
	public static RecruitmentType recruitmentDataMapper(RecruitmentTypeData recuitmentData) {
		RecruitmentType recruitment = new RecruitmentType();

		recruitment.setId(recuitmentData.getId());
		recruitment.setRecruitmentType(recuitmentData.getRecruitmentType());
		return recruitment;
	}
}
