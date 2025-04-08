package forloop;
import java.util.Scanner;
public class pr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // sum of even and odd number
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1+num2;
		if(num3%2 == 0) {
			System.out.println("sum is even:"+num3);
		}else {
			System.out.println("sum is odd:"+num3);
		}
		
	
	}

}
