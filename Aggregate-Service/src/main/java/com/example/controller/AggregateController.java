package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.SpeedResult;
import com.example.repository.RepoService;

@RestController
@RequestMapping(value="api/experiment")
public class AggregateController {
	
	@Autowired
	RepoService repoService;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SpeedResult> addSpeedResult(@RequestBody SpeedResult newSpeedResult) {
	
	SpeedResult result = repoService.addSpeedResult(newSpeedResult);
	
	return new ResponseEntity<SpeedResult>(result, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/{from}/to/{to}")
	public Double getConversion(@RequestParam Double unit, @PathVariable String from, @PathVariable String to) {
		
		
		
	return unit;
	}
}
