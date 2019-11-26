/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to implement ordered list
 * @date     19-11-19
 * @file     unordered List
 *************************************************************************************/


package com.bridgelabz.datastructureprograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.datastructreprograms.base.LinkedList;




public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		LinkedList<Integer> list =new LinkedList<Integer>();
	
	/*	try
		{*/

			FileReader fr=new FileReader("/home/admin1/Desktop/vishal/Sample.txt");
			
			int ar[]=new int[10];
			int i=0,j=0;
			while((i=fr.read())!=-1)
			{
				ar[j]=((Integer)fr.read());
				//System.out.println(ar[j]);
				j++;
			}
			fr.close();
			BubbleSort(ar);
			for(int l=0;l<ar.length;l++)
				System.out.println(ar[l]);
			
			FileWriter fw=new FileWriter("/home/admin1/Desktop/vishal/Sample2.txt");
			for(int k=0;k<ar.length;k++)
				fw.write(ar[i]);
			fw.close();
		//}
		/*catch(Exception e)
		{
			System.out.println("file not found");
		}*/
		
		
	}

	private static void BubbleSort(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
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
