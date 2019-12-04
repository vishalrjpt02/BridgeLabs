/*******************************************************************************************
 * This the file to perform all command given by user and call the nethods to find output
 * @author 	vishal kumar
 * @version 1.0
 * @date	02/12/19
 * @purpose	to perform user interaction
 *******************************************************************************************/

package com.blbz.Controller;

import java.util.InputMismatchException;

import com.blbz.services.implementation.StockImple;
import com.blbz.utility.Util;

public class StockMain {

	public static void main(String[] args) {

	 int temp=0;
		
	  char s1='0';
	  while(temp==0) 
	  {
	   try {
		System.out.println("mark your choice\n 1 -> view companies \n 2 -> Add company  \n 3 -> remove Stocks \n 4 -> Find number of shares \n 5 -> Stock report  \n 6 -> To Exit");
			StockImple stockObject= new StockImple();
		s1=Util.readChar();
		switch (s1)
		{
		case '1':
			stockObject.viewshare();
			break;
		case '2':
			stockObject.addshare();
			break;
		case '3':
			stockObject.removeshare();
			break;
		case '4':
			stockObject.numberofshare();
			break;
		case '5':
			stockObject.stockreport();
			break;
		case '6':
			System.out.println("Thank you");
			temp = 1;
			break;
		default: 
			System.out.println("Invalid input");
			break;
			
		}
		
		}catch(InputMismatchException e){
				System.out.println("e");
			}
	

	}

}
}
