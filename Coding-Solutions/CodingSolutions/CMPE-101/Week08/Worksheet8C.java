package worksheet;

import java.util.Random;

public class Worksheet8C {
	
	//PART 1
	public int sumEvenOrOdd(int[] arr, boolean isEven) {
		
		
		int count = 0;// Values will be added to count
		
		
		//Condition
		if (isEven) {// If isEven==true
			for (int i = 0; i < arr.length; i+=2) { //Every even indexed element will be added to count; 
					count+=arr[i];
			}
		}else{// If isEven==false
			for (int i = 1; i < arr.length; i+=2) { //Every odd indexed element will be added to count; 		
					count+=arr[i];
			}
		}//END Condition
		
		return count;
	}//END PART1
	
	//PART2
	public int sumChar(String[] array) {
		
		int count = 0;// Values will be added to count
		
		for (int i = 0; i < array.length; i++) {// total num of char == total length 
			count+= array[i].length();
		}
		
		return count;
	}//END PART2
	
	//PART3
	public int randomValue(int[][] arr) {
		Random rand = new Random();
		int random_array = rand.nextInt(arr.length);// Choose a random nested list in list
		int random_array_length = arr[random_array].length; //Takes the length of chosen list
		int random_value = rand.nextInt(random_array_length);// Choose a random value in chosen list
		int result = arr[random_array][random_value];// Choose random list and a random value from that list
		
		return result;
					
	}// END PART3
	public static void main(String[] args) {
		Worksheet8C run = new Worksheet8C();
		//Test Part1
		System.out.println("PART 1:");
		int[] p1 = {1,2,3,4,5,6,7,8};
		System.out.println(run.sumEvenOrOdd(p1, true));// at i0=1 i2=3 i4=5 i6=7
		System.out.println(run.sumEvenOrOdd(p1, false));// at i1=2 i3=4 i5=6 i7=8
		System.out.println();
		//End Test Part1
		
		//Test Part2
		System.out.println("PART 2:");
		String[] s1 = {"Part","2","Test"};
		System.out.println(run.sumChar(s1));
		System.out.println();
		//End Test Part2
		
		//Test Part3
		System.out.println("PART 3:");
		int[][] rando = {{3,500,1} , {5,4,2,8,-5} , {21,7,-90} , {1000}};		
	/*	for (int i = 0; i < 100; i++) { */
			System.out.println(run.randomValue(rando)); // WORKS
	/*  }
		//End Test Part3*/
	}
}
