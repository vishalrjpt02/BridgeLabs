/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to find prime factor
 * @date     20-11-19
 * @file     primefact.java
 *************************************************************************************/


/*Factors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.
*/
package com.bridgelabz.basic;

import java.util.*;
public class Factors {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
			
		//	int num=sc.nextInt();
			for(int m=0;m<2;m++)
			{
				int n =sc.nextInt();
				methode(n);
			}
		
	}
	public static void methode(int num)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i*i<=num;i++)
		{
			boolean chk=true;
			if(num%i==0)
			{
				int j=2;
				while(j<i)
				{
					if(i%j==0)
					{
						chk=false;
					}
					j++;
				}
				if(chk=true)
				{
					al.add(i);
				}
			}
		}
		for(int l=0;l<al.size();l++)
		{
			System.out.println(al.get(l));
		}
	}

}
