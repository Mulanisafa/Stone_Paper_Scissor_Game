package arrays;

import java.util.Arrays;

public class arr16 {

	public static void main(String[] args) {
	//Transpose of given number
		int[][] matrix = {{1,2},{3,4}};
		int [][]transpose = new int [2][2];
		for(int i =0 ;i<2;i++)
			for(int j =0;j<2;j++)
				transpose[j][i] = matrix[i][j];
					System.out.println("transpose"+Arrays.deepToString(transpose));
	}

}
