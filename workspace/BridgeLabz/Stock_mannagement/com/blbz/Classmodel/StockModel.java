/*********************************************************************************************
 * this file is the encapsulation of all variables.
 * @author 	vishal kumar
 * @purpose	to encapsulate all variables
 * @version 1.0
 * @date	02/12/19
 ***********************************************************************************************/

package com.blbz.Classmodel;

public class StockModel {

	private String Name;
	private double shares;
	private double price;
	private String CompSymbol;
	private String DateTime;
	
	public StockModel(String Name,double shares,double price)
	{
		this.Name=Name;
		this.shares=shares;
		this.price=price;
		this.CompSymbol=CompSymbol;
		this.DateTime=DateTime;
	}
	
	
	public String getCompSymbol() {
		return CompSymbol;
	}
	public void setCompSymbol(String compSymbol) {
		CompSymbol = compSymbol;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getShares() {
		return shares;
	}
	public void setShares(double shares) {
		this.shares = shares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
