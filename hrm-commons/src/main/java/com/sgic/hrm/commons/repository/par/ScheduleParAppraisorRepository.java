package com.sgic.hrm.commons.repository.par;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.par.Par;
import com.sgic.hrm.commons.entity.par.ScheduleParAppraisor;

@Repository

public interface ScheduleParAppraisorRepository extends JpaRepository<ScheduleParAppraisor, String> {
	public List<ScheduleParAppraisor>findByParId(Par parId);

}
