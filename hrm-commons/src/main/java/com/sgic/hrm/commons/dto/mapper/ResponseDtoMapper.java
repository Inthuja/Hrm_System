package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ResponseDto;
import com.sgic.hrm.commons.dto.ResponseSaveDto;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Response;
import com.sgic.hrm.commons.entity.SelfService;
import com.sgic.hrm.commons.entity.User;

public class ResponseDtoMapper {

	public static Response mapResponseDtoToResponse(ResponseSaveDto responseSaveDto) {
		Response response = new Response();
		Department relevantDepartment = new Department();
		User relevantIndividual = new User();
		SelfService selfService = new SelfService();

		relevantDepartment.setId(responseSaveDto.getId());
		relevantIndividual.setId(responseSaveDto.getRelevantIndividual());
		selfService.setId(responseSaveDto.getSelfService());

		response.setId(responseSaveDto.getId());
		response.setAttachment(responseSaveDto.getAttachment());
		response.setRelevantDepartment(relevantDepartment);
		response.setRelevantIndividual(relevantIndividual);
		response.setResponseMessage(responseSaveDto.getResponseMessage());
		response.setSelfService(selfService);
		response.setCreatedAt(responseSaveDto.getCreatedAt());

		return response;
	}

	public static Response mapResponseDtoJsonToResponseJson(ResponseDto responseDto) {
		SelfService selfService = new SelfService();
		selfService.setId(responseDto.getId());
		
		Response response = new Response();
		response.setId(responseDto.getId());
		response.setAttachment(responseDto.getAttachment());
		response.setRelevantDepartment(responseDto.getRelevantDepartment());
		response.setRelevantIndividual(responseDto.getRelevantIndividual());
		response.setResponseMessage(responseDto.getResponseMessage());
		response.setSelfService(selfService);
		response.setCreatedAt(responseDto.getCreatedAt());

		return response;
	}
}
