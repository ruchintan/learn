package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class operator {
	
	public static void main(String[] args)
	{
		int[] inp;
		Scanner input = new Scanner(System.in);
		double mealCost = input.nextDouble();
		int tipPercent = input.nextInt();
		int taxPercent = input.nextInt();
		
		double tip = mealCost * ((double) tipPercent/(double)100);
		double tax = mealCost * ((double)taxPercent/(double)100);
		double Totalcost = mealCost + tip + tax;
		//System.out.println(tip + " " + tax);
		System.out.println("The total meal cost is " + (int) Math.round(15.8)+ " dollars.");
		
	}

}
