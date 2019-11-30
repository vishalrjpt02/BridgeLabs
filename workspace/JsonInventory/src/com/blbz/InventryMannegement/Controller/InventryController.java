package com.blbz.InventryMannegement.Controller;

import com.blbz.services.InventoryInterface;
import com.blbz.utility.Util;
import com.brlbz.services.implementation.Inventerydetailimpl;

public class InventryController {

	public static void main(String[] args) 
	{
		InventoryInterface details=new Inventerydetailimpl();
		details.defaultInventory();
		details.readData();
		int temp=0;
		while(temp==0)
		{
			System.out.println("Mark your selection");
			System.out.println("1. for show inventry\n" +"2. for add invertry\n" +"3. for  exit");
			int choice=Util.readint();
			switch(choice)
			{
			case 1:
				details.defaultInventory();
			case 2:
				details.writeData();
			case 3:
				temp=1;
			}
			
			
		}
	}

}
