package com.yuvashree.assignment.employees;

public class Manager extends Employee{
	private int teamsize;
	public Manager(String name,String employeeId,double salary,int teamsize) {
		super(name,employeeId,salary);
		this.teamsize=teamsize;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
}
