/*
 Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails

 */
package com.bridgelabz.basic;
import java.util.*;
public class Flipcoin 
{
	public static void main(String[] args) 
	{
		double head=0;double tail=0;
		float headcount=0,tailcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of flips");
		int time=sc.nextInt();
		if(time>0){
		for(int i=0;i<=time;i++)
		{
			head=Math.random();
			tail=Math.random();
			if(head>0.5){
				headcount++;
			}
			else if(tail>0.5)
			{
				tailcount++;
			}
		 
		}
		double out=(tailcount/headcount)*100;
		System.out.println("percentage of heads vs tails  \n"+out);
		}
	}

}
