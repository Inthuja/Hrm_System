package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {

}
