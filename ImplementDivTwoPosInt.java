package com.dailycoding;

import java.util.Scanner;

/*

This question was asked by ContextLogic.

Implement division of two positive integers without using the division, multiplication, or modulus operators. 
Return the quotient as an integer, ignoring the remainder.

*/

public class ImplementDivTwoPosInt
{
	public static void main(String[] args) {
	
		int divident=0, divisor=0, count=0,num=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter divident : ");
		divident = sc.nextInt();
		
		System.out.println("Enter divisor : ");
		divisor = sc.nextInt();
		
		boolean negateResult = false;
		
		if(divident <0 || divisor <0)
		{
			negateResult = true;
		}
		
		if(divident <0 && divisor <0)
		{
			negateResult = false;
		}
		
		if(divident < 0 )
		{
			divident = Math.abs(divident);
		}	
		if( divisor <0)
		{
			divisor = Math.abs(divisor);
		}	
		
		boolean flag = true;
		
		while(flag)
		{
			num = num +divisor;
			count++;
			if(num > divident )
			{
				count--;
				break;
			}
			if(num == divident)
			{
				break;
			}
			
		}
		
		if(negateResult)
		{
			count = (-count);
		}
		
		System.out.println("Quotient = "+count);
		
	}	
}	


