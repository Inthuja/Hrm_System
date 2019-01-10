package com.sgic.hrm.commons.repository.par;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.ReportParAppraise;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;

public interface ScoreParAppraiseeRepository extends JpaRepository<ScoreParAppraisee, String> {

	List<ScoreParAppraisee> findScoreParAppraiseeByReportParAppraise(ReportParAppraise reportParAppraise);
}
