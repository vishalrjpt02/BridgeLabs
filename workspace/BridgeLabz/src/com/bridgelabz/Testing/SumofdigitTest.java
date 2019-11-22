package com.bridgelabz.Testing;
import com.bridgelabz.Utility.Util;
import org.junit.Assert;
import org.junit.Test;



public class SumofdigitTest 
{
	@Test
	public void givenZero_whenDigit_shouldBeZero()
	{
		int arr[]={0,0,0,0};
		int out[]={0,0,0};
		Assert.assertArrayEquals(out,Util.sumof3digit(arr));
	}
	@Test
	public void given3Positivenumber_whenDigit_shouldBeZero()
	{
		int arr[]={1,2,3,4,5};
		int out[]={0,0,0};
		Assert.assertArrayEquals(out,Util.sumof3digit(arr));
	}
	@Test
	public void givenNegativeNumber_whenDigit_shouldBeAllNumbers()
	{
		int arr[]={1,2,-3,4,5,6};
		int out[]={1,2,-3};
		Assert.assertArrayEquals(out,Util.sumof3digit(arr));
	}
}
