package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.SelfServiceTypeDto;
import com.sgic.hrm.commons.entity.SelfServiceType;

public class SelfServiceTypeMapper {

  public static SelfServiceTypeDto mapSelfServiceTypeToSelfServiceTypeDto(SelfServiceType selfServiceType) {
    SelfServiceTypeDto selfServiceTypeDto = new SelfServiceTypeDto();
    
    selfServiceTypeDto.setId(selfServiceType.getId());
    selfServiceTypeDto.setSelfServiceTypeName(selfServiceType.getSelfServiceTypeName());
        
    return selfServiceTypeDto; 
  }
  
  public static List<SelfServiceTypeDto> mapSelfServiceTypeListToSelfServiceTypeDtoList(List<SelfServiceType> selfServiceTypeList){
    List<SelfServiceTypeDto> selfServiceTypeDtoList = new ArrayList<SelfServiceTypeDto>();
    
    if(selfServiceTypeList != null) {
      for(SelfServiceType selfServiceType : selfServiceTypeList) {
        selfServiceTypeDtoList.add(mapSelfServiceTypeToSelfServiceTypeDto(selfServiceType));
      }
    }
    return selfServiceTypeDtoList;
  }
}
