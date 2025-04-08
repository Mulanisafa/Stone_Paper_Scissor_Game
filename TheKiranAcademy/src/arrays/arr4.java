package arrays;
import java.util.Scanner;


public class arr4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a rowsize");
		int rowsize = sc.nextInt();
		System.out.println("enter a colsize");
		int colsize = sc.nextInt();
		int a[][]= new int [rowsize][colsize];
		
		System.out.print("enter "+(rowsize*colsize)+"elements of matix");
		for(int row= 0 ;row<a.length;row++) {
			for (int col =0 ; col<a.length;col++) {
				a[row][col]= sc.nextInt();
			}
		}
		int max = 0;
		for(int row= 0 ;row<a.length;row++) {
			for (int col =0 ; col<a.length;col++) {
				if(a[row][col]>max) {
					max = a[row][col];
				}
			}
		}
		System.out.print(max);

	}

}
