package com.example.demo.model;

import java.time.Duration;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Speed {
	
	private Duration duration;
	
	@Embedded
	private Distance distance;
	
	public Speed () {
		
	}
	
	public Speed (Duration duration, Distance distance) {
		this.duration = duration;
		this.distance = distance;
	}
	
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	
	public Duration getDuration() {
		return duration;
	}
	
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
	
	public Distance getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Speed [duration=" + duration + ", distance=" + distance + "]";
	}
	
}
