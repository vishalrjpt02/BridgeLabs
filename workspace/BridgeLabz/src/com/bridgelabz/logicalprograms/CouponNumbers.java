/*
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number?
This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.
*/
package com.bridgelabz.logicalprograms;
import java.util.*;
public class CouponNumbers 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double arr[]=new double[num];
		int count=0;
		while(count<=num)
		{
			double rnum=Math.random();
			for(int i=0;i<arr.length;i++)
			{
				
				if(arr[i]==rnum)
				{
					break;
				}
				else
				{
					arr[i]=rnum;
					count++;
				}
				
			}
			
		}
		System.out.print(count);
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
	}

}
