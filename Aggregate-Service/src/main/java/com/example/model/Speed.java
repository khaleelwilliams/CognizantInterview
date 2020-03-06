package com.example.model;

import java.time.Duration;

public class Speed {
	
	private Duration duration;
	
	private Distance distance;

	public Speed() {
		
	}
	
	public Speed(Duration duration, Distance distance) {
		super();
		this.duration = duration;
		this.distance = distance;
	}
	
	
}
