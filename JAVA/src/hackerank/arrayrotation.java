package hackerank;

import java.util.Scanner;

public class arrayrotation {
	
	public static void main(String[] args)
	{
		String[] array;
		int[]arr;
		int[] print;
		StringBuffer array1 = new StringBuffer();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int q = input.nextInt();
		if(n>0 && n<=100000 && k>0 && k<=100000 && q>0 && q<=500)
		{
			arr = new int[n];
			print = new int[q];
			for(int nn=0; nn<n; nn++)
			{
				arr[nn]=input.nextInt();
				//int a= input.nextInt();;
				array1.append(String.valueOf(arr[nn]));
			}
			int check_m =0;
			for(int m=0; m<q; m++)
			{
				print[m]=input.nextInt();
				if(print[m]> n-1 && print[m]<1)
				{
					check_m =1;
				}
			}
			if(check_m == 0){
			int count = k%n;
			/*for (int kk=0; kk<count; kk++)
			{
				int temp = array[n-1];
				for (int i = n-1; i >0; i--)
				{
					array[i]=array[i-1];
				}
				array[0]= temp;
			}*/
			array = new String[count];
			//System.out.println(array1.substring(array1.length()-1, array1.length()));
			array[0] = array1.substring(array1.length()-1, array1.length())+ array1.substring(0, array1.length()-1);
			//System.out.println(array[0]);
			for (int kk=1; kk<count; kk++)
			{
				array[kk] = array[kk-1].substring(array[kk-1].length()-1,array[kk-1].length()).concat(array[kk-1].substring(0,array[kk-1].length()-1));
			}
			for(int m=0; m<q; m++)
			{
				//System.out.println(array[count-1]);
				int x=array[count-1].charAt(print[m])-'0';
				System.out.println(x);
			}			
		}
		}
	}
}
