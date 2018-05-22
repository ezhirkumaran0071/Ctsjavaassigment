package com.cts.java;

public class NumberToString3digit {
	
	public String threedigitnumber (int num)
	{
		int num2,num3,num4,num5;
		
	
String str1[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thriteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty"};
String str2[]= {"zer","ten","twenty","thirty","fouty","fifty","sixty","seventy","ninty"
};
if(num<0 && num>19)
{
return str1[num]; }
else
{
num2=num%10;
num3=num/10;
num4=num3%10;
num5=num3/10;
return str1[num5]+""+str2[num4]+""+str1[num2];
}

	
}
}
