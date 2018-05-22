package com.cts.java;

public class Factorial {
	
	public int factorial(int number)
	{
		int i;
		int fact=1;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}

}
