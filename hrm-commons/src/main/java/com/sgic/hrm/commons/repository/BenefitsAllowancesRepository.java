package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.BenefitsAllowancesEntity;

public interface BenefitsAllowancesRepository extends JpaRepository<BenefitsAllowancesEntity, Integer>{

	@Query("SELECT ba FROM BenefitsAllowancesEntity ba WHERE ba.chartEntity.id = ?1 ")
	List<BenefitsAllowancesEntity> findByBenefitsId(Integer id);
}
