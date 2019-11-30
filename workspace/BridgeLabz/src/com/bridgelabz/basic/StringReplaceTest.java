package com.bridgelabz.basic;

import org.junit.Test;

import junit.framework.Assert;


public class StringReplaceTest
{
	@Test
	public void teststring()
	{
		StringReplace test=new StringReplace();
		String result=StringReplace.Replace("vishal");
		Assert.assertEquals(result,"hello vishal , how are you ");
	}
}
