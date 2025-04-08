package array_ass;

import java.util.Scanner;

public class arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// even and odd
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row");
		int row = sc.nextInt();
		System.out.println("enter a col");
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		System.out.println("enter a " + (row) * (col) + "elements of array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				a[i][j] = sc.nextInt();

			}
		}
		int even = 0, odd = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] % 2 == even) {

					even++;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] % 2 != odd) {

					odd++;
				}

			}
		}
		System.out.println("even no " + even);
		System.out.println("odd no " + odd);

	}

}
