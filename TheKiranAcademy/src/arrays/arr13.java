package arrays;

import java.util.Arrays;

public class arr13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//merge two sorted array into single sorted array
		int[]arr1 = {1,3,4,6};
		int []arr2 = {7,8,9,2};
		int[] merged = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
			merged[k++] = arr1[i]<arr2[j] ? arr1[i++]:arr2[i++];
		while(i<arr1.length)
			merged[k++]= arr1[i++];
		while(j<arr2.length)
			merged[k++]= arr2[j++];
		System.out.println("merged"+Arrays.toString(merged));
		

	}

}
