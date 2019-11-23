/***********************************************************************************
 * @purpose - To check string pelindrom
 * @author  - Vishal Kumar
 * @version - 1.0
 * @date 	- 20-11-2019
 * @FileName- Pelindromchecker.java
 ************************************************************************************/


package com.bridgelabz.datastructureprograms;

import com.bridgelabz.Datastructre.base.MyDeque;
import com.bridgelabz.Utility.myscanner;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		String input=myscanner.readLine();
		pelindromcheck(input);
	}
	

 // Function to check the pelindrom using Dequeue
 
	
	static void pelindromcheck(String in)
	{
		char arr[]=in.toCharArray();
		String compare="";
		MyDeque dq=new MyDeque(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			dq.addrear(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			compare=compare+(char)dq.getfront();
			dq.removefront();
		}
		if(compare.equals(in))
		{
			System.out.println(compare +"  is a pelindrom");
		}
		else
			System.out.println(compare  +"   is not a pelindrom");
	}
}