package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.RepoService;

@RestController
@RequestMapping(value="api/experiment")
public class AggregateController {
	
	@Autowired
	RepoService repoService;
	
//	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<SpeedResult> addSpeedResult(@RequestBody SpeedResult newSpeedResult) {
//	System.out.println("[DEBUG] - Inside Repo-Service, In SpeedResultController.addSpeedResult()...");
//	
//	SpeedResult result = speedResult.addSpeedResult(newSpeedResult);
//	
//	return new ResponseEntity<SpeedResult>(result, HttpStatus.CREATED);
//	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addSpeedResult(@RequestBody Object newSpeedResult) {
	
	Object result = repoService.addSpeedResult(newSpeedResult);
	
	return new ResponseEntity<Object>(result, HttpStatus.CREATED);
	}
}
