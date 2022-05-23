package com.D5_Q1;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Id:");
		int id = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter Name:");
		String name = input.nextLine();
		
		System.out.println("Enter Salary:");
		double salary = input.nextDouble();
		
		System.out.println("Enter PF percentage:");
		int pf = input.nextInt();
		
		Employee e1 = new Employee();
		
		e1.setEmployeeId(id);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
		
		Employee data = e1.getEmployeeDetails();
				System.out.println(data);
		
//		System.out.println("Name:" + data.employeeName);
		
		
		
		
	}
}
