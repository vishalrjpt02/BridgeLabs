package com.blbz.InventryMannegement.Controller;

import com.blbz.services.InventoryInterface;
import com.brlbz.services.implementation.Inventerydetailimpl;

public class InventryController {

	public static void main(String[] args) 
	{
		InventoryInterface details=new Inventerydetailimpl();
		details.defaultInventory();
		details.readData();
		
	}

}
