package com.example.demo.model;

public class Distance {
	
	private DistanceUnit distanceUnit;
	private Double unit;
	
	
	public Distance() {
		
	}
	
	public Distance(DistanceUnit distanceUnit, Double unit) {
		this.distanceUnit = distanceUnit;
		this.unit = unit;
	}
	
	public void setDistance(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	
	public void setUnit(Double unit) {
		this.unit = unit;
	}
	
	public Double getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		return "Distance [distanceUnit=" + distanceUnit + ", unit=" + unit + "]";
	}
	
	
}
