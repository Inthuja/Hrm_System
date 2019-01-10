package com.sgic.hrm.employee.par.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ReportParAppraiseeDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoGet;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoPost;
import com.sgic.hrm.employee.par.serviceCombined.ParReportForAppraiseeService;

@RestController
public class ParReportForAppraiseeController {
	@Autowired
	ParReportForAppraiseeService parReportForAppraiseeService;

	@PostMapping("/parreportappraisee")
	public String createParReportForAppraisee(@RequestBody ReportParAppraiseeDtoPost reportParAppraiseeDtoPost) {
		return parReportForAppraiseeService.saveReportAndScore(reportParAppraiseeDtoPost);
	}

	@GetMapping("/parreportappraisee/{parId}")
	public ReportParAppraiseeDtoGet getParReportForAppraisee(@PathVariable("parId") Integer parId ) {
		return parReportForAppraiseeService.getReportAndScore(parId);
	}

	@GetMapping("/parReportTemplatePost")
	public ReportParAppraiseeDtoPost getParReportForAppraiseePost() {
		ReportParAppraiseeDtoPost reportParAppraiseeDtoPost = new ReportParAppraiseeDtoPost();

		List<ScoreParAppraiseeDtoPost> scheduleParAppraisorList = new ArrayList<>();
		scheduleParAppraisorList.add(new ScoreParAppraiseeDtoPost());
		scheduleParAppraisorList.add(new ScoreParAppraiseeDtoPost());
		scheduleParAppraisorList.add(new ScoreParAppraiseeDtoPost());
		reportParAppraiseeDtoPost.setScoreParAppraiseeList(scheduleParAppraisorList);
		return reportParAppraiseeDtoPost;
	}

	@GetMapping("/parReportTemplateGet")
	public ReportParAppraiseeDtoGet getParReportForAppraiseeGet() {
		ReportParAppraiseeDtoGet reportParAppraiseeDtoGet = new ReportParAppraiseeDtoGet();

		List<ScoreParAppraiseeDtoGet> scheduleParAppraiseeList = new ArrayList<>();
		scheduleParAppraiseeList.add(new ScoreParAppraiseeDtoGet());
		scheduleParAppraiseeList.add(new ScoreParAppraiseeDtoGet());
		scheduleParAppraiseeList.add(new ScoreParAppraiseeDtoGet());
		reportParAppraiseeDtoGet.setScoreParAppraiseeList(scheduleParAppraiseeList);
		return reportParAppraiseeDtoGet;
	}

}