package level01;

import java.util.Iterator;

public class String02 {
	
	//doubleChar
	public String doubleChar(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res += str.substring(i,i+1) +str.substring(i,i+1);
		}
		return res;
	}//END doubleChar
	
	//countHi
	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals("hi")) {
				count+=1;
			}
		}
		return count;
	}//END countHi
	
	//catDog
	public boolean catDog(String str) {
		int cat = 0;
		int dog = 0;
		for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i,i+3).equals("cat")) {
				cat+=1;
			} else if (str.substring(i,i+3).equals("dog")) {
				dog+=1;
			}
		}
		if(cat==dog) return true;
		
		return false;
	}//END catDog
	
	//countCode
	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-3; i++) {
			if ( str.substring(i, i+2).equalsIgnoreCase("co") && str.substring(i+3,i+4).equalsIgnoreCase("e")) {
				count+=1;
			}
		}
		return count;
	}//END countCode
	
	//endOther
	public boolean endOther(String a, String b) {
		
		if (b.length()>a.length()) {
			if (a.equalsIgnoreCase(b.substring(b.length()-a.length(),b.length()))) {
				return true;
			}
		}else if(a.length()>b.length()) {
			if (b.equalsIgnoreCase(a.substring(a.length()-b.length(),a.length()))) {
				return true;
			}
		}else if (a.equalsIgnoreCase(b)) {
			return true;
		}
		return false;
	}//END endOther
	
	//xyzThere
	public boolean xyzThere(String str) {
		boolean flag = false;
		int false_when = 0;
		int true_when = 0;
		
		for (int i = 0; i < str.length()-3; i++) {
			if (str.substring(i,i+4).equals(".xyz"))  {
				false_when+=1;
			}
		}
		for (int j = 0; j < str.length()-2; j++) {
			if (str.substring(j,j+3).equals("xyz")) {
				true_when+=1;
			}
		}
		    	
		if (true_when>false_when) {
			flag=true;
		}else if(true_when<=false_when) {
			return false;
		}
		return flag;
	}//END xyzThere
	
	//bobThere
	public boolean bobThere(String str) {
		  for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b")) {
				return true;
			}
		}
		return false;  
	}//END bobThere
	
	//xyBalance
	public boolean xyBalance(String str) {
		boolean flag=false;
			  
		if (str.isEmpty() || !str.contains("x")) {
			flag=true;
		}else if (str.lastIndexOf("y")>str.lastIndexOf("x")) {
			flag=true;
		}
			
		return flag;
			
	}//END xyBalance
		
	//mixString !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public String mixString(String a, String b) {
		String res = "";
		int low = (a.length()>=b.length())? b.length():a.length();
		
		for (int i = 0; i < low; i++) {
			if (i==low-1 && a.length()>b.length()) {
				res+=a.substring(i, i+1)+b.substring(i, i+1)+ a.substring(i+1);
			} else if (i==low-1 && a.length()<b.length()){
				res+=a.substring(i, i+1)+b.substring(i, i+1)+ b.substring(i+1);
			} else {
				res+=a.substring(i, i+1)+b.substring(i, i+1);
			}
		}
		if (a.length()==0) {
			res = b;
		}else if (b.length()==0) {
			res = a;
		}
		return res;
	}//END mixString
	
	//repeatEnd
	public String repeatEnd(String str, int n) {
		String repeat = str.substring(str.length()-n,str.length());
		String res = "";
		
		for (int i = 0; i < n; i++) {
			res+=repeat;
		}

		return res;
		
	}//END repeatEnd
	
	//repeatFront
	public String repeatFront(String str, int n) {
		String res = "";
		for (int i = n; i > 0; i--) {
			res+=str.substring(0,i);
		}
		return res;
	}//END repeatFront
	
	//repeatSeperator
	public String repeatSeparator(String word, String sep, int count) {
		String res = word;
		
		if (count<=0) {
			return "";
		}
		
		for (int i = count-1; i > 0; i--) {
			res+= sep+word;
		}
		
		return res;
	}//END repeatSeperator
	
	//prefixAgain
	public boolean prefixAgain(String str, int n) {
		boolean flag = false;
		
		if (str.lastIndexOf(str.substring(0,n))>=n) {
			flag = true;
		} 
		
		return flag;
	}//END prefixAgain
	
	//xyzMiddle
	public boolean xyzMiddle(String str) {
		boolean flag = false;
		
		for (int i = 0; i < str.length()-3; i++) {
			if (str.substring(i,i+3).equalsIgnoreCase("xyz")) {
				if ( Math.abs( str.substring(0,i).length()- str.substring(i+3,str.length()).length()) <= 1) {
					flag = true;
				}
			}
		}
		if (str.equals("xyz")) {
			flag=true;
		}
		
		return flag;
	}//END xyzMiddle
	
	//getSandwich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public String getSandwich(String str) {
		String res = "";
		
		if (str.indexOf("bread")!=str.lastIndexOf("bread") && str.indexOf("bread")!=-1 & str.lastIndexOf("bread")!=-1) {
			res+= str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
		} 
		
		return res;
	}//END getSandwich
	
	//sameStarChar
	public boolean sameStarChar(String str) {
		
		boolean flag = true;
		
		if(str.length()<3 || !str.contains("*")){
			flag=true;

		} else if (str.length()>=3) {
			for (int i = 1; i < str.length()-1; i++) {
				if (str.charAt(i-1)!=str.charAt(i+1) && str.charAt(i)=='*') {
					flag = false;
				}
			}
		}
		
		return flag;
	}//END sameStarChar
	
	//oneTwo
	public String oneTwo(String str) {
		String res = "";
		 
		if (str.length()%3==0) {
			for (int i = 0; i < str.length(); i+=3) {
				String triple = str.substring(i+1,i+3)+str.substring(i,i+1);
				res+=triple;
			}
		}else {
			str = str.substring(0,str.length()-str.length()%3);
			for (int i = 0; i < str.length(); i+=3) {
				String triple = str.substring(i+1,i+3)+str.substring(i,i+1);
				res+=triple;
			}			
		}
		return res;
	}//END oneTwo
	
	//zipZap !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public String zipZap(String str) {
		
		String res = "";
		
		if (str.length()<3 || !(str.contains("z")) || !(str.contains("p")) ) {
			return str;
		}else {
			for (int i = 0; i < str.length(); i++) {
				if ((str.charAt(i)=='z') && (str.charAt(i+2)=='p')) {
					
					if ((i==str.length()-2)) {
						res+= "zp";						
					} else {
						res+="zp";
						i+=2;
					}
					
				}else {
					res+=str.charAt(i);
				}
			}
		}
		return res;
	}//END zipZap
	
	//starOut
	/*public String starOut(String str) {
		   // CHECK ====>> https://github.com/mirandaio/codingbat/blob/master/java/string-2/starOut.java
	}//END starOut*/


	//plusOut
	public String plusOut(String str, String word) {
		String res = "";
		int i = 0;
		while (i<str.length()) {
			if (i+word.length()<=str.length() && str.substring(i,i+word.length()).equals(word)) {
				res+= word;
				i+=word.length();
			} else {
				res+="+";
				i++;
			}
		}
		return res;
	}//END plusOut
	
	//wordEnds
	/*public String wordEnds(String str, String word) {
		// CHECK ====>> https://github.com/mm911/codingbat-solutions/blob/master/java/String-2/wordEnds.java
	}//END wordEnds*/
	
}
