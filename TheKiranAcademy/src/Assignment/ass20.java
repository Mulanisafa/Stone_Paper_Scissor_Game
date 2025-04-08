package Assignment;
import java.util.Scanner;
public class ass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find character is uppercase and lowercase
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
