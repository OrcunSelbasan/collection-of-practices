package week4;
import java.util.Random;
import java.util.Scanner;


public class Worksheet04 {
	
	public static void main(String[] args) {
		
		//PART 1
		
		int tails  = 0;	
		int toss=0;
		while(toss<100) {
			
			// Creates random number to make random result of tossing
			Random rand = new Random();        
			int upperbound = 10;
			int random_int=rand.nextInt(upperbound);
			
			//If part can be seen as toss
			if (random_int%2==0) {
				tails++;
			}// modulo two is the condition for tails
			toss++;
			
		}
		int heads = 100-tails;
		System.out.println("Tails: "+tails); 
		System.out.println("Heads: "+heads);
		//END OF PART 1 //Each Time it may result different tail amount in 100 tosses
		
		
		// PART 2
		int k = 5;//this integer value must be columnNumber-1 to print the shape
		for (int i = 0; i < 6; i++) { // setting 6 rows
			for (int j = 0; j < 6; j++) { // setting columns
				if (j<k) {               
					System.out.print(" ");
				}else if ((j==k || j>k) && k>=0) {
					System.out.print("*");	
				}	
			}
			k--;
			System.out.println();
		}//END OF PART 2
		
		
		
		//PART 3
		
		
		while(true) {// directly executes code block
			
			//INPUT
			Scanner scan = new Scanner(System.in);
			
			System.out.println("First num: ");
			int first_given_int = scan.nextInt();
			
			System.out.println("Second num: ");
			int second_given_int = scan.nextInt();
			//END OF INPUT
			
				if (first_given_int*second_given_int == 256) { // IF RESULT IS VALID 
					System.out.println("It's 256!");
					break;//STOP WORKING
				}else {//IF RESULT IS NOT VALID
					continue;//CONTINUE WORKING
				}
		
		}//END OF PART 3
	}
}
