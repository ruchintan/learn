package hackerank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class fibomodif {
	
	public static BigInteger fibo(BigInteger t1, BigInteger t2, BigInteger n)
	{
		if (n==t1 || n==t2)
		{
			return n;
		}
		else
		{
			return fibo(t1,t2,n.subtract(BigInteger.valueOf(2))).add((fibo(t1,t2,n.subtract(BigInteger.valueOf(1))).pow(2)));
		}
	}
	public static void main(String[] args)
	{	
		BigInteger[] array;
		Scanner input = new Scanner(System.in);
		BigInteger t1 = input.nextBigInteger();
		BigInteger t2 = input.nextBigInteger();
		int n = input.nextInt();	
		BigInteger nn = input.nextBigInteger();
		//System.out.println(fibo(t1,t2,nn));
		BigInteger sum;
		array = new BigInteger[n];
		array[0]=t1;
		array[1]=t2;
		for (int i =2; i<n; i++)
		{
			array[i]=array[i-2].add(array[i-1].pow(2));
		}
		System.out.println((array[n-1]));
	}
}
