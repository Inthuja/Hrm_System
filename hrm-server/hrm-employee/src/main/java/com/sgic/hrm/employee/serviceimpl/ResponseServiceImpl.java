package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.commons.entity.Response;
import com.sgic.hrm.commons.repository.ResponseRepository;
import com.sgic.hrm.employee.service.ResponseService;

@Service
public class ResponseServiceImpl implements ResponseService {

	@Autowired
	private ResponseRepository responseRepository;
	@Override
	public List<Response> viewResponse() {
		return responseRepository.findAll();
	}

	@Override
	public boolean addResponse(Response response) {
		responseRepository.save(response);
		return true;
	}

}
