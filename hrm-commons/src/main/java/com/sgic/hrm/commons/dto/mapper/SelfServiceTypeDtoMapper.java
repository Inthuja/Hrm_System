package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.SelfServiceTypeDto;
import com.sgic.hrm.commons.entity.SelfServiceType;

public class SelfServiceTypeDtoMapper {

  public static SelfServiceType mapSelfServiceTypeDtoToSelfServiceType(SelfServiceTypeDto selfServiceTypeDto) {
    SelfServiceType selfServiceType = new SelfServiceType();
    
    selfServiceType.setId(selfServiceTypeDto.getId());
    selfServiceType.setSelfServiceTypeName(selfServiceTypeDto.getSelfServiceTypeName());
    
    return selfServiceType;
  }
}
