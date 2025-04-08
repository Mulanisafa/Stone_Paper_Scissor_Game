package arrays;
import java.util.Scanner;

public class arr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row");
		int rowsize = sc.nextInt();
		System.out.println("enter a col");
		int colsize = sc.nextInt();
		
		int a[][]= new int[rowsize][colsize];
		int b[][]= new int[rowsize][colsize];
		int c[][]= new int[rowsize][colsize];
		
		System.out.println("enter "+(rowsize*colsize)+"elements of matrix");
		for(int row= 0 ;row<a.length;row++) {
			for(int col = 0;col<a.length;col++) {
				a[row][col]= sc.nextInt();
				
			}
		}
		
		System.out.println("enter "+(rowsize*colsize)+"elements of matrix");
		for(int row= 0 ;row<b.length;row++) {
			for(int col = 0;col<b.length;col++) {
				b[row][col]= sc.nextInt();
				
			}
		}
		System.out.println("summing up of two matix");
		for(int row= 0 ;row<c.length;row++) {
			for(int col = 0;col<c.length;col++) {
				c[row][col]= a[row][col]+b[row][col];
				
			}
		}
		System.out.println("display matix");
		for(int row= 0 ;row<c.length;row++) {
			for(int col = 0;col<c.length;col++) {
				System.out.println(c[row][col]+" ");
				
			}
			System.out.println();
		}
	}

}
