package com.sgic.hrm.lms.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.commons.dto.AcceptCancelRequestDto;
import com.sgic.hrm.commons.dto.RejectCancelRequestDto;
import com.sgic.hrm.commons.entity.AcceptCancelRequest;
import com.sgic.hrm.commons.entity.CancelLeaveRequest;
import com.sgic.hrm.commons.entity.LeaveRequest;
import com.sgic.hrm.commons.entity.RejectCancelRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.commons.repository.AcceptCancelRequestRepository;
import com.sgic.hrm.commons.repository.CancelLeaveRequestRepository;
import com.sgic.hrm.commons.repository.LeaveRequestRepository;
import com.sgic.hrm.commons.repository.LoginRepository;
import com.sgic.hrm.commons.repository.RejectCancelRequestRepository;
import com.sgic.hrm.lms.service.CancelLeaveRequestService;
import com.sgic.hrm.lms.service.LeaveAllocationService;

@Service
public class CancelLeaveRequestServiceImpl implements CancelLeaveRequestService {

  @Autowired
  CancelLeaveRequestRepository cancelLeaveRequestRepository;
  @Autowired
  LeaveRequestRepository leaveRequestRepository;
  @Autowired
  LeaveAllocationService leaveAllocationService;
  @Autowired
  AcceptCancelRequestRepository acceptCancelRequestRepository;
  @Autowired
  RejectCancelRequestRepository rejectCancelRequestRepository;
  @Autowired
  LoginRepository loginRepository;

  @Override
  public boolean addCancelLeaveRequest(CancelLeaveRequest cancelLeaveRequest) {
    cancelLeaveRequest.setStatus(Status.PENDING);
    cancelLeaveRequestRepository.save(cancelLeaveRequest);
    return true;
  }

  @Override
  public boolean deleteCancelLeaveRequest(Integer id) {
    cancelLeaveRequestRepository.deleteById(id);
    return true;
  }

  @Override
  public boolean acceptCancelLeaveRequestStatus(AcceptCancelRequestDto acceptCancelRequestDto) {

    CancelLeaveRequest cancelLeaveRequest = cancelLeaveRequestRepository
        .findById(acceptCancelRequestDto.getCancelRequestId()).orElse(null);

    if (cancelLeaveRequest != null) {
      if (cancelLeaveRequest.getStatus() == Status.PENDING) {
        LeaveRequest leaveRequest = cancelLeaveRequest.getLeaveRequest();
        leaveRequest.setStatus(Status.CANCELED);
        leaveAllocationService.updateLeaveCount(leaveRequest);
        cancelLeaveRequest.setStatus(Status.ACCEPTED);
        cancelLeaveRequestRepository.save(cancelLeaveRequest);
        leaveRequestRepository.save(leaveRequest);
        AcceptCancelRequest acceptCancelRequest = new AcceptCancelRequest();
        acceptCancelRequest.setCancelLeaveRequest(cancelLeaveRequest);
        acceptCancelRequest.setAcceptedBy(
            loginRepository.findByUserName(acceptCancelRequestDto.getUserName()).getUser());
        acceptCancelRequestRepository.save(acceptCancelRequest);
        return true;
      }
    }
    return false;
  }

  @Override
  public List<CancelLeaveRequest> getAllCancelRequest() {
    return cancelLeaveRequestRepository.findAll();
  }

  @Override
  public List<CancelLeaveRequest> getPendingCancelRequest() {
    return cancelLeaveRequestRepository.findByStatus(Status.PENDING);
  }

  @Override
  public List<CancelLeaveRequest> getCancelRequestByUser(Integer userId) {

    return null;
  }

  @Override
  public boolean rejectCancelLeaveRequestStatus(RejectCancelRequestDto rejectCancelRequestDto) {

    CancelLeaveRequest cancelLeaveRequest = cancelLeaveRequestRepository
        .findById(rejectCancelRequestDto.getCancelRequestId()).orElse(null);

    if (cancelLeaveRequest != null) {
      if (cancelLeaveRequest.getStatus() == Status.PENDING) {
        cancelLeaveRequest.setStatus(Status.REJECTED);
        cancelLeaveRequestRepository.save(cancelLeaveRequest);
        RejectCancelRequest rejectCancelRequest = new RejectCancelRequest();
        rejectCancelRequest.setCancelLeaveRequest(cancelLeaveRequest);
        rejectCancelRequest.setRejectedBy(
            loginRepository.findByUserName(rejectCancelRequestDto.getUserName()).getUser());
        rejectCancelRequest.setReason(rejectCancelRequestDto.getRejectReason());
        rejectCancelRequestRepository.save(rejectCancelRequest);
        return true;
      }
    }
    return false;
  }

}
