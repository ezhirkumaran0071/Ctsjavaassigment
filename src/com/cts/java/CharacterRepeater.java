package com.cts.java;

public class CharacterRepeater {
	public int number(String s,char c)
	{
		int b=s.length();
		int count=0;
		for(int i=0;i<b;i++)
		{
		if(s.charAt(i)==c)
				
			count++;
		}
		return count;
	}
}
	


