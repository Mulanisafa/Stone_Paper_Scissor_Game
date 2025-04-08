package Scanner_class;
import java.util.Scanner;

public class sc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//positive and even number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		if(num>0 && num% 2 == 0) {
			System.out.println("number is positive and even");
			
		}else {
			System.out.println("no is invalid");
		}
		

	}

}
