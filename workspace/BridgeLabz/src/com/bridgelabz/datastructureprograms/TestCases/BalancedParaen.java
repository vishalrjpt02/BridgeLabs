package com.bridgelabz.datastructureprograms.TestCases;

import junit.framework.Assert;

import org.junit.Test;

import com.bridgelabz.datastructureprograms.BalancedParentheses;


public class BalancedParaen 
{
	@Test
	public void givenZero_whenCheck_thenShouldBetrue()
	{
		
		Assert.assertEquals(true,BalancedParentheses.checkPara(""));
	}

	@Test
	public void giventwochar_whencheck_ShouldBefalse()
	{
		
		Assert.assertEquals(false,BalancedParentheses.checkPara(")("));
	}
	
	@Test
	public void givenfourchar_whencheck_ShouldBetrue()
	{
		
		Assert.assertEquals(true,BalancedParentheses.checkPara("((23)67)"));
	}
	@Test
	public void givencomplexchar_whencheck_ShouldBefalse()
	{
		
		Assert.assertEquals(false,BalancedParentheses.checkPara("{))){(((}}"));
	}
}
