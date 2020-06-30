/*
This problem was asked by Microsoft.

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given [100, 4, 200, 1, 3, 2], the longest consecutive element sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.

*/


package com.dailycoding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConsecutiveElementsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		int input[] = new int[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++)
		{
			input[i] = sc.nextInt();
		}
		
		Set<Integer> inputset = new HashSet<Integer>();
		
		for(int i=0;i<n;i++)
		{
			inputset.add(input[i]);
		}
		
		int count=0;
		
		for(int nums : inputset)
		{
			if(!inputset.contains(nums-1))
			{
				int currentnum = nums;
				int count2 = 1;
				
				while(inputset.contains(currentnum+1))
				{
					currentnum++;
					count2++;
				}
				count = Math.max(count, count2);
			}
			
		}
		
		System.out.println("The longest consecutive integer array : "+count);
		
	}

}
