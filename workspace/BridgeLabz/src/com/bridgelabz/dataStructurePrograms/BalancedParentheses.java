package com.bridgelabz.dataStructurePrograms;
import java.util.*;

import com.bridgelabz.Datastructre.base.stack;
public class BalancedParentheses 
{	
	public static void main(String[] args) 
	{
		stack st=new stack();
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		char exp[]=s.toCharArray();
          if (st.isBalanced(exp))
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
		
	}


}
