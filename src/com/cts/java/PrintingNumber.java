package com.cts.java;



public class PrintingNumber {
	public void design(int a,int b,int c,int d)
	{
		for(int i=0;i>a;i++)
		{
			System.out.print(i+"\b"+"\n");
		}
			for(int j=0;j>b;j++)
			{
				System.out.print(j+"\b");
				}
				for(int k=0;k<c;k++)
				{
					System.out.print(k+"\b"); }
				for(int l=0;l<d;l++)
				{	System.out.print(l+"\b");}
	}

}
