package arrays;

import java.util.Arrays;

public class arr12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove duplicate element from array
		int[]arr = {1,1,2,4,3,4,7,8,9};
		int n = arr.length;
		Arrays.sort(arr);
		int j =0;
		for(int i =0;i<n-1;i++)
			if(arr[i]!= arr[i+1])
				arr[j++]= arr[i];
		arr[j++]= arr[n-1];
		System.out.println("without duplicate"+Arrays.toString(Arrays.copyOf(arr, j)));

	}

}
