/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to unordered list
 * @date     19-11-19
 * @file     unordered List
 *************************************************************************************/



package com.bridgelabz.datastructureprograms;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import com.bridgelabz.Utility.Util;
import com.bridgelabz.datastructreprograms.base.LinkedList;
public class UnOrderedList 
{
	
	static LinkedList<String> list = new LinkedList<String>();
	
	public static void main(String[] args)
	{
		System.out.println("Enter the string you want to add or remove");
		String command=Util.readline();
		
		checkfile(command);
	}
	
	
	
	public static void checkfile(String s)
	{
		
		String in="";
		try
		{
		//String fileName = ;
		//File file = new File(fileName);
		FileReader fr = new FileReader("/home/admin1/Desktop/vishal/Sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null)
			{
		    	//process the line
		    	in=in+line;
		    	
			}
		fr.close();
		}
		catch (Exception e)
		{
			System.out.println("file not found");
		}
		checkforString(s,in);
	}
	
	public static void checkforString(String s,String raw)
	{
		String chk[]=raw.split(" ");
		for(String read:chk)
		{
			list.add(read);
			//System.out.println(read);
			
		}
		
		if(list.contains(s))
		{
			list.removeit(s);
//			list.show();
		}
		else
		{
			list.add(s);
		}
		
		
		String ar[]=list.getElement();
		
	   try {
	         FileWriter fs =new FileWriter("/home/admin1/Desktop/vishal/Sample2.txt");
	          for(int i=0;i<ar.length;i++)
	          {
	        	 fs.write((String)ar[i] +" ");
	        	 //System.out.println("yes");
	          }
	          fs.close();
	        } 
	    catch (IOException e) 
	        {
	            System.out.println("File not found");
	        }
	}
		
}
