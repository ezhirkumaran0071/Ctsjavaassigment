package com.cts.java;

public class Pallindrome 
{
	public String isPallindrome(int num)
	{
	
		int mod,add=0;
		int reference;
		reference=num;
		while(num>0)
		{
			mod=num%10;
			add=add*10+mod;
			num=num/10;
			
		}
		if(add==reference)
		{
			return"is a a palli";
			
		}
		else
		{
			return"not a palli";
		}
		}}