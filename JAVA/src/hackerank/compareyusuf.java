package hackerank;

import java.util.Scanner;

public class compareyusuf {
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			int inputLength = scan.nextInt();
			String bigEST = "";
			String lowEST = "";
			int longIter = input.length()-inputLength+1;
			String[] arrayString = new String[longIter];
			//Insert Data
			for(int x=0; x<longIter; x++){
				String tempo = input.substring(x,x+inputLength);
				arrayString[x] = tempo;
			}
			bigEST = arrayString[0];
			lowEST = arrayString[0];
			for(int y=1; y<arrayString.length; y++)
			{
				int resultBig = bigEST.compareTo(arrayString[y]);
				if(resultBig > 0){
					bigEST = arrayString[y];
				}
				int resultLow = lowEST.compareTo(arrayString[y]);
				if(resultLow < 0){
					lowEST = arrayString[y];
				}
			}
			System.out.print(bigEST+"\n"+lowEST);
		}
	}
			
