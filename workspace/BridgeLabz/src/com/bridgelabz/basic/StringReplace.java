package com.bridgelabz.basic;
import com.bridgelabz.Utility.myscanner;
public class StringReplace 
{
	public static void main(String[] args) 
	{
		//System.out.println("enter your whole text");
		//String s1=myscanner.readLine();
		System.out.println("enter the string want to add");
		String s3=myscanner.readLine();
		System.out.println(Replace(s3));
	}
	
	public static String Replace(String name)
	{
		String s1="hello <<username>> , how are you";
		String s2="<<username>>";
		String out="";
		String s3=name;
		for(String s:s1.split("\\s"))
		{
			if(s.equals(s2))
			{
				s=s3;
				out=out+s+" ";
				
			}
			else
			out=out+s+" ";
		}
		return (out);
	}
}