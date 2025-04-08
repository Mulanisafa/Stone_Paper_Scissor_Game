package array_ass;

import java.util.Scanner;

public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//largest and samllest no in java
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row");
		int row = sc.nextInt();
		System.out.println("enter a col");
		int col = sc.nextInt();
		
		
		
		int a[][]= new int[row][col];
		System.out.println("enter a "+(row)*(col)+"elements of array");
		for(int i =0;i<a.length;i++) {
			for(int j = 0; j<a.length;j++) {
				
				a[i][j]= sc.nextInt();
				
				
			}
		}
		int large = a[0][0],small=a[0][0];
		for(int i =0;i<a.length;i++) {
			for(int  j= 0; j<a.length;j++) {
				if(a[i][j]>large) {
					large = a[i][j];
				}
				if(a[i][j]<small) {
					small = a[i][j];
				}
			}
		}
		System.out.println("large element of array"+large);
		
		System.out.println("small element of array"+small);
		
		
		
		

	}

}
