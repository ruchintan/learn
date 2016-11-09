package hackerank;

import java.util.Scanner;

public class reversearray {
	
	public static void main(String[] args)
	{
		int[] inp;
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		if(N<=1000 && N>0)
		{
			inp = new int[N];
			for(int i=0; i<N; i++)
			{
				inp[i]=input.nextInt();
			}
			
			for(int i=N-1; i>=0; i--)
			{
				System.out.print(inp[i]+" ");
			}
		}
	}
}
