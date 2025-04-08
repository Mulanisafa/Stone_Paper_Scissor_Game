package practice;
import java.util.Scanner;
public class pr17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no is divisible or  not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if(a%5 == 0 && a%11 == 0) {
			System.out.println("divisible by both");
		}else if(a%5 == 0 || a% 11 == 0) {
			System.out.println("only divisible by 5 or 11");
		}
		else {
			System.out.println("not divisible by both");
		}

	}

}
