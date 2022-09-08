package level01;

public class String01 {
	public String helloName(String name) { //Q1
		return "Hello "+name+"!";
	}//END Q1
	
	public String makeAbba(String a, String b) {//Q2
		return a+b+b+a;
	}//END Q2
	
	public String makeTags(String tag, String word) {//Q3
		return "<"+tag+">"+word+"</"+tag+">";
	}//END Q3
	
	public String makeOutWord(String out, String word) {//Q4
		return out.substring(0,2)+word+out.subSequence(2, out.length());
	}//END Q4
	
	public String extraEnd(String str) {//Q5
		return str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length());
	}//END Q5
	
	public String firstTwo(String str) {//Q6
		return (str.length()<2)? str:str.substring(0,2);
	}//END Q6
	
	public String firstHalf(String str) {//Q7
		return str.substring(0,str.length()/2);
	}//END Q7
	
	public String withoutEnd(String str) {//Q8
		return str.substring(1,str.length()-1);
	}//END Q8
	
	public String comboString(String a, String b) {//Q9
		return (a.length()>b.length())? b+a+b:a+b+a;
	}//END Q9
	
	public String nonStart(String a, String b) {//Q10
		return a.substring(1,a.length())+b.substring(1,b.length());
	}//END Q10
	
	public String left2(String str) {//Q11
		return str.substring(2,str.length())+str.substring(0,2);
	}//END Q11
	
	public String right2(String str) {//Q12
		return str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
	}//END Q12
	
	public char theEnd(String str,boolean front) {//Q13 T1
		return (front)? str.charAt(0):str.charAt(str.length()-1);
	}//END Q13 T1
	
	public String theEnd2(String str,boolean front) {//Q13 T2
		return (front)? str.substring(0, 1):str.substring(str.length()-1, str.length());
	}//END Q13 T2
	
	public String withouEnd(String str){//Q14
		return (str.length()>2)? str.substring(1,str.length()-1):"";
	}//END Q14
	
	public String middleTwo(String str) {//Q15
		return str.substring((str.length()/2)-1,(str.length()/2)+1);
	}//END Q15
	
	public boolean endsLy(String str) {//Q16
		return (str.length()>=2 && (str.charAt(str.length()-1)=='y' && str.charAt(str.length()-2)=='l'))? true:false;
	}//END Q16
	
	public String nTwice(String str, int n) {//Q17
		return str.substring(0,n)+str.substring(str.length()-n,str.length());
	}//END Q17
	
	public String twoChar(String str, int index) {//Q18
		return (index> str.length()-2 || index<0)? str.substring(0,2):str.substring(index,index+2);
	}//END Q18
	
	public String middleThree(String str) {//Q19	
		int len = str.length();
		int lower = ((len+1)/2)-2;
		int upper = ((len+1)/2)+1;
		return (str.length()>=3)? str.substring(lower,upper):"Invalid!";
	}//END Q19
	
	public boolean hasBad(String str) {//Q20
		if (str.length()>=3) {
			if (str.length()>=4) {
				return (str.substring(0,3).equals("bad")|| str.substring(1,4).equals("bad"))? true:false;
			}else {
				return (str.substring(0,3).equals("bad"))? true:false;
			}
		}else {
			return false;
		}
	}//END Q20 
	
	public String atFirst(String str) {//Q21
		if (str.length()==1) {
			return str+"@";
		}else if(str.length()==0) {
			return "@@";
		}else {
			return str.substring(0,2);
		}
	}//END Q21
	
	public String lastChars(String a, String b) {//Q22
		if(a.length()==b.length() && a.length()==0) {
			return "@@";
		}else if(b.length()==0) {
			return a.charAt(0)+"@";
		}else if (a.length()==0){
			return "@"+b.charAt(b.length()-1);
		}else {
			return a.substring(0,1).concat(b.substring(b.length()-1,b.length()));
		}
	}//END Q22
	
	
	public String conCat(String a, String b) {//Q23
		if (a=="" || b=="") {
			return a.concat(b);
		}else if (a.charAt(a.length()-1)==b.charAt(0)) {
			return a.concat(b.substring(1,b.length()));
		}else {
			return a.concat(b);
		}
	}//END Q23
	
	public String lastTwo(String str) {	//Q24
		if(str.length()>=2) {
			char last = str.charAt(str.length()-1);
			char sublast = str.charAt(str.length()-2);
			String body = str.substring(0,str.length()-2);
			return body+last+sublast;
			
		}else {
			return str;
		}	
	}//Q25
	
	public String seeColor(String str) {//Q26
		if (str.length()>=3) {
			if (str.length()>=4) {
				if (str.substring(0,4).equals("blue")) {
					return "blue";
				}else if(str.substring(0,3).equals("red")) {
					return "red";
				}else {
					return "";
				}
			}else {
				if(str.substring(0,3).equals("red")) {
					return "red";
				}else {
					return "";
				}
			}
		}else {
			return "";
		}
	}//END Q26
	
	
	public boolean frontAgain(String str) {//Q27
		if (str.length()>=2) {
			if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}//END Q27
	
	public String minCat(String a, String b) {//Q28
		if (a.length()!=b.length()) {
			if (a.length()>b.length()) {
				
				int dif = a.length()-b.length();
				return a.substring(dif,a.length())+b;
				
			}else if(b.length()>a.length()){
				
				int dif2 = b.length()-a.length();
				return a+b.substring(dif2,b.length());
				
			}else {
				return "NONE";
			}
		}else {
			return a+b;
		}
	}//END Q28
	
	public String extraFront(String str) {//Q29
		if (str.length()>=2) {
			return str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
		}else {
			return str+str+str;
		}
	}//END Q29
	
	public String without2(String str) {//Q30
		if(str.length()>=4) {
			if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
				return str.substring(2,str.length());
			} else {
				return str;
			}
		}else if(str.length()==1) {
			return str;
				
		}else if (str.equals("")){
			return "";
		}else if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
			return str.substring(2,str.length());
		}else {
			return "";
		}
	}//END Q30
	
	public String deFront(String str) {//Q31
		if((str.substring(0,1).equals("a"))&&(str.substring(1,2).equals("b"))) {
			return str;
		} else if (str.substring(0,1).equals("a")) {
			return "a"+str.substring(2,str.length());
		} else if(str.substring(1,2).equals("b")){
			return "b"+str.substring(2, str.length());
		}else {
			return str.substring(2,str.length());
		}
	}//END Q31
	
	public String startWord(String str, String word) {//Q32
		if(str.equals("") || word.equals("") || word.length()>str.length()){
			return "";
		}else if (word.equals(str.substring(0,word.length())) || word.substring(1,word.length()).equals(str.substring(1,word.length()))) {
			return str.substring(0,word.length());
		}else {
			return "";
		}
	}//END Q32
	
	public String withoutX(String str) {//Q33
		
		if(str.length()<=1){
			return "";
		}else if (str.startsWith("x") && str.endsWith("x")) {
			return str.substring(1,str.length()-1);
		}else if(str.startsWith("x")) {
			return str.substring(1, str.length());
		}else if(str.endsWith("x")) {
			return str.substring(0,str.length()-1);
		}else {
			return str;
		}
	}//END Q33

	public String withoutX2(String str) {//Q34
		
		if(str.length()>2) {
			if(str.charAt(0)=='x' && str.charAt(1)=='x') {
				return str.substring(2,str.length());
			}else if (str.charAt(0)=='x') {
				return str.substring(1, str.length());
			}else if (str.charAt(1)=='x') {
				return str.substring(0,1)+str.substring(2,str.length());
			}else {
				return str;
			}
		}else if(str.length()==2) {
			if(str.charAt(0)=='x' && str.charAt(1)=='x') {
				return "";
			}else if (str.charAt(0)=='x') {
				return str.substring(1, 2);
			}else if (str.charAt(1)=='x') {
				return str.substring(0,1);
			}else {
				return str;
			}
		}else if(str.length()==1){
			if (str.charAt(0)=='x') {
				return "";
			}else {
				return str;
			}
		}else {
			return "";
		}	
	}//END Q34

}
