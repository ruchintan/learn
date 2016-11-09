package hackerank;

import java.util.Scanner;

public class array2dhourglass {
	public static void main(String[] args)
	{
		int[][] array;
		array = new int[6][6];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i<6; i++)
		{
			for (int j = 0; j<6; j++)
			{
				array[i][j]= input.nextInt();
			}
		}
		int maximum = -100000;
		for (int i = 0; i<4; i++)
		{
			for (int j=0;j<4;j++)
			{
				int sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j]+ array[i+2][j+1]+array[i+2][j+2];
				maximum= Math.max(maximum,sum);
			}
			
		}
		System.out.println(maximum);
	}

}
