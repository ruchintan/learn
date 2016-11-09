package hackerank;

import java.util.Scanner;

public class stringcompare {
	
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int sub = input.nextInt();
		String minimum = word.substring(0,sub);
		String maximum = word.substring(0,sub);
		for(int i =1; i<word.length()-(sub-1);i++)
		{
			if(word.substring(i, i+sub).compareTo(minimum) <0)
			{
				minimum = word.substring(i, i+sub);
			}
			if(word.substring(i, i+sub).compareTo(maximum) > 0)
			{
				maximum = word.substring(i, i+sub);
			}
		}
		System.out.println(minimum);
		System.out.println(maximum);
	}

}
