package practice;

import java.util.Arrays;

public class Array_p1 {
	//move all zeros
	public static void main(String[] args) {
		int[]arr = {0,1,2,1,0,4,5,6,7,0,0};
		movezerostoend(arr);
		
	
		
	}
	public  static void movezerostoend(int[] arr) {
		int index = 0;
		for(int num:arr)
			if(num != 0)
				arr[index++]=num;
		while(index < arr.length)
			arr[index++]=0;
		System.out.println("Array after moving zeros"+Arrays.toString(arr));
		
	
		
	}
	

}
