package com.example.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SpeedResult implements Serializable{
	
	private Long id;
	
	private String subjectName;
	
	private Speed speed;
	
	private Timestamp experimentTime;
}
