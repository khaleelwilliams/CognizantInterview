package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Entity
@Table(name="speed_result")
public class SpeedResult implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	
	@Column(name="subject_name")
	private String subjectName;
	
//	@Transient
	@Embedded
	private Speed speed;
	
	@Column(name="experiment_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Timestamp experimentTime;

	public SpeedResult() {
		
	}
	
	public SpeedResult(String subjectName) {
		super();
		this.subjectName = subjectName;
		}
	
	public SpeedResult(Long id, String subjectName, Timestamp experimentTime) {
	super();
	this.id = id;
	this.subjectName = subjectName;
	this.experimentTime = experimentTime;
	}

	public SpeedResult(Long id, String subjectName, Speed speed, Timestamp experimentTime) {
		super();
		this.id = id;
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

	public Timestamp getExperimentTime() {
		return experimentTime;
	}

	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SpeedResult [id=" + id + ", subjectName=" + subjectName + ", speed=" + speed + ", experimentTime="
				+ experimentTime + "]";
	}
	
}
