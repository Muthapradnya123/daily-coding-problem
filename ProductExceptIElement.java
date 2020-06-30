/*

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class ProductExceptIElement
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
		
		int mul=1;
		
		int[] multiArray = new int[n];
		
		for(int i=0;i<n;i++)
		{
			mul=1;
			for(int j=0;j<n;j++)
			{
				if(j==i)
				{
					//j++;
				}
				else
				{
					mul=mul*arrayList[j];
				}
			}
			multiArray[i]=mul;
		}
		
		System.out.println("Final Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(multiArray[i]);	
		}
		
	}
}















