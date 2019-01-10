package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;


public interface RefereeRepository extends JpaRepository<Referee, Integer> {
	List<Referee>findRefereeByUser(User user);
}
