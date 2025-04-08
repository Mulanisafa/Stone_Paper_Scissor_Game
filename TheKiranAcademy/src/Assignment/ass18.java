package Assignment;
import java.util.Scanner;
public class ass18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find triangle based on angles
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();
		
		int angle4 = 180-(angle1+angle2);
		
		if(angle4<90) {
			System.out.println(angle4+"it is acute triangle");
		}else if(angle4==90) {
			System.out.println(angle4+"it is rigt angle triangle");
			
		}else {
			System.out.println(angle4+"it is obtuse triangle");
		}
		
			
		
		

	}

}
