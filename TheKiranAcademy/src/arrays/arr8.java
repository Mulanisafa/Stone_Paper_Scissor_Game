package arrays;

import java.util.Arrays;

public class arr8 {

	public static void main(String[] args) {
		//reverse an array
		int []arr = {1,2,3,4,5,6};
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			
		}
		System.out.println("reversed"+Arrays.toString(arr));
		
		

	}

}
