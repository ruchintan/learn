package hackerank;

import java.util.Scanner;

public class beautifulbinary {
		
	public static int checkbeautiful(StringBuffer inp)
	{
		int count_step =0;
		for (int i=0; i<inp.length()-2; i++)
		{
			if(inp.substring(i,i+3).equals("010"))
			{
				inp.replace(i, i+3, "011");
				count_step++;
			}
		}
		return count_step;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		if(len < 101 && len > 0)
		{
			//Scanner input2 = new Scanner(System.in);
			int check=0;
			String inputword = input.next();
			for (int i = 0;i<inputword.length();i++)
			{
				if(inputword.substring(i, i+1).equals("0")|| inputword.substring(i, i+1).equals("1"))
				{
					check =0;
				}
				else
				{
					check = 1;
					break;
				}
			}
			if(inputword.length()== len && check == 0)
			{
				StringBuffer inputstring = new StringBuffer(inputword);
				System.out.println(checkbeautiful(inputstring));
			}
		}
		
		
	}
}

