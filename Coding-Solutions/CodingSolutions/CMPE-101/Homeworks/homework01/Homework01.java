package homework01;

import java.util.Scanner;

public class Homework01 {

	
	//////////////////////////////////////////////////////// PART 1 ////////////////////////////////////////////////////////////	
	
	public int f(int x) {
		
		// OPTIONAL //int x = scan.nextInt(); //then delete ( int x ) in f
		
		int sum=0;
		
		// f(0) && f(-1) ==> k>0 && k>-1 ==> So it doesn't execute for loop.
		for (int k = 1; k <= x; k++) {// Beginning of the for loop    ///THIS LOOP CAN BE SEEN AS SIGMA WHICH HAS k=1 as lower limit and x as upper limit 
			
			
			sum+= f(k-1);   			//f(x) = sum(k=1,x) f(x) == f(0)-f(-1)+ x + f(1)+f(0)+ x +
			sum+= x;  					//							f(2)-f(1) + x + f(3) +f(2) + x +......+ f(k-1) + f(k-2)*(-1)^k + x 

			//BUT K DETERMINES THE SIGN OF SECOND EXPRESSION (   f(k-2)*(-1)^k    )
			if (k%2==0) {				// ADD IF IT'S EVEN						
				sum+= f(k-2);			 					
			}else{						// SUBSTRACT IF IT'S ODD
				sum-= f(k-2);
			}
		}// End of the for loop
		return sum;
	}										
	//										
				
	//////////////////////////////////////////////////////// END OF PART 1 ////////////////////////////////////////////////////////////
	
	
	//////////////////////////////////////////////////////// PART 2 ////////////////////////////////////////////////////////////
	
	public double func(double x,double n) {// f(x) = x^3-n
		return x*x*x - n;																	
	}// end f(x)
	public double derivative(double x) {//f'(x) = 3x^2
		return 3*x*x;
	}//end f'(x)
	
	//////FORMULA : Xn+1 = Xn - f(Xn)/f'(Xn)
	public double newtonsAlg() {   //
		
		System.out.print("Number : ");     // USER DEFINES NUMBER
		double n = scan.nextDouble();
		
		System.out.print("Initial value : ");	//USER DEFINES INITIAL VALUE
		double x1 = scan.nextDouble(); 
		
		System.out.print("Number of iteration : "); //USER DEFINES THE NUMBER OF ITERATION
		int iter = scan.nextInt();						
		
		double update_x =x1- func(x1,n)/derivative(x1); // first iteration
		
		
			if(iter == 1) {
				return update_x;
			}else{
				for (int i = 0; i < iter; i++) {// loop starts
					update_x = update_x - func(update_x,n)/derivative(update_x); // Result of the loop depends on user's iter input. Result of the loop= X(iter+1)(ex. if iter=4 than result is x5 according to formula			
				}// loop ends																														//+1 comes from first iteration
				return update_x; // returns last value of update_x
			}

			
	} 
	// n:28, x1:3 , iter:1 => 3.037037037037037      // double n = 28; can be used if input is not necessary
	// n:28, x1:3 , iter:2 => 3.036589037977101		 // float should be used for more detailed results
	// n:28, x1:3 , iter:3 => 3.036588971875664
	// n:28, x1:3 , iter:4 => 3.0365889718756627
	
			
	//////////////////////////////////////////////////////// END OF PART 2 ////////////////////////////////////////////////////////////	

	
	//////////////////////////////////////////////////////// PART 3 ////////////////////////////////////////////////////////////
	
	public int sumAllFact() {
		System.out.print("Please enter an integer: ");
		int x = scan.nextInt();				//USER INPUT
		int sum = 0;						
		
		if(x>0) { 													//FIRST CONDITION: IF GIVEN X IS POSITIVE 
			for (int i= 1; i <= x ; i++) {//for loop starts			//THEN CHECK ALL NUMBERS FROM 1 TO X
				if (x%i==0) {										//IF THE NUMBER DIVIDE X WITHOUT REMAINDER
					sum+=i;											//THEN ADD THE NUM TO THE SUM
				}
			}//for loop ends
			
		}else if (x<0) {											//SECOND CONDITION: IF GIVEN X IS NEGATIVE
			for (int i= -1; i >= x ; i--) {//for loop starts 		// THEN CHECK ALL NUMBERS FROM -1 to X
				if (x%i==0) {										//IF THE NUMBER DIVIDE X WITHOUT REMAINDER
					sum+=i;											//THEM ADD THE NUM TO THE SUM
				}
			}//for loop ends
			
		}else {											//THIRD CONDITION: IF GIVEN X IS ZERO
			return 0;									//THEN RETURN ZERO
		}
		return sum;
	}//////////////////////////////////////////////////////// END OF PART 3 ////////////////////////////////////////////////////////////
	
	Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Homework01 run = new Homework01(); //Object is created
		
		System.out.println("Part 1 Test: ");
		System.out.println(run.f(9));
		System.err.println();
		System.out.println("Part 2 Test: ");
		System.out.println("Result : "+run.newtonsAlg());
		System.out.println();
		System.out.println("Part 3 Test");
		System.out.println("Sum of all factors: "+run.sumAllFact());	
		
	}

}
