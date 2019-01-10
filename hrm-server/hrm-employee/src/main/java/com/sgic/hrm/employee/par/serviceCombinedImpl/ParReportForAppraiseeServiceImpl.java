package com.sgic.hrm.employee.par.serviceCombinedImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.mapper.par.ScoreParAppraiseeMapper;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoPost;
import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ParContent;
import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;
import com.sgic.hrm.employee.par.service.ParContentService;
import com.sgic.hrm.employee.par.service.ParService;
import com.sgic.hrm.employee.par.service.ReportParAppraiseeService;
import com.sgic.hrm.employee.par.service.ScoreParAppraiseeService;
import com.sgic.hrm.employee.par.serviceCombined.ParReportForAppraiseeService;

@Service
public class ParReportForAppraiseeServiceImpl implements ParReportForAppraiseeService {
	@Autowired
	ParService parservice;
	@Autowired
	ReportParAppraiseeService reportParAppraiseService;
	@Autowired
	ScoreParAppraiseeService scoreParAppraiseeService;
	@Autowired
	ParContentService parContentService;

	@Override
	public void saveReportAndScore(Integer parId, List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList,
			ReportParAppraise reportParAppraise) {

		if (parservice.findParById(parId) != null) {
			Par parObj = parservice.findParById(parId);
			reportParAppraiseService.createReportParAppraise(reportParAppraise, parObj);
			Iterator<ScoreParAppraiseeDtoPost> iteratorDTO = scoreParAppraiseeList.iterator();
			int i = 0;
			while (iteratorDTO.hasNext()) {
				String pk = reportParAppraise.getId() + "_" + i;
				ScoreParAppraiseeDtoPost scoreParAppraiseeDtoPost=iteratorDTO.next();
				ParContent parContent=parContentService.findParContentById(scoreParAppraiseeDtoPost.getParContentId());
				scoreParAppraiseeService.createScoreParAppraisee(
						ScoreParAppraiseeMapper.dtoToEntity(pk,parContent,scoreParAppraiseeDtoPost ), reportParAppraise);
				i++;
			}

		}
	}

	@Override
	public String saveReportAndScore(ReportParAppraiseeDtoPost reportParAppraiseeDtoPost) {

		String msg = new String();
		ReportParAppraise reportParAppraise = new ReportParAppraise();
		reportParAppraise.setId(reportParAppraiseeDtoPost.getReportId());

		if (parservice.findParById(reportParAppraiseeDtoPost.getParId()) != null) {
			if (reportParAppraiseService.findReportParAppraiseeById(reportParAppraiseeDtoPost.getReportId()) == null) {

				Par parObj = parservice.findParById(reportParAppraiseeDtoPost.getParId());
				reportParAppraiseService.createReportParAppraise(reportParAppraise, parObj);
				Iterator<ScoreParAppraiseeDtoPost> iteratorDTO = reportParAppraiseeDtoPost.getScoreParAppraiseeList()
						.iterator();
				int i = 0;
				while (iteratorDTO.hasNext()) {
					String pk = reportParAppraise.getId() + "_" + i;
					ScoreParAppraiseeDtoPost scoreParAppraiseeDtoPost=iteratorDTO.next();
					ParContent parContent=parContentService.findParContentById(scoreParAppraiseeDtoPost.getParContentId());
					scoreParAppraiseeService.createScoreParAppraisee(
							ScoreParAppraiseeMapper.dtoToEntity(pk,parContent,scoreParAppraiseeDtoPost ), reportParAppraise);
					i++;
				}
			} else {
				msg = "report id is already exist";
			}

		} else {
			msg = "par id is not found";
		}
		return msg;
	}

	@Override
	public boolean updateParScore() {

		return false;
	}

	@Override
	public ReportParAppraiseeDtoGet getReportAndScore(Integer parId) {
		//creating a ReportParAppraiseeDtoGet object
		ReportParAppraiseeDtoGet reportParAppraiseeDtoGet=new ReportParAppraiseeDtoGet();
		
		// find par by id
		Par par=parservice.findParById(parId);
		// set the par id at dto
		reportParAppraiseeDtoGet.setParId(par.getId());
		
		// find the report by par id and the dto
		ReportParAppraise reportParAppraise=reportParAppraiseService.findReportParAppraiseeByParId(par);
		reportParAppraiseeDtoGet.setReportId(reportParAppraise.getId());
		
		// score par appraisee have the iterator
		Iterator<ScoreParAppraisee> iteratorDTO = scoreParAppraiseeService.getScore(reportParAppraise).iterator();
//		
	// dto score list 
		List<ScoreParAppraiseeDtoGet> scoreParAppraiseeDtoGetList=new ArrayList<>();
//		
//		// loop to pull values and set to dto list
		while (iteratorDTO.hasNext()) {
			ScoreParAppraiseeDtoGet scoreParAppraiseeDtoGet=new ScoreParAppraiseeDtoGet();
			
			ScoreParAppraisee scoreParAppraisee=iteratorDTO.next();
			
			scoreParAppraiseeDtoGet.setParContentId(scoreParAppraisee.getParContent().getId());
			// par content name
			//ParContent parContent=parContentService.findParContentById(scoreParAppraisee.getParContentId());
			scoreParAppraiseeDtoGet.setParContentName(scoreParAppraisee.getParContent().getContentName());
			
			scoreParAppraiseeDtoGet.setScore(scoreParAppraisee.getScore());
			
			scoreParAppraiseeDtoGetList.add(scoreParAppraiseeDtoGet);
			
		}
		reportParAppraiseeDtoGet.setScoreParAppraiseeList(scoreParAppraiseeDtoGetList);
		return reportParAppraiseeDtoGet;
	}

}
