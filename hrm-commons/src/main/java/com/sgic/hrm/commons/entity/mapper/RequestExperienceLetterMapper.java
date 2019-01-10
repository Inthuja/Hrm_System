package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.RequestExperienceLetterDto;
import com.sgic.hrm.commons.dto.RequestExperienceLetterGetDto;
import com.sgic.hrm.commons.entity.RequestExperienceLetter;

public class RequestExperienceLetterMapper {

  /*
   * create single value rest api for post method. (User object is not needed and userId can accept for post method)
   * POST HttpMethod access this method
   */
  public static RequestExperienceLetterDto mapRequestExperienceLetter(RequestExperienceLetter requestExperienceLetter) {
    RequestExperienceLetterDto requestExperienceLetterDto = new RequestExperienceLetterDto();

    if(requestExperienceLetter != null) {
      requestExperienceLetterDto.setId(requestExperienceLetter.getId());
      requestExperienceLetterDto.setUser(UserMapper.mapUserDto(requestExperienceLetter.getUser()).getId());
      requestExperienceLetterDto.setNoOfCopy(requestExperienceLetter.getNoOfCopy());
      requestExperienceLetterDto.setReason(requestExperienceLetter.getReason());
      requestExperienceLetterDto.setCompetency(requestExperienceLetter.getCompetency());
      requestExperienceLetterDto.setStatus(requestExperienceLetter.getStatus());
      requestExperienceLetterDto.setCreatedAt(requestExperienceLetter.getCreatedAt());
    }
    return requestExperienceLetterDto;
  }
  
  /*
   * map all records of experience letter request including user object model for single object data
   */
  public static RequestExperienceLetterGetDto mapAllRequestExperienceLetter(RequestExperienceLetter requestExperienceLetter) {
    RequestExperienceLetterGetDto requestExperienceLetterGetDto = new RequestExperienceLetterGetDto();
    
    if(requestExperienceLetter != null) {
      requestExperienceLetterGetDto.setId(requestExperienceLetter.getId());
      requestExperienceLetterGetDto.setUser(requestExperienceLetter.getUser());
      requestExperienceLetterGetDto.setNoOfCopy(requestExperienceLetter.getNoOfCopy());
      requestExperienceLetterGetDto.setReason(requestExperienceLetter.getReason());
      requestExperienceLetterGetDto.setCompetency(requestExperienceLetter.getCompetency());
      requestExperienceLetterGetDto.setStatus(requestExperienceLetter.getStatus());
      requestExperienceLetterGetDto.setCreatedAt(requestExperienceLetter.getCreatedAt());
    }
    return requestExperienceLetterGetDto;
  }
  
  /*
   * get all list records of experience letter request including user object model
   * GET HttpMethod API access this method
   */  
  public static List<RequestExperienceLetterGetDto> mapRequestExperienceLetterList(List<RequestExperienceLetter> requestExperienceLetterList) {
    List<RequestExperienceLetterGetDto> requestExperienceLetterGetDtoList = new ArrayList<RequestExperienceLetterGetDto>();
    
    if(requestExperienceLetterList != null) {
      for(RequestExperienceLetter requestExperienceLetter : requestExperienceLetterList) {
        requestExperienceLetterGetDtoList.add(mapAllRequestExperienceLetter(requestExperienceLetter));
      }
    }
    return requestExperienceLetterGetDtoList;
  }
}
