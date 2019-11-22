package com.bridgelabz.Datastructre.base;
public class Queue {
	
	

	int Queue[]=new int[10];
	int size;
	int front;
	int rear;
	
	public void enqueue(int item)
	{
		Queue[rear]=item;
		rear++;
		size++;
	
	}
	
	public void Dequeue()
	{
		front=front-1;
		size=size-1;
		
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		return true;
		
		return false;
	}
	
	public int size()
	{
		
		return size;
	}
	
	public void isempty()
	{
		if(Queue[0]==0)
		{
			System.out.println("Queue is empty");
		}
	}
	
	public int Balance(String trans[])
	{
		int balance=0;
		for(int i=0;i<=size;i++)
		{
			if(trans[i].equalsIgnoreCase("dep"))
			{
				balance=balance+Queue[i];
			}
			else if(trans[i].equalsIgnoreCase(""))
			{
				if(balance>=0)
				balance=balance-Queue[i];
				else
					System.out.println("sorry we don't have enough cash");
			}
		Dequeue();	
		}
		return balance;
	}
}