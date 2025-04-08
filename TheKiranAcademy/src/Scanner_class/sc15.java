package Scanner_class;

import java.util.Scanner;

public class sc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uppercase and lowercase character
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		if(Character .isUpperCase(ch)) {
			System.out.println("it is upper case character");
			
		}else if(Character.isLowerCase(ch)) {
			System.out.println("it is a lower case character");
		}else {
			System.out.println("invalid character");
		}

	}

}
