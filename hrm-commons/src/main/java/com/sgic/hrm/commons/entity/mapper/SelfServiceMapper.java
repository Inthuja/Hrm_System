package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.SelfServiceDto;
import com.sgic.hrm.commons.entity.SelfService;

public class SelfServiceMapper {

  public static SelfServiceDto mapSelfServiceToSelfServiceDto(SelfService selfService) {
    SelfServiceDto selfServiceDto = new SelfServiceDto();

    selfServiceDto.setId(selfService.getId());
    selfServiceDto.setSelfServiceType(selfService.getSelfServiceType());
    selfServiceDto.setUser(selfService.getUser());
    selfServiceDto.setRelevantDepartment(selfService.getRelevantDepartment());
    selfServiceDto.setRelevantIndividual(selfService.getRelevantIndividual());
    selfServiceDto.setInformIndividual(selfServiceDto.isInformIndividual());
    selfServiceDto.setDescription(selfService.getDescription());
    selfServiceDto.setAttachment(selfService.getAttachment());
    selfServiceDto.setCreatedAt(selfService.getCreatedAt());
    selfServiceDto.setStatus(selfService.getStatus());
    selfServiceDto.setMessage(selfService.getMessage());

    return selfServiceDto;
  }

  public static List<SelfServiceDto> mapSelfServiceListToSelfServiceDtoList(List<SelfService> selfServiceList) {
    List<SelfServiceDto> selfServiceDtoList = new ArrayList<SelfServiceDto>();

    if (selfServiceList != null) {
      for (SelfService selfService : selfServiceList) {
        selfServiceDtoList.add(mapSelfServiceToSelfServiceDto(selfService));
      }
    }
    return selfServiceDtoList;
  }

}
