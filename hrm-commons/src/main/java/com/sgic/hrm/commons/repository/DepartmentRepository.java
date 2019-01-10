package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

	Department findDepartmentById(Integer id);
}
