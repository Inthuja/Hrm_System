package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.RejectedApplicant;

public interface RejectedApplicantRepository extends JpaRepository<RejectedApplicant, Integer> {

}
