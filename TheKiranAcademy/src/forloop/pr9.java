package forloop;
import java.util.Scanner;
public class pr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print  even and odd number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("no is even:"+num);
		}else {
			System.out.println("no is odd:"+num);
		}
		
	}

}
