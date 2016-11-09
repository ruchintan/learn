package hackerank;

import java.util.Scanner;

import javax.swing.JPopupMenu.Separator;

public class stdinstdout {
	
	public static void main(String[] args)
	{
		StringBuffer line = new StringBuffer();
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		double d = input.nextDouble();
		String s = input.nextLine();
		s = input.nextLine();
		
		System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
