package hackerank;

import java.util.Scanner;

public class stringconstruct {
	
	public static void main(String[] args)
	{	
		int[] output;
		StringBuffer p = new StringBuffer();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		output = new int[n];
		if(n>0 && n<6)
		{
			for(int i =0; i<n; i++)
			{
				String s = input.next();
				int cost =0;
				for (int index =0; index<s.length();index++)
				{
					int end = s.length()-1;
					int check =0;
					while(end != index-1)
					{
						if(p.toString().contains(s.substring(index, end+1)))
						{
							p.append(s.substring(index, end+1));
							index=end;
							check =1;
							break;
						}
						end--;
					}
					if(check==0)
					{
						p.append(s.substring(index, index+1));
						cost++;
					}
				}
				output[i]=cost;
				p.delete(0, p.length());
			}
			for(int i =0; i<n; i++)
			{
				System.out.println(output[i]);
			}
		}
	}

}
