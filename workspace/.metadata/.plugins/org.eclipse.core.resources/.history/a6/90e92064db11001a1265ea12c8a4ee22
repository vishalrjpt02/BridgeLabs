/**********************************************************************************
 * @author   vishal kumar
 * @version  1.0
 * @purpose  To check in string that Parentheses
 * @date     22/11/19
 * @file	 BalancedParenthesis.java
 **********************************************************************************/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.Utility.Util;
import com.bridgelabz.datastructreprograms.base.Stack;;
public class BalancedParentheses 
{	
	static Stack st=new Stack();
	public static void main(String[] args) 
	{
		String in =Util.readline();
		if(checkPara(in))
			System.out.println("it is balanced");;
	}
	public static boolean checkPara(String s)
	{
		char exp[]=s.toCharArray();
        if (st.isBalanced(exp))
          return true; 
        else
        	return false;
	}

}
