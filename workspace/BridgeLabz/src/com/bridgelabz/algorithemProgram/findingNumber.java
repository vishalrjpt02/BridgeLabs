/**********************************************************************************
 * @author   vishal kumar
 * @version  1.0
 * @purpose  To create a utility package
 * @date     21/11/19
 * @file	 Util.java
 **********************************************************************************/

package com.bridgelabz.algorithemProgram;
//import java.util.*;
public class findingNumber 
{
	public static void main(String []args) 
	{
		
		int num=Integer.parseInt(args[0]);
		int n=0;
		search(num,n);

	}
	
	public static void search(int num,int n)
	{
		if(num>n)
		{
			if(num==Math.pow(2,n))
			{
				System.out.println(n);
			}
				search(num,n+1);
		}
		
	}

}
