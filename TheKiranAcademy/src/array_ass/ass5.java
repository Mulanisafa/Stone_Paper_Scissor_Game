package array_ass;

import java.util.Scanner;

public class ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array in ascending order without using build-in functions

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter" + n + "elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if 
				
				
				(arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];

					arr[j] = arr[j] - arr[j + 1];

				}

			}
		}
		System.out.println("Array in ascending order");
		for (int num : arr) {
			System.out.println(num + " ");
		}

	}

}
