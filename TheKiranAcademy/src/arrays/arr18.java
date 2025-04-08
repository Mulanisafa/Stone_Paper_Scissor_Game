package arrays;

public class arr18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of each row and column
		int [][] arr = {{1,2},{3,4}};
		int row=0;
		int col=0;
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				row += arr[i][j];
		        col += arr[j][i];
		        System.out.println("sum of row"+row);
		        System.out.println("sum of col"+col);
				
			}
				
			
		}
			
		
				
		

	}

}
