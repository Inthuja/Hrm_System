package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.TerminationRequest;
import com.sgic.hrm.commons.enums.Status;

public interface TerminationRequestRepository extends JpaRepository<TerminationRequest, Integer>{
	
	List<TerminationRequest> findByStatus(Status status);

}
