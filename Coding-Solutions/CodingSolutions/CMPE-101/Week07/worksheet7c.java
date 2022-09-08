package worksheet7c;

import java.util.Random;
import java.util.Scanner;

public class worksheet7c {
	/*PART 1
	 * 
	 * Static objects are shared between all instances which means it belongs to the class.Once it's declared to a value,
	 * Every other instance will have that static object with last value if it was included in.
	 * 
	 * Non-static objects doesn't have static keyword in them. 
	 * 
	 * If non-static variable will be used in static method, object must be created.
	 * But if static variable will be used in non-static method, there are no need to create a object, it can be used directly
	 *
	 * END OF PART 1*/
	public static int count=0;
	// PART 2
	public int find_random() {
		Scanner scan = new Scanner(System.in); 
		Random rand = new Random();
		int chosen_num = rand.nextInt(10); //Generates random number between 0 and 9
		System.out.println("Random num generated");
		
		while (true) {			
			if(scan.nextInt()==chosen_num) {// loop will end with that condition
				System.out.print("Congrats!\nCount: ");
				count+=1; //Even if it's a right guess, it's still a guess so it counts...
				return count;
			}else {// Take user input until it matches with generated random number
				System.out.println("Try Again!");
				count+=1;
			}			
		}		
	}// END OF PART2
	
	
	// PART 3
	public static double stringWrapper() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		Double d2 = new Double(input); // Java automatically convert string to the double
		// System.out.println(d2);
		// double d = Double.parseDouble(input);  //using convert method
		return d2;	
	}
	// END OF PART 3
	
	//MAIN
	public static void main(String[] args) {
		worksheet7c run = new worksheet7c();
		//PART2
		System.out.println(run.find_random());
		System.out.println("Calling public static int count: "+count);
		//
		//PART3
		System.out.println(stringWrapper());
		//
	}//END MAIN
	
}
