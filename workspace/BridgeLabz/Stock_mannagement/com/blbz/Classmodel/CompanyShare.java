/***************************************************************************************
 * this file is the protfolio for all company shares
 * @author	vishal kumar
 * @version	1.0
 * @date	04/12/19
 * @file	Stock_portfolio.java
 ***************************************************************************************/
package com.blbz.Classmodel;

public class CompanyShare {
	
	private String companyName;
	private String companySymbol;
	private int	numberOfShare;
	private double price;
	private String dateTime;
	
	public CompanyShare(String companyName, String companySymbol, int numberOfShare, double price, String dateTime) {
		super();
		this.companyName = companyName;
		this.companySymbol = companySymbol;
		this.numberOfShare = numberOfShare;
		this.price = price;
		this.dateTime = dateTime;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanySymbol() {
		return companySymbol;
	}
	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public double getPrice() {
		return price;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}