package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.SalaryDetailsDto;
import com.sgic.hrm.commons.entity.SalaryDetailsHRViewEntity;

public class SalaryDetailsEntityMapper {

	public static SalaryDetailsDto mapSalaryDetailsEntityToSalaryDetailsDto(
			SalaryDetailsHRViewEntity salaryDetailsHRViewEntity) {
		SalaryDetailsDto salaryDetailsDto = new SalaryDetailsDto();

		salaryDetailsDto.setAllowances(salaryDetailsHRViewEntity.getAllowances());
		salaryDetailsDto.setAppointmentDate(salaryDetailsHRViewEntity.getAppointmentdate());
		salaryDetailsDto.setBasicSalary(salaryDetailsHRViewEntity.getBasicSalary());
		salaryDetailsDto.setDeductions(salaryDetailsHRViewEntity.getDeductions());
		salaryDetailsDto.setEmpName(salaryDetailsHRViewEntity.getEmpName());
		salaryDetailsDto.setId(salaryDetailsHRViewEntity.getId());
		salaryDetailsDto.setIncrement(salaryDetailsHRViewEntity.getIncrement());
		salaryDetailsDto.setNetSalary(salaryDetailsHRViewEntity.getNetSalary());
		salaryDetailsDto.setStatutoryPayment(salaryDetailsHRViewEntity.getStatutoryPayment());
		
		return salaryDetailsDto;
	}
	
	public static List<SalaryDetailsDto> mapSalaryDetailsEntityListToSalaryDetailsDtoList(List<SalaryDetailsHRViewEntity> salaryDetailsEntityList){
		List<SalaryDetailsDto> salaryDetailsDtoList=new ArrayList<SalaryDetailsDto>();
		if(salaryDetailsEntityList!=null) {
			for(SalaryDetailsHRViewEntity salaryDetailsHRViewEntity:salaryDetailsEntityList) {
				salaryDetailsDtoList.add(mapSalaryDetailsEntityToSalaryDetailsDto(salaryDetailsHRViewEntity));
			}
		}
		return salaryDetailsDtoList;
	}
}
