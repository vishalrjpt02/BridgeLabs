/**********************************************************************************
 * This file contains all controls that are given by user
 * @author 	Vishal kumar
 * @version 1.0
 * @date 	30/11/19
 **********************************************************************************/


package com.blbz.InventryMannegement.Controller;

import com.blbz.services.implementation.InventoryImplementation;
import com.blbz.utility.Util;

public class Main 
{
	public static void main(String[] args) 
	{
		int temp=0;
		
		
		while(temp==0) 
		{
		System.out.println("mark your choice\n 1 -> view items in inventry \n 2 -> Add Items  \n 3 -> remove Items \n 4 -> Find Total price \n 5 -> Find Total weight \n 6 -> To Exit");
			InventoryImplementation inventoryObject= new InventoryImplementation();
			int n=Util.readint();

			
				
		switch (n)
		{
		
		case 1:
			inventoryObject.view();
			break;
		case 2:
			inventoryObject.add();
			break;
		case 3:
			inventoryObject.remove();
			break;
		case 4:
			inventoryObject.totalPrice();
			break;
		case 5:
			inventoryObject.totalWeight();
			break;
		case 6:
			System.out.println("Thank you");
			temp = 1;
			break;
		default: 
			System.out.println("Invalid input");
			break;
			
		}
		if((Integer.valueOf(n)>'A'||Integer.valueOf(n)>'Z')||(Integer.valueOf(n)>'a'||Integer.valueOf(n)>'z'))
		{
			System.out.println("Exiting the program");
			break;
		}
		}
	}
}