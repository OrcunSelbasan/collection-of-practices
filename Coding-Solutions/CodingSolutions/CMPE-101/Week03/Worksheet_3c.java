package week3;
import java.util.Scanner;

public class Worksheet_3c {
	public static void main(String[] args) {
		
		// START OF PART 1
		int x;
		int y;
		x =11;
		y=10;
		
		boolean firstCond= (7 <= x && x <= 12); // CONDITION ONE
		boolean secondCond= (9 < y && y<23); // CONDITION TWO
		boolean thirdCond = ( 8 <= x && x< 20 && 8 <=y && y<20 && y<x); // CONDITION THREE

		if(firstCond && secondCond && thirdCond) { 
			System.out.printf("x: %3d and y: %3d",x,y);
			
		}else {
			System.out.println("One or more conditions do not return True");
		}// END OF PART 1
		
		
		System.out.println("\n");
//////////////////////////////////////////////////////// //////////////////////////// 
		//////////////////////////// START OF PART 2//////////////////////////// 
//////////////////////////////////////////////////////// //////////////////////////// 		
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		
		
		switch (hour) {
			case 1:
				System.out.println("Morning");	
				break;
			case 2:
				System.out.println("Morning");
				break;
			case 3:
				System.out.println("Morning");
				break;
			case 4:
				System.out.println("Morning");
				break;
			case 5:
				System.out.println("Morning");
				break;
			case 6:
				System.out.println("Morning and Sunrise");
				break;
			case 7:
				System.out.println("Morning");
				break;
			case 8:
				System.out.println("Morning");
				break;
			case 9:
				System.out.println("Morning");
				break;
			case 10:
				System.out.println("Morning");
				break;
			case 11:
				System.out.println("Morning");
				break;
			case 12:
				System.out.println("Morning and Midday/Noon");
				break;
			case 13:
				System.out.println("Afternoon");
				break;
			case 14:
				System.out.println("Afternoon");
				break;
			case 15:
				System.out.println("Afternoon");
				break;
			case 16:
				System.out.println("Afternoon");
				break;
			case 17:
				System.out.println("Afternoon");
				break;
			case 18:
				System.out.println("Afternoon and Sunset");
				break;
			case 19:
				System.out.println("Evening");
				break;
			case 20:
				System.out.println("Evening");
				break;
			case 21:
				System.out.println("Evening");
				break;
			case 22:
				System.out.println("Evening");
				break;
			case 23:
				System.out.println("Evening");
				break;
			case 24:
				System.out.println("Midnight");
				break;

			default:
			System.out.println("Wrong Input");
			break;
			
//////////////////////////////////////////////////////// //////////////////////////// 			
		} /////////////// END OF PART 2//////////////////////////// 
//////////////////////////////////////////////////////// //////////////////////////// 	
		
	System.out.println("\n");
	
//////////////////////////////////////////////////////// //////////////////////////// 	
////////////////////////////START OF PART 3//////////////////////////// //////////////////////////// 
//////////////////////////////////////////////////////// //////////////////////////// 	
	  
		// x = 11  and y = 10
		
		int cond1 = (x>20)? x-5 : x+7;
		int cond2 = (10 < y && y < 30 )? y*2 : y/3;
		int cond3 = (x>25)? x=y : 7*x;
	
		System.out.println(cond1);
		System.out.println(cond2);
		System.out.println(cond3);
	
	

		
		
//////////////////////////////////////////////////////////////////////////////////// 	
////////////////////////////END OF PART 3//////////////////////////// //////////////////////////// 
//////////////////////////////////////////////////////////////////////////////////// 		
	}
}