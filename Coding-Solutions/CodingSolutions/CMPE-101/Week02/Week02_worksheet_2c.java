package week02;
/*LÜTFÜ ORÇUN SELBASAN 119200063*/
public class Week02_worksheet_2c {
	
	public static void main(String[] args) {
		/* PART 1 Starts Here*/
		
		int x= 2;
		double y= 3.14;
		float z=2.7182f;
		
		int xsqr = x*x;
		float zcube = (z*z*z);
		int fivex = 5*x;
		double ysqr = y*y;
						/* ((x*x)+y-(z*z*z))/(5*x -(y*y)) */
		System.out.println((xsqr+y-zcube)/(fivex - ysqr));
		/* PART 1 Ends Here*/
		
		/* PART 2 Starts Here*/
		int a = 10;
		int res = a++ + ++a;
		/* a++ => first return value than add 1  ++a=> first add 1 then return value
		 * So in res=> a++=10 adds to a a then a=11,add1 to a before a=12 so ++a=12 => a++ + ++a=22
		 * 																				10 + 12=22
		 * 		 */
		System.out.println(res);
		
		a=10;
		res = a++ + a++;
		/*a++ => first return value than add1  ++a=> first add 1 then return value
		 * a++=10 then a=11, a++=11 then 12
		 * 10+11=21
		 * last value of a is 12:
		 */
		System.out.println(res);
		/*PART 2 Ends Here*/
		
		/*PART 3 Starts Here*/
		String str = "This is a string";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.toUpperCase());
	}
	
}
