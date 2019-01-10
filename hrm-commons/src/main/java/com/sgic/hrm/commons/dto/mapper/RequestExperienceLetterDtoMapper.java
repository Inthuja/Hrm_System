package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.RequestExperienceLetterDto;
import com.sgic.hrm.commons.entity.RequestExperienceLetter;
import com.sgic.hrm.commons.entity.User;

public class RequestExperienceLetterDtoMapper {

  /*
   * post method using direct foreign key id
   * this method can be referred directly from the controller
   * no need to provide any foreign key object data for POST method
   */
  public static RequestExperienceLetter mapRequestExperienceLetter(RequestExperienceLetterDto requestExperienceLetterDto) {
    RequestExperienceLetter requestExperienceLetter = new RequestExperienceLetter();
    User user = new User();
    user.setId(requestExperienceLetterDto.getUser());
    
    if (requestExperienceLetterDto.getNoOfCopy() != null) {
      requestExperienceLetter.setId(requestExperienceLetterDto.getId());
      requestExperienceLetter.setUser(user);
      requestExperienceLetter.setNoOfCopy(requestExperienceLetterDto.getNoOfCopy());
      requestExperienceLetter.setReason(requestExperienceLetterDto.getReason());
      requestExperienceLetter.setCompetency(requestExperienceLetterDto.getCompetency());
      requestExperienceLetter.setStatus(requestExperienceLetterDto.getStatus());
      requestExperienceLetter.setCreatedAt(requestExperienceLetterDto.getCreatedAt());
    }
    return requestExperienceLetter;
  }
  
  /*
   * to retrieve the list of request experience letter object data only without any foreign key objects
   */
  public static List<RequestExperienceLetter> mapRequestExperienceLetterList(List<RequestExperienceLetterDto> requestExperienceLetterDtoList) {
    List<RequestExperienceLetter> requestExperienceLetterList = new ArrayList<RequestExperienceLetter>();
    if (requestExperienceLetterDtoList != null) {
      for(RequestExperienceLetterDto requestExperienceLetterDto : requestExperienceLetterDtoList) {
        requestExperienceLetterList.add(mapRequestExperienceLetter(requestExperienceLetterDto));
      }
    }
    return requestExperienceLetterList;
  }
  
}
