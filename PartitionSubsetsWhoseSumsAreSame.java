package com.dailycoding;
/*

This problem was asked by Facebook.

Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.

For example, given the multiset {15, 5, 20, 10, 35, 15, 10}, it would return true,
since we can split it up into {15, 5, 10, 15, 10} and {20, 35}, which both add up to 55.

Given the multiset {15, 5, 20, 10, 35}, it would return false, since we can't split it up into two subsets that add up to the same sum.

*/

import java.io.*;
import java.util.*;

class PartitionSubsetsWhoseSumsAreSame
{
	
	static int finalSum=0;
	static int sum=0;
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of elements you want to enter");
		
		int n = scan.nextInt();
			
		int set[] = new int[n];
		
		System.out.println("Enter numbers");
		
		for(int i=0;i<n;i++)
		{
			set[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(set[i]+" ");
		}
		
		PartitionSubsetsWhoseSumsAreSame p = new PartitionSubsetsWhoseSumsAreSame();
		
		System.out.println("\n"+p.calculateSum(set));
		
		System.out.println("Final Sum = "+sum/2);
		
	}

	public boolean calculateSum(int[] set) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<set.length;i++)
		{
			sum = sum+set[i];
		}
		
		if(sum%2!=0)
		{
			return false;
		}
		
		return partitionPossible(sum/2,0,set);
		
	}

	private boolean partitionPossible(int requiredSum, int currentIndex, int[] set) {
		// TODO Auto-generated method stub
		
		if(requiredSum==0)
		{
			
			
			return true;
		}
		
		if(currentIndex==set.length)
		{
			return false;
		}
		
		
		return (partitionPossible(requiredSum-set[currentIndex], currentIndex+1, set) 
				|| partitionPossible(requiredSum, currentIndex+1, set) );
	}
}





























