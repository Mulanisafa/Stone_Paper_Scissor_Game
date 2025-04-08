package ApplicationDevelopment;

import java.util.Scanner;

public class main2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stud management = new Stud();

	        while (true) {
	            System.out.println("\n--- Student Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    management.addStudent();
	                    break;
	                case 2:
	                    management.displayAllStudents();
	                    break;
	                case 3:
	                    management.searchStudent();
	                    break;
	                case 4:
	                    System.out.println("Exiting... Goodbye!");
	                    management.closeScanner();
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please enter a valid option.");
	            }
	        }
	    }
	


}
