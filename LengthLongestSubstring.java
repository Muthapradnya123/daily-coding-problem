/*

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;  

public class LengthLongestSubstring
{
	public static void main(String args[])
	{
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		//System.out.println(s);
		
		//convert string to char array
		
		char[] stringToCharArray = s.toCharArray();
		for (char c : stringToCharArray) 
		{
			System.out.println(c);
		}
		
		HashSet<Character> set=new HashSet();  
		
		/* Iterator<Character> i=set.iterator();  
        while(i.hasNext())  
        {  
           System.out.println(i.next());  
        }  */ 	
		
		System.out.println("Enter value of K");
		int k=scanner.nextInt();
		
		System.out.println("K = "+k);
		
		int start_index=0, end_index=0, max=0, len=0;
		
		int count=0;
		
		int i=0,j=0;
		for(i=0;i<stringToCharArray.length;i++)
		{
			//System.out.println("\n Iteration I= "+i); 
			set.clear();
			
			count=0;
			len=0;
			for(j=i;j<stringToCharArray.length;j++)
			{
				//System.out.println("\n Iteration J= "+j); 
				if(count!=k && set.contains(stringToCharArray[j])!=true)
				{
					//System.out.println(j+" = "+stringToCharArray[j]); 
					set.add(stringToCharArray[j]);
					count++;
				}
				if(set.contains(stringToCharArray[j]))
				{
					len++;
				}
				else
				{
					//System.out.println("broke"); 
					break;
				}
			}
			//System.out.println("after broke"); 
			if(max<len)
			{
				end_index=j;
				start_index=i;
				max=len;
			}
		}
		System.out.println("\nMain String len = "+stringToCharArray.length); 
		System.out.println("\nSub-String len = "+max); 
		//System.out.println(start_index+" = "+end_index); 
		System.out.println("\nSub-String :"); 
		for(i=start_index;i<end_index;i++)
		{
			System.out.print(stringToCharArray[i]);
		}
		System.out.println("\n \n"); 
	}
}
















