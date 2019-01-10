package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.VacancyData;
import com.sgic.hrm.commons.entity.Vacancy;
import java.sql.Date;

public class VacancyMapper {
	
	public static VacancyData vacancyMapper(Vacancy vacancy) {
		VacancyData vacancyData = new VacancyData();

		if (vacancy != null) {
			
			vacancyData.setId(vacancy.getId());
			vacancyData.setNoOfVacancy(vacancy.getNoOfVacancy());
			vacancyData.setSalaryScale(vacancy.getSalaryScale());
			vacancyData.setVacancyOpenDate(vacancy.getVacancyOpenDate());
			vacancyData.setVacancyCloseDate(vacancy.getVacancyCloseDate());
			vacancyData.setInterviewDate(vacancy.getInterviewDate());
			vacancyData.setKeyRecuitment(vacancy.getKeyRecuitment());

			vacancyData.setUser(UserMapper.userMapper(vacancy.getUser()));
			vacancyData.setJob(JobMapper.jobMapper(vacancy.getJob()));
			vacancyData.setDepartment(DepartmentMapper.departmentMapper(vacancy.getDepartment()));
			vacancyData.setRecruitmentType(RecruitmentTypeMapper.recruitmentMapper(vacancy.getRecruitmentType()));
			
			return vacancyData;
		}
		return null;

	}
}
