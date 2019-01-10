package com.sgic.hrm.employee;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Date;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.commons.entity.Applicant;
import com.sgic.hrm.employee.service.ApplicantService;
import com.sgic.hrm.employee.service.JobService;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicantServiceTest {
	
	@Autowired
	ApplicantService applicantService;
	
	@Autowired
	JobService jobService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddApplicant() {
		Applicant testApplicant = new Applicant();
		testApplicant.setAddress("TestAddress");
		testApplicant.setDateOfBirth(new Date(new java.util.Date().getTime()));
		testApplicant.setFullName("TestFullname");
		testApplicant.setCvFile(new File("C:\\Users\\Inthuja\\Documents\\Add-in Express\\adxregistrator.log"));
		testApplicant.setJob(jobService.getJobId(1).get());
		applicantService.addApplicant(testApplicant);
		
		
	}

	@Test
	public void testGetAllApplicant() {
		List<Applicant> test = applicantService.getAllApplicant();
		assertThat(test, not(IsEmptyCollection.empty()));
	}

	@Test
	public void testEditApplicant() {
		Applicant applicant= applicantService.getById(1);
		applicant.setFullName("NameChanged");
		
		applicantService.editApplicant(applicant, applicant.getId());
		
		Applicant assertApp= applicantService.getById(applicant.getId());
		
		assertEquals("NameChanged", assertApp.getFullName());
	}

	@Test
	public void testDeleteApplicant() {
		testAddApplicant();
		List<Applicant> test = applicantService.getAllApplicant();
		System.out.println("The Id is "+ test.get(0).getId());
		applicantService.deleteApplicant(test.get(0).getId());
	}

	@Test
	public void testGetById() {
		
		Applicant assertApp= applicantService.getById(1);
	}

}
