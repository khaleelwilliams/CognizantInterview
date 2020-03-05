package com.example.demo.model;

import java.sql.Timestamp;
import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="speed")
public class SpeedResult {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="subjectName")
	private String subjectName;
	
	@Column(name="speed")
	private Speed speed;
	
	@Column(name="speed")
	private Timestamp experimentTime;
	

}

class Speed {
	
	private Duration dureation;
	private Distance  distance;
}

class Distance {
	private DistanceUnit distanceUnit;
	private Double unit;
}

enum DistanceUnit {
//	Millimeters("millimeters"),
//	Centimeters("centimeters"),
//	Meters("meters"),
//	Kilometers("kilometers"),
//	Inches("inches"),
//	Feet("feet"),
//	Yards("yards"),
//	Miles("miles")
}