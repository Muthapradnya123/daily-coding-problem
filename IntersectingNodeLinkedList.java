/*

This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


class Node
{
	int data;
	Node link;
	
	Node()
	{
		link=null;
		data=0;
	}
	Node(int d, Node n)
	{
		data=d;
		link=n;
	}
	public void setLink(Node n)
	{
		link=n;
	}
	public void setData(int d)
	{
		data=d;
	}
	public Node getLink()
	{
		return link;
	}
	public int getData()
	{
		return data;
	}
}

class LinkedList
{
	Node start;
	Node end;
	int size;
	
	LinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return start==null;
	}
	public int getSize()
	{
		return size;
	}
	
	public void insertAtEnd(int val)
	{
		Node nptr = new Node(val,null);
		size++;
		
		if(start==null)
		{
			start=nptr;
			end=start;
		}
		else
		{
			end.setLink(nptr);
			end=nptr;
		}
	}
	
	public void display()
	{
		System.out.println("Linked List :");
		if(size==0)
		{
			System.out.println("Linked List is empty!");
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
	
	void findIntersection(LinkedList l1, LinkedList l2)
	{
		System.out.println("Linked List :");
		if(size==0)
		{
			System.out.println("Linked List is empty!");
			return;
		}
		if(start.getLink()==null)
		{
			System.out.println(start.getData());
			return;
		}
		Node ptr = l1.start;
		//System.out.print(start.getData()+"->");
		//ptr = start.getLink();
		while(ptr.getLink()!=null)
		{
			System.out.print(ptr.getData()+"->");
			ptr = ptr.getLink();
		}
		//System.out.println(ptr.getData());
	}
	}



public class IntersectingNodeLinkedList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l = new LinkedList();
		System.out.println("Enter number of elements you want to enter");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			l1.insertAtEnd( sc.nextInt() );   
		}
		
		l1.display();
		
		System.out.println("Enter number of elements you want to enter in Second linked list");
		n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			l2.insertAtEnd( sc.nextInt() );   
		}
		
		l2.display();
        
		System.out.println("Intersection point is :");
		l.findIntersection(l1,l2);
		
		
	}
}




























