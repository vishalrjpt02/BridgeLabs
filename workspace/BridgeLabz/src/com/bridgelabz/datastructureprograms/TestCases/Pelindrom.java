package com.bridgelabz.datastructureprograms.TestCases;

import junit.framework.Assert;

import org.junit.Test;
import com.bridgelabz.datastructureprograms.PalindromeChecker;


public class Pelindrom 
{
	
	@Test
	public void givenOnechar_whencheck_ShouldBetrue()
	{
		
		Assert.assertEquals(true, PalindromeChecker.pelindromcheck("V"));
	}
	
	@Test
	public void giventwochar_whencheck_ShouldBetrue()
	{
		
		Assert.assertEquals(true, PalindromeChecker.pelindromcheck("VV"));
	}
	
	@Test
	public void givenThreechar_whencheck_ShouldBetrue()
	{
		
		Assert.assertEquals(true, PalindromeChecker.pelindromcheck("VIV"));
	}
}
