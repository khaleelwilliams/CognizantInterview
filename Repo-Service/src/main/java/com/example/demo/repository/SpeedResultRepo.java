package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SpeedResult;

@Repository
public class SpeedResultRepo {

	@Autowired
	SpeedResultInt speedResult;
	
	public SpeedResult addSpeedResult(SpeedResult newSpeedResult) {
		System.out.println("[DEBUG] - Currently in Repo-Service, In SpeedResultRepository.addSpeedResult()...");
		speedResult.save(newSpeedResult);
		
		return newSpeedResult;
	}
}
