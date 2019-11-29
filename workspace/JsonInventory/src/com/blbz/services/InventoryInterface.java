package com.blbz.services;

import org.json.simple.JSONArray;

public interface InventoryInterface
{
	public void listInventory(JSONArray inventoryList);

	public void writeData();

	public void readData();

	public void defaultInventory();

	
	
}
