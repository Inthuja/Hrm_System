package com.sgic.hrm.employee.par.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.par.ParAppraisor;
import com.sgic.hrm.commons.repository.par.ParAppraisorRepository;
import com.sgic.hrm.employee.par.service.ParAppraisorService;

@Service
public class ParAppraisorServiceImpl implements ParAppraisorService {

	@Autowired
	private ParAppraisorRepository parAppraisorRepository;

	@Override
	public List<ParAppraisor> getParAppraisor() {
		return parAppraisorRepository.findAll();
	}

	@Override
	public void createParAppraisor(ParAppraisor parAppraisor) {
		parAppraisorRepository.save(parAppraisor);

	}

	@Override
	public void updateParAppraisor(ParAppraisor parAppraisor, String id) {
		ParAppraisor existParAppraisor = findParAppraisorByAppraiserId(id);

		if (existParAppraisor != null) {
			parAppraisor.setAppraiserId(id);
			parAppraisorRepository.save(parAppraisor);
		}
	}

	@Override
	public void deleteParAppraisor(String id) {
		parAppraisorRepository.deleteById(id);

	}

	@Override
	public ParAppraisor findParAppraisorByAppraiserId(String appraiserId) {
		// TODO Auto-generated method stub
		return parAppraisorRepository.findParAppraisorByAppraiserId(appraiserId);
	}

}
