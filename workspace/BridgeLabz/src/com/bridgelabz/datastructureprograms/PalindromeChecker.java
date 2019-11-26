/***********************************************************************************
 * @purpose - To check string pelindrom
 * @author  - Vishal Kumar
 * @version - 1.0
 * @date 	- 20-11-2019
 * @FileName- Pelindromchecker.java
 ************************************************************************************/


package com.bridgelabz.datastructureprograms;

import com.bridgelabz.Utility.myscanner;
import com.bridgelabz.datastructreprograms.base.MyDeque;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		String input=myscanner.readLine();
		pelindromcheck(input);
	}
	

 // Function to check the pelindrom using Dequeue
 
	
	public static boolean pelindromcheck(String in)
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
			return true;
		}
		else
			System.out.println(compare  +"   is not a pelindrom");
		return false;
	}
}