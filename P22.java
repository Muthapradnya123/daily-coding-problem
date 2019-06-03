/*

This problem was asked by Google.

The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.

You may also use a list or array to represent a set.

*/

import java.io.*;
import java.util.*;

class P22
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of nunbers");
		int n = scan.nextInt();
		
		int[] input = new int[n];
		System.out.println("Enter number");
		for(int i=0;i<n;i++)
		{
			input[i] = scan.nextInt();
		}
		
		long power_size = (long)Math.pow(2,n);
		
		System.out.println("Power = "+power_size);
		
		System.out.println("Power set :");
		
		for(int i = 0; i < power_size; i++)
		{
			System.out.print("{");
			for(int j=0;j<n;j++)
			{
				if ((i >> j) % 2 == 1)
				{
					System.out.println("*** i>>j = " + i +" :"+j);
					System.out.print(input[j]+",");
				}
			}
			System.out.print("}");
			System.out.println("\n");
		}
		
		
	}
}





























