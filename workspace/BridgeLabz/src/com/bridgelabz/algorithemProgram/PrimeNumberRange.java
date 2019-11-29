/**********************************************************************************
 * @author   Vishal kumar
 * @version  1.0
 * @purpose  To check prime number in range of 0 to 1000
 * @date     22/11/19
 * @file	 primenumber.java
 **********************************************************************************/
package com.bridgelabz.algorithemProgram;
import com.bridgelabz.Utility.Util;
public class PrimeNumberRange 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the limit till which you want to calculate prime numbers");
	 int num=Util.readint();
	 CalculatePrime(num);
	}
	
	public static void CalculatePrime(int n)
	{
		
		for(int i=1;i<n;i++)
		{
			boolean chk=false;
			for(int j=i-1;j>1;j--)
			{
				if(i%j==0)
				{
					chk=true;
				}
				
			}
			if(chk==false)
			System.out.println(i);
			//Anagram(i);
				
		}
	}
	public static void Anagram(int n)
	{
		int num=n;
		int rev=0;
		while(n>0)
		{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
			
		}
		if(num==rev)
		{
			System.out.println("Is an anagram");
		}
	}

}
