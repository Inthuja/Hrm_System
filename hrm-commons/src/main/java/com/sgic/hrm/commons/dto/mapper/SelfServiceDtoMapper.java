package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.SelfServiceDto;
import com.sgic.hrm.commons.dto.SelfServiceSaveDto;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.SelfService;
import com.sgic.hrm.commons.entity.SelfServiceType;
import com.sgic.hrm.commons.entity.User;

public class SelfServiceDtoMapper {

  public static SelfService mapSelfServiceSaveDtoToSelfService(SelfServiceSaveDto selfServiceSaveDto) {
    SelfService selfService = new SelfService();
    SelfServiceType selfServiceType = new SelfServiceType();
    Department relevantDepartment = new Department();
    User user = new User();
    User relevantUser = new User();
    
    selfServiceType.setId(selfServiceSaveDto.getSelfServiceType());
    relevantDepartment.setId(selfServiceSaveDto.getRelevantDepartment());
    user.setId(selfServiceSaveDto.getUser());
    relevantUser.setId(selfServiceSaveDto.getRelevantIndividual());
    
    selfService.setId(selfServiceSaveDto.getId());
    selfService.setSelfServiceType(selfServiceType);
    selfService.setUser(user);
    selfService.setRelevantDepartment(relevantDepartment);
    selfService.setRelevantIndividual(relevantUser);
    selfService.setInformIndividual(selfService.isInformIndividual());
    selfService.setDescription(selfServiceSaveDto.getDescription());
    selfService.setAttachment(selfServiceSaveDto.getAttachment());
    selfService.setCreatedAt(selfServiceSaveDto.getCreatedAt());
    selfService.setStatus(selfServiceSaveDto.getStatus());
    selfService.setMessage(selfServiceSaveDto.getMessage());
    
    return selfService;
  }
  
  
  public static SelfService mapSelfServiceDtoToSelfService(SelfServiceDto selfServiceDto) {
	    SelfService selfService = new SelfService();
	    
	    selfService.setId(selfServiceDto.getId());
	    selfService.setSelfServiceType(selfServiceDto.getSelfServiceType());
	    selfService.setUser(selfServiceDto.getUser());
	    selfService.setRelevantDepartment(selfServiceDto.getRelevantDepartment());
	    selfService.setRelevantIndividual(selfServiceDto.getRelevantIndividual());
	    selfService.setInformIndividual(selfService.isInformIndividual());
	    selfService.setDescription(selfServiceDto.getDescription());
	    selfService.setAttachment(selfServiceDto.getAttachment());
	    selfService.setCreatedAt(selfServiceDto.getCreatedAt());
	    selfService.setStatus(selfServiceDto.getStatus());
	    selfService.setMessage(selfServiceDto.getMessage());
	    
	    return selfService;
	  }
}