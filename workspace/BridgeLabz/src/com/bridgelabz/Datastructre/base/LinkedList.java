package com.bridgelabz.Datastructre.base;

public class LinkedList<T>
	{
		private Node head;	
		Node tail;
		private int size;

		public void add(T data)
		{
			Node node = new Node(data);
			node.next = null;
			
			if(head==null)
			{
				head = node;
				size++;
			}
			else
			{
				Node n = head;
				while(n.next!=null)
				{
					n = n.next;
				}
				n.next =  node;
				size++;
			}
			
		}
		
		
		public void addatstart(T data)
		{
			Node node = new Node(data);
			node.next = null;
			node.next = head;
			head = node;
		}
		
		public void addAt(int index,T data) //throws NullPointerException
		{
			Node node = new Node(data);
			node.data = data;
			node.next = null;
			
			if(index==0)
			{
				addatstart(data);
			}
			else
			{
				Node n = head;
				for(int i=0;i<index-1;i++)
				{
					n = n.next;
				}
			node.next = n.next;
			n.next = node;
			}
		}
		
		public void remove(int index)
		{
			if(index==0)
			{
				head = head.next;
			}
			else
			{
				Node n = head;
				Node n1 = null;
				for(int i=0;i<index-1;i++)
				{
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
				//System.out.println("n1 " + n1.data);
				n1 = null;
			}
		}
		
		
		
		public void show()
		{
			Node node = head;
			
			while(node.next!=null)
			{
				//System.out.print(node.data +" ");
				node = node.next;
			}
			System.out.print(node.data +" ");
		}
		
		
		
		public T pop(int pos) 
		{
			int index = 0;
			Node n = head;
			if (pos == 0) {
				head = head.next;
				size--;
				return (T)n.data;
			}
			Node prev = null;
			while (index != pos) {
				prev = n;
				n = n.next;
				index++;
			}
			prev.next = n.next;
			size -= 1;
			return (T) n.data;
		}
		
		
		public int Size()
		{
			return size;
		}
		
		public boolean contains(T item) {
			Node n = head;
			while (n.next != null) {
				if (n.data.equals(item)) {
					return true;
				}
				n = n.next;
			}
			return false;
		}
		
		@Override
		public String toString() {
			StringBuffer s = new StringBuffer();
			
			Node node = head;
			while (node != null) {
				s.append(node.data);
				node = node.next;
				//s.append(",");
			}
			//s.append(" ]");
			return s.toString();	
	}
}
