import java.util.Arrays;
import java.util.Scanner;

/*
 
This problem was asked by LinkedIn.
You are given a string consisting of the letters x and y, such as xyxxxyxyy. 
In addition, you have an operation called flip, which changes a single x to y or vice versa.
Determine how many times you would need to apply this operation to ensure that all x's come before all y's. 
In the preceding example, it suffices to flip the second and sixth characters, so you should return 2. 
 
 */




public class FlipXY {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int len=0,x,y,count=0;
		
		String in=null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input string");
		in = sc.next();
		
		len = in.length();
		
		char[] input = in.toCharArray();
		
		//System.out.println(in);
		
		y=x=len-1;
		
		while(y!=0)
		{
			if(input[y]=='x')
			{
				x=y;
				//System.out.println("X Y : "+x+" : "+y);
				//System.out.println("Found X : "+input[y]+" : Index : "+y);
				while(x!=-1 )
				{
					//System.out.println("In while X value : "+x);
					if(input[x]=='y')
					{
						//System.out.println("Found Y : "+input[x]+" : Index : "+x);
						
						//System.out.println("Before X Y: "+input[x]+" : "+input[y]	);
						
						char temp=input[x];
						input[x]=input[y];
						input[y]=temp;
						
						//System.out.println("after X Y: "+input[x]+" : "+input[y]	);
						x--;
						count++;
						
						break;
					}
					x--;
					//count++;
				}
			}
			y--;
		}
		String output = new String(input);
		System.out.println("Count : "+count);
		System.out.println("String : "+output);
		
		
	
		
		

	}

}



















