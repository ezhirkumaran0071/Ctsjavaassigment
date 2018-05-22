package com.cts.java.test;

import com.cts.java.Numberof;

public class Javaadditiontest {
	
	public static void main(String args[])
	{
 Numberof s=new Numberof();
	System.out.println(s.add(4,2));
	System.out.println(s.add(s.add(12, 3),70));
	int total=s.add(12,3)+s.add(14, 3);
	System.out.println(+total);
		
		
	}
}
