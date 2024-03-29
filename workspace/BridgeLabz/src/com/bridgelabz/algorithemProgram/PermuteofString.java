/**********************************************************************************
 * @author   Vishal kumar
 * @version  1.0
 * @purpose  To check permute of string
 * @date     22/11/19
 * @file	 permuteofString.java
 **********************************************************************************/

package com.bridgelabz.algorithemProgram;
import java.util.ArrayList;

import com.bridgelabz.Utility.myscanner;
	

public class PermuteofString 
{
	static  ArrayList<String> al=new ArrayList<String>();
	public static void main(String[] args)
	{
		System.out.println("Enter the string want to calculate permutes");
		String s1 = myscanner.readString();
		int index=0;
		int length=s1.length();
		System.out.println(permute(s1,index,length));
	
	}
	
	public static ArrayList<String> permute(String str,int l,int r)
	{
		
		if(l==r)
		{
			al.add(str);
		}
		else
		{
			for(int i=l;i<r;i++)
			{
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
		return(al);
	}
	
	public static String swap(String a,int i,int j)
	{
		char temp;
		char[]arr=a.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		return String.valueOf(arr);
	}

}
