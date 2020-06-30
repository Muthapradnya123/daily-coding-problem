/*
 
 This problem was asked by Facebook.

Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.

For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.

Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.
 
 
 */


package com.dailycoding;

import java.util.Scanner;

public class NonDecreasingArray {

	static int n;
	static int input[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements.");
		n= sc.nextInt();
		
		System.out.println("Enter elements");
		
		input = new int[n];
		
		int len =n;
		
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();
		}
		
		NonDecreasingArray narray = new NonDecreasingArray();
		
		boolean result = narray.getNonDescArray(input);
		
		
		while(len>0)
		{
			if(result)
			{
				System.out.println("Final Result = "+result);
				for(int i=0;i<n;i++)
				{
					System.out.println(input[i]);
				}
				//break;

			}
			else
			{
				result = narray.getNonDescArray(input);
			}
			len--;
		}
		
		System.out.println("Print array");
		for(int i=0;i<n;i++)
		{
			System.out.println(input[i]);
		}
		
	}

	public boolean getNonDescArray(int[] input) {
		// TODO Auto-generated method stub
		
		int count=0, index=0;
		
		for(int i=0;i<input.length-1;i++)
		{
			if(input[i]>input[i+1])
			{
				count++;
				index=i;
			}
		}
		
		//System.out.println("Count = " + count);
		
		if( count >= 2)
		{
			return false;
		}
		
		if(count == 1)
		{
			
			if(index==0)
			{
				if(input[index+1] == 1)
				{
					input[index]=1;
					return true;
				}
				else
				{
					input[index]=input[index+1]-1;
					return true;
				}
			}
			/*if(index == input.length-1)
			{
				
			}*/
			else
			{
				int num  = input[index-1]+input[index+1];
				input[index] = num/2;
				return true;
			}
				
		}
		
		return true;
	}

}
