package com.sgic.hrm.employee.remuneration.service;

import java.util.List;

import com.sgic.hrm.commons.entity.BenefitsAllowancesEntity;

public interface BenefitsAllowancesService {

	List<BenefitsAllowancesEntity> getBenefitsAllowances();

	BenefitsAllowancesEntity viewById(Integer id);
	
	List<BenefitsAllowancesEntity> viewByChatId(Integer id);
}
