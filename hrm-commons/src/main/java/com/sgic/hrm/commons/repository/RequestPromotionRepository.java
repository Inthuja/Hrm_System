package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.RequestPromotion;

public interface RequestPromotionRepository extends JpaRepository<RequestPromotion, Integer>{
//	RequestPromotion findById(int id);
}
