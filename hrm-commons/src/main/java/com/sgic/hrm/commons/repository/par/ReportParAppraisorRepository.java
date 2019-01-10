package com.sgic.hrm.commons.repository.par;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.ReportParAppraisor;

public interface ReportParAppraisorRepository extends JpaRepository<ReportParAppraisor, Integer> {
	ReportParAppraisor findReportParAppraiseById(Integer id);
}