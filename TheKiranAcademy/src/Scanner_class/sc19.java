package Scanner_class;
import java.util.Scanner;
public class sc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculate the grade based on marks
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		if(marks>90 && marks<100 ) {
			System.out.println("Grade A");
		}else if(marks>80 && marks<89) {
			System.out.println("Grade B");
		}
		else if(marks>70 && marks<80) {
			System.out.println("Grade c");
		}
		else if(marks>35 && marks<89) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
			
			
		}
//		while(marks>90 && marks<100||marks>80 && marks<89||marks>70 && marks<80||marks>35 && marks<89||marks<35);
//		System.out.println(marks);
		

	}

}
