package com.bridgelabz.basic;
import com.bridgelabz.Utility.myscanner;
public class Leapyear {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the year to find leap year or not");
		int year=myscanner.readInteger();
		boolean out=false;
		if(year>1000)
		{
			if(year%4==0)
			{
				if(year%100==0)
				{
					if(year%400==0)
					{
						out=true;
					}
					else
						out=false;
				}
				else
					out=true;
			}
		}
		if(out)
		System.out.println("Is A leap year");
		else
			System.out.println("Is not A leap year");	
	}

}
