package com.webla.starter.dto;

public class College {
	private int id;
	private String name;
	private String location;
	private boolean isAutonomous;
	
	public boolean isAutonomous() {
		return isAutonomous;
	}

	public void setAutonomous(boolean isAutonomous) {
		this.isAutonomous = isAutonomous;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
