package com.bridgelabz.dataStructurePrograms;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.bridgelabz.Utility.LinkedList;
public class OrderedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list =new LinkedList<Integer>();
	
		try
		{

			FileReader fr=new FileReader("/home/admin1/Desktop/vishal/Sample.txt");
			FileWriter fw=new FileWriter("/home/admin1/Desktop/vishal/Sample.txt");
			int ar[]=new int[10];
			int i=0;
			while(fr.read()!=-1)
			{
				ar[i]=fr.read();
				i++;
			}
			BubbleSort(ar);
			
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
	}

	private static void BubbleSort(int[] arr) 
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
	}
}
