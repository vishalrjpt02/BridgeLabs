/**********************************************************************************
 * @author   Vishal kumar
 * @version  1.0
 * @purpose  perform sorting by insertion sort
 * @date     11/11/19
 * @file	 insertionSort.java
 **********************************************************************************/

package com.bridgelabz.algorithemProgram;

import com.bridgelabz.Utility.Util;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number of elements");
		int number=Util.readint();
		int elements[]=new int[number];
		System.out.println("Enter " +number +" elements");
		for(int i=0;i<elements.length;i++)
		{
			elements[i]=Util.readint();
		}
		insertionSort(elements);
	}
	
	
	public static void insertionSort(int listelements[])
	{
		
		for(int i=0;i<listelements.length;i++)
		{
			int temp=listelements[i];
			int j=i;
			while(j>0 && temp<listelements[j-1] )
			{
				listelements[j]=listelements[j-1];
				j=j-1;
			}
			listelements[j]=temp;
		}
		for(int i=0;i<listelements.length;i++)
		System.out.print(listelements[i] +" ");
	}

}
