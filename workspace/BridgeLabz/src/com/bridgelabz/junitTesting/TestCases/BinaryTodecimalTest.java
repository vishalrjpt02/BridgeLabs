package com.bridgelabz.junitTesting.TestCases;

import org.junit.Test;

import junit.framework.Assert;

import com.bridgelabz.junitTesting.BinarytoDecimal;
;

public class BinaryTodecimalTest
{
	@Test
	public void given0_whentoBinary_ShouldBeZero()
	{
		Assert.assertEquals(0.0, BinarytoDecimal.toBinary(0));
	}

	@Test
	public void givenOne_whentoBinary_ShouldBeZero()
	{
		Assert.assertEquals(0.0, BinarytoDecimal.toBinary(0));
	}

	@Test
	public void givenfifty_whentoBinary_ShouldBeThirtyEight()
	{
		Assert.assertEquals(38.0, BinarytoDecimal.toBinary(50));
	}

	@Test
	public void givenHundred_whentoBinary_ShouldBeSeventy()
	{
		Assert.assertEquals(70.0, BinarytoDecimal.toBinary(100));
	}

	@Test
	public void given100000_whentoBinary_ShouldBe82310()
	{
		Assert.assertEquals(82310.0, BinarytoDecimal.toBinary(100000));
	}
}
