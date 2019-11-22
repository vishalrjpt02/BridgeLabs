package com.bridgelabz.basic;

import org.junit.Test;


public class StringReplaceTest
{
	@Test
	public void teststring()
	{
		StringReplace test=new StringReplace();
		String result=test.Replace("hello <<username>> , how are you");
		assert.equals(result,"")
	}
}
