package com.sgic.hrm.commons.dto.mapper;



import com.sgic.hrm.commons.dto.VacancyData;
import com.sgic.hrm.commons.dto.VacancySaveData;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.RecruitmentType;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.Vacancy;

public class VacancyDataMapper {
	private VacancyDataMapper() {}
	public static Vacancy  vacancyDataMapper(VacancyData vacancyData) {
		Vacancy vacancy = new Vacancy();

		vacancy.setId(vacancyData.getId());
//		vacancy.setHiring_officer(vacancyDto.getHiring_officer());
		vacancy.setNoOfVacancy(vacancyData.getNoOfVacancy());
		vacancy.setSalaryScale(vacancyData.getSalaryScale());
		vacancy.setVacancyOpenDate(vacancyData.getVacancyOpenDate());
		vacancy.setVacancyCloseDate(vacancyData.getVacancyCloseDate());
		vacancy.setInterviewDate(vacancyData.getInterviewDate());
		vacancy.setKeyRecuitment(vacancyData.getKeyRecuitment());
		

		vacancy.setUser(UserDataMapper.userDataMapper(vacancyData.getUser()));
		vacancy.setJob(JobDataMapper.jobDataMapper(vacancyData.getJob()));
		vacancy.setDepartment(DepartmentDataMapper.departmentDataMapper(vacancyData.getDepartment()));
		vacancy.setRecruitmentType(RecruitmentTypeDataMapper.recruitmentDataMapper(vacancyData.getRecruitmentType()));
		
		
		return vacancy;
	    
}
	
	public static Vacancy  vacancySaveDataMapper(VacancySaveData vacancySaveData) {
		Vacancy vacancy = new Vacancy();
		User user = new User();
		Job job = new Job();
		Department department = new Department();
		RecruitmentType recruitmentType = new RecruitmentType();

		vacancy.setId(vacancySaveData.getId());
		vacancy.setNoOfVacancy(vacancySaveData.getNoOfVacancy());
		vacancy.setSalaryScale(vacancySaveData.getSalaryScale());
		vacancy.setVacancyOpenDate(vacancySaveData.getVacancyOpenDate());
		vacancy.setVacancyCloseDate(vacancySaveData.getVacancyCloseDate());
		vacancy.setInterviewDate(vacancySaveData.getInterviewDate());
		vacancy.setKeyRecuitment(vacancySaveData.getKeyRecuitment());

		user.setId(vacancySaveData.getUser());
		vacancy.setUser(user);

		job.setId(vacancySaveData.getJob());
		vacancy.setJob(job);

		department.setId(vacancySaveData.getDepartment());
		vacancy.setDepartment(department);

		recruitmentType.setId(vacancySaveData.getRecruitment());
		vacancy.setRecruitmentType(recruitmentType);

		return vacancy;
	}

	
	
}
