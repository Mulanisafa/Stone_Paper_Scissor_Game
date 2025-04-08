package practice;

import java.util.Scanner;

public class p1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 :");
		int num1 = sc.nextInt();
		System.out.println("enter num2 :");
		int num2 = sc.nextInt();
		int a = 10;
		int b = 20;
		int c =a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	

	}

}
