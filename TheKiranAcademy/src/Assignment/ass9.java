package Assignment;
import java.util.Scanner;


public class ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("num1 is maximum");
		}else {
			System.out.println("num2 is minimum");
		}
		

	}

}
