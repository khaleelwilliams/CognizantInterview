package com.example.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="repo-service", url="http://localhost:8080/api/experiment")
public interface RepoService {
	
	@PostMapping
	Object addSpeedResult(Object speed);
}
