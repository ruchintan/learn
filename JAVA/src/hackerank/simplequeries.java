package hackerank;

import java.util.Scanner;

public class simplequeries {
	public static int[] array;
	public static int[] temp;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		array = new int[N];
		temp= new int[N];
		if(N<100001 && N >0 && M < 100001 && M>0)
		{
			int check =0;
			for (int i =0; i< N; i++)
			{
				array[i]= input.nextInt();
				if(array[i]>1000000000 && array[i]<1)
				{
					check =1;
					break;
				}
			}
			if(check==0)
			{
				for(int test =0; test< M; test++)
				{
					int type = input.nextInt();
					int i = input.nextInt();
					int j = input.nextInt();
					if(i > 0 && i <=j && j >= i && j <= N)
					{
						if (type==1)
						{
							int index = i-1;
							int start=0;
							for (int t =0; t < N; t++)
							{
								if(index < j)
								{
									temp[t] = array[index];
									index++;
								}
								else if(index==j && start<i-1)
								{
									temp[t]= array[start];
									start++;
								}
								else
								{
									temp[t]=array[t];
								}
							}
						}
						if (type==2)
						{
							int index2 = j-1;
							int end = N-1;
							for (int t = N-1; t >=0; t--)
							{
								if(index2 >= i-1)
								{
									temp[t]=array[index2];
									index2--;
								}
								else if(index2==i-2 && end>j-1)
								{
									temp[t]= array[end];
									end--;	
								}
								else
								{
									temp[t]=array[t];
								}
							}
						}
						for (int p =0; p<N; p++)
						{
							array[p] = temp[p];
						}
					}
					else
					{
						break;
					}
				}
					long beda = array[0]-array[N-1];
					System.out.println(Math.abs(beda));
					for (int p =0; p<N; p++)
					{
						System.out.print(array[p] + " ");
					}
			}
		}
	}
}
		
