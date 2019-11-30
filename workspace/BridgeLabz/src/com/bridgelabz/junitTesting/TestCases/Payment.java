package com.bridgelabz.junitTesting.TestCases;
import org.junit.Test;

import com.bridgelabz.junitTesting.MonthlyPayment;

import junit.framework.Assert;
import junit.framework.JUnit4TestAdapter;;

@SuppressWarnings("deprecation")
public class Payment {
	
	@Test
	public void givenZero_WhenpaymentShouldbe_Zero() {
		int result = MonthlyPayment.findPayment(0, 0, 0);
		Assert.assertEquals(0,result);
	}
	
	@Test
	public void givenOne_WhenpaymentShouldbe_zero() {
		int result = MonthlyPayment.findPayment(1, 2, 10);
		Assert.assertEquals(0,result);
	}
	
	@Test
	public void given23_WhenpaymentShouldbe_One() {
		int result = MonthlyPayment.findPayment(23, 2, 10);
		Assert.assertEquals(1,result);
	}
	
	@Test
	public void given230_WhenpaymentShouldbe_Eleven() {
		int result = MonthlyPayment.findPayment(230, 2, 20);
		Assert.assertEquals(11,result);
	}
	@Test
	public void given2300_WhenpaymentShouldbe_140() {
		int result = MonthlyPayment.findPayment(2300, 2, 40);
		Assert.assertEquals(140,result);
	}
	@Test
	public void given23000_WhenpaymentShouldbe_140() {
		int result = MonthlyPayment.findPayment(23000, 2,43);
		Assert.assertEquals(1444,result);
	}
}
