/***********************************************************************************
 * @purpose - An Anagram Detection Example
 * @author  - Vishal Kumar
 * @version - 1.0
 * @date 	- 14-11-2019
 * @FileName- Pelindromchecker.java
 ************************************************************************************/

package com.bridgelabz.algorithemProgram;
import java.util.Scanner;
public class AnagramDetection 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(checkanagrm(s1,s2))
		{
			System.out.println("yes it is an anagram");
		}
	}
	/*
	 * method to find out that String is an anagram or not
	 */
		public static boolean checkanagrm(String in,String comp)
		{
			char []ar1=in.toCharArray();
			char []ar2=comp.toCharArray();
			String estring="";
			boolean chk=false;
			for(int i=ar2.length-1;i>=0;i--)
			{
				estring=estring+ar2[i];
			}
			ar2=estring.toCharArray();
			for(int i=0;i<ar1.length;i++)
			{
				if(ar1[i]==ar2[i])
				{
					chk=true;
				}
				else
					chk=false;
			}
			return chk;
	}

}
