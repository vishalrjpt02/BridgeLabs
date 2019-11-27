
/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  create a vending machine that can count minimum number of notes to be returned
 * @date     19-11-19
 * @file     VendingMachine.java
 *************************************************************************************/
package com.bridgelabz.junitTesting;
import java.util.*;
public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amout to be calculated");
		int n= sc.nextInt();
		count(n);
	}
	
	public static int count(int num)
	{
		int notes[]={1000,500,100,50,10,5,2,1};
		int notecount[]=new int[8];
		
		for(int i=0;i<notes.length;i++)
		{
			if(num>=notes[i])
			{
				notecount[i]=num/notes[i];
				num=num-notecount[i]*notes[i];
			}
		}
		 //System.out.println("Currency Count ->"); 
		 int out=0;  
		 int Notes[]=new int[8];
		 for (int i = 0; i<8; i++)
	        { 
	        	
	            if (notecount[i] != 0)
	            { 
	                out=out+ notecount[i];
	            	 
	            }     
	        }
	        return out;
	}
}
