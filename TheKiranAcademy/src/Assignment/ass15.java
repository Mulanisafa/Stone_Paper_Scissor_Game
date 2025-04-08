package Assignment;
import java.util.Scanner;
public class ass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
