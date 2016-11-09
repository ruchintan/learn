package hackerank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
	
	public static void solution(int[] A)
	{
		int maks = -1000000;
		for(int i =0; i< A.length; i++)
		{
			int diff =1;
			int index=1;
			int a= A[i];
			int b = A[i];
			for(int j =i+1; j< A.length; j++)
			{
				if(diff < 2 || A[j]==a || b== A[j])
				{
					index++;
					if(A[i]!=A[j])
					{
						b = A[j];
						diff++;
					}
				}
				else
				{
					break;
				}
			}
			maks = Math.max(maks, index);
		}
		System.out.println(maks);
	}
	
	public static void main(String []args)
    {
		int[] array;
		Scanner input = new Scanner(System.in);
        //int n=input.nextInt();
        array = new int[6];
        int n=0;
        while(input.nextLine().isEmpty())
        {
        	array[n]=input.nextInt();
        	n++;
        }
        for (int t=0; t<array.length; t++)
        {
        	System.out.println(array[t]);
        	//array[t] = input.nextInt();
        }
        if(array.length>=0 && array.length<=100000)
        {
        	solution(array);
        }
		//int[] array={5,4,4,5,0,12};
		
	}        
}
