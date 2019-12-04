package com.blbz.utility;

public class MyStack<T> 
{

MyLinkedList<T> myLinkedList;
	
	public MyStack(){
		myLinkedList = new MyLinkedList<T>();
	}
	
	public void push(T data){
		myLinkedList.add(data);
	}
	
	public T pop(){
		return myLinkedList.pop();
	}
	
	public T peek(){
		T temp = myLinkedList.pop();
		myLinkedList.add(temp);
		return temp;
	}
	
	public boolean isEmpty(){
		return myLinkedList.isEmpty();
	}
	
	public int size(){
		return myLinkedList.size();
	}
}
