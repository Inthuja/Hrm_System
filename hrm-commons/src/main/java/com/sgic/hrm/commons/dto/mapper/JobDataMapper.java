package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.JobData;
import com.sgic.hrm.commons.entity.Job;

public class JobDataMapper {
	private JobDataMapper() {}
	public static Job jobDataMapper(JobData jobData) {
		Job job = new Job();

		job.setId(jobData.getId());
		job.setJobName(jobData.getJobName());
		job.setJobReferenceNo(jobData.getJobReferenceNo());
		return job;
	}
}
