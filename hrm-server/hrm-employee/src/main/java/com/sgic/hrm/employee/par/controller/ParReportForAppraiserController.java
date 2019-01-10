package com.sgic.hrm.employee.par.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.par.AppraisorDto;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoPost;
import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoGet;
import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoGet;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoPost;
import com.sgic.hrm.employee.par.serviceCombined.ParReportForAppraisorService;

@RestController
public class ParReportForAppraiserController {

	@Autowired
	ParReportForAppraisorService parReportForAppraisorService;
	
	@GetMapping("/parReportAppraiserTemplatePost")
	public ReportParAppraisorDtoPost getParReportForAppraiseePost() {
		ReportParAppraisorDtoPost reportParAppraiserDtoPost = new ReportParAppraisorDtoPost();

		List<ScoreParAppraiserDtoPost> scoreParAppraisorList = new ArrayList<>();
		scoreParAppraisorList.add(new ScoreParAppraiserDtoPost());
		scoreParAppraisorList.add(new ScoreParAppraiserDtoPost());
		reportParAppraiserDtoPost.setScoreParAppraiserList(scoreParAppraisorList);
		return reportParAppraiserDtoPost;
	}

	@PostMapping("/parReportAppraiser")
	public String createParReportForAppraisee(@RequestBody ReportParAppraisorDtoPost reportParAppraiserDtoPost) {

		return parReportForAppraisorService.saveReportAndScoreAppraisor(reportParAppraiserDtoPost);
	}

	@GetMapping("/parReportAppraiserTemplateGet")
	public ReportParAppraisorDtoGet getParReportForAppraiseeGet() {
		ReportParAppraisorDtoGet reportParAppraiseeDtoGet = new ReportParAppraisorDtoGet();
		AppraisorDto appraisorDto = new AppraisorDto();
		reportParAppraiseeDtoGet.setAppraisedBy(appraisorDto);
		List<ScoreParAppraiserDtoGet> scoreParAppraisorList = new ArrayList<>();
		scoreParAppraisorList.add(new ScoreParAppraiserDtoGet());
		scoreParAppraisorList.add(new ScoreParAppraiserDtoGet());
		scoreParAppraisorList.add(new ScoreParAppraiserDtoGet());
		reportParAppraiseeDtoGet.setScoreParAppraiserList(scoreParAppraisorList);
		return reportParAppraiseeDtoGet;
	}

}
