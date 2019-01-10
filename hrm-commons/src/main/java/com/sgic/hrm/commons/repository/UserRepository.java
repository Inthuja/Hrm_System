package com.sgic.hrm.commons.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserById(Integer id);

//
//	@Query("select usr from User as usr where usr.fullName LIKE '%'|| ?1 ||'%' ")
//  public List<User> findAllUsersByName(String name);
//
//  @Query("select usr from User as usr where usr.appointmentId.appoinmentDate = ?1 ")
//  public List<User> findUsersByAppointmentDate(Date date);
//
//  @Query("select usr from User as usr where usr.appointmentId.designationId.designationName LIKE '%'|| ?1 ||'%' ")
//  public List<User> findAllUsersByDesignation(String designation);
//
//  @Query("select usr from User as usr where usr.appointmentId.designationId.designationName LIKE '%'|| ?1 ||'%' AND usr.fullName LIKE '%'|| ?2 ||'%' ")
//  public List<User> findAllUsersByDesignationAndName(String designation, String name);
//
//  @Query("select usr from User as usr where usr.appointmentId.designationId.designationName LIKE '%'|| ?1 ||'%' AND usr.appointmentId.appoinmentDate = ?2  ")
//  public List<User> findAllUsersByDesignationAndAppointmentDate(String designation, Date date);
//
//  @Query("select usr from User as usr where usr.appointmentId.appoinmentDate = ?1  AND usr.fullName LIKE '%'|| ?2 ||'%' ")
//  public List<User> findAllUsersByAppointmentDatenAndName(Date date, String name);
//
//  @Query("select usr from User as usr where usr.appointmentId.appoinmentDate = ?1  AND usr.fullName LIKE '%'|| ?2 ||'%'  AND usr.appointmentId.designationId.designationName LIKE '%'|| ?3 ||'%' ")
//  public List<User> findAllUsersByAppointmentDatenAndNameAndDesignation(Date date, String name,String designation);

}
