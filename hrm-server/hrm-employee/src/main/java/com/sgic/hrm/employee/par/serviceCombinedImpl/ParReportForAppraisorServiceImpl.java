package com.sgic.hrm.employee.par.serviceCombinedImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.mapper.par.ScoreParAppraiserMapper;
import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoPost;
import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ReportParAppraisor;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;
import com.sgic.hrm.employee.par.service.ParService;
import com.sgic.hrm.employee.par.service.ReportParAppraisorService;
import com.sgic.hrm.employee.par.service.ScoreParAppraisorService;
import com.sgic.hrm.employee.par.serviceCombined.ParReportForAppraisorService;

@Service
public class ParReportForAppraisorServiceImpl implements ParReportForAppraisorService {
	@Autowired
	ParService parService;
	@Autowired
	ReportParAppraisorService reportParAppraisorService;
	@Autowired
	ScoreParAppraisorService scoreParAppraisorService;

	@Override
	public void saveReportAndScoreAppraisor(Integer parId, ReportParAppraisor reportParAppraisor,
			List<ScoreParAppraisor> scoreParAppraisorList) {
		if (parService.findParById(parId) != null) {
			Par parObj = parService.findParById(parId);
			reportParAppraisorService.createReportParAppraise(reportParAppraisor, parObj);
			Iterator<ScoreParAppraisor> iterator = scoreParAppraisorList.iterator();
			while (iterator.hasNext()) {
				scoreParAppraisorService.createScoreParAppraisor(iterator.next(), reportParAppraisor);
			}

		}
	}

	@Override
	public String saveReportAndScoreAppraisor(ReportParAppraisorDtoPost reportParAppraisorDtoPost) {
		String msg = null;
		ReportParAppraisor reportParAppraisor = new ReportParAppraisor();
		// Mapping goes here 
		reportParAppraisor.setId(reportParAppraisorDtoPost.getReportId());
		reportParAppraisor.setAppraisorId(reportParAppraisorDtoPost.getAppraisedById());
		reportParAppraisor.setAppraisedDate(reportParAppraisorDtoPost.getAppraisedDate());
		
		// sequence of steps goes here with proper validation
		if (parService.findParById(reportParAppraisorDtoPost.getParId()) != null) {
			if (reportParAppraisorService.findReportParAppraisorById(reportParAppraisorDtoPost.getReportId()) == null) {

				Par parObj = parService.findParById(reportParAppraisorDtoPost.getParId());
				reportParAppraisorService.createReportParAppraise(reportParAppraisor, parObj);
				Iterator<ScoreParAppraiserDtoPost> iteratorDTO = reportParAppraisorDtoPost.getScoreParAppraiserList()
						.iterator();
				int i = 0;
				while (iteratorDTO.hasNext()) {
					String pk = reportParAppraisor.getId() + "_" + i;
					scoreParAppraisorService.createScoreParAppraisor(
							ScoreParAppraiserMapper.dtoToEntity(pk, iteratorDTO.next()), reportParAppraisor);
					i++;
				}
				
				msg="success";
			} else {
				msg = "report id is already exist";
			}

		} else {
			msg = "par id is not found";
		}
		return msg;
	}

}