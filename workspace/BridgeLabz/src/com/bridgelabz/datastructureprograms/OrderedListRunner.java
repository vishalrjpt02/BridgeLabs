/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to implement ordered list
 * @date     19-11-19
 * @file     ordered List
 *************************************************************************************/


package com.bridgelabz.datastructureprograms;

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
		OrderedList<Integer> elememts = new OrderedList<Integer>();
		try {
		FileReader inputfile = new FileReader("/home/admin1/Desktop/vishal/Sample2.txt");
		int i =0;
		String stringElement = "";
		while((i=inputfile.read())!=-1) {
			stringElement = stringElement+(char) i ;
		}
		System.out.println(stringElement);
		String Words[] = stringElement.split(" ");
		int numbers[] = new int[Words.length];
		 for(int j = 0 ; j<Words.length;j++) 
			 numbers[j] = Integer.parseInt(Words[j]);
			
		 for(int k : numbers) {
			elememts.add(k);
		 }
		 System.out.println("Enter the number to search");
		int number = Util.readint();
		if(elememts.search(number)) {
			System.out.println("removed: "+ number);
		elememts.remove(number);
		}else {
			System.out.println("added: "+ number);
			elememts.add(number);
		}
		FileWriter writingelements  = new FileWriter("/home/admin1/Desktop/vishal/Sample2.txt");
		int size = elememts.size();
		elememts.disp();
		for(int o = 0 ; o<=size ; o++) 
		{
			writingelements.write(elememts.pop(0)+" ");
		}
		writingelements.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}

	}

}