package com.blbz.Creational.Singleton;

public class StaticBlock {

	private static StaticBlock myInstance;
	
	private StaticBlock(){
		
	}
	
	static {
		try
		{
			myInstance=new StaticBlock();
			System.out.println("Objects initalized while loading class");
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error caught");
		}
		
	}
	
	public static StaticBlock getmyInstance()
	{
		System.out.println("object created address is" +myInstance);
		return myInstance;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("called from main but add remains same" +StaticBlock.getmyInstance());
		
	}

}
