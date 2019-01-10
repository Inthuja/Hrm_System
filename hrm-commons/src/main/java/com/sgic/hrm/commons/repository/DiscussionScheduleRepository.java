package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.DiscussionSchedule;
import com.sgic.hrm.commons.entity.TerminationRequest;

public interface DiscussionScheduleRepository extends JpaRepository<DiscussionSchedule, Integer>{
	
	DiscussionSchedule findByTerminationRequest(TerminationRequest terminationRequest);
}
