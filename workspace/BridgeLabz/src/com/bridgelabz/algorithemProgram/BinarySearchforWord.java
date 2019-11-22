/************************************************************************************
 * @author  vishal kumar
 * @version 1.0
 * @purpose Binary search for word
 * @date    21/11/19
 * @file 	BinarySearchforword.java
 ************************************************************************************/

package com.bridgelabz.algorithemProgram;
import com.bridgelabz.Utility.myscanner;
import java.util.ArrayList;
import java.util.Collections;
public class BinarySearchforWord
{

	public static void main(String[] args) 
	{
		String arr[]=new String[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=myscanner.readLine();
		}
		Arrays.sort(arr);
		System.out.println("enter the element to search");
		String key=myscanner.readString();
		int l=0,h=arr.length-1;
		System.out.println("index of the element is"+binarySearch(arr,key,l,h));
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
		}
		else if(ar[mid].compareTo(k)>0)
		{
			low=mid+1;
			binarySearch(ar,k,low,high);
		}
		else if(k.compareTo(ar[mid])<0)
		{
			high=mid-1;
			binarySearch(ar,k,low,high);        
		}
		}
		return index;
	}

}
