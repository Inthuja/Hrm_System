package com.sgic.hrm.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.commons.dto.par.ReportParAppraisorDtoPost;
import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoPost;
import com.sgic.hrm.employee.par.serviceCombined.ParReportForAppraisorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParReportAppraisorTest {
	@Autowired
	ParReportForAppraisorService parReportForAppraisorService;
	@Test
	public void  ParReportAppraisor() {
		ReportParAppraisorDtoPost objParReport =new ReportParAppraisorDtoPost(1,12,"EMP001",new Date());
		List<ScoreParAppraiserDtoPost> scoreParAppraisorList=new ArrayList<>();
		scoreParAppraisorList.add(new ScoreParAppraiserDtoPost("C001",3.5));
		scoreParAppraisorList.add(new ScoreParAppraiserDtoPost("C002",2.5));
		scoreParAppraisorList.add(new ScoreParAppraiserDtoPost("C003",1.5));
		parReportForAppraisorService.saveReportAndScoreAppraisor(objParReport);
	}

}