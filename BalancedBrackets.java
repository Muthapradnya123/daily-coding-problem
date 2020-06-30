/*

This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class BalancedBrackets
{
	public static void main(String args[])
	{
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		
		System.out.println("The String : "+s);
		
		char[] stringToCharArray = s.toCharArray();
		
		boolean status = false;
		
		Stack<Character> stack = new Stack<Character>();
		int count =0;
		for (char c : stringToCharArray) 
		{
			System.out.println("Iteration : "+(count++));
			
			if(c=='(' || c=='[' || c=='{')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				if(stack.isEmpty() || stack.pop() != '(')
				{
					System.out.println("Stack status 1 : "+stack.isEmpty());
					
					status=false;
					break;
				}
			}
			
			else if(c=='}')
			{
				if(stack.isEmpty() || stack.pop() != '{')
				{
					System.out.println("Stack status 2 : "+stack.isEmpty());
					status=false;
					break;
				}
			}
			
			else if(c==']')
			{
				if(stack.isEmpty() || stack.pop() != '[')
				{
					
					System.out.println("Stack status 3 : "+stack.isEmpty());
					status=false;
					break;
				}
			}
			
		}
		if(stack.isEmpty())
		{
			status = true;
		}
		
		if(status == true)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}
}



























