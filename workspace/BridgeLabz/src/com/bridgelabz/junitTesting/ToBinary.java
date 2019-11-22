package com.bridgelabz.junitTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
 
public class ToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		toBinary(num);
	}
	public static void toBinary(int n)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(n>0)
		{
			int rem=n%2;
			al.add(rem);
			n=n/2;
		}
		Collections.reverse(al); 
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}
