/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to implement ordered list
 * @date     19-11-19
 * @file     ordered List
 *************************************************************************************/


package com.bridgelabz.datastructureprograms;
/********************************************************************************************
 * Purpose : reading a file and searching the word
 * @author :Rahul C H
 * @version:1.0
 * @date   :21-11-2019
 * @Filename:OrderedListMain.java
 ********************************************************************************************/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.Utility.Util;
import com.bridgelabz.datastructreprograms.base.OrderedList;

public class OrderedListRunner 
{
	 /**
	 * main method to check the ordered list 
	 * @param string arrya as  args	
	 * @throws and throws a  IOException
	 */
	public static void main(String[] args) throws IOException {
		OrderedList<Integer> nw = new OrderedList<Integer>();
		try {
		FileReader file = new FileReader("/home/admin1/Desktop/vishal/Sample2.txt");
		int i =0;
		String stringElement = "";
		while((i=file.read())!=-1) {
			stringElement = stringElement+(char) i ;
		}
		System.out.println(stringElement);
		String arrr[] = stringElement.split(" ");
		int arr[] = new int[arrr.length];
		 for(int j = 0 ; j<arrr.length;j++) 
			 arr[j] = Integer.parseInt(arrr[j]);
			
		 for(int k : arr) {
			nw.add(k);
		 }
		 System.out.println("Enter the number to search");
		int num = Util.readint();
		if(nw.search(num)) {
			System.out.println("removed: "+ num);
		nw.remove(num);
		}else {
			System.out.println("added: "+ num);
			nw.add(num);
		}
		FileWriter filee  = new FileWriter("/home/admin1/Desktop/vishal/Sample2.txt");
		int size = nw.size();
		nw.disp();
		for(int o = 0 ; o<=size ; o++) 
		{
			filee.write(nw.pop(0)+" ");
		}
		filee.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}

	}

}