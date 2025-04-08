package ApplicationDevelopment;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a choice");
		System.out.println("enter a name");
		String name = sc.next();
		
		System.out.println("enter id:");
		int id = sc.nextInt();
		
		System.out.println("enter marks of 3 subjects");
		int []marks = new int[3];
		for(int i =0;i<3;i++) {
			marks[i]= sc.nextInt();
		}
		StudentmangInIMPClass s = new 	StudentmangInIMPClass();
		s.addStudentData(id,name,marks);
	
	}

}
