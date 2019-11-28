/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to show prime number with anagram using stack
 * @date     23-11-19
 * @file     PrimeAnagramwithStack.java
 *************************************************************************************/

package com.bridgelabz.datastructureprograms;
import com.bridgelabz.datastructreprograms.base.LinkedList;
import com.bridgelabz.datastructreprograms.base.Stack;


public class PrimeAnagramWithStack {

	static Stack<Integer> st =new Stack<Integer>();
	static LinkedList<Integer> list=new LinkedList<Integer>();
	public static void main(String[] args) 
	{
		System.out.println("Printing prime number which are anagrama in range of 1 to 1000");
		checkprime(1,1000);
		//list.show();

	}
	
	
	static void checkprime(int start, int end)
	{
		for(int i=start;i<end;i++)
		{
			boolean checking=false;
			for(int j=i-1;j>1;j--)
			{
				if(i%j==0)
				{
					checking=true;
				}
				
			}
			if(checking==false && Anagram(i) )
				{
						list.add(i);
				}
		}
		//list.show();
		Addtostack(list);
	}
	public static boolean Anagram(int n)
	{
		int reverse=0;
		int number=n;
		while(n>0)
		{
			int temp=n%10;
			reverse=reverse*10+temp;
			n=n/10;
		}
		if(number==reverse)
		{
			return true;
		}
		else
			return false;
	}
	
	
	private static void Addtostack(LinkedList<Integer> list2) 
	{
		//System.out.println(st.pop());

		while(list2.Size()!=0)
			{
				st.push(list2.PoP());
			}
		//list.show();
		while(st.size()>0)
		{
			System.out.println(st.pop());
		}
		
	}
	

}
