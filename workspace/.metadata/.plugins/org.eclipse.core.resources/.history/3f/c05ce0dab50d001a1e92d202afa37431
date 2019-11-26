/***********************************************************************************
 * @purpose - To check a searching a number from from a file
 * @author  - Vishal Kumar
 * @version - 1.0
 * @date 	- 20-11-2019
 * @FileName- Pelindromchecker.java
 ************************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class SearchingNumber 
{
	public static void main(String[] args) throws Exception
	{
		hasingfunction hf = new hasingfunction();
		LinkedList<Integer> ll = new LinkedList();
		try {
			Scanner s = new Scanner(new File("/home/admin1/Desktop/vishal/Sample.txt"));
			while (s.hasNextInt())
				  { 
					int i = s.nextInt();
					hf.put(i);
					System.out.println(hf.list[i % 11]); 
					System.out.println(i); 
					} 
			} 
		catch(FileNotFoundException e)
		{
			System.out.println("Exception");
				  e.printStackTrace(); 
		}
		System.out.println("Enter the element you want to add");
		int num=myscanner.readInteger();
		
	}
}
	
	/*
	 * class to store and check a number in a file
	 */
	
	
	 class hasingfunction
	{
		LinkedList<Integer> list[]=new LinkedList[10];
		
		public hasingfunction()
		{
			for(int i=0;i<list.length;i++)
			{
				list[i]=new LinkedList();
			}
		}
		
		void put(int n)
		{
			list[n%11].add(n);
		}
		boolean search(int n)
		{
			return list[n%11].contains(n);
		}
	
}
