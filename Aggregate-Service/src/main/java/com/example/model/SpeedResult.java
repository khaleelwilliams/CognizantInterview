package com.example.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SpeedResult implements Serializable{
	
	private Long id;
	
	private String subjectName;
	
	private Speed speed;
	
	private Timestamp experimentTime;

	
	public SpeedResult() {
		
	}
	
	public SpeedResult(String subjectName) {
		super();
		this.subjectName = subjectName;
	}


	public SpeedResult(String subjectName, Speed speed, Timestamp experimentTime) {
		super();
		this.subjectName = subjectName;
		this.speed = speed;
		this.experimentTime = experimentTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public Timestamp getExperimentTime() {
		return experimentTime;
	}

	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}

	@Override
	public String toString() {
		return "SpeedResult [id=" + id + ", subjectName=" + subjectName + ", speed=" + speed + ", experimentTime="
				+ experimentTime + "]";
	}
	
	
	
}
