package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class lonelynum {
	
	public static void main(String[] args)
	{
		int[] inp;
		ArrayList<Integer> out = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		if(N>0 && N<100)
		{
			inp = new int[N];
			for (int i=0; i<N; i++)
			{
				inp[i]=input.nextInt();
			}
			for (int i=0; i<N; i++)
			{
				int count =1;
				if(inp[i]>0)
				{
					for (int j=i+1; j<N; j++)
					{
						if(inp[j]>0)
						{
							if(inp[i]==inp[j])
							{
								count++;
								inp[j]= -1;
							}
						}
					}
					//System.out.println(count);
					if(count%2!=0)
					{
						out.add(inp[i]);
					}
				}
			}
			for (int i =0;i<out.size();i++)
			{
				System.out.print(out.get(i));
			}
		}
	}

}
