/******************************************************************************************************
 * @author 	:Vishal kumar
 * @Version :1.0
 * @Since	:06/12/19
 * @file	:Lazy.java
 ********************************************************************************************************/
package com.blbz.Creational.Singleton;

public class Lazy {

	private static Lazy LazyInstance;
	
	private Lazy(){}
	
	public static Lazy getLazyInstance()
	{
		if(LazyInstance==null) {
			LazyInstance=new Lazy();
		System.out.println("Object initalized at if block :"+LazyInstance);
		}
		return LazyInstance;
			
	}
	
	public static void main(String[] args) {
		
		System.out.println(getLazyInstance());
	}

}
