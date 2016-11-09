package hackerank;

import java.util.Scanner;

public class factorialrekursion {
	
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		return n*factorial(n-1);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		if(N>=2 && N<=12)
		{
			System.out.println(factorial(N));
		}
	}
}
