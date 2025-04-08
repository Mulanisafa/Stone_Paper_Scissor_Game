package Scanner_class;

import java.util.Scanner;

public class sc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiple of 3 or 7
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if(num%3==0 && num%7==0) {
			System.out.println(num+"number is multiple by both 3 or 7");
		}else if(num%3==0) {
			System.out.println(num+"number is multiple by 3 ");
		}
		else if(num%7==0) {
			System.out.println(num+"number is multiple by 7");
		}else {
			System.out.println(num+"num is not divisible by both");
		}

	}

}
