/*********************************************************************************************
 * This class contains all   properties
 * @author  Vishal kumar
 * @Version 1.0
 * @date	28/11/19
 * @file 	InventryDetails.java
 ********************************************************************************************/
package com.blbz.Classmodel;

public class InventoryModel 
{
	private String Name;
	private int price;
	private int weight;
	
	public InventoryModel(String Name, int price, int weight)	{
		this.Name=Name;
		this.price=price;
		this.weight=weight;
	}
	
	//set and get the values of Name
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	//set and get the values of Price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//set and get the values of weight
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
