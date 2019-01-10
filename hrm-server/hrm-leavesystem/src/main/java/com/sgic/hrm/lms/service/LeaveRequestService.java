package com.sgic.hrm.lms.service;

import java.util.List;
import com.sgic.hrm.commons.dto.AcceptLeaveDto;
import com.sgic.hrm.commons.dto.RejectLeaveDto;
import com.sgic.hrm.commons.entity.LeaveRequest;
import com.sgic.hrm.commons.enums.Status;


public interface LeaveRequestService {

  boolean addLeaveRequest(LeaveRequest leaveRequest,String userName);

  boolean acceptLeaveRequest(AcceptLeaveDto acceptLeaveDto);

  boolean rejectLeaveRequest(RejectLeaveDto rejectLeaveDto);

  boolean deleteLeaveRequest(Integer id);

  List<LeaveRequest> getLeaveRequestByUser(Integer userId);

  List<LeaveRequest> getAllLeaveRequest();

  List<LeaveRequest> getAllLeaveRequestByStatus(Status status);

}
