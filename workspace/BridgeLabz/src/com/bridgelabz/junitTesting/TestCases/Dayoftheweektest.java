package com.bridgelabz.junitTesting.TestCases;

import junit.framework.Assert;

import org.junit.Test;

import com.bridgelabz.junitTesting.DayOfWeek;


public class Dayoftheweektest 
{
	
	@Test
	public void givenZero_dayoftheweekShouldbe_InvalidInput()
	{
		String result=DayOfWeek.Dayoftheweek(0,0,0);
		Assert.assertEquals("Invalid Input",result);
	}
	
	@Test
	public void given19_11_2019_dayoftheweekShouldbe_tuesday()
	{
		String result=DayOfWeek.Dayoftheweek(19,11,2019);
		Assert.assertEquals("tuesday",result);
	}
	@Test
	public void given19_11_0091_dayoftheweekShouldbe_Invalid_Input()
	{
		String result=DayOfWeek.Dayoftheweek(19,11,91);
		Assert.assertEquals("Invalid Input",result);
	}
	@Test
	public void given26_11_2019_dayoftheweekShouldbe_tuesday()
	{
		String result=DayOfWeek.Dayoftheweek(26,11,2019);
		Assert.assertEquals("tuesday",result);
	}
}
