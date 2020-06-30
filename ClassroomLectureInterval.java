/*

This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

*/

import java.io.*;
import java.util.Scanner;
import java.util.*;


class Interval
{
	int startTime;
	int endTime;
	
	public void setData(int c,int d)
	{
		startTime=c;
		endTime=d;
    }
	
	public int getStartTime() {
        return startTime;
    }
 
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
	
	public int getEndTime() {
        return endTime;
    }
 
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
	
}

public class ClassroomLectureInterval
{
	public static void main(String args[])
	{
		System.out.println("How many entires do you want ? NOTE: Enter a valid positive number!!");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		Interval obj[] = new Interval[n] ;
				
		int s,e;
		System.out.println("Enter data");
		
		for(int i=0;i<n;i++)
		{
			obj[i] = new Interval();
			s=scanner.nextInt();
			e = scanner.nextInt();
			obj[i].startTime = s;
			obj[i].endTime = e;
		}  
 			Arrays.sort(obj, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return	Integer.compare(o1.startTime, o2.startTime);
				//return o1.startTime.compareTo(o2.startTime);
			}
		}); 
		
		System.out.println("\nAfter Sorting");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Start Time = "+obj[i].getStartTime());
			System.out.println("End Time = "+obj[i].getEndTime());
			
		}
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(obj[i+1].startTime < obj[i].endTime)
			{
				count++;
			}
		}
		
		System.out.println("Minimum number of rooms required : "+count);
		
	}
}




















