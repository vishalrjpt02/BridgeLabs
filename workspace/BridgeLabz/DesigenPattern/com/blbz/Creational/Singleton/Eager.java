/****************************************************************************************
 * To implement the eager singleton desigen pattern
 * @author	:vishal kumar
 * @version	:1.0
 * @since	:07/11/19
 * @file	:Eager.java
 *****************************************************************************************/


package com.blbz.Creational.Singleton;

public class Eager {
	
	public static void main(String []args)
	{
		System.out.println(eager.getInstance());
	}
}
 class eager
 {
	 private static final eager Bridgelab=new eager();
		
		private eager(){}
		
		public static eager getInstance()
		{
			return Bridgelab;
		}
 }
