package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayreverse {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int check=0;
		if( N < 1001 && N > 0)
		{
			for(int i = 0; i< N; i++)
			{
				int member = input.nextInt();
				if(member<10001 && member>0)
				{
					array.add(member);
				}
				else
				{
					check =1;
					break;
				}
			}
		}
		if(check==0)
		{
			for(int i = N-1; i >= 0; i--)
			{
				System.out.print(array.get(i)+" ");
			}
		}
	}
}
