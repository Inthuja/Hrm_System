package com.sgic.hrm.employee.par.service;

import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;

public interface ReportParAppraisorService {
	public void createReportParAppraise(ReportParAppraisor reportParAppraisor,Par par);

	public ReportParAppraisor findReportParAppraisorById(Integer reportId);
	
}