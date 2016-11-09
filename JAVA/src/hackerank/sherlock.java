package hackerank;

import java.util.Scanner;

public class sherlock {

	public static void main(String []args)
    {
		int[] array;
		String[] output;
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        if(test>=1 && test<=10)
        {
        	output = new String[test];
        	for(int t =0; t<test; t++)
            {
            	int n=input.nextInt();
            	array = new int [n];
            	if(n>=1 && n<= 100000)
            	{
        			for(int i=0; i< n; i++)
            		{
            			array[i] = input.nextInt();
            		}
            	int left=0;
            	int flag =0;
            	for(int i=0; i< n; i++)
        		{
            		if(n==1)
            		{
            			flag=1;
            		}
            		else
            		{
            			left = left+array[i];
                		int right =0;
                		for(int j = i+1; j<n; j++)
                		{
                			right = right + array[j];
                			if (right>left-array[i])
                			{
                				break;
                			}
                			else if(left-array[i] == right && j==n-1)
                			{
                				flag =1;
                				break;
                			}
                		}
            		}
            		if(flag==1)
                	{
            			System.out.println("YES");
            			//output[t]="YES";
                		break;
                	}
            	}	
            	if(flag==0)
            	{
            		System.out.println("NO");
            		//output[t]="NO";
            	}
            }
           }
            /*for(int t =0; t<test; t++)
            {
            	System.out.println(output[t]);
            }*/
        }
    }
}
