package com.oops.test;

import com.oops.EmployeeDetails;

public class EmployeeDetailsTest {
	public void display(EmployeeDetails e)
	{
		System.out.println(e.getName());
		System.out.println(e.getRollnum());
		System.out.println(e.getSalary());
		
		
}
	public static void main(String args[])
	{
		EmployeeDetails e=new EmployeeDetails();
		e.setName("raj");
		e.setRollnum(109);
		e.setSalary(9000);
		EmployeeDetailsTest a=new EmployeeDetailsTest();
		a.display(e);

			
	}


}
