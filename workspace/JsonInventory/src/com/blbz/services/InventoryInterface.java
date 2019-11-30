/*********************************************************************************************
 * This is a interface with all oprations.
 * @author  Vishal kumar
 * @Version 1.0
 * @date	28/11/19
 * @file 	InventryDetails.java
 ********************************************************************************************/

package com.blbz.services;

import org.json.simple.JSONArray;

public interface InventoryInterface
{
	public void listInventory(JSONArray inventoryList);

	public void writeData();

	public void readData();

	public void defaultInventory();

	
	
}
