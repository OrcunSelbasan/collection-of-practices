package level01;

public class Logic01 {
	//Q1
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend==true) {
			if (cigars>=40) {
				return true;
			}else {
				return false;
			}
		} else {
			if (cigars>=40 && cigars <= 60) {
				return true;
			} else {
				return false;
			}

		}
	}//END Q1
	
	//Q2
	public int dateFashion(int you,int date) {
		if(you<=2 || date<=2) {
			return 0;
		}else if (you>=8 || date >=8) {
			return 2;
		}else {
			return 1;
		}
	}//END Q2
	
	//Q3
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer==true) {
			if (temp>=60 && temp<=100) {
				return true;
			} else {
				return false;
			}
		} else {
			if (temp>=60 && temp<=90) {
				return true;
			} else {
				return false;
			}
		}
	}//END Q3
	
	//Q4
	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday==true) {
			if (speed<=65) {
				return 0;
			} else if(speed>=66 && speed<=85){
				return 1;
			}else {
				return 2;
			}
		} else {
			if (speed<=60) {
				return 0;
			} else if(speed>=61 && speed<=80){
				return 1;
			}else {
				return 2;
			}

		}  
	}//END Q4
	
	//Q5
	public int sortaSum(int a, int b) {
		if (a+b>=10 && a+b<=19) {
			return 20;
		}else {
			return a+b;
		}
	}//END Q5
	
	//Q6
	public String alarmClock(int day, boolean vacation) {
		if (vacation==true) {
			if (day>=1 && day<=5) {
				return "10:00";
			}else {
				return "off";
			}
		} else {
			if (day>=1 && day<=5) {
				return "7:00";
			}else {
				return "10:00";
			}
		}
	}//END Q6
	
	//Q7
	public boolean love6(int a, int b) {
		if (a+b>=0) {
			if (a==6 || b==6) {
				return true;
			}else if(a+b==6|| Math.abs(a-b) ==6 ) {
				return true;
			}else {
				return false;
			}
		} else {
			if(a-b==6) {
				return true;
			}else if(b-a==6) {
				return true;
			}else {
				return false;
			}
		}
	}// END Q7
	
	//Q8
	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode==true) {
			if (n<=1 || n>=10) {
				return true;
			}else {
				return false;
			}
		} else {
			if (n>=1 && n<=10) {
				return true;
			}else {
				return false;
			}

		}
	}// END Q8

	//Q9
	public boolean specialEleven(int n) {
		if (n%11==0 || n%11==1) {
			return true;
		} else {
			return false;
		}
	}// END Q9
	
	//Q10
	public boolean more20(int n) {
		if (n%20==1 || n%20==2) {
			return true;
		}else {
			return false;
		}
	}// END Q10
	
	//Q11
	public boolean old35(int n) {
		if (n%3==0 && n%5==0) {
			return false;
		} else if(n%3==0 || n%5==0){
			return true;
		} else {
			return false;
		}
	}//END Q11
	
	//Q12
	public boolean less20(int n) {
		if (n%20==18 || n%20==19) {
			return true;
		} else {
			return false;
		}	  
	}//END Q12
	
	//Q13
	public boolean nearTen(int num) {
		if (num%10<=2 || num%10>=8) {
			return true;
		} else {
			return false;
		}
	}//END Q13
	
	//Q14
	public int teenSum(int a, int b) {
		if((a>=13 && a<=19)||(b>=13 && b<=19)) {
			return 19;
		}else {
			return a+b;
		}
	}// END Q14
	
	//Q15
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep==true) {
			return false;
		}else {
			if (isMorning==true) {
				if (isMom==true) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
	}//Q15
	
	//Q16
	public int teaParty(int tea, int candy) {
		if ((tea>=5 && candy>=5)&&(tea>=2*candy || candy>=tea*2)) {
			return 2;
		} else if(tea>=5 && candy>=5){
			return 1;
		} else{
			return 0;
		}
	}//END Q16 
	
	//Q17
	public String fizzString(String str) {
		if( (str.startsWith("f")) && (str.endsWith("b")))  {
			return "FizzBuzz";
		}else if (str.endsWith("b")) {
			return "Buzz";
		}else if (str.startsWith("f")){
			return "Fizz";
		}else {
			return str;
		}
	}//END Q17
	
	//Q18
	public String fizzString2(int n) {
		if (n%3==0 && n%5==0) {
			return "FizzBuzz!";
		} else if(n%3==0){
			return "Fizz!";
		} else if (n%5==0) {
			return "Buzz!";
		}else {
			return n+"!";
		}
	}//END Q18
	
	//Q19
	public boolean twoAsOne(int a, int b, int c) {
		if (a+b==c || a+c==b || b+c==a) {
			return true;
		} else {
			return false;
		}	  
	}// END Q19
	
	//Q20
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if (bOk==true) {
			if (c>a || c>b) {
				return true;
			} else {
				return false;
			}
		} else {
			if (b>a && c>b) {
				return true;
			} else {
				return false;
			}
		}
	}//END Q20
	
	//Q21
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk==true) {
			if ((a==b && b<c)|| (b==c && a<b) || (a==b&&b==c) ){
				return true;
			} else {
				return false;
			}
		} else {
			if (a<b && b<c) {
				return true;
			}else {
				return false;
			}
		}
	}//END Q21
	
	//Q22
	public boolean lastDigit(int a,int b, int c) {
		if(a%10==b%10 || a%10==c%10 || b%10==c%10) {
			return true;
		}else {
			return false;
		}
	}//END Q22
	
	//Q23
	public boolean lessBy10(int a,int b, int c) {
		if(a-b>=10 || b-c>=10 || a-c>=10||b-a>=10 || c-b>=10 || c-a>=10) {
			return true;
		}else {
			return false;
		}
	}//END Q23
	
	//Q24
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles==true) {
			if (die1==6 && die2==6) {
				return 7;
			} else if (die1==die2) {
				return die1+die2+1;
			}else {
				return die1+die2;
			}
		} else {			
				return die1+die2;
			}			
	}//END Q24
	
	//Q25
	public int maxMod5(int a, int b) {
		if (a==b){
			return 0;
		}else if (a%5==b%5){
			return (a>b)? b:a;
		}else if (b>a) {
			return b;
		}else if(a>b) {
			return a;
		}else {
			return 2;
		}
	}//END Q25
	
	//Q26
	public int redTicket(int a, int b, int c) {
		if (b!=a && c!=a) {
			return 1;
		}else if (b==c && a==b && a==2) {
			return 10;
		}else if (a==b && b==c) {
			return 5;
		}else {
			return 0;
		}
	}//END Q26
	
	//Q27
	public int greenTicket(int a, int b,int c) {
		if ( (a==b && b!=c) || (a==c && a!=b) || (b==c && a!=b) ) {
			return 10;
		}else if (a==b && b==c) {
			return 20;
		}else {
			return 0;
		}
	}//END Q27
	
	//Q28
	public int blueTicket(int a, int b,int c) {
		if( (a+b== Math.abs(10)) ||  (a+c== Math.abs(10)) || (b+c== Math.abs(10)) ) {
			return 10;
		}else if(a==Math.abs(10+c) || b==Math.abs(10+c)){
			return 5;
		}else {
			return 0;
		}
	}//END Q28
	
	
	//Q29
	public boolean shareDigit(int a, int b) {
		if (a%10==b/10 || a/10==b%10 || a%10==b%10 || a/10==b/10) {
			return true;
		}else {
			return false;
		}
	}//END Q29
	
	//Q30
	public int sumLimit(int a, int b) {
		int c= a+ b;
		String str1= String.valueOf(c);
		String str2= String.valueOf(a);
		 if (str1.length()<= str2.length() ) {
			return a+b;
		} else {
			return a;
		}
	}// END Q30
	
}
