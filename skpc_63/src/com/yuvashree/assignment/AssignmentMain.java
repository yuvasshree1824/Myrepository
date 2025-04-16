package com.yuvashree.assignment;
import com.yuvashree.assignment.employees.*;
import com.yuvashree.assignment.utilities.*;
public class AssignmentMain {
	public static void main(String[]args) {
		Manager manager=new Manager("YuvaShree","M001",9000,4);
		Developer developer=new Developer("Moni","M002",10000,"java");
		EmployeeUtilities util=new EmployeeUtilities();
		System.out.println("Manager Details:");
		util.printEmployeeDetails(manager);
		util.giveRaisee(manager, 15);
		System.out.println("\nDevelopers Details:");
		util.printEmployeeDetails(developer);
		util.giveRaisee(developer, 15);
		System.out.println("\nAfter Raises:");
		util.printEmployeeDetails(manager);
		util.printEmployeeDetails(developer);
		
	}

}
