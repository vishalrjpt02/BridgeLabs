package com.bridgelabz.Testing;

import junit.framework.Assert;

import org.junit.Test;

import com.bridgelabz.junitTesting.VendingMachine;


public class TestVenMechine 
{
	@Test
	public void givenZero_whenCount_thenShouldBeZero()
	{
		
		Assert.assertEquals(1,VendingMachine.count(100));
	}
	@Test
	public void givenOne_whenCount_thenShouldBeOne()
	{
		
		Assert.assertEquals(2,VendingMachine.count(1050));
	}
}
