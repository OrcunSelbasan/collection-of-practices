package week05;

import java.util.Scanner;

public class week05worksheet {
	
	Scanner scan= new Scanner(System.in);// Input
	
	// PART 1
	// helper factorial function
	public int factorial(int n) { 
		int num = 1;
		for (int i = 1; i <=n; i++) { // multiplies all numbers in range of n and n is inclusive
			num*=i;
		}
		return num; // result of factorial
	}
	// main func   // binom formula ==> x!/(x-k)!*k!
	public int binomExp(int n, int m) {
		//Default result
		int result = 0;
		
		
		if (n>m) {// Cond one
			result+= factorial(n)/(factorial(n-m)*factorial(m)); //binom formula is applied
		}else if (n==m) { //Cond 2
			result+=1;
		}else { // Cond 3 which is n<m
			result+= factorial(m)/(factorial(m-n)*factorial(n)); //binom formula is applied
		}
			
		return result;
	
	}//PART 1 ENDS
	
	//PART 2
	
	public int calculate(int x, int y) {
		
		System.out.println("Choose operation: Summation(+) Multiplication(*) ");
		// Taking char input from user
		char op = scan.next().charAt(0);
		// Default result
		int result = 0;
		
		switch (op) { // Checks cases in terms of op
		case '+':	// if char is '+'
			result = x + y;//updates result
			break;
		case '*':	// if char is'*'
			result = x * y;//updates result
			break;
		default:	// if op doesn't match with cases
			System.out.println("Invalid Input!");
			break;
		}
		
		return result; // returns the value of result
	}// PART 2 ENDS
	
	//PART 3
	public boolean inCircle(int x, int y, int r) {
		// basic definitions for formula ==> x^2 + y^2 = r^2
		int rsqr = r*r;
		int xsqr = x*x;
		int ysqr = y*y;
		int sum = xsqr+ysqr;
		
		if (sum<=rsqr) { //  x^2 + y^2 <= r^2
			return true;
		} else {		//  x^2 + y^2 > r^2
			return false;
		}
	}// PART 3 ENDS
	
	
	
	public static void main(String[] args) {
		week05worksheet run = new week05worksheet();//Object Create
		//Part 1 test
		System.out.println("Factorial Test:");
		System.out.println(run.factorial(5));
		System.out.println("Part 1:");
		System.out.println(run.binomExp(5,3));
		System.out.println(run.binomExp(2,4));
		//Part 2 test
		System.out.println("Part 2:");
		System.out.println(run.calculate(5, 3));
		System.out.println(run.calculate(-5, -4));
		//Part 3 test
		System.out.println("Part 3:");
		System.out.println(run.inCircle(1, 1, 3));
		System.out.println(run.inCircle(3, 4, 5));
		System.out.println(run.inCircle(-3, -4, -5));
		System.out.println(run.inCircle(4, -4, -5));
	}
}
