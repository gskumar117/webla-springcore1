package com.webla.spring.annotations.search.student;

public class Student {
	
	private int rollNumber;
	private String name;
	private int percentage;
	
	public Student(int rollNumber, String name, int percentage) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getPercentage() {
		return percentage;
	}

}
