package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.KeyActivity;


@Repository
public interface KeyActivityRepository extends JpaRepository<KeyActivity, Integer> {
	 KeyActivity findKeyActivityById(Integer id);
}
