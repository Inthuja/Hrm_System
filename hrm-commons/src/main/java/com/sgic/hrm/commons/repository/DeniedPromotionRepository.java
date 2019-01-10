package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.DeniedPromotion;

public interface DeniedPromotionRepository  extends JpaRepository<DeniedPromotion, Integer>{

}
