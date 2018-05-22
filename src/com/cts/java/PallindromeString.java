package com.cts.java;

public class PallindromeString {
	public String pallindrome(String a)
	{
		
		char b=a.charAt(1);
		char c=a.charAt(4);

		{
			if(b==c)
					{
				return ("it is a pallindrome");
				
					}
			else
				return "not a pallindrome";
		}
	

	}
}

