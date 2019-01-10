package com.sgic.hrm.employee.par.serviceCombined;

import java.util.List;

import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoPost;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;

public interface ParReportForAppraisorService {
	/*
	 * save report entity -save list of par score -save report record find the par
	 * object by par id save the ReportParAppraise including par object write
	 * iteratoror to save the List of ScoreParAppraisee
	 */
	public void saveReportAndScoreAppraisor(Integer parId, ReportParAppraisor reportParAppraisor,
			List<ScoreParAppraisor> scoreParAppraisorList);
	
	public String saveReportAndScoreAppraisor(ReportParAppraisorDtoPost reportParAppraisorDtoPost);

}