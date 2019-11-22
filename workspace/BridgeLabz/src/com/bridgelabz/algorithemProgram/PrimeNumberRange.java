package com.bridgelabz.algorithemProgram;
import java.util.Scanner;
public class PrimeNumberRange 
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);	
	 int num=sc.nextInt();
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
		int rev=0;
		while(n>0)
		{
			int temp=n%10;
			rev=rev+temp;
		}
		if(n==rev)
		{
			System.out.println("Is an anagram");
		}
	}

}
