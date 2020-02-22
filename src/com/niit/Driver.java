package com.niit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		StudentEnrollment enrolledStudent = new StudentEnrollment();
		Student std = enrolledStudent.getEnrolledStudent();
		System.out.println("Name : "+std.getFirstName()+" "+std.getLastName());
		System.out.println("ID : "+std.getId());
		System.out.println("Enrolled In : ");
		for(Course course : std.getCoursesEnrolled())
		{
			System.out.println(course.getCourseName());
		}
		System.out.println("Total Tuition Fees : Rs. "+enrolledStudent.getTotalCourseAmount());
		System.out.println("Thank you for your payment of : Rs. "+std.getAmountPaid());
		System.out.println("Your Balance is : Rs."+enrolledStudent.getRemainingAmount());
		
		
	}

}
