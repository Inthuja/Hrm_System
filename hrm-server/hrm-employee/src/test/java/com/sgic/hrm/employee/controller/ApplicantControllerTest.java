package com.sgic.hrm.employee.controller;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.commons.entity.Applicant;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApplicantControllerTest {
	
	@LocalServerPort
	int port;
	
	@Autowired
    private TestRestTemplate restTemplate;

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
    public void greetingShouldReturnDefaultMessage() throws Exception {
		
		ResponseEntity<List<Applicant>> response = restTemplate.exchange(
		  "http://localhost:8080/hrm_system/applicant/",
		  HttpMethod.GET,
		  null,
		  new ParameterizedTypeReference<List<Applicant>>(){});
		List<Applicant> applicants = response.getBody();
		System.out.println("Name is :" + applicants.get(0).getFullName());
    }
}
