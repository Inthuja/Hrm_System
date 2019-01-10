package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.AppointmentType;

@Repository
public interface AppointmentTypeRepository extends JpaRepository<AppointmentType, Integer> {
	AppointmentType findAppointmentTypeById(Integer id);
}
