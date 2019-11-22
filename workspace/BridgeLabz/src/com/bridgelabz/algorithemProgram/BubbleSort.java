/*Bubble Sort 
Desc -> Reads in integers prints them in sorted order using Bubble Sort
I/P -> read in the list ints
O/P -> Print the Sorted List
*/
package com.bridgelabz.algorithemProgram;

import java.util.Scanner;

public class BubbleSort
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int list[]=new int[10];
		for(int i=0;i<10;i++)
		{
			list[i]=sc.nextInt();
		}
		BubbleSort(list);
	}
	public static void BubbleSort(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] +"  ");
	}
}