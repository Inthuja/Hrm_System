package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.BenefitsAllowancesDto;
import com.sgic.hrm.commons.entity.BenefitsAllowancesEntity;

public class BenefitsAllowancesEntityMapper {

	public static BenefitsAllowancesDto mapBenefitsAllowancesEntityToBenefitsAllowancesDto(
			BenefitsAllowancesEntity benefitsAllowancesEntity) {
		BenefitsAllowancesDto benefitsAllowancesDto = new BenefitsAllowancesDto();

		benefitsAllowancesDto.setDeptName(benefitsAllowancesEntity.getDeptName());
		benefitsAllowancesDto.setHousing(benefitsAllowancesEntity.getHousing());
		benefitsAllowancesDto.setId(benefitsAllowancesEntity.getId());
		benefitsAllowancesDto.setMeal(benefitsAllowancesEntity.getMeal());
		benefitsAllowancesDto.setMedical(benefitsAllowancesEntity.getMedical());
		benefitsAllowancesDto.setMobile(benefitsAllowancesEntity.getMobile());
		benefitsAllowancesDto.setName(benefitsAllowancesEntity.getName());
		benefitsAllowancesDto.setTravelling(benefitsAllowancesEntity.getTravelling());
		benefitsAllowancesDto.setChartEntity(benefitsAllowancesEntity.getChartEntity());
		return benefitsAllowancesDto;
	}

	public static List<BenefitsAllowancesDto> mapBenefitsAllowancesEntityListToBenefitsAllowancesDtoList(
			List<BenefitsAllowancesEntity> benefitsAllowancesEntityList) {
		List<BenefitsAllowancesDto> benefitsAllowancesDtoList = new ArrayList<BenefitsAllowancesDto>();

		if (benefitsAllowancesEntityList != null) {
			for (BenefitsAllowancesEntity benefitsAllowancesEntity : benefitsAllowancesEntityList) {
				benefitsAllowancesDtoList
						.add(mapBenefitsAllowancesEntityToBenefitsAllowancesDto(benefitsAllowancesEntity));
			}
		}
		return benefitsAllowancesDtoList;
	}
}
