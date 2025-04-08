package Assignment;
import java.util.Scanner;

public class ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leap year or  not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int year = sc.nextInt();
		boolean leap = ((year%4 == 0 && year% 100 != 0)||(year%400 == 0)); 
			
		if(leap) {
			System.out.println("year is leap"+year);
		}else {
			System.out.println("year is not leap"+year);
		}
		

	}

}
