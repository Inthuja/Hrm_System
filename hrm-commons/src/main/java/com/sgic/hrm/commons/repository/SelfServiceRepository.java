package com.sgic.hrm.commons.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.hrm.commons.entity.SelfService;

public interface SelfServiceRepository extends JpaRepository<SelfService, Integer> {

  @Query("SELECT ss FROM SelfService ss WHERE ss.user.id = ?1")
  List<SelfService> findByUser(Integer id);
  
  List<SelfService> findByStatus(String status);
}
