package com.D5_Q1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void calculateNetSalary(int pfpercentage) {
		
	}
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	
	public static Employee getEmployeeDetails() {
		
		Employee e1 = new Employee();
		e1.employeeId = e1.getEmployeeId();
		e1.employeeName = e1.getEmployeeName();
		e1.salary = e1.getSalary();
		
//		System.out.println(e1.employeeId);
		return e1;
	}
}
