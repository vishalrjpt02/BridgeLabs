package com.blbz.Creational.Singleton;

public class ThreadSafe {

	private static ThreadSafe ThreadInstance=null;
	
	private ThreadSafe() {}
	
	private static ThreadSafe getThreadInstance()
	{
		if(ThreadInstance==null)
			ThreadInstance=new ThreadSafe();
		return ThreadInstance;
	}
	
	public static void main(String[] args) {
		System.out.println(getThreadInstance());
	}

}
