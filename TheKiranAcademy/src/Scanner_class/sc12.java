package Scanner_class;

import java.util.Scanner;

public class sc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//alphabets ,digits,special character
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		if(Character .isLetter(ch)) {
			System.out.println(ch+"is a alphabet");
		}
		else if(Character.isDigit(ch)) {
			System.out.println(ch+"is a digit");
		}else {
			System.out.println(ch+"is a special character");
		}
		

	}

}
