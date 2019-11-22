package com.bridgelabz.functionalprogram;
import java.util.*;
/*
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x,
hence there are 2 roots. The 2 roots of the equation can be found using a formula (Note: Take a, b and c as
input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
*/
public class Quadratic
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double delta = ((b*b)-(4*a*c));
		double root1=0;
		double root2=0;
		if(delta>0)
		{
		root1=(-b + Math.sqrt(delta))/(2*a);
		root2=(-b - Math.sqrt(delta))/(2*a);
		System.out.println(root1 +" " +root2);
		}
		else if(delta==0)
		{
			root1=root2= -b/2*a;
			System.out.println(root1 +" " +root2);
		}
		else
			System.out.println(Math.sqrt(-delta)/(2*a));

	}

}
