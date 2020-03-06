package com.example.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="DISTANCEUNIT-REPOSITORY", url="http://localhost:8001/api/convert")
public interface DistanceService {

	@GetMapping(value="/{from}/to/{to}")
	String getConversion(Double value, String from, String to);
	
}
