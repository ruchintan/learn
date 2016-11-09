package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class alternatingchar {
	public static int checkconsecutive(StringBuffer inp)
	{
		int count_step =0;
		for (int i=0; i<inp.length()-1; i++)
		{
			if(inp.charAt(i)==inp.charAt(i+1))
			{
				count_step++;
			}
		}
		return count_step;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		if(T < 11 && T > 0)
		{
			int testcase=T;
			int i =0;
			while(testcase > 0)
			{
				String inputword = input.next();
				if(inputword.length()<100001 && inputword.length()>0)
				{
					StringBuffer inputstring = new StringBuffer(inputword);
					output.add(checkconsecutive(inputstring));
				}
				testcase--;
			}
			for (int b =0; b<output.size();b++)
			{
				System.out.println(output.get(b));
			}
			
		}
		
		
	}

}
