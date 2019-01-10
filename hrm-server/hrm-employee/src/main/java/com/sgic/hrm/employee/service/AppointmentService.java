package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.entity.AppointmentType;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.User;


public interface AppointmentService {
	boolean addAppointment(Appointment appointment,AppointmentType appointmentType,User user,Department department,Designation designation);
	List<Appointment> getAppointment();
//	boolean editDepartment(Department department,Integer id);
//	Optional<Department> getDepartmentId(Integer id);
//	boolean deleteDepartment(Integer id);
}
