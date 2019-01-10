package com.sgic.hrm.employee.remuneration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.BenefitsAllowancesEntity;
import com.sgic.hrm.commons.repository.BenefitsAllowancesRepository;
import com.sgic.hrm.employee.remuneration.service.BenefitsAllowancesService;

@Service
public class BenefitsAllowancesServiceImpl implements BenefitsAllowancesService {

	@Autowired
	BenefitsAllowancesRepository benefitsAllowancesRepository;

	
	@Override
	public List<BenefitsAllowancesEntity> getBenefitsAllowances() {
		// TODO Auto-generated method stub
		return benefitsAllowancesRepository.findAll();
	}

	@Override
	public BenefitsAllowancesEntity viewById(Integer id) {
		// TODO Auto-generated method stub
		return benefitsAllowancesRepository.getOne(id);
	}

	@Override
	public List<BenefitsAllowancesEntity> viewByChatId(Integer id) {
		// TODO Auto-generated method stub
		return benefitsAllowancesRepository.findByBenefitsId(id);
	}





}
