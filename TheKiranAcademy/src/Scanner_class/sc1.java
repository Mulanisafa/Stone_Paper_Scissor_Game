package Scanner_class;
import java.util.Scanner;
public class sc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num =  sc.nextInt();
		int choice = 1;
		System.out.println("addition");
		System.out.println("subtraction");
		System.out.println("multiplication");
		System.out.println("division");
		System.out.println("modulus");
		System.out.println("exit");
		switch(choice) 
		{
		case 1: System.out.println("enter num1");
		int add1 = sc.nextInt();
		System.out.println("enter num2");
		int add2 = sc.nextInt();
		System.out.println("addition of 2 numbers is"+(add1+add2));
		
		case 2: System.out.println("enter num1");
		int sub1 = sc.nextInt();
		System.out.println("enter num2");
		int sub2 = sc.nextInt();
		System.out.println("subtraction of 2 numbers is"+(sub1-sub2));
		
		case 3: System.out.println("enter num1");
		int mul1 = sc.nextInt();
		System.out.println("enter num2");
		int mul2 = sc.nextInt();
		System.out.println("multiplication of 2 numbers is"+(mul1*mul2));
		
		case 4: System.out.println("enter num1");
		int div1 = sc.nextInt();
		System.out.println("enter num2");
		int div2 = sc.nextInt();
		System.out.println("division of 2 numbers is"+(div1/div2));
		
		case 5: System.out.println("enter num1");
		int mod1 = sc.nextInt();
		System.out.println("enter num2");
		int mod2 = sc.nextInt();
		System.out.println("modulus of 2 numbers is"+(mod1%mod2));
		
		
		case6:
			System.out.println("bye!!!");
		System.exit(0);
		}
		while(choice != 6);

	}

}
