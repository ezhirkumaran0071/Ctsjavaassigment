package com.oops.test;

import com.oops.getsetsexample;

public class getsetsexampletest {
	public void display (getsetsexample a)
	{
		System.out.println(a.getName());
		System.out.println(a.getNum());
		System.out.println(a.getOccupation());
		
	}
	public static void main(String args[])
	{
		getsetsexample a=new getsetsexample();
		a.setNum(101);
		a.setName("raja");
		a.setOccupation("assistant professor");
		
		
		getsetsexampletest ex  = new getsetsexampletest();
		ex.display(a);
		
		
		

}
}