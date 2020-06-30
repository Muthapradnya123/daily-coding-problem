/*

This problem was asked by Google.

Given a singly linked list and an integer k, remove the kth last element from the list. 
k is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.

Do this in constant space and in one pass.

*/

import java.io.*;
import java.util.*;

class Node
{
	int data;
	Node link;
	
	Node()
	{
		link = null;
		data =0;
	}
	
	Node(int d,Node n)
	{
		data=d;
		link=n;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public void setLink(Node n)
	{
		link = n;
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getLink()
	{
		return link;
	}
	
}

class LinkedList
{
	Node start;
	Node end;
	int size;
	
	LinkedList()
	{
		start = null;
		end = null;
		size = 0;
	}
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void insertAtEnd(int val)
	{
		Node nptr = new Node(val,null);
		size++;
		
		if(start == null)
		{
			start = nptr;
			end = start;
			
		}
		else
		{
			end.setLink(nptr);
			end = nptr;
		}
		
	}
	
	public void display()
	{
		System.out.println("Linked List : ");
		if(size == 0)
		{
			System.out.println("Linked list is empty");
			return;
		}
		if(start.getLink()==null)
		{
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData()+"->");
		ptr = start.getLink();
		while(ptr.getLink()!=null)
		{
			System.out.print(ptr.getData()+"->");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
	}
	
	void deleteKElement(int n, int k)
	{
		if(size == 0)
		{
			System.out.println("Linked list is empty");
			return;
		}
		if(start.getLink()==null)
		{
			System.out.println(start.getData());
			return;
		}
		
		Node ptr = start;
		
		if(k==n)
		{
			ptr = ptr.getLink();
			start = ptr;
			return;
		}
		if(k>n)
		{
			return;
		}
				
		for(int i=0;(ptr.getLink()!=null && i<n-k-1);i++)
		{
			ptr = ptr.getLink();	
		}
		
		Node prev = ptr;
		ptr = ptr.getLink();
		Node next = ptr.getLink();
		
		prev.setLink(next);
		ptr = next;
	}
	
	
}


public class LinkedListRemoveKLastElement
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		LinkedList l = new LinkedList();
		System.out.println("Enter number of elements you want : ");
		int n = scan.nextInt();
		
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++)
		{
			l.insertAtEnd(scan.nextInt());
		}
		
		System.out.println("\nDisplay Linked List : ");
		l.display();
		
		System.out.println("Enter K");
		int k = scan.nextInt();
		 
		int num = n-k;
		
		l.deleteKElement(n,k);
		
		l.display();
		
	}
	
	
}

















