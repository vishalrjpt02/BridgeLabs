/**********************************************************************************
 * @author   Vishal kumar
 * @version  1.0
 * @purpose  To check prime number in range and store in a 2d array
 * @date     22/11/19
 * @file	 PrimeNumberWithAnagram.java
 **********************************************************************************/

package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;

import com.bridgelabz.Utility.Util;

public class PrimeNumberWithAnagram {

	public static void main(String[] args) 
	{
		int start=0,end=100;
		ArrayList<ArrayList<Integer>> al=findPrimeIn2D(0,1000);
	
		for(int i=0;i<10;i++)
		{
			
			System.out.print(start +" to " +end +"  ");
			System.out.println(al.get(i));
			start=start+100;end=end+100;
		}

	}
	
	public static ArrayList<ArrayList<Integer>> findPrimeIn2D(int start,int end)
	{
		int limit=100;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(10);
        
		for(int i=0;i<10;i++)
		{

			graph.add(Util.CalculatePrime(start,limit));
			start=start+100;
			limit=limit+100;
			//System.out.println();
		}
		
		return graph;
	}
	
}
