package arrays;

public class arr17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//max elements of matrix
		int[][]matrix= {{1,2},{4,5}};
		int max = matrix[0][0];
		for(int[]row:matrix)
			for(int num:row)
				if(num>max)
					max = num;
					System.out.println("max:"+max);
			
				
		
		

	}

}
