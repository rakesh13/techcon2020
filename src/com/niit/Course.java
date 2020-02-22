package com.niit;

public class Course {

	private String courseName;
	private double fees;
	
	public Course()
	{
		this.fees = 45000.00;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
