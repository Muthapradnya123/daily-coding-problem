/*

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class TwoNumbersAddUptoK
{
	public static void main(String args[])
	{
		System.out.println("How many numbers do you want to enter? NOTE: Enter a valid positive number!!");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		//System.out.println("Total numers = "+n);	
		System.out.println("Enter "+n+" numbers");	
		int[] arrayList = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arrayList[i]=scanner.nextInt();
		}
		
		boolean flag=false;
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(hashSet.contains(k-arrayList[i]))
			{
					flag=true;
			}
			hashSet.add(arrayList[i]);
		}
		if(flag)
		{
			out.println("YES PRESENT");
		}
		else
		{
			out.println("NOT PRESENT");
		}			
		
		
	}
}



















