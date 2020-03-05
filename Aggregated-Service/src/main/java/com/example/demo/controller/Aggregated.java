package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SpeedResult;


@RestController
@RequestMapping(value="/api/experiment")
public class Aggregated {
	
	//create a connection with repo microservice 
	//import SpeedResultInt which gives the ability to Access the Repository
	//import SpeedResult class gives the ability to handle SpeedResult objects
	
	@Autowired
	SpeedResultInt speedRepo;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public SpeedResult getSpeedResult(@RequestParam(name = "subjectName") String subjectName,
			@RequestParam(name = "convertTo")  String convertTo) {
		
		//Connect with Repo microservice 
	    //SpeedResult result = speedRepo.;	
	    
	    if(result == null) {
	    	return null;//throw error here
	    }
	    
	    return result;
	}
	
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SpeedResult> addSpeedResult(@RequestBody SpeedResult newSpeedResult) {
		
		SpeedResult speed = speedRepo.save(newSpeedResult);
		if (speed == null ) {
			//throw exception
		}
		
		return new ResponseEntity<SpeedResult>(speed, HttpStatus.CREATED); 
	}
}
