package com.sgic.hrm.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.CarryforwardObjectData;
import com.sgic.hrm.commons.entity.CarryforwardRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.commons.repository.CarryforwardRequestRepository;
import com.sgic.hrm.lms.service.CarryforwardRequestService;
import com.sgic.hrm.lms.service.LoginService;

@Service
public class CarryforwardRequestServiceImpl implements CarryforwardRequestService{

	@Autowired
	CarryforwardRequestRepository carryforwardRequestRepository;
	
	@Autowired
	LoginService loginService;
	
	
	@Override
	public List<CarryforwardRequest> viewAllCarryforwardRequest() {
		return carryforwardRequestRepository.findAll(); 
	}

	@Override
	public boolean createCarryforwardRequest(CarryforwardObjectData carryforwardObjectData) {
		if(carryforwardObjectData != null) {
			CarryforwardRequest carryforwardRequest= new CarryforwardRequest();
			carryforwardRequest.setStatus(Status.PENDING);
			carryforwardRequest.setUser(loginService.getUser(carryforwardObjectData.getUserName()));
			carryforwardRequest.setCarryForwardDays(carryforwardObjectData.getCarryforwardDays());
			carryforwardRequestRepository.save(carryforwardRequest);
			return true;
		}
		return false;
	}

}
