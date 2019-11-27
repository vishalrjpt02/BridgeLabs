package com.bridgelabz.junitTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BinarytoDecimal {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		toBinary(num);
	}
	public static void toBinary(int n)
	{
		double out=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(n>0)
		{
			int rem=n%2;
			al.add(rem);
			n=n/2;
		}
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=0;i<al.size()/2;i++)
		{
			al1.add(al.get(i));
		}
		
		Collections.reverse(al); 
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int i=0;i<al.size()/2;i++)
		{
			al2.add(al.get(i));
		}
		
		for(int i=0;i<al.size()/2;i++)
		{
			System.out.print(al1.get(i));
		}
		
		System.out.print("  ");
		
		for(int i=0;i<al.size()/2;i++)
		{
			System.out.print(+al2.get(i));
		}
		
		al.removeAll(al);
		al.addAll(al2);
		al.addAll(al1);
		
		for(int i=0;i<al.size();i++)
		{
			double sum=2;
			
			if(al.get(i)>0)
			{
				int count =i;
				while(count>=0)
				{
					sum=Math.pow(2,i);
					sum=sum*2;
					count--;
				}
				out=out+sum;
			}	
		}
		
		System.out.println(" \n"+out);
		
	}

}
