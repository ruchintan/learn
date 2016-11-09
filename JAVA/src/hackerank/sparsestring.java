package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class sparsestring {
	
	public static void main(String args[])
	{
		ArrayList<String> sequence= new ArrayList<String>();
		ArrayList<String> query= new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		if(N<1001 && N >0)
		{
			for (int i =0; i< N; i++)
			{
				sequence.add(input.next());
			}
			int Q = input.nextInt();
			if(Q<1001 && Q >0){
			for (int i =0; i< Q; i++)
			{
				query.add(input.next());
			}
			for (int q =0; q<Q; q++)
			{
				int count =0;
				for (int seq =0; seq<N; seq++)
				{
					if(sequence.get(seq).equals(query.get(q)))
					{
						count++;
					}
				}
				System.out.println(count);
			}
		}
		}
	}
}
