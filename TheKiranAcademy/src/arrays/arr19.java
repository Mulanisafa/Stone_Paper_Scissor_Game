package arrays;

import java.util.Arrays;

public class arr19 {

	public static void main(String[] args) {
		//sort each row of matrix by ascending order
		int[][]matrix= {{2,9},{8,4}};
		for(int[]row:matrix)
			Arrays.sort(row);
		System.out.println("sorted"+Arrays.deepToString(matrix));
		

	}

}
