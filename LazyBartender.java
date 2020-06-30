/*

This problem was asked by Amazon.
At a popular bar, each customer has a set of favorite drinks, and will happily accept any drink among this set.
For example, in the following situation, customer 0 will be satisfied with drinks 0, 1, 3, or 6.
preferences = {
    0: [0, 1, 3, 6],
    1: [1, 4, 7],
    2: [2, 4, 7, 5],
    3: [3, 2, 5],
    4: [5, 8]
}
A lazy bartender working at this bar is trying to reduce his effort by limiting the drink recipes he must memorize. 
Given a dictionary input such as the one above, return the fewest number of drinks he must learn in order to satisfy all customers.
For the input above, the answer would be 2, as drinks 1 and 5 will satisfy everyone.

*/
import java.util.*; 

public class LazyBartender
{
	public static void main(String args[])
	{
		System.out.println("Enter number of entries");
		int entries=0;
		Scanner sc  = new Scanner(System.in);
		entries = sc.nextInt();
		
		ArrayList<Integer> al[] = new ArrayList[entries];
		
		for(int i=0;i<entries;i++)
		{
			al[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<entries;i++)
		{
			System.out.println("Enter number of preferences for input "+(i+1));
			int input = sc.nextInt();
			System.out.println("Enter data");
			for(int j=0;j<input;j++)
			{
				int data = sc.nextInt();
				al[i].add(data);
			}
		}
		System.out.println("\n Data entered :"); 
		for(int i=0;i<entries;i++)
		{
			
			for(int j=0;j<al[i].size();j++)
			{
				System.out.print(al[i].get(j) + " ");
			}
			System.out.println(); 
		}
		
		ArrayList<Integer> count_al[] = new ArrayList[entries];
		
		for(int i=0;i<entries;i++)
		{
			count_al[i] = new ArrayList<Integer>();
		}

		//System.out.println("\n count_al :"); 
		for(int i=0;i<entries;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				count_al[i].add(0);
				//System.out.print(count_al[i].get(j) + " ");
			}
			//System.out.println(); 
		}
		
		for(int i=0;i<entries;i++)
		{
			//System.out.print("\n STEP : "+i);
			for(int j=0;j<al[i].size();j++)
			{
				int data = al[i].get(j);
				int count=0;
				//System.out.print("\n Data to compare : "+data);
				//System.out.print("\n Traverse data: ");
				for(int k=0;k<entries;k++)
				{
					for(int l=0;l<al[k].size();l++)
					{
						if(k==i)
						{  //skip
							l++;
						}
						else
						{
							//System.out.print(al[k].get(l) + " ");
							
							if(data==al[k].get(l))
							{
								count++;
								if(count_al[i].get(1)<count)
								{
									count_al[i].set(0,data);
									count_al[i].set(1,count);
								}
								
								
							}
							
							
						}
						//System.out.print(" ");
					}
					
				}
				
			}
		}
		
		Set<Integer> set = new HashSet<Integer>();
		//System.out.print("\n count_al : ");
		for(int i=0;i<entries;i++)
		{
			
			for(int j=0;j<count_al[i].size();j++)
			{
				set.add(count_al[i].get(0));
				//System.out.print(count_al[i].get(0) + " ");
			}
			//System.out.println(); 
		}
		
		System.out.println("\nThe lazy bartender has to make total of "+set.size()+" drinks. ");
		System.out.println("Name of drinks to make");
		System.out.println(set);
		
		
		
		
	}
}

























