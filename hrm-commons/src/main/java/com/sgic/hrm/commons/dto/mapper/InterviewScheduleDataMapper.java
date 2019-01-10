package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.InterviewSchduleDataSave;
import com.sgic.hrm.commons.dto.InterviewScheduleData;
import com.sgic.hrm.commons.entity.Applicant;
import com.sgic.hrm.commons.entity.InterviewSchedule;

public class InterviewScheduleDataMapper {
	public InterviewScheduleDataMapper() {

	}

	public static InterviewSchedule interviewScheduleDataMapper(InterviewScheduleData InterviewScheduleData) {
		InterviewSchedule interviewSchedule = new InterviewSchedule();

		interviewSchedule.setId(InterviewScheduleData.getId());
		interviewSchedule.setInterviewVenue(InterviewScheduleData.getInterviewVenue());
		interviewSchedule.setInterviewTime(InterviewScheduleData.getInterviewTime());
		interviewSchedule.setInterviewDate(InterviewScheduleData.getInterviewDate());

		interviewSchedule.setApplicant(ApplicantDataMapper.applicantDataMapper(InterviewScheduleData.getApplicant()));


		return interviewSchedule;
	}

	public static InterviewSchedule interviewScheduleDataSaveMapper(
			InterviewSchduleDataSave InterviewScheduleDataSave) {
		InterviewSchedule interviewSchedule = new InterviewSchedule();
		Applicant applicant = new Applicant();

		interviewSchedule.setId(InterviewScheduleDataSave.getId());
		interviewSchedule.setInterviewVenue(InterviewScheduleDataSave.getInterviewVenue());
		interviewSchedule.setInterviewTime(InterviewScheduleDataSave.getInterviewTime());
		interviewSchedule.setInterviewDate(InterviewScheduleDataSave.getInterviewDate());
		applicant.setId(InterviewScheduleDataSave.getApplicant());
		interviewSchedule.setApplicant(applicant);
		

		return interviewSchedule;
	}

}
