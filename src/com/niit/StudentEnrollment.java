package com.niit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrollment {

	private Student std;
	private String usrCourse;
	public Student getEnrolledStudent()
	{
		std = new Student();
		List<Course> coursesEnrolled = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		AllCoursesDummy acd = new AllCoursesDummy();
		System.out.println("Enter Student First Name");
		String fName = new Scanner(System.in).next();
		System.out.println("Enter Student Last Name");
		String lName = new Scanner(System.in).next();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		List<Course> allCourses = acd.getAllCourses();
		System.out.println("Select from the available courses");
		for(Course course : allCourses)
		{
			System.out.println(course.getCourseName());
		}
		do
		{
			System.out.println("Enter Course to enrol (Q to quit)");
			usrCourse = sc.next();
			
			if(!(usrCourse.equals("q") || usrCourse.equals("Q")))
			{
				Course c = new Course();
				c.setCourseName(usrCourse);
				coursesEnrolled.add(c);
			}
				
		}while(!(usrCourse.equals("Q")||usrCourse.equals("q")));
		System.out.println("Enter Payment");
		double amt = sc.nextDouble();
		std.setFirstName(fName);
		std.setLastName(lName);
		std.setCoursesEnrolled(coursesEnrolled);
		std.setAmountPaid(amt);
		std.setYear(year);
		return std;
	}
	
	public double getRemainingAmount()
	{
		double amt,totalAmt;
		totalAmt = getTotalCourseAmount();
		amt = totalAmt - std.getAmountPaid();
		return amt;
				
	}
	
	public double getTotalCourseAmount()
	{
		return std.getCoursesEnrolled().size()*new Course().getFees();
	}
}
