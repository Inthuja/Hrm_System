package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.SalaryChartEntity;

public interface SalaryChartRepository extends JpaRepository<SalaryChartEntity, Integer> {

	@Query("SELECT sc FROM SalaryChartEntity sc WHERE sc.empName LIKE ?1%")
	List<SalaryChartEntity> findByEmpName(String name);
}
