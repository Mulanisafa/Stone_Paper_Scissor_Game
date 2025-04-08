package Scanner_class;
import java.util.Scanner;
public class sc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//maximum of 3 numbers
		//nested if else using 3 numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if(a>b) {
					System.out.println("a is max");
				}else if(b>c) {
					System.out.println("b is max");
					
				}else {
					System.out.println("c is max");
				}

	}

}
