/**********************************************************************************
 * @author   vishal kumar
 * @version  1.0
 * @purpose  To check prime number in range and store in a 2d array
 * @date     22/11/19
 * @file	 PrimeNumber2D.java
 **********************************************************************************/

package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;

import com.bridgelabz.Utility.Util;

public class PrimeNumber2D 
{
	public static void main(String []args)
	{
		int start=0,end=100;
		ArrayList<ArrayList<Integer>> numbers=findPrimeIn2D(0,1000);
		System.out.println("printing the list of prime numbers in range of 0 to 1000");
		for(int i=0;i<10;i++)
		{
			System.out.print(start +" to " +end +"  ");
			System.out.println(numbers.get(i));
			start=start+100;end=end+100;
		}
		
		
	}
	
	/* Method  to find out prime number in 0 to 1000
	 * @param  int,int
	 * @return Two dimational Arraylist
	 */
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
