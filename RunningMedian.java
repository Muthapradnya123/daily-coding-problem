/*

This problem was asked by Microsoft.

Compute the running median of a sequence of numbers. That is, given a stream of numbers, 
print out the median of the list so far on each new element.

Recall that the median of an even-numbered list is the average of the two middle numbers.

For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:

2 1.5 2 3.5 2 2 2

*/

import java.io.*;
import java.util.*;

public class RunningMedian
{
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = scan.nextInt();
		
		ArrayList<Float> arrayList = new ArrayList<Float>();
		ArrayList<Float> medianList = new ArrayList<Float>();
		
		float num=0;
		
		float median=0;
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			num = scan.nextFloat();
			arrayList.add(num);
			median = displayList(arrayList,i);
			medianList.add(median);
		}
		
		System.out.println("\n");
		Iterator itr=medianList.iterator(); 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	public static float displayList(ArrayList<Float> list, int i)
	{
		//System.out.println("\nIteration : "+i);
		
		if(i==0)
		{
			return list.get(i);
		}
		
		if(i==1)
		{
			return ((list.get(i-1)+list.get(i))/2);
		}
		
		if((i+1)%2==1)
		{
			Collections.sort(list);
			//System.out.println(list.get(i/2));
			return (list.get(i/2));
		}
		
		if((i+1)%2==0)
		{
			Collections.sort(list);
			//System.out.println(list.get((i/2)));
			
			int index = i/2;
			
			return ((list.get(index) + list.get(index+1))/2);
		}
		
		return 0;
		
	}
	
}
































