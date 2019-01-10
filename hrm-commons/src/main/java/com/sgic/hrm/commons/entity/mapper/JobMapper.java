package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.JobData;
import com.sgic.hrm.commons.entity.Job;

public class JobMapper {

	public static JobData jobMapper(Job job) {
		JobData jobData = new JobData();

		if (job != null) {
			jobData.setId(job.getId());
			jobData.setJobName(job.getJobName());
			jobData.setJobReferenceNo(job.getJobReferenceNo());

			return jobData;
		}
		return null;

	}
}
