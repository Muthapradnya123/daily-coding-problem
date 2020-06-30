/*

This problem was asked by Google.

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)
Do this in O(n) time and O(k) space. 
You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class MaxValuesSubArray
{
	public static void main(String args[])
	{
		System.out.println("How many numbers do you want to enter? NOTE: Enter a valid positive number!!");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		System.out.println("Enter "+n+" numbers");	
		int[] arrayList = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arrayList[i]=scanner.nextInt();
		}
		
		System.out.println("Enter value of K");
		int k=scanner.nextInt();
		
		ArrayList<Integer> maxValues = new ArrayList<Integer>();
		
		int max =0, count=0;
		for(int i=0;i<(n-k+1);i++)
		{
			System.out.println("\nIteration : "+i);
			count = 0;
			max = 0;
			while(count<k)
			{
				System.out.println("arrayList[i+count] = "+arrayList[i+count] + " comparing with "+max);
				if(max < arrayList[i+count])
				{
					max = arrayList[i+count];
					
				}
				count++;
			}
			maxValues.add(max);
			System.out.println(max);
		}
		System.out.println("Final Answer");
		System.out.println(maxValues);
       
		
	}
}























