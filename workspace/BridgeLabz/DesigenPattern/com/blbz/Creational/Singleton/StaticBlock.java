/*********************************************************************************************
 * To implement the Singleton desigen patten using Static block
 * @author	:VISHAL KUMAR
 * @version :1.0
 * @Since 	:07/12/19
 * @file	:StaticBlock.java
 **********************************************************************************************/


package com.blbz.Creational.Singleton;

public class StaticBlock {
	//creating a instance which can not be changed
	
 	private static StaticBlock myInstance;
	
	private StaticBlock(){
		
	}
	//Static block has been used so that Instance has been initalised at class loading 
	static {
		//Exception handeling has been given which is differ fro m eager implementation
		try
		{
			myInstance=new StaticBlock();
			System.out.println("Objects initalized while loading class :"+myInstance);
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error caught");
		}
		
	}
	
	public static StaticBlock getmyInstance()
	{
		System.out.println("object created address is :" +myInstance);
		return myInstance;
	}
	
	/*
	 *main method to run the staticBlock class 
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("called from main but add remains same :" +StaticBlock.getmyInstance());
		
	}

}
