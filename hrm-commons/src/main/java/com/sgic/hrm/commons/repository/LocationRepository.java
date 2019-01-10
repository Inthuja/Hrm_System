package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	Location findLocationById(Integer id);
}
