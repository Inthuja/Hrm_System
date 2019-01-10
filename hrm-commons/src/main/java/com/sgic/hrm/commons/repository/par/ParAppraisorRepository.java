package com.sgic.hrm.commons.repository.par;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.ParAppraisor;

public interface ParAppraisorRepository extends JpaRepository<ParAppraisor, String>{

	public ParAppraisor findParAppraisorByAppraiserId(String appraiserId);
}

