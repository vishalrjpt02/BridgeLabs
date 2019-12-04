package com.blbz.Controller;

import com.blbz.Classmodel.StockModel;
import com.blbz.utility.MyLinkedList;
import com.blbz.utility.Util;

public class StockReportController
{
	
static MyLinkedList<StockModel> list;
	
	public static void main(String[] args) {

		StockReportController report = new StockReportController();	//	class object
		StockReportController.getStockData();
		report.printReport();
	}

	/**
	 * gets user input of stock data
	 * @param-type: Takes no argument
	 * @return-type: Doesn't return anything
	 */
	static void getStockData() {
		System.out.println("Enter number of stocks: ");
		int count = Util.readint();
		list = new MyLinkedList<StockModel>();
		
		for(int i = 0; i < count; i++) {
			System.out.println("Enter stock name, number of shares, and share price: ");
			String name = Util.readString();
			int numberOfShares = Util.readint();
			int price = Util.readint();
			StockModel stock = new StockModel(name, numberOfShares, price);
			list.add(stock);
		}
		Util.scannerClose();
	}
	
	/**
	 * Print the Stock Report
	 * @param-type: Takes no argument
	 * @return-type: Doesn't return anything
	 * 
	 */
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
}
