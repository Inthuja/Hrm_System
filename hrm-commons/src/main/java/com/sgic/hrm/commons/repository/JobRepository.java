package com.sgic.hrm.commons.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Job;
@Repository
public interface JobRepository extends JpaRepository<Job, Integer>{
	Job findJobById(Integer id);
}
