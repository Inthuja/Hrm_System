package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.SalaryChartDto;
import com.sgic.hrm.commons.entity.SalaryChartEntity;

public class SalaryChartDtoMapper {

	public static SalaryChartEntity mapSalaryChartDtoToSalartChartEntity(SalaryChartDto salaryChartDto) {
		SalaryChartEntity salaryChartEntity = new SalaryChartEntity();

		salaryChartEntity.setId(salaryChartDto.getId());
		salaryChartEntity.setBasicSalary(salaryChartDto.getBasicSalary());
		salaryChartEntity.setEmpName(salaryChartDto.getEmpName());
		salaryChartEntity.setEpf8(salaryChartDto.getEpf8());
		salaryChartEntity.setEpf12(salaryChartDto.getEpf12());
		salaryChartEntity.setEtf3(salaryChartDto.getEtf3());
		salaryChartEntity.setLoan(salaryChartDto.getLoan());
		salaryChartEntity.setNetSalary(salaryChartDto.getNetSalary());
		salaryChartEntity.setStampDuty(salaryChartDto.getStampDuty());
		salaryChartEntity.setStatutoryPayment(salaryChartDto.getStatutoryPayment());
		salaryChartEntity.setPayee(salaryChartDto.getPayee());

		return salaryChartEntity;
	}

}
