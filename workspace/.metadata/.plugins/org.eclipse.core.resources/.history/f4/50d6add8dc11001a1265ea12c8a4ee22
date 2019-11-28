package com.bridgelabz.datastructureprograms;
import com.bridgelabz.Utility.Util;
import com.bridgelabz.datastructreprograms.base.Queue;
public class BankingCashCounter {

	public static void main(String[] args) 
	{
		System.out.println("enter number of people that can be in queue");
		int num=Util.readint();
		int money=0;
		String arr[]=new String[num];
		Queue q1=new Queue();
		for(int i=0;i<num;i++)
		{
			System.out.println("enter the amount for "+(i+1) +" Customer");
			q1.enqueue(Util.readint());
			System.out.println("Enter the type of transection like dep:-Deposit or wid:-for Withdral");
			arr[i]=Util.readnext();
			
		}
		money=q1.Balance(arr);
		if(money>1)
			System.out.println("Avilable amount in the bank is "+money);
		
	}
}
