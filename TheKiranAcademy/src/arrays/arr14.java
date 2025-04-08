package arrays;

import java.util.Arrays;

public class arr14 {

	public static void main(String[] args) {
		//left rotate array
		int[]arr = {1,2,3,4,5,6};
		int first = arr[0];
		for(int i =1;i<arr.length;i++) {
			arr[i-1]=arr[i];
			arr[arr.length-1]= first;
			System.out.println("rotated"+Arrays.toString(arr));
					
		}
	}

}
