package com.bridgelabz.dataStructurePrograms;
import java.io.*;

import com.bridgelabz.Utility.*;
public class UnOrderedList 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the string you want to add or remove");
		String command=Util.readline();
		LinkedList<String> list = new LinkedList<String>();
		
		InputStream in=	new FileInputStream("/home/admin1/Desktop/vishal/Sample.txt");
		InputStreamReader isr = new InputStreamReader(in);
		
		BufferedReader br = new BufferedReader(isr);
		
		while(br.readLine()!=null)
		{
			list.add(br.readLine());
			System.out.println(br.readLine());
		}
		
		
		list.add(command);
		list.show();
		System.out.println(list.Size());
		list.show();
	}
}
