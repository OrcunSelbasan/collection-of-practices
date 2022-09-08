package homework03;

import java.lang.Math;
import java.util.Arrays;
import java.util.Iterator;

public class Matrix {
	
	// PART 1
	public double[][] matrix_multiplication(double[][] a, double[][] b) {
		
		//row number == array amount in a
		int row = a.length;
		//column number == size of any array in b
		int column = (b.length>0)? b[0].length: -1;	
		//values will be in:
		double[][] arr = new double[row][column];
		
		/*first for is to make rows
		 *second for is to make columns
		 *third for is to make matrix calculation 
		 * => multiply numbers in row with their equivalent in column a[0][0]*b[0][0]+a[0][1]*b[1][0]
		 * which is sum of all a[constant_until_end][i++]*b[k++][constant__until_end]
		 */
		
		if (row==column ) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					for (int k = 0; k < a[0].length; k++) {
						arr[i][j] += a[i][k]*b[k][j];
					}
				}
			}	
		}else if (row>=2 && column > row) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a.length; k++) {
						arr[i][j] += a[i][k]*b[k][j];
					}
				}
			}
		}else if(row==1 && column==1){ // [2] X  [5] == [10]
			arr[0][0]=a[0][0]*b[0][0];
			return arr;
		} else { 
			return arr;
		}
			
		return arr;	
	}// END OF PART 1 
	
	// PART 2
	public double[][] matrix_rotate(double[][] a, double angle){
		
		angle = -1*angle;
		/*
		 * NOTE: 
		 * [cosO,-sinO] [x1,x2,x3...xn]  a should be like second matrix
		 * [sinO, cosO] [y1,y2,y3...yn]
		 *
		 */		
		// This array is constant:
		double[][] rv = {{Math.cos(Math.toRadians(angle)),Math.sin(Math.toRadians(angle))},
		                 {-1*Math.sin(Math.toRadians(angle)),Math.cos(Math.toRadians(angle))}};			
		// Method from part one can be used as it's the result of multiplication of two matrices 
		// rv is constant for matrix rotation 
		// a vary
		// so rv X a is:
		double[][] matrix_mul = matrix_multiplication(rv, a);
		double[][] res = new double[matrix_mul[0].length][matrix_mul.length];
		
		for (int i = 0; i < matrix_mul[0].length; i++) {
			res[i][0] = matrix_mul[0][i];
			res[i][1] = matrix_mul[1][i];
		}
		
		return res;
	}// END OF PART 2
	
	//PART 3
	public double[][] matrix_two_linear(double[][] coefficients, double[][] groundtruth){
		
		//determinant is 1/(ad-bc)
		double determinant = 1/(coefficients[0][0]*coefficients[1][1]-coefficients[0][1]*coefficients[1][0]);
		//inverse array
		double[][] inverse = new double[2][2];
		
		/*		
		 * [d -b]  is needed to find inverse of [a,b]	
		 * [-c a]                               [c,d]
		 * 
		 */	
		inverse[0][0]=coefficients[1][1]; inverse[0][1]=coefficients[0][1]*-1;
		inverse[1][0]=coefficients[1][0]*-1; inverse[1][1]=coefficients[0][0];
		
		// Determinant multiplied with inverse matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				inverse[i][j] *= determinant;
			}
		}
		
		// Result matrix [ [x],[y] ]
		double[][] res = new double[2][1];
		// Inverse coefficients matrix multiplied with groundtruth matrix
		res[0][0] = inverse[0][0]*groundtruth[0][0]+ inverse[0][1]*groundtruth[1][0];  // VALUE OF X
		res[1][0] = inverse[1][0]*groundtruth[0][0]+ inverse[1][1]*groundtruth[1][0];  // VALUE OF Y
			
		return res;
	}// END OF PART 3
	
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		double[][] coeff = {{0.63,0.84},{4.50,4.62}};
		double[][] res = {{3.43},{5.42}};
		System.out.println(Arrays.deepToString(matrix.matrix_two_linear(coeff, res)));
	}
	
}
