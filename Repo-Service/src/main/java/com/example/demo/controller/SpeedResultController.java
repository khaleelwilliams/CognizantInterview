package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SpeedResult;
import com.example.demo.repository.SpeedResultRepo;

@RestController
@RequestMapping(value="api/experiment")
public class SpeedResultController {
	
	@Autowired
	SpeedResultRepo speedResult;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SpeedResult> addReimbursement(@RequestBody SpeedResult newSpeedResult) {
	System.out.println("[DEBUG] - Inside Repo-Service, In SpeedResultController.addSpeedResult()...");
	
	SpeedResult result = speedResult.addSpeedResult(newSpeedResult);
	
//	SpeedResult test = new SpeedResult("Math");
	
	return new ResponseEntity<SpeedResult>(result, HttpStatus.CREATED);
	}

}
