package com.niit;

import java.util.List;
import java.util.Random;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private int year;
	private double amountPaid;
	private List<Course> coursesEnrolled;
	
	public Student()
	{
		id = 10000 + new Random().nextInt(90000);
	}

	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Course> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public void setCoursesEnrolled(List<Course> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}

	public int getId() {
		return id;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
}
