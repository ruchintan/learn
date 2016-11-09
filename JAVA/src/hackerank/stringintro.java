package hackerank;

import java.util.Scanner;

public class stringintro {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String A = input.next();
		String B = input.next();
		System.out.println(A.length()+B.length());
		if (A.charAt(0)> B.charAt(0))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1, A.length())+ " " + B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
	}

}
