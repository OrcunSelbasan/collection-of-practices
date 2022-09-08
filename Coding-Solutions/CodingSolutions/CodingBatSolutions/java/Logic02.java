package level01;

import java.util.Iterator;

public class Logic02 {
	
	//makeBricks
	public boolean makeBricks(int small, int big, int goal) {
		return ( (big*5+small)>=goal && (goal%5)<=small );
	}//END makeBricks
	
	//loneSum
	public int loneSum(int a,int b, int c) {
		if (a==b && b==c) {
			return 0;
		}else if (a==c) {
			return b;
		}else if (a==b) {
			return c;
		}else if (b==c) {
			return a;
		}
		return a+b+c;
	}//END loneSum
	
	//luckySum
	public int luckySum(int a, int b, int c) {
		if (a==13) {
			return 0;
		}else if (b==13) {
			return a;
		}else if(c==13) {
			return a+b;
		}
		return a+b+c;
	}//END luckySum
	
	//noTeenSum
	public int noTeenSum(int a, int b, int c) {
		int[] arr = {a,b,c};
		int[] res = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			if ( (arr[i]>=13 && arr[i]<15) || (arr[i]>16 && arr[i]<=19)) {
				res[i]=0;
			}else {
				res[i] = arr[i];
			}			 
		}
		
		int count = 0;
		for (int i = 0; i < res.length; i++) {
			count+=res[i];
		}
		return count;
	}//END noTeenSum;
	
	//roundSum
	public int roundSum(int a, int b, int c) {
		int[] arr = {a,b,c};
		int[] res = new int[3];
		
		for (int i = 0; i < res.length; i++) {
			if (arr[i]%10>=5) {
				res[i] = arr[i]+(10 -arr[i]%10);
			}else if (arr[i]%10<5) {
				res[i] = arr[i]-arr[i]%10;
			}			
		}
		
		int count = 0;
		for (int i = 0; i < res.length; i++) {
			count+= res[i];
		}
		
		return count;
	}//END roundSum
	
	//closeFar
	public boolean closeFar(int a, int b, int c) {
		boolean flag = false;
		
		if (Math.abs(a-b)<=1 && Math.abs(b-c)>=2 && Math.abs(c-a)>=2) {
			flag=true;
		}else if(Math.abs(c-a)<=1 && Math.abs(c-b)>=2 && Math.abs(a-b)>=2) {
			flag=true;
		}			
		return flag;
	}//END closeFar
	
	//blackjack
	public int blackjack(int a, int b) {
		if (a>21 && b>21) {
			return 0;
		} else if(a>21 && b<=21){
			return b;
		} else if(a<=21 && b>21){
			return a;
		} else if(a<=21 && b<=21) {
			if (a==b) {
				return a;
			}else if (a>b) {
				return a;
			}else {
				return b;
			}
		}
		return 0;
	}//END blackjack
	
	//evenlySpaced
	public boolean evenlySpaced(int a, int b, int c) {
		double avg = ((double)a+(double)b+(double)c)/3;
		boolean flag = false;
		if (avg == a || avg == b || avg == c) {
			flag=true;
		}
		return flag;
	}//END evenlySpaced
	
	//makeChocolate
	public int makeChocolate(int small, int big, int goal) {
		
		int remainder;
		
		if (goal>=big*5) {
			remainder = goal-5*big;
		} else {
			remainder = goal%5;
		}
		if (remainder<=small) {
			return remainder;
		}
		return -1;
	}//END makeChocolate

}
