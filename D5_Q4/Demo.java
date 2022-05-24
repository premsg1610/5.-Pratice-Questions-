package com.D5_Q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("No of Students objects to be created:");
		int numOfStudents = input.nextInt();
		
		Student[] studentObjArray = new Student[numOfStudents];
		
		Scanner details = new Scanner(System.in);
		
		for(int i=0; i<numOfStudents; i++)
		{
//			details.nextLine(); is not used because we not use it when it is executed first.
			System.out.println("Enter Student Name:");
			String name = details.nextLine();
			
			System.out.println("Enter Student Roll No:");
			int roll = details.nextInt();
			
			System.out.println("Enter Student Marks:");
			int marks = details.nextInt();
			
			details.nextLine();
			System.out.println("Enter Student Address:");
			String address = details.nextLine();
			
			Student s1 = new Student();
			s1.setName(name);
			s1.setRoll(roll);
			s1.setMarks(marks);
			s1.setAddress(address);
			
			
			studentObjArray[i] = s1;
		}
		
//		System.out.println(studentObjArray[0]);
//		System.out.println(studentObjArray[1]);
		
		
//		to print the details of each student:
		for(int i=0; i<numOfStudents; i++)
		{
			System.out.println("======================");
			System.out.println();
			System.out.println("Student name: " + studentObjArray[i].getName());
			System.out.println("Student roll no: " + studentObjArray[i].getRoll());
			System.out.println("Student marks: " + studentObjArray[i].getMarks());
			System.out.println("Student address: " + studentObjArray[i].getAddress());
			System.out.println("======================");
			System.out.println();
		}
		
//		to find the average of marks of all student:
		int totalMarks = 0;
		for(Student item: studentObjArray) {
			totalMarks += item.getMarks();
		}
		
		int avgMarks = totalMarks/studentObjArray.length ;
		System.out.println(avgMarks);
	}
}
