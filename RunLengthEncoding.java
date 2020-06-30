/*

This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings. 
The basic idea is to represent repeated successive characters as a single count and character. 
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. 
You can assume the string to be encoded have no digits and consists solely of alphabetic characters. 
You can assume the string to be decoded is valid.

*/

import java.io.*;
import java.util.*;

public class RunLengthEncoding
{
	public static void main(String args[])
	{
		System.out.println("Enter input String");
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String outputString = null;
		
		char c;
		int count = 0 , i=0;
		
		int len = s.length();
		
		char[] stringToCharArray = s.toCharArray();
		
		/* while(len>=0)
		{
			System.out.println("Iteration : "+i+ " : "+len);
			count = 0;
			c = stringToCharArray[i];
			while(c == stringToCharArray[i])
			{
				i++;
				count++;
				len--;
				System.out.println("Length : "+len);
			}
			System.out.println("Count : "+c+" : "+count);
			
		} */
		
		/* for(i=0;i<len;i++)
		{
			System.out.println("\nIteration : "+i+ " : "+len);
			count = 0;
			c = stringToCharArray[i];
			while(c == stringToCharArray[i])
			{
				i++;
				count++;
				//len--;
				//System.out.println("Length : "+len);
			}
			System.out.println("Count : "+c+" : "+count);
		} */
		c = stringToCharArray[0];
		for(i=0;i<len;i++)
		{
			//System.out.println("\nIteration : "+i+ " : "+len);
			
			if(c == stringToCharArray[i])
			{
				count++;
			}
			else
			{
				c = stringToCharArray[i];
				System.out.println("Count : "+stringToCharArray[i]+" : "+count);
				count = 0;
			}
		}
		
	}
}






























