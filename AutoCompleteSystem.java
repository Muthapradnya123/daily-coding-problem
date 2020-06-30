/*

This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, 
return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class AutoCompleteSystem
{
	public static void main(String args[])
	{
		System.out.println("Enter input String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		System.out.println("Enter number of Entries to add in String array");
		
		int n = scanner.nextInt();
		
		String dict[] = new String[n];

		for(int i=0;i<n;i++)
		{
			dict[i]=scanner.next();
		}
		
		char[] chinput=input.toCharArray();
		
		HashSet<String> hs = new HashSet<>();
		
		int count=0;
		for(int i=0;i<dict.length;i++)
		{
			
			char[] dictchar = dict[i].toCharArray();
			for(int j=0;j<chinput.length;j++)
			{
				if(chinput[j] == dictchar[j])
				{
					//System.out.println(chinput[j]);
					count++;
					
				}
				if(count==chinput.length)
				{
					
					//System.out.println(dict[i]);
					hs.add(dict[i]);
				}
			}
		}
		
		System.out.println("Total number of words matched = " +count);
		
		Iterator<String> i = hs.iterator(); 
        while (i.hasNext())
		{
			System.out.println(i.next()); 
		}			
            
    } 
		
}
	
























