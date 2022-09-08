package homework02;

public class Point {
	// Properties
	private double x;// x coordinate
	private double y;// y coordinate
	
	//CONSTRUCTORS
	public Point() {
		//super();
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y) {
		//super();
		this.x = x;
		this.y = y;
	}
	//END OF CONSTRUCTORS
	
	//SETTER GETTER
	public double getX() { // get x coordinate of the point
		return x;
	}

	public void setX(double x) { // set x coordinate of the point
		this.x = x;
	}

	public double getY() { // get y coordinate of the point
		return y;
	}

	public void setY(double y) { // set y coordinate of the point
		this.y = y;
	}
	//END OF SETTER GETTER
	
	// toString() method
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}// END OF toString() METHOD
}
