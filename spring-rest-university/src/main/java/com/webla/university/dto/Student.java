package com.webla.university.dto;

public class Student {
	private int id;
	private String name;
	private String college;

	public Student() {
		//do-nothing
	}

	public Student(int id, String name, String college) {
		this.id = id;
		this.name = name;
		this.college = college;
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
