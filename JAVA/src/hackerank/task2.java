package hackerank;

import java.util.Scanner;

public class task2 {
	
	public static void solution(int[] A)
	{
		
	}
	
	public static void main(String []args)
    {
		int[] array;
		Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        array = new int[n];
        for (int t=0; t<n; t++)
        {
        	array[t] = input.nextInt();
        }
        int localmin =0;
        int localmaks =0;
        for(int i=0; i<n; i++)
        {
        	for(int j=i+1; j<n; j++)
        	{
        		if(array[i]== array[j])
        		{
        			i++;
        			continue;
        		}
        		else if(array[i]!=array[j])
        		{
        			if(array[j]<array[j+1]&& j<n-1)
        			{
        				localmin++;
        			}
        			else if((array[j]<array[j+1]&& j<n-1))
        			{
        				
        			}
        		}
        		
        	}
        }
        
		
	}

}
