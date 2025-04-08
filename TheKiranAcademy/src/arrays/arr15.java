package arrays;

public class arr15 {

	public static void main(String[] args) {
		//sum of all elements
		int [][]matrix= {{1,2},{3,4}};
		int sum = 0;
		for(int[] row:matrix)
			for(int num:row)
				sum += num;
		System.out.println("sum of elements"+sum);
		

	}

}
