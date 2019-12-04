/***************************************************************************************
 * this file is the protfolio for all company shares
 * @author	vishal kumar
 * @version	1.0
 * @date	04/12/19
 * @file	Stock_portfolio.java
 ***************************************************************************************/
package com.blbz.Classmodel;

public class Stock_portfolio {
	
	private String name;
	private int numberOfShares, price;
	
	/**
	 * Constructor
	 * @param name - name of the stock
	 * @param numberOfShares - share count
	 * @param price - price of each share
	 */
	public Stock_portfolio(String name , int numberOfShares, int price) {
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.price = price;
	}
	
	
	/**
	 * @returns value of the all stocks
	 */
	public int getValue() {
		return numberOfShares * price;
	}
	
	/**
	 * @returns name of the stock
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @returns number of shares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	/**
	 * @returns price of the each share
	 */
	public int getPrice() {
		return price;
	}

}