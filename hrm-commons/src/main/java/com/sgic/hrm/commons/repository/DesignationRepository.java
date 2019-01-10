package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Integer> {
	Designation findDesignationById(Integer id);
}
