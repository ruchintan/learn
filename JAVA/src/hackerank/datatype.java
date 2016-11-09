package hackerank;

import java.util.Scanner;

public class datatype {
	public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        for(int i=0;i<test;i++)
        {
            try
            {
                long inp= input.nextLong();
                System.out.println(inp+" can be fitted in:");
                if(inp < 128 || inp > -128)
                {
                	System.out.println("* byte");
                }
                if(inp <32768 || inp > -32768)
                {
                	System.out.println("* short");
                }
                if(inp < 2147483647 || inp > -2147483648)
                {
                	System.out.println("* short");
                }
                if(inp<-2147483648 || inp>2147483647 || inp>-2147483648|| inp<2147483647)
                {
                	System.out.println("* long");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(e+" can't be fitted anywhere.");
            }

        }
    }
}

