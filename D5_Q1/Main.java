package com.D5_Q1;

import java.util.Scanner;

public class Main {

   public static Employee getEmployeeDetails() {
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int id = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter Name:");
		String name = input.nextLine();
		  
		System.out.println("Enter Salary:");
		double salary = input.nextDouble();
		
		
		Employee e1 = new Employee();
		e1.setEmployeeId(id);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
       
		
		
//		System.out.println(e1.employeeId);
		return e1;
	}
   
   
	public static int getPFpercentage() {
			
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter PF percentage:");
		int pfPercentage = input.nextInt();
	
		return pfPercentage;
	}
	
	
	public static void main(String[] args) {
		
		
		Employee e = Main.getEmployeeDetails();
		int pfPercentage = Main.getPFpercentage();
		 
		e.calculateNetSalary(pfPercentage);
		
	
//		System.out.println(data);
		
		System.out.println("Id:" + e.getEmployeeId());
		System.out.println("Name:" + e.getEmployeeName());
		System.out.println("Salary:" + e.getSalary());
		System.out.println("Net Salary: " + e.getNetSalary());
		
		
		
		
		
	}
}
