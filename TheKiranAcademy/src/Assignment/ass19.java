package Assignment;
import java.util.Scanner;
public class ass19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find positive and even
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if(num>0 && num% 2 == 0) {
			System.out.println("number is positive and even");
			
		}else if(num>0 && num% 2 != 0) {
			System.out.println("number is positive and odd");
		}
		
		else if(num<0 && num% 2 == 0) {
			System.out.println("number is negative and even");
			
		}else if(num<0 && num% 2 != 0) {
			System.out.println("number is negative and odd");
		}else {
			System.out.println("number is zero");
		}
		
		

	}

}
