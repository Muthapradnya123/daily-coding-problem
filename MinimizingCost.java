/*

This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. 
He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, 
return the minimum cost which achieves this goal.

eg 

11	16	12	5 - 5
9	4	7	3 - 4
17	19	5	6 - 5
18	11	9	12 - 18

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*; 
import java.

public class MinimizingCost
{
	public static void main(String args[])
	{
		int n,k;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter N : Number of houses :");
		n=scan.nextInt();
		
		System.out.println("Enter K : Number of colors :");
		k=scan.nextInt();
		
		int arr[][] = new int[n][k];
		
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				arr[i][j] = scan.nextInt();
			}
			
		}
		
		System.out.println("Matrix :");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println("");
		}
		
		//logic
		
		int min=arr[0][0],sum=0,index=;
		
		 for(int i=0;i<n;i++)
		{
			System.out.println("\nIteration : "+i);
			index = i;
			min=arr[i][0];
			
			for(int j=0;j<k;j++)
			{
				if(j==index)
				{
					System.out.println("Skipping "+index);
					j++;
				}
				else
				{
					if(min > arr[i][j])
					{
						min = arr[i][j];
						index = i;
						System.out.println("Index = "+index);
						
					}
				}
				
			}
			System.out.println("Min = "+min);
			sum = sum + min;
		} 
		System.out.println("Min Cost = "+sum);
		
		
	}
}






















