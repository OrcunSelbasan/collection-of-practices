package level01;

import java.util.Arrays;
import java.util.Iterator;


public class Array02 {
	
	//countEvens
	public int countEvens(int[] nums) {
	int count = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i]%2==0) {
			count+=1;
		} 
	}
	return count;
	}//END countEvens
	
	//bidDiff
	public int bigDiff(int[] nums) {
		if (nums.length>1) {
			Arrays.sort(nums);
			return nums[nums.length-1]-nums[0];
		}
		return 0;
	}//END bigDiff
	
	//centeredAverage
	public int centeredAverage(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 1; i < nums.length-1; i++) {
			sum+= nums[i];
		}
		return sum/(nums.length-2);
		
	}//END centeredAverage
	
	//sum13
	public int sum13(int[] nums) {
		int i = 0;
		int count = 0;
		while (i<nums.length) {
			if (nums[i]==13) {
				i+=2;
			} else {
				count+=nums[i]; 
				i++;
			}
		}
		return count;
	}//END sum13
	
	//sum67
	public int sum67(int[] nums) {
		int i = 0;
		int count = 0;
		while (i<nums.length) {
			if (nums[i]==6) {
				while (nums[i]!=7) {
					i++;
				}
				i++;
			} else {
				count+=nums[i];
				i++;
			}
		}
		return count;
	}//END sum67

	//has22
	public boolean has22(int[] nums) {
		boolean flag =false;
		int i = 0;
		while (i<nums.length) {
			if (nums[i]!=2) {
				i++;
			} else {
				if (i+1<nums.length && nums[i+1]==2) {
					flag = true;
					break;
				}
				i++;
			}
		}
		return flag;
	}//END has22
	
	//lucky13
	public boolean lucky13(int[] nums) {
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==1 || nums[i]==3) {
				flag =false;
				break;
			}
		}
		return flag;
	}//END lucky13
	
	//sum28
	public boolean sum28(int[] nums) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==2) {
				count+=2;
			}
		}
		
		return(count==8)? true:false;
	}//END sum28
	
	//more14
	public boolean more14(int[] nums) {
		int count1 =0;
		int count4 =0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==1) {
				count1++;
			}else if(nums[i]==4) {
				count4++;
			}
		}
		return (count1>count4)? true:false;
	}//END more14

	//fizzArray
	public int[] fizzArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		return arr;
	}//END fizzArray
	
	//only14
	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=1 && nums[i]!=4) {
				return false;
			}
		}
		return true;
	}//END only14
	
	//fizzArray2
	public String[] fizzArray2(int n) {
	String[] arr = new String[n];		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.toString(i);
		}
	return arr;
	}//END fizzArray2
	
	//no14
	public boolean no14(int[] nums) {
		int no1=0;
		int no4=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==1) {
				no1++;
			}else if (nums[i]==4) {
				no4++;
			}
		}
		return (no1>0 && no4>0)? false:true;
	}//END no14
	
	//isEverywhere
	public boolean isEverywhere(int[] nums, int val) {
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			if (i+1<nums.length && nums[i]!=val && nums[i+1]!=val) {
				flag = false;
			} 
		}
		return flag;
	}//END isEverywhere
	
	//either24
	public boolean either24(int[] nums) {
		int no2,no4; 
		no2=0; no4=0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i]==2 && nums[i-1]==2) {
				no2++;
			}else if(nums[i]==4 && nums[i-1]==4) {
				no4++;
			}
		}
		return ((no2>0 && no4>0)|| (no2==no4 && no2==0) )? false:true;
	}//END either24
	
	//matchUp
	public int matchUp(int[] nums1, int[] nums2) {
		int count =0;
		for (int i = 0; i < nums2.length; i++) {
			boolean check = (Math.abs(nums1[i]-nums2[i])<=2 && nums1[i]!=nums2[i])? true:false;
			if (check) {
				count++;
			}
		}
		return count;
	}//END matchUp
	
	//has77
	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==7) {
				if (i+1<nums.length && nums[i+1]==7) {
					return true;
				} else if (i+2<nums.length && nums[i+2]==7){
					return true;
				}
			}
		}
		return false;
	}//END has77

	//has12
	public boolean has12(int[] nums) {
		int i = 0;
		while (i<nums.length) {
			if (nums[i]==1) {
				while (i<nums.length) {
					if (nums[i]==2) {
						return true;
					}else {
						i++;
					}
					
				}
			}
			i++;
		}
		return false;
	}//END has12
	
	//modThree
	public boolean modThree(int[] nums) {
		
		for (int i = 0; i < nums.length-2; i++) {
			boolean check_even = (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0 )? true:false;
			boolean	check_odd = (nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1 )? true:false;
			if(i+2<nums.length && (check_even||check_odd)){
				return true;
			}
		}
		return false;
	}//END modThree
	
	//haveThree
	public boolean haveThree(int[] nums) {
		if (nums.length<5) {
			return false;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (i+6<nums.length && nums[i]==nums[i+2] && nums[i]==nums[i+4] && nums[i]==nums[i+6] && nums[i]!=nums[i+1] && nums[i]!=nums[i+3] && nums[i]==3) {
					return false;
				}else if(i+4<nums.length && nums[i]==nums[i+2] && nums[i]==nums[i+4] && nums[i]!=nums[i+1] && nums[i]!=nums[i+3] && nums[i]==3) {
					return true;
				}
			}
		}
		return false;
	}//END haveThree
	
	//twoTwo
	public boolean twoTwo(int[] nums) {
		boolean flag = false;
				
		for (int i = 1; i < nums.length; i++) {
			if (nums[i]==2 && nums[i-1]==2) {
				flag=true;
				i++;
			}else if(nums[i]==2 && nums[i-1]!=2) {
				flag=false;
			}
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j]!=2) {
					count++;
				}
			}
			if (count==nums.length) {
				flag=true;
				break;
			}
		}
		
		if (nums.length==0) {
			flag=true;
		} else if(nums.length==1){
			if (nums[0]!=2) {
				flag=true;
			}
		} else if(nums.length==2) {
			if (nums[0]!=2 && nums[1]!=2) {
				flag=true;
			}
		}
		return flag;
	}//END twoTwo
	
	//sameEnds
	public boolean sameEnds(int[] nums, int len) {
		int[] start = new int[len];
		int[] end = new int[len];
		boolean flag=true;
		
		for (int i = 0; i < len; i++) {
			start[i]=nums[i];
			end[i]=nums[nums.length-len+i];
		}
		
		for (int i = 0; i < end.length; i++) {
			if (start[i]!=end[i]) {
				flag=false;
				break;
			}else {
				flag=true;
			}
		}
		return flag;
	}//END sameEnds

	//tripleUp
	public boolean tripleUp(int[] nums) {
		for (int i = 2; i < nums.length; i++) {
			if (nums[i]==nums[i-1]+1  && nums[i-1]==nums[i-2]+1) {
				return true;
			} 
		}
		return false;
	}//END tripleUp
	
	//fizzArray3
	public int[] fizzArray3(int start, int end) {
		int[] arr = new int[end-start];
		for (int i = 0; i <end-start; i++) {
			arr[i]=start+i;
		}
		return arr;
	}//END fizzArray3

	//shiftLeft
	public int[] shiftLeft(int[] nums) {
		int[] arr= new int[nums.length];
		int i = 0;
		while (i<nums.length) {
			if (i+1<nums.length) {
				arr[i]=nums[1+i];
				i++;
			}else {
				arr[i]=nums[0];
				i++;
			}
		}
		return arr;
	}//END shiftLeft
	
	//tenRun
	public int[] tenRun(int[] nums) {
		int i = 0;
		while (i<nums.length) {
			int n;
			if (nums[i]%10==0) {
				n = nums[i];
			}else if (i>0 && nums[i]%10!=0 && nums[i-1]%10==0) {
				n = nums[i-1];
			}else {
				n = nums[i];
			}
			nums[i]=n;
			i++;
		}
		return nums;
	}//END tenRun
	
	//pre4
	public int[] pre4(int[] nums) {
		int[] arr = new int[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==4) {
				arr = new int[i];
				for (int j = 0; j < i; j++) {
					arr[j]=nums[j];
				}
				return arr;
			}
		}
		return arr;
	}//pre4

	//post4
	public int[] post4(int[] nums) {
		int len = nums.length-1;
		int[] arr = new int[0];
		
		while (len>=0) {
			if (nums[len]==4) {
				arr = new int[nums.length-(1+len)];
				for (int i = 0; i < arr.length; i++) {
					arr[i]=nums[len+1+i];
				}
				break;
			}else {
				len--;
			}
		}		
		return arr;
	}//END post4
	
	//notAlone
	public int[] notAlone(int[] nums, int val) {
		
		if (nums.length<3) {
			return nums;
		}else {
			for (int i = 1; i < nums.length-1; i++) {
				if (nums[i]==val && nums[i]!=nums[i+1] && nums[i]!=nums[i-1]) {
					if (nums[i+1]>nums[i-1]) {
						nums[i]=nums[i+1];
						i++;
					}else {
						nums[i]=nums[i-1];
						i++;
					}
				}
			}
		}
			
		return nums;
	}//END notAlone
	
	//zeroFront
	public int[] zeroFront(int[] nums) {
		int count0 = 0;
		int other = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==0) {
				count0++;
			}else {
				other = nums[i];
			}
		}		
		
		for (int i = 0; i < nums.length; i++) {
			if (i<count0) {
				nums[i]=0;
			} else {
				nums[i]=other;				
			}
		}
		return nums;
	}//END zeroFront
	
	//withoutTen
	public int[] withoutTen(int[] nums) {
		int count = 0;
		int[] arr = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=10) {
				count++;
			}
		}
		
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=10){
				arr[j]=nums[i];
				j++;
			}
		}
		
		for (int i = count; i < arr.length; i++) {
			arr[i]=0;
		}
		
		return arr;
	}//END withoutTen

	//zeroMax
	public int[] zeroMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {				
			if (nums[i]==0) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j]%2==1 && nums[i]<nums[j]) {
						nums[i]=nums[j];
					}
				}
			}
		}
		return nums;
	}//END zeroMax

	//evenOdd
	public int[] evenOdd(int[] nums) {
		int odd = 0;
		int even = 0;
			
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==1) {
				odd++;
			}else {
				even++;
			}
		}
		
		int[] arr_odd= new int[odd];
		int[] arr_even= new int[even];
		int o =0;
		int e =0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==1) {
				arr_odd[o]=nums[i];
				o++;
			}else {
				arr_even[e]=nums[i];
				e++;
			}
		}
		
		int j=0;
		for (int i = 0; i <nums.length; i++) {
			if (i<even) {
				nums[i]=arr_even[i];
			}else {
				nums[i]=arr_odd[j];
				j++;
			}
		} 
		return nums;
	}//END evenOdd
	
	//fizzBuzz
	public String[] fizzBuzz(int start, int end) {
		String[] arr = new String[end-start];
		for (int i = 0; i < end-start; i++) {
			if ((i+start)%3==0 && (i+start)%5==0) {
				arr[i]="FizzBuzz";
			}else if((i+start)%3==0 & (i+start)%5!=0){
				arr[i]="Fizz";
			}else if((i+start)%5==0 & (i+start)%3!=0){
				arr[i]="Buzz";
			}else {
				arr[i]= Integer.toString(i+start);
			}
		}
		return arr;
	}//END fizzBuzz
	
	
	
	
	
	
}
