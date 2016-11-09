package hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pairs {
	
	public static void main(String[] args)
	{
		int[] inp;
		ArrayList<Integer> unique = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		if(N<=100000 && K>0 && K < 1000000000)
		{
			inp= new int[N];
			for (int i=0; i< N; i++)
			{
				inp[i] = input.nextInt();
			}
			int count =0;
			Arrays.sort(inp);
			for (int i=0; i< inp.length-1; i++)
			{
				for (int j=i+1; j< inp.length; j++)
				{
					int differ = inp[j]-inp[i];
					if(differ == K)
					{
						count++;
						break;
					}
				}
			}
			System.out.print(count);
		}
	}

}
