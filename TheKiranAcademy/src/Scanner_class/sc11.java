package Scanner_class;

import java.util.Scanner;

public class sc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//divisible by 5 or not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if(num %5 == 0 && num %11==0) {
			System.out.println("both 5 and 11 are divisible");
		}else {
			System.out.println("not divisible by both");
		}

	}

}
