package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.employee.service.LocationService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@PostMapping("/location")
	public HttpStatus AddLocation(@RequestBody Location location) {
		boolean test=locationService.addLocation(location);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@GetMapping("/location")
	public ResponseEntity<List<Location>>GetLocation(){
		List<Location> locations= locationService.getLocation();
		ResponseEntity<List<Location>> responseEntity=new ResponseEntity<>(locations , HttpStatus.OK);
		return responseEntity;
	}
	@PutMapping("location/{id}")
	public HttpStatus ModifyLocation(@PathVariable Integer id,@RequestBody Location location) {
		boolean test=locationService.editLocation(location, id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("location/{id}")
	public HttpStatus DeleteLocation(@PathVariable Integer id) {
		boolean test=locationService.deleteLocation(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
}
