package com.blbz.Controller;

import java.util.InputMismatchException;


import com.blbz.utility.Util;

public class StockMain {

	public static void main(String[] args) {

		int temp=0;
		
		char s1='0';
		while(temp==0) 
		{
			try {
		System.out.println("mark your choice\n 1 -> view companies \n 2 -> Add company  \n 3 -> remove Stocks \n 4 -> Find number of shares \n 5 -> Stock report  \n 6 -> To Exit");
			StockImpl stockObject= new StockImpl();
		
		s1=(Util.readline()).charAt(0);
		switch (s1)
		{
		
		case '1':
			stockObject.view();
			break;
		case '2':
			stockObject.add();
			break;
		case '3':
			stockObject.remove();
			break;
		case '4':
			stockObject.totalPrice();
			break;
		case '5':
			stockObject.totalWeight();
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
				System.out.println(e.getMessage());
			}
	

	}

}
