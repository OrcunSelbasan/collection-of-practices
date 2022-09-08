package level01;
import java.util.*;

public class Array01 {
	
	//firstLast6
	public boolean firstLast6(int[] nums) { 
		if (nums[0]==6 || nums[nums.length-1]==6)
			return true;
		else
			return false;
	}//END firstLast6
	
	//sameFirstLast
	public boolean sameFirstLast(int[] nums) {
		if(nums.length>=1 && nums[0]==nums[nums.length-1])
			return true;
		else
			return false;
	}//END sameFirstLast
	
	//makePi
	public int[] makePi() {
		int[] pi = {3,1,4};
		return pi;
	}//END makePi
	
	//commonEnd
	public boolean commonEnd(int[] a, int[] b) {
		if (a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		else
			return false;
	}//END commonEnd
	
	//sum3
	public int sum3(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count+=nums[i];
		}
		return count;
	}//END sum3
	
	//rotateLeft3
	public int[] rotateLeft3(int[] nums) {
		int[] arr = {nums[1],nums[2],nums[0]};
		return arr;  
	}//END rotateLeft3
	
	//reverse3
	public int[] reverse3(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nums[nums.length-1-i];
		}
		return arr;
	}//END reverse3
	
	//maxEnd3
	public int[] maxEnd3(int[] nums) {
		int[] arr = new int[3];
		if(nums[0]>=nums[nums.length-1]) {
			for (int i = 0; i < arr.length; i++) {
				arr[i]=nums[0];
			}
		}else if (nums[0]<=nums[nums.length -1]) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = nums[nums.length -1];
			}
		}
		return arr;
	}//END maxEnd3
	
	//sum2
	public int sum2(int[] nums) {
		int count = 0;
		if (nums.length<2) {
			for (int i = 0; i < nums.length; i++) {
				count+=nums[i];
			}
		} else {
			count+= nums[0]+nums[1];
		}
		return count;
	}//sum2
	
	//middleWay
	public int[] middleWay(int[] a, int[] b) {
		int[] arr = {a[1],b[1]};
		return arr;
	}//END middleWay
	
	//makeEnds
	public int[] makeEnds(int[] nums) {
		int[] arr = {nums[0],nums[nums.length - 1]};
		return arr;
	}//END makeEnds
	
	//has23
	public boolean has23(int[] nums) {
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==2 || nums[i]==3) {
				return flag;
			}
		}
		return flag=false;
	}//END has23
	
	//no23
	public boolean no23(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==2 || nums[i]==3) {
				return flag;
			}
		}
		return flag=true;
	}//END no23
	
	//makeLast
	public int[] makeLast(int[] nums) {
		int[] arr = new int[2*nums.length];
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				arr[i]=0;
			} else {
				arr[i]=nums[nums.length-1];
			}
		}
		return arr;
	}//END makeLast
	
	//double23
	public boolean double23(int[] nums) {

		if (nums.length==2) {
			return (nums[0]==nums[1] && nums[0]==2) || (nums[0]==nums[1] && nums[0]==3);
		} 
		return false;
		
	}//END double23
	
	//fix23
	public int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==2 && nums[i+1]==3) {
				nums[i+1]=0;
			}
		}
		return nums;
	}//END fix23
	
	//start1
	public int start1(int[] a, int[] b) {
		int count = 0;
		if(a.length>0 && a[0]==1) {
			count+=1;
		}
		if(b.length>0 && b[0]==1) {
			count+=1;
		}
		return count;
	}//END start1 
	
	//biggerTwo
	public int[] biggerTwo(int[] a, int[] b) {
		int sumA = Arrays.stream(a).sum();
		int sumB = Arrays.stream(b).sum();
		if (sumA>=sumB) {
			return a;
		}
		return b;
		
	}//END biggerTwo
	
	//makeMiddle
	public int[] makeMiddle(int[] nums) {
		int[] arr = {nums[(nums.length/2)-1],nums[nums.length/2]};
		return arr;
	}//END makeMiddle
	
	//plusTwo
	public int[] plusTwo(int[] a, int[] b) {	
		int[] arr = {a[0],a[1],b[0],b[1]};
		return arr;
		
	}//END plusTwo
	
	//swapEnds
	public int[] swapEnds(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				arr[i]=nums[nums.length-1];
			}else if (i==nums.length-1){
				arr[i]=nums[0];
			}else {
				arr[i]=nums[i];
			}
		}
		return arr;  
	}//END swapEnds
	
	//midThree
	public int[] midThree(int[] nums) {
		int index_of_mid = (nums.length-1)/2;
		int[] arr = {nums[index_of_mid-1],nums[index_of_mid],nums[index_of_mid+1]};
		return arr;
	}//END midThree

	//maxTriple
	public int maxTriple(int[] nums) {
		int index_of_mid = (nums.length-1)/2;
		int[] arr = {nums[0],nums[index_of_mid],nums[nums.length-1]};
		Arrays.sort(arr);
		return arr[arr.length-1];
	}//END maxTriple
	
	//frontPiece
	public int[] frontPiece(int[] nums) {
		if (nums.length>2) {
			int[] slice = Arrays.copyOfRange(nums, 0, 2);
			return slice;
		}
		return nums;
	}//END frontPiece
	
	//unlucky1
	public boolean unlucky1(int[] nums) {
		if(nums.length>=3) {
			if ((nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3) 
				||(nums[nums.length-2]==1 && nums[nums.length-1]==3)){
				return true;
			}
		}
		else if(nums.length==2) {
			return (nums[0]==1 && nums[1]==3);
		}
		
		return false;		
	}//END unlucky1

	//make2
	public int[] make2(int[] a, int[] b) {
		int[] arr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if(a.length==0) {
				arr[i]=b[i];
			}else if(b.length==0) {
				arr[i]=a[i];
			}else if(a.length==1) {
				if (i==0) {
					arr[i]=a[i];
				}else {
					arr[i]=b[0];
				}
			}else if (a.length>1) {
				arr[i]=a[i];
			}			
		}
		return arr;
		
	}//END make2
	
	//front11
	public int[] front11(int[] a, int[] b) {
		int[] arr;
		
		if(a.length==0 && b.length==0) {
			arr = new int[0];
		}else if (a.length==0 && b.length>0) {
			arr = new int[1];
			arr[0]=b[0];
		}else if (a.length>0 && b.length==0) {
			arr = new int[1];
			arr[0]=a[0];
		}else {
			arr = new int[2];
			arr[0]=a[0]; arr[1]=b[0];
		}
		return arr;
		
	}//END fron11
}
