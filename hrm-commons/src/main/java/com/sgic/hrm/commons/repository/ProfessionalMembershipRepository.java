package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.ProfessionalMembership;
import com.sgic.hrm.commons.entity.User;

@Repository
public interface ProfessionalMembershipRepository extends JpaRepository<ProfessionalMembership, Integer> {
	List<ProfessionalMembership>findByUser(User user);
}
