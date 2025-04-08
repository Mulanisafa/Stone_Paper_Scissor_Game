package Scanner_class;
import java.util.Scanner;

public class sc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find no is positive,negative,zero
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
			if(num>0) {
				System.out.println("no is positive");
			}else if(num<0) {
				System.out.println("no is negative");
			}else {
				System.out.println("no is zero");
			}
			
		

	}

}
