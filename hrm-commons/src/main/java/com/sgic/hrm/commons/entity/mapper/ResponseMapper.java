package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.ResponseDto;
import com.sgic.hrm.commons.entity.Response;

public class ResponseMapper {

  public static ResponseDto mapResponseToResponseDto(Response response) {
    ResponseDto responseDto = new ResponseDto();
    
    responseDto.setId(response.getId());
    responseDto.setRelevantDepartment(response.getRelevantDepartment());
    responseDto.setRelevantIndividual(response.getRelevantIndividual());
    responseDto.setSelfService(response.getSelfService());
    responseDto.setResponseMessage(response.getResponseMessage());
    responseDto.setCreatedAt(response.getCreatedAt());
    responseDto.setAttachment(response.getAttachment());
    
    return responseDto;
  }
  
//  public static List<ResponseDto> mapResponseToResponseDto(List<Response> responseList){
//    List<ResponseDto> responseDtoList = new ArrayList<ResponseDto>();
//    
//    if(responseList != null) {
//      for(Response response : responseList) {
//        responseDtoList.add(mapResponseToResponseDto(response));
//      }
//    }
//    return responseDtoList;
//  }
}
