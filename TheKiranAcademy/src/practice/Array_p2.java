package practice;

public class Array_p2 {
	//count of how many times number is appear in array
	public static void main(String[] args) {
		int []arr = {1,2,3,4,2,3,4,1,3,2,4};
		int num = 2;
		countofarray(arr,num);
		
		
	}
	public static void countofarray(int[]arr,int num) {
		int count = 0;
		for(int val:arr)
			if(val == num)
				count++;
		System.out.println("count of"+num+" :"+count);
		
		
	}

}
