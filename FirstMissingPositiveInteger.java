/*

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class FirstMissingPositiveInteger
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
		
		System.out.println("Array List ");	
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arrayList[i]);	
		}
		
		Arrays.sort(arrayList);
		
	/*	System.out.println("Sorted array");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arrayList[i]);	
		}  */
		//find the 
		int num=1;
		/*int firstnum=arrayList[0];
		for(int i=0;i<n;i++)
		{
			if(arrayList[i]>0)
			{
				
				if(i==n-1)
				{
					num=arrayList[i]+1;
					break;
				}
				else
				{
					num=arrayList[i]+1;
					if(arrayList[i+1]==num)
					{
					
					}
					else if(arrayList[i+1]!=num)
					{
						break;
					}
				}
				
			}
			
		}
		*/
		
		// If array contains single element.
		if(n==1)
		{
			if(arrayList[0]!=1)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
			
		} 
		else  // If array contains more than 1 elements
		{
			if(arrayList[0]>1)
			{
				System.out.println("Answer = 1");
				
			}
			else
			{
				for(int i=0;i<n;i++)
				{
					if(i==n-1)
					{
						System.out.println("Answer = "+(arrayList[i]+1));
					}
					else
					{
						// for test case [-1, 0, 5, 7] and duplicate numbers
						if((arrayList[i]>=0) || (arrayList[i]==arrayList[i+1]))
						{
							
							
							if((arrayList[i+1]-arrayList[i]) > 1)
							{
								System.out.println("Answer = "+(arrayList[i]+1));
								break;
							}
							
							
						}
					}
			}
			
				
		}
			
		}
		
	}
}
















