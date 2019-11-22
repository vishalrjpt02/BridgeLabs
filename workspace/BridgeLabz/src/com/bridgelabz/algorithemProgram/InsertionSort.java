package com.bridgelabz.algorithemProgram;

import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		InsertionSort(ar);
	}
	
	
	public static void InsertionSort(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i;
			while(j>0 && temp<arr[j-1] )
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}

}
