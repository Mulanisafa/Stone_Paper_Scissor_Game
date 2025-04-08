package arrays;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][]= new int[3][3];
		a[0][0]=12;
		a[0][1]= 22;
		a[0][2]=78;
		
		a[1][0]= 97;
		a[1][1]=88;
		a[1][2]= 6;
		
		a[2][0]= 18;
		a[2][1]= 11;
		a[2][2]= 30;
		
		for(int row = 0;row < a.length;row++){
			for(int col = 0;col<a.length;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
			
		}

	}

}
