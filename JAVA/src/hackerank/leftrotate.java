package hackerank;

import java.util.Scanner;

public class leftrotate {
	public static void main(String[] args)
	{	
		int[] array;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int d = input.nextInt();
		if(n<100001 && n >0 && d <= n && d>0)
		{
			array = new int[n];
			for (int i =0; i< n; i++)
			{
				array[i]=input.nextInt();
			}
			int count = d % n;
			for (int j =0; j< count; j++)
			{
				int temp = array[0];
				for (int i =0; i <n-1; i++)
				{
					array[i] = array[i+1];
				}
				array[n-1]=temp;
			}
			for (int i =0; i< n; i++)
			{
				System.out.print(array[i]+" ");
			}
		}
	}
}
