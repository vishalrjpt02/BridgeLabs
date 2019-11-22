package com.bridgelabz.functionalprogram;
/* 
2D Array
Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
*/
import java.util.*;
public class TwoDarray
{	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
				{
				  arr[i][j]=sc.nextInt();
				}
			}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
