/*******************************************************************************************
 * This the file to perform all command given by user and call the nethods to find output
 * @author 	vishal kumar
 * @version 1.0
 * @date	02/12/19
 * @purpose	to perform user interaction
 *******************************************************************************************/

package com.blbz.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.blbz.services.implementation.StockImple;
import com.blbz.utility.Util;

public class StockMain {
	
	static StockImple stockObject= new StockImple();
	static String path = "/home/admin1/workspace/BridgeLabz/Stock_mannagement/com/blbz/jsonfolder";
	static File file;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

	 int temp=0;
		
	  char s1='0';
	  while(temp==0) 
	  {
	   try {
		System.out.println("mark your choice\n 1 -> view companies \n 2 -> create a customer account \n 3 -> remove Stocks \n 4 -> Find number of shares \n 5 -> Stock report  \n 6 -> create an company account\n 7 -> Print Transection details\n 8->exit");
			
		
		s1=Util.readChar();
		switch (s1)
		{
		case '1':
			stockObject.viewshare();
			break;
		case '2':
			System.out.println("enter your name");
			createAccount(sc.nextLine());
			break;
		case '3':
			stockObject.removeshare();
			break;
		case '4':
			stockObject.numberofshare();
			break;
		case '5':
			StockReportController.printReport();
			break;
		case '6':
			ComapnyShareController.companyDetails();
			break;
		case '7':
			stockObject.printTransactionDetails();
			break;
		case '8':
			System.out.println("Thank u next...!!!");
			break;
		default: 
			System.out.println("Invalid input");
			break;
			
		}
		
		}
	   catch(InputMismatchException e) {
			System.out.println("e");
			}
	  }
	}
	   
	   private static void createAccount(String fileName) {
			
			file = new File("/home/admin1/workspace/BridgeLabz/Stock_mannagement/com/blbz/jsonfolder"+fileName+".json");
			try(FileWriter fileWriter = new FileWriter(file)){
				System.out.println(file+" Created Successfully !!!");
				if(file.length()==0) {
					String defaultValue = "[]";
					fileWriter.write(defaultValue);
					fileWriter.flush();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			buyOrSellStock(file);
		}
	
	

		public static void buyOrSellStock(File file2) {
			System.out.println("1. Buy Some Share");
			System.out.println("2. Sell some Share");
			System.out.println("3. Print Transaction");
			System.out.println("4. Exit from customer window");
			double amount;
			String symbol;
			
			String choice = sc.next();
			switch(choice) 
			{
			case "1":
				System.out.println("Enter amount :\nEnter Symbol :");
				amount = Util.readDouble();
				symbol = sc.next();
				stockObject.buyShare(amount,symbol,file2);
				buyOrSellStock(file2);
				break;
			case "2":
				System.out.println("Enter amount :\nEnter Symbol :");
				amount = Util.readDouble();
				symbol = sc.next();
				stockObject.sellShare(amount,symbol,file2);
				buyOrSellStock(file2);
				break;
			case "3":
				stockObject.printTransactionDetails();
				buyOrSellStock(file2);
				break;
			case "4":
			System.out.println("Thank you");
			break;
			}
			
		}
}