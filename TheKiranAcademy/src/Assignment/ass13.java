package Assignment;
import java.util.Scanner;
public class ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eligible for voting or not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("eligible for voting");
		}else {
			System.out.println("not eligible");
		}
		

	}

}
