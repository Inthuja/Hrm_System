package com.sgic.hrm.lms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.entity.AcceptLeaveRequest;
import com.sgic.hrm.lms.service.AcceptLeaveRequestService;

@RestController
@RequestMapping("/accept")
public class AcceptLeaveRequestController {

  @Autowired
  AcceptLeaveRequestService acceptLeaveRequestService;
  
  @GetMapping
  public List<AcceptLeaveRequest> getAllAcceptRequest() {
    return acceptLeaveRequestService.getAllAcceptLeaveRequests();
  }
}
