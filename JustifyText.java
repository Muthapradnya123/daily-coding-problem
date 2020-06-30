/*

This problem was asked by Palantir.

Write an algorithm to justify text. Given a sequence of words and an integer line length k, 
return a list of strings which represents each line, fully justified.

More specifically, you should have as many words as possible in each line. 
There should be at least one space between each word. Pad extra spaces when necessary so that each line has exactly length k. 
Spaces should be distributed as equally as possible, with the extra spaces, if any, distributed starting from the left.

If you can only fit one word on a line, then you should pad the right-hand side with spaces.

Each word is guaranteed not to be longer than k.

For example, given the list of words ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"] and k = 16, you should return the following:

["the quick brown", # 1 extra space on the left "fox jumps over", # 2 extra spaces distributed evenly "the lazy dog"] # 4 extra spaces distributed evenly

k=16
the quick brown(1)  = 1 = 1^3 = 1
fox jumps over(2)   = 2 = 2^3 = 8
the lazy dog(4)     = 4 = 4^3 = 64


*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class JustifyText
{
	public static void main(String args[])
	{
		System.out.println("Enter number of words");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		List<String> stringList = new ArrayList<>(); 
		
		for(int i=0;i<n;i++)
		{
			stringList.add(scan.next());
		}
		System.out.println(stringList);
		/* for(int i=0;i<n;i++)
		{
			System.out.println(stringList[i]);
		} */
		System.out.println("Enter value of K");
		int k = scan.nextInt();
		
		String temp = null;
		int counter=0,lineCount=0,spaceCounter=0,wordLength=0,currentLength=0,c=0;
		
		while(stringList.isEmpty() != true)
		{
			if(c<n)
			{
				//System.out.println("\nIteration : "+c);
				temp = stringList.get(c);
				//System.out.println("String : "+temp);
				//stringList.remove(c);
				c++;
			}
			else
			{
				break;
			}
			wordLength = wordLength + temp.length();
			
			if(wordLength < k && wordLength!=k)
			{
				//System.out.println(c);
				if(c>n || c==n)
				{
					System.out.println("\n****SPACES***** 1: "+(k-wordLength));
					
				}
				else
				{
					wordLength++;
					//System.out.println("Word Length 1 : "+wordLength);
				}
				
			}
			else if(wordLength > k && wordLength!=k)
			{
				if(c>n || c==n)
				{
					System.out.println("\n****SPACES***** 2: "+(wordLength-temp.length()-1));
					
				}
				else
				{
					wordLength = wordLength - temp.length() -1;
					c--;
					System.out.println("\n****SPACES***** 3: "+(k-wordLength));
					//System.out.println("Word Length 2 : "+wordLength);	
					wordLength = 0;
				}
				
			}
			else if(wordLength == k)
			{
				//System.out.println("Word Length 3 : "+wordLength);
				System.out.println("\n****SPACES***** 4: "+(wordLength-k));
				wordLength= 0;
				
			}
		}
		
		
	}
}


	



























































