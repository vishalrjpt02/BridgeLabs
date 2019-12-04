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
		System.out.println("mark your choice\n 1 -> view companies \n 2 -> create a company account \n 3 -> remove Stocks \n 4 -> Find number of shares \n 5 -> Stock report  \n 6 -> Add company share \n 7-> view detailed report\n 8-> Exit");
			StockImple stockObject= new StockImple();
		
		s1=Util.readChar();
		switch (s1)
		{
		case '1':
			stockObject.viewshare();
			break;
		case '2':
			ComapnyShareController.companyDetails();
			break;
		case '3':
			stockObject.removeshare();
			break;
		case '4':
			stockObject.numberofshare();
			break;
		case '5':
			ComapnyShareController.companyDetails();
			break;
		case '6':
			ComapnyShareController.companyDetails();
			break;
		case '7':
			System.out.println("Thanku");
			temp=1;
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
