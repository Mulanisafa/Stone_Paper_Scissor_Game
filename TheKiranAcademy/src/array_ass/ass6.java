package array_ass;
import java.util.Scanner;

public class ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//search of given elements in array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row");
		int rowsize = sc.nextInt();
		System.out.println("enter a col");
		
		int colsize = sc.nextInt();
		int a[][]= new int[rowsize][colsize];
		
		int	row_index=0;
		int col_index = 0;
		int index = row_index+col_index;
		int count = 0;
		int Search = sc.nextInt();
		for(int row=0;row<a.length;row++) {
			for(int col = 0;col<a.length;col++) {
				if(Search == a[row][col]) {
					count++;
					index = row;
				
				
				
					
				}
			}
			if(count>0) {
				System.out.println("element of index is available"+index);
			}else {
				System.out.println("elements of index not available"+index);
			}
		}

	}

}
