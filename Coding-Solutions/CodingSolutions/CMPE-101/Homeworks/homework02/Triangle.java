package homework02;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
	
	// Point properties
	private Point pointA= new Point(); //pointa
	private Point pointB= new Point(); //pointb
	private Point pointC= new Point(); //pointc
	// End of prop.
	
	//Constructors
	public Triangle() {}
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		//super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}//End of Constructor	
	
	// SETTER GETTER
	public Point getPointA() { //GET VALUES OF A(x,y)
		return pointA;
	}//END getA
	
	public void setPointA(Point pointA) {//SET VALUES OF A(x,y)
		this.pointA = pointA;
	}//END setA
	
	public Point getPointB() {//GET VALUES OF B(x,y)
		return pointB;
	}//END getB
	
	public void setPointB(Point pointB) {//SET VALUES OF B(x,y)
		this.pointB = pointB;
	}//END setB
	
	public Point getPointC() {//GET VALUES OF C(x,y)
		return pointC;
	}//END getC
	
	public void setPointC(Point pointC) {//SET VALUES OF C(x,y)
		this.pointC = pointC;
	}//END setC
	// END OF SETTER GETTER
	
	// toString method
	@Override
	public String toString() {
		return "Triangle \n [pointA=" + pointA +"\n"+ ", pointB=" + pointB +"\n"+ ", pointC=" + pointC + "]";
	}// END of the toString method
	
	public Triangle rotate(Triangle triangle,double degree) {// Basically apply same rotation formula for
															 // different points 	
		// SETTING NEW COORDINATES FOR POINT A				 // formula => P(X,Y) and X= x*cos(o) + y*sin(o)
															 //                       Y= -1*x*sin(o) + y*cos(o)
		// AX  = x*cos(o) + y*sin(o)
		double xA =( triangle.getPointA().getX()*Math.cos(Math.toRadians(degree))  
				            + triangle.getPointA().getY()*Math.sin(Math.toRadians(degree)));
		
		// AY  = -1*x*sin(o) + y*cos(o)
		double yA=	(-1*triangle.getPointA().getX()*Math.sin(Math.toRadians(degree))
							+ triangle.getPointA().getY()*Math.cos(Math.toRadians(degree)));
		
		pointA.setX(xA); 	pointA.setY(yA);    // updates x,y of the point A
		
		//END OF SETTING A
        ////////////////////////////////////////////////////////////////////////////////////////
		// SETTING NEW COORDINATES FOR POINT B

		// BX  = x*cos(o) + y*sin(o)
		double xB =( triangle.getPointB().getX()*Math.cos(Math.toRadians(degree))  
	            		+ triangle.getPointB().getY()*Math.sin(Math.toRadians(degree)));
		
		// BY  = -1*x*sin(o) + y*cos(o)		
		double yB=	(-1*triangle.getPointB().getX()*Math.sin(Math.toRadians(degree))
						+ triangle.getPointB().getY()*Math.cos(Math.toRadians(degree)));
		
		pointB.setX(xB);	pointB.setY(yB);   // updates x,y of the point B
		
		//END OF SETTING B
		////////////////////////////////////////////////////////////////////////////////////////
		// SETTING NEW COORDINATES FOR POINT C
		
		// CX  = x*cos(o) + y*sin(o)
		double xC =( triangle.getPointC().getX()*Math.cos(Math.toRadians(degree))  
					+ triangle.getPointC().getY()*Math.sin(Math.toRadians(degree)));
		
		// CY  = -1*x*sin(o) + y*cos(o)			
		double yC=	(-1*triangle.getPointC().getX()*Math.sin(Math.toRadians(degree))
					+ triangle.getPointC().getY()*Math.cos(Math.toRadians(degree)));
		
		pointC.setX(xC);    pointC.setY(yC);    // updates x,y of the point C
	
		//END OF SETTING C
		
		return triangle;
		
	}// END OF rotate() METHOD
	
	public double findArea(Triangle triangle) {// Calculates the area of triangle with given points
		
		// FORMULA is => ( x1(y2-y3) + x2(y3-y1) + x3(y1-y2) )/2
		//x1(y2-y3)
		double p1 = triangle.getPointA().getX()*(triangle.getPointB().getY()-triangle.getPointC().getY());
		
		//x2(y3-y1)
		double p2 = triangle.getPointB().getX()*(triangle.getPointC().getY()-triangle.getPointA().getY());
		
		//x3(y1-y2)
		double p3 = triangle.getPointC().getX()*(triangle.getPointA().getY()-triangle.getPointB().getY());
		
		// Returns result of the formula, which is the area of the triangle with given points
		return Math.abs(p1+p2+p3)/2;
		
	}// END OF findArea() method
	
	public Point centerOfMass(Triangle triangle) { // Calculates the center of mass point of given Triangle
		double x = (triangle.getPointA().getX()+triangle.getPointB().getX()+triangle.getPointC().getX())/3;
		double y = (triangle.getPointA().getY()+triangle.getPointB().getY()+triangle.getPointC().getY())/3;
		
		Point center = new Point(x,y);
		return center;

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 	
		double[][] points = new double[3][2];// Creating array of points and coordinates 
											 //	{ {x1,y1},
											 //	  {x2,y2},
											 //	  {x3,y3} }
														

		for (int i = 0; i < points.length; i++) {//User input for coordinates, one by one
			System.out.printf("Coordinate of element %d\n",i+1);// Prints the element 1=A , 2=B, 3=C.......
			for (int j = 0; j < 2; j++) {
				points[i][j] = scan.nextDouble();
			}
		}// END OF FOR LOOP, Array is ready 
		
		Point pointa = new Point(points[0][0],points[0][1]); // pointA
		Point pointb = new Point(points[1][0],points[1][1]); // pointB
		Point pointc = new Point(points[2][0],points[2][1]); // pointC 
		
		System.out.println("Positive input => cw(clockwise)\nNegative input => ccw(counterclockwise)");
		//User input for rotation
		double degree = scan.nextDouble();
		
		Triangle tri = new Triangle(pointa,pointb,pointc); // Create Triangle Object
		
		System.out.println();
		System.out.println("Main Triangle:");
		System.out.println(tri);  // Coordinates of the points of triangle at first
		System.out.println("Center of mass before rotation:");
		System.out.println();
		System.out.println(tri.centerOfMass(tri)); // Coordinate of the center of mass point before rotation
		System.out.println();
		// PART 1 
		System.out.println();
		System.out.printf("AFTER ROTATION OF %f DEGREE\n",degree);
		System.out.println(tri.rotate(tri, degree)); // WORKS
		System.out.println();
		// PART 2
		System.out.println();
		System.out.println("Area:");
		System.out.println(tri.findArea(tri)); // WORKS
		System.out.println();
		// PART 3
		System.out.println();
		System.out.println("Center of mass after rotation:");
		System.out.println(tri.centerOfMass(tri)); // WORKS
		System.out.println();
		
		scan.close();
		
	}
}
