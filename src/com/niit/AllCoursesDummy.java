package com.niit;

import java.util.ArrayList;
import java.util.List;

public class AllCoursesDummy {

	private List<Course> allAvailableCourses;
	
	public List<Course> getAllCourses()
	{
		allAvailableCourses = new ArrayList<>();
		Course course1 = new Course();
		course1.setCourseName("History");
		Course course2 = new Course();
		course2.setCourseName("Mathematics");
		Course course3 = new Course();
		course3.setCourseName("Chemistry");
		Course course4 = new Course();
		course4.setCourseName("Physics");
		Course course5 = new Course();
		course5.setCourseName("Computer Science");
		Course course6 = new Course();
		course6.setCourseName("English");
		Course course7 = new Course();
		course7.setCourseName("Statistics");
		allAvailableCourses.add(course1);
		allAvailableCourses.add(course2);
		allAvailableCourses.add(course3);
		allAvailableCourses.add(course4);
		allAvailableCourses.add(course5);
		allAvailableCourses.add(course6);
		allAvailableCourses.add(course7);
		return allAvailableCourses;
	}
}
