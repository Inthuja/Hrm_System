package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.SalaryChartDto;
import com.sgic.hrm.commons.entity.SalaryChartEntity;

public class SalaryChartEntityMapper {

	public static SalaryChartDto mapSalaryChartEntityToSalartChartDto(SalaryChartEntity salaryChartEntity) {
		SalaryChartDto salaryChartDto = new SalaryChartDto();

		salaryChartDto.setId(salaryChartEntity.getId());
		salaryChartDto.setBasicSalary(salaryChartEntity.getBasicSalary());
		salaryChartDto.setEmpName(salaryChartEntity.getEmpName());
		salaryChartDto.setEpf8(salaryChartEntity.getEpf8());
		salaryChartDto.setEpf12(salaryChartEntity.getEpf12());
		salaryChartDto.setEtf3(salaryChartEntity.getEtf3());
		salaryChartDto.setLoan(salaryChartEntity.getLoan());
		salaryChartDto.setNetSalary(salaryChartEntity.getNetSalary());
		salaryChartDto.setPayee(salaryChartEntity.getPayee());
		salaryChartDto.setStampDuty(salaryChartEntity.getStampDuty());
		salaryChartDto.setStatutoryPayment(salaryChartEntity.getStatutoryPayment());

		return salaryChartDto;
	}

	public static List<SalaryChartDto> mapSalaryChartEntityListToSalaryChartDtoList(
			List<SalaryChartEntity> salaryChartEntityList) {
		List<SalaryChartDto> salaryChartDtoList = new ArrayList<SalaryChartDto>();

		if (salaryChartEntityList != null) {
			for (SalaryChartEntity salaryChartEntity : salaryChartEntityList) {
				salaryChartDtoList.add(mapSalaryChartEntityToSalartChartDto(salaryChartEntity));
			}
		}
		return salaryChartDtoList;
	}
}
