/*************************************************************************************
 * @author   Vishal kumar
 * @Version  1.0
 * @purpose  to implement Deque
 * @date     19-11-19
 * @file     Deque.java
 *************************************************************************************/


package com.bridgelabz.datastructreprograms.base;
public class MyDeque 
{
	static final int max=100;
	
	int arr[];
	int size;
	int front;
	int rear;
	
	public MyDeque(int size)
	{
		arr=new int[max];
		front=-1;
		rear=0;
		this.size=size;
	}
	
	boolean isempty()
	{
		return (front==-1);
	}
	
	public void addFront(int item)
	{
		if(rear==size-1 && front==-1)
		{
			System.out.println("queue is full");
		}
		
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
			front=size-1;
		else
			front=front-1;
		arr[front]=item;
	}
	
	
	public void addrear(int item)
	{
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(rear==size-1)
			rear=0;
		else
			rear=rear+1;
		arr[rear]=item;
	}
	
	
	public void removefront()
	{
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			if(front==rear)
			{
				front=0;
			}
			else
			{
				front=front+1;
			}
		}
	}
	
	
	public void removerear()
	{
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(rear==0)
		{
			rear=size-1;
		}
		else
			rear=rear-1;
	}
	
	public int getfront()
	{
		if(isempty())
		{
			System.out.println("underflow");
			return -1;
		}
		return(arr[front]);
	}
	
	public int getrear()
	{
		if(isempty() || rear<0)
		{
			return -1;
		}
		return (arr[rear]);
	}
}
