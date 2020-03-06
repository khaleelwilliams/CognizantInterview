package com.example.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.SpeedResult;

@FeignClient(name="repo-service", url="http://localhost:8080/api/experiment")
public interface RepoService {
	
	@PostMapping
	SpeedResult addSpeedResult(SpeedResult speed);
}
