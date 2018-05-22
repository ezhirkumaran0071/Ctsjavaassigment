package com.oops;

public class EmployeeDetails {
	private String  name;
	private int salary;
	private int rollnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		if(salary<10_000)
		{
			System.out.println("not a valid salary make it as default 10_000");
		}
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	

}
