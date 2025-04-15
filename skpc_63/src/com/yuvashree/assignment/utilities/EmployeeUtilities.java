package com.yuvashree.assignment.utilities;

import com.yuvashree.assignment.employees.Employee;

public class EmployeeUtilities {

	public void printEmployeeDetails(Employee employee) {
		System.out.println("Name:"+employee.getName());
		System.out.println("ID:"+employee.getEmployeeId());
		System.out.println("Salary:"+employee.getSalary());
		
	}
	public void giveRaisee(Employee employee,double percent) {
		double newsalary=employee.getSalary()*(1+percent/100);
		employee.setSalary(newsalary);
	}
}
