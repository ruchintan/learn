package hackerank;

import java.util.Scanner;

public class SPARSEYUSUF {
	
		public static int searchQuery(String query, String[] arrayInput){
			int result = 0;
			for(int x=0; x<arrayInput.length;x++){
				if(arrayInput[x].equals(query)){
					result +=1;
				}
			}
			return result;
		}
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int inputOne = scan.nextInt();
			String[] arrayString = new String[inputOne];
			//scan.nextLine();
			for(int y =0; y<inputOne; y++){			
				//arrayString[y] = scan.nextLine();
				arrayString[y] = scan.next();
			}
			//String xyz =scan.nextLine();
			int inputTwo = scan.nextInt();
			
			String[] arrayStringTwo = new String[inputTwo];
			int[] resultArray = new int[inputTwo];
			//String xy =scan.nextLine();
			//System.out.println("*** "+xy);
			for(int x = 0; x < inputTwo; x++){
				String query = scan.next();
				//System.out.println("###"+query);
				resultArray[x] = searchQuery(query, arrayString);
			}
			for(int eachResult : resultArray){
				System.out.println(eachResult);
			}
		}
	}
