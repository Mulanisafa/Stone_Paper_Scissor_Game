package arrays;

import java.util.Scanner;


public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row");
		int rowsize = sc.nextInt();
		System.out.println("enter a col");
		int colsize = sc.nextInt();
		
		int a[][]= new int[rowsize][colsize];
		System.out.println("enter "+(rowsize * colsize)+"elements");
		for(int row = 0;row<a.length;row++) {
			for(int col = 0 ; col<a.length;col++) {
				a[row][col]= sc.nextInt();
			}
		}
		for(int row = 0;row<a.length;row++) {
			for(int col = 0 ; col<a.length;col++) {
				System.out.println(a[row][col]+" ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
