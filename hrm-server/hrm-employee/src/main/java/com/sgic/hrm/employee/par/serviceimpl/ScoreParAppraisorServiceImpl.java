package com.sgic.hrm.employee.par.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.par.ReportParAppraisor;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;
import com.sgic.hrm.commons.repository.par.ScoreParAppraisorRepository;
import com.sgic.hrm.employee.par.service.ScoreParAppraisorService;


@Service
public class ScoreParAppraisorServiceImpl implements  ScoreParAppraisorService {
@Autowired
ScoreParAppraisorRepository scoreParAppraisorRepo;
	@Override
	public void createScoreParAppraisor(ScoreParAppraisor scoreParAppraisor, ReportParAppraisor reportParAppraisor) {
		// TODO Auto-generated method stub
		scoreParAppraisor.setReportParAppraisor(reportParAppraisor);
		scoreParAppraisorRepo.save(scoreParAppraisor);
		
	}

}
