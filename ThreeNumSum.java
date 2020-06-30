/*
This problem was asked by Microsoft.
Given an array of numbers and a number k, determine if there are three entries in the array which add up to the specified number k. 
For example, given [20, 303, 3, 4, 25] and k = 49, return true as 20 + 4 + 25 = 49.

*/
import java.util.*;
public class ThreeNumSum
{
	public static void main(String args[])
	{
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total elements");
		n = sc.nextInt();
		System.out.println("Enter elements in array");
		int input[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();
		}
		
		boolean value = false;
		
		System.out.println("Enter total sum you want.");
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			//System.out.println("Step "+i);
			if(value==true)
			{
				break;
			}
			for(int j=i;j<n-2;j++)
			{
				//System.out.println("Elements : "+input[i]+" : "+input[j+1]+" : "+input[j+2]);
				if((input[i]+input[j+1]+input[j+2])==k)
				{
					System.out.println("SUCCESS");
					value = true;
					break;
				}
			}
		}
		if(value==false)
		{
			System.out.println("FAIL");
		}
	}
}