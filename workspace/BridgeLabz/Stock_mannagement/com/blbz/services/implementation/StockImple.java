/*********************************************************************************************
 * This file do all the implemntation/calculation part of program ,implements stock interface
 * @author 	vishal kumar
 * @purpose to perform implementation of stockInterface
 * @version 1.0
 * @date 	02/12/19
 **********************************************************************************************/

package com.blbz.services.implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blbz.Classmodel.CompanyShare;
import com.blbz.Classmodel.StockModel;
import com.blbz.repositry.StockAccountRepository;
import com.blbz.services.StockInterface;
import com.blbz.utility.MyLinkedList;
import com.blbz.utility.MyQueue;
import com.blbz.utility.MyStack;
import com.blbz.utility.Util;

public class StockImple implements StockInterface {

	static String path = "BridgeLabz/Stock_mannagement/com/blbz/jsonfolder/CompanyList.json";
	static double totalshare;
	static double totalprice;
	static Scanner sc=new Scanner(System.in);
	
	File fileRead = new File(path);
	File fileWrite = new File(path);
	MyStack<String> transactionStack;
	MyQueue<String> transactionQueue;
	static MyLinkedList<StockModel> list;
	CompanyShare[] companyShares;

	public StockImple() {
		transactionStack = new MyStack<>();
		transactionQueue = new MyQueue<>();
	}

	/*
	 * methode add a company into the list
	 * 
	 * @param none
	 * 
	 * @return nothing
	 */
	@SuppressWarnings("unchecked")
	public void addshare() {
		try {
			JSONArray list_array = new JSONArray();
			if (new File(path).length() != 0) {
				FileReader fr = new FileReader(path);
				JSONParser read = new JSONParser();
				Object obj = read.parse(fr);
				list_array = (JSONArray) obj;
			}

			JSONObject jobj = new JSONObject();

			// Adding the company and stocks

			list = new MyLinkedList<StockModel>();
			int number_of_stock;
			int stock_value;
			System.out.println("Enter the name of company:");
			String name =sc.nextLine();

			System.out.println("Enter the number of stock: ");
			number_of_stock = Util.readint();

			System.out.println("Enter the value of stock :");
			stock_value = Util.readint();

			// new stock has been created
			StockModel Stock;
			Stock = new StockModel(name, number_of_stock, stock_value);
			
			jobj.put("Company_name", Stock.getName());
			jobj.put("Stocks", Stock.getShares());
			jobj.put("stock_value", Stock.getPrice());

			list_array.add(jobj);
			list.add(Stock);
			FileWriter fw = new FileWriter(path);
			fw.write(list_array.toJSONString());
			fw.flush();
			fw.close();
			System.out.println("company added...!!\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * to view the element from list
	 * 
	 * @param: nothing
	 * 
	 * @return: void
	 */
	public void viewshare() {
		try {
			if (new File(path).length() != 0) {
				JSONParser jp = new JSONParser();
				Object parse = (Object) jp.parse(new FileReader(path));
				
				JSONArray ja = (JSONArray) parse;
				// System.out.println(parse);

				for (Object i : ja) {
					JSONObject jobj = (JSONObject) i;
					System.out.println("Company name : " + jobj.get("Company_name"));
					System.out.println("number of Stocks : " + jobj.get("Stocks"));
					System.out.println("Stock price : " + jobj.get("stock_value"));
					System.out.println();
				}
				
			} else
				System.out.println("File is empty...");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * this methode finds out the total number of shares
	 * 
	 * @param void
	 * 
	 * @return void
	 */
	@Override
	public void numberofshare() {
		try {
			if (new File(path).length() != 0) {
				double total_share = 0;
				int count_of_share = 0;
				JSONParser jpar = new JSONParser();
				Object obj = jpar.parse(new FileReader(path));
				JSONArray jarr = (JSONArray) obj;
				for (Object read : jarr) {
					JSONObject input = (JSONObject) read;
					double temp = (double) input.get("Stocks");
					total_share = total_share + temp;
					count_of_share++;
				}
				System.out.println("Total number of shares are : " + count_of_share + "\namount of whole share is   : "
						+ total_share);

			} else
				System.out.println("File is empty...");
		}

		catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	/*
	 * this the implemetation of shareprice methode in stockinterface it shows the
	 * share price of total
	 * 
	 * @param -nothing
	 * 
	 * @return -void
	 */

	@Override
	public void sharePrice() {
		try {
			if (new File(path).length() != 0) {
				JSONParser jpar = new JSONParser();
				Object obj = jpar.parse(new FileReader(path));
				JSONArray jarr = (JSONArray) obj;
				System.out.println("Choose your company name");
				for (Object read : jarr) {
					JSONObject input = (JSONObject) read;
					System.out.println((String) input.get("Comapny_name"));
				}
				String company = Util.readline();
				for (Object read : jarr) {
					JSONObject input = (JSONObject) read;
					if ((String) input.get("Company_name") == company) {
						System.out.println("The stock price of " + company + " is " + input.get("stock_value"));
					}
				}
			} else
				System.out.println("File is empty...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * this methode gives the whole report of total stock and prices
	 * 
	 * @param -nothing
	 * 
	 * @return -nothing
	 */

	@Override
	public void stockreport() {
		System.out.println("Showing the all companies stocks and stock values \n");
		viewshare();
		System.out.println("--------------final Stock report-----------------");

		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(new FileReader(path));
			JSONArray jarr = (JSONArray) obj;
			int count = 0;
			for (Object read : jarr) {
				JSONObject readstock = (JSONObject) read;
				double temp = (double) readstock.get("Stocks");
				totalshare = totalshare + temp;

				JSONObject readvalue = (JSONObject) read;
				double temp1 = (double) readvalue.get("Stocks");
				totalprice = totalprice + temp1;
				count++;
			}
			System.out.println("Total number of Comapnies " + count);
			System.out.println("Total number of Stocks\t" + totalshare);
			System.out.println("Total price of stocks\t" + totalprice + "\n");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	
	void printReport() {
		int totalValue = 0;
		
		System.out.println("----------STOCK REPORT----------");
		System.out.println("\nName\tShares\tPrice\tValue");
		while(!list.isEmpty()) {
			StockModel folio = list.pop();
			totalValue += folio.getPrice();
			System.out.println(folio.getName() + "\t" + folio.getShares()
					+ "\t" + folio.getPrice() + " \t" + folio.getPrice());
		}
		System.out.println("\nTotal stock value is: " + totalValue);
	}
	
	
	
	
	
	

	public void removeshare() {

		try {
			if (new File(path).length() != 0) {
				System.out.println("enter the name of company which stocks to be remove");
				String item = Util.readString();
				boolean result = true;
				FileReader fr = new FileReader(path);
				JSONParser jp = new JSONParser();
				JSONArray jarray = (JSONArray) jp.parse(fr);
				for (int i = 0; i < jarray.size(); i++) {
					JSONObject jobj = (JSONObject) jarray.get(i);

					if (item.equals(jobj.get("Company_name"))) {
						jarray.remove(jobj);
						result = false;

					}
				}
				if (result) {
					System.out.println("Not found..");
				} else {
					System.out.println("Successful.");
				}
				try (FileWriter fw = new FileWriter(path)) {
					fw.write(jarray.toJSONString());
					fw.flush();
				}
			} else
				System.out.println("File is empty...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public void buyShare(double amount, String symbol, File file2) {
		int count = 0;
		double price = 0;
		JSONArray array, jsonArray = null;

		JSONObject jsonObject = StockAccountRepository.readData(fileRead);
		JSONObject json = (JSONObject) jsonObject.get("STOCK MARKET");
		System.out.println(json);
		if ((array = (JSONArray) json.get(symbol)) != null) {
			jsonArray = array;
			Iterator<?> iterator = array.iterator();
			while (iterator.hasNext()) {
				JSONObject cDetails = (JSONObject) iterator.next();
				price = (double) cDetails.get("Price");
			}

			int numberOfShare = (int) Math.round(amount / price);
			System.out.println("Share :" + numberOfShare);

			array = updateCompanyDetails(jsonArray, numberOfShare);
			LocalDateTime current = LocalDateTime.now();
			// System.out.println("current date and time : "+ current);
			// to print in a particular format
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			String dateTime = current.format(format);

			JSONObject accountObject = new JSONObject();
			accountObject.put("Symbol", symbol);
			accountObject.put("PurchaseShare", numberOfShare);
			accountObject.put("PurchaseTime", dateTime);
			accountObject.put("Price", price);

			JSONArray array2 = new JSONArray();
			array2.add(accountObject);

			StockAccountRepository.writeData(fileRead, jsonObject);
			StockAccountRepository.writeData(fileWrite, array2);

			transactionStack.push("Purchased");
			transactionQueue.enqueue(dateTime);
		} else {
			System.out.println("The Stock you are trying to purchase is not available in Stock Market");
		}

	}

	@Override
	public void sellShare(double amount, String symbol, File file2) {
		double price = 0;
		JSONArray jsonArray = StockAccountRepository.readArrayData(file2);
		if (jsonArray.size() != 0) {
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject, accountJson = null;
			while (iterator.hasNext()) {
				if ((jsonObject = (JSONObject) iterator.next()).get("Symbol").equals(symbol)) {
					if (jsonObject.get("PurchaseShare") != null) {
						accountJson = jsonObject;
						price = (double) jsonObject.get("Price");
					}
				}
			}
			int numberOfShare = (int) Math.round(amount / price);
			System.out.println("Share :" + numberOfShare);

			jsonObject = updateAccountDetails(accountJson, numberOfShare);

			StockAccountRepository.writeData(file2, jsonArray);
		} else {
			System.out.println("You doesn't have any share please buy some share berfore selling\n");
		}

	}

	@SuppressWarnings("unchecked")
	private JSONObject updateAccountDetails(JSONObject accountJson, int numberOfShare) {
		long share = (long) accountJson.get("PurchaseShare");
		long updatedShare = 0;
		String dateTime = "";
		if (share > numberOfShare) {
			updatedShare = share - numberOfShare;
			accountJson.put("SoldShare", updatedShare);
			LocalDateTime current = LocalDateTime.now();

			// to print in a particular format
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			dateTime = current.format(format);
			transactionStack.push("Sold");
			transactionQueue.enqueue(dateTime);

		} else {
			System.out.println("You are trying to sell Over limit you habve only " + share + " share");
		}

		accountJson.put("SoldTime", dateTime);

		return accountJson;
	}

	@Override
	public void printTransactionDetails() {
		/**
		 * prints queue
		 */

		System.out.println("\nTransactions Queue:");
		while (!transactionQueue.isEmpty()) {
			System.out.println(transactionQueue.dequeue());
		}

		/**
		 * prints stack
		 */

		System.out.println("\nTransactions Stack:");
		while (!transactionStack.isEmpty())
			System.out.println(transactionStack.pop());

	}

	@SuppressWarnings("unchecked")
	private static JSONArray updateCompanyDetails(JSONArray jsonArray, int numberOfShare) {

		long updatedShare = 0;

		Iterator<?> iterator = jsonArray.iterator();
		while (iterator.hasNext()) {
			JSONObject type = (JSONObject) iterator.next();
			updatedShare = (long) type.get("NumberOfShare");
			System.out.println("updated share " + updatedShare);
			if (numberOfShare > updatedShare) {
				System.out.println("Number of Share should be less than total share which is :" + updatedShare);
			} else {
				updatedShare = updatedShare - numberOfShare;
				type.put("NumberOfShare", updatedShare);
			}
		}
		return jsonArray;
	}
	
	
	
	
	
}