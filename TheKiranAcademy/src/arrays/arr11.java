package arrays;

import java.util.Arrays;

public class arr11 {

	public static void main(String[] args) {
		//sort array in ascending order
		int[]arr = {1,7,8,4,9,6};
		for(int i=0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
				System.out.println("sorted"+Arrays.toString(arr));
			}
		}

	}

}
