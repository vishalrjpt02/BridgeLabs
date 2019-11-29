/**********************************************************************************
 * @author   Vishal kumar
 * @version  1.0
 * @purpose  To find out the day by taking date
 * @date     12/11/19
 * @file	 DayOfWeek.java
 **********************************************************************************/
package com.bridgelabz.junitTesting;


import com.bridgelabz.Utility.Util;
public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the date in  formate of dd/mm/yyyy");
		int date=Util.readint();
		int month=Util.readint();
		int year=Util.readint();
		System.out.println(Dayoftheweek(date,month,year));

	}
	
	public static String Dayoftheweek(int d,int m,int y)
	{
		if(d<1||m<1||y<1000)
			{
				return "Invalid Input";
			}
		y=y-(14-m)/12;
		int x=0;
		x = y+ y/4-y/100 + y/400;
		m=m+12*((14-m)/12)-2;
		d= (d+x+((31*m)/12))%7;
		String []days={"sunday","monday","tuesday","Wednesday","thursday","friday","saturday"};
		String out="";
		for(int i=0;i<days.length;i++)
		{
			if(d==i)
			{
				out=(days[i]);
			}
		}
		return out;
	}

}
