/************************************************************************************
 * @author  vishal kumar
 * @version 1.0
 * @purpose Binary search for word
 * @date    21/11/19
 * @file 	BinarySearchforword.java
 ************************************************************************************/

package com.bridgelabz.algorithemProgram;
import java.util.Arrays;

import com.bridgelabz.Utility.Util;

public class BinarySearchforWord
{

	public static void main(String[] args) 
	{
		 
		System.out.println("Enter 3 String elements");
		String []words=Util.readlinearray(3);
		Arrays.sort(words);
		for(int i=0;i<3;i++)
		System.out.println((String)words[i]);
		System.out.println("enter the element to search");
		String key=Util.readline();
		int l=0,h=words.length-1;
		System.out.println("index of the element is"+binarySearch(words,key,l,h));
	}
	
	public static int binarySearch(String ar[],String k,int low,int high)
	{
		int index=0;
		if(high>=low)
		{
		int mid=low+(high-low)/2;
		
		if(k==ar[mid])
		{
			index=mid;
			System.out.println("yes");
		}
		else if(ar[mid].compareTo(k)>0)
		{
			low=mid+1;
			binarySearch(ar,k,low,high);
			System.out.println("yes");
		}
		else if(k.compareTo(ar[mid])<0)
		{
			high=mid-1;
			binarySearch(ar,k,low,high);
			System.out.println("yes");
		}
		}
		return index;
	}

}
