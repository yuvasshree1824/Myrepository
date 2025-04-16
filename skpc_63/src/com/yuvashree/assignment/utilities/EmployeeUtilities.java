package com.yuvashree.assignment.utilities;
import com.yuvashree.assignment.employees.*;
import com.yuvashree.assignment.employees.Employee;

public class EmployeeUtilities {

	public void printEmployeeDetails(Manager manager) {
		System.out.println("Name:"+manager.getName());
		System.out.println("ID:"+manager.getEmployeeId());
		System.out.println("Salary:"+manager.getSalary());
		System.out.println("Team size:"+manager.getTeamsize());
	}
	public void printEmployeeDetails(Developer developer) {
		System.out.println("Name:"+developer.getName());
		System.out.println("ID:"+developer.getEmployeeId());
		System.out.println("Salary:"+developer.getSalary());
		System.out.println("Programming Language:"+developer.getProgrammingLanguage());
	}
	public void giveRaisee(Employee employee,double percent) {
		double newsalary=employee.getSalary()*(1+percent/100);
		employee.setSalary(newsalary);
	}
}
