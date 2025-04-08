package ApplicationDevelopment;

import java.util.Scanner;

public class StudentGradeManagementSystem {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stud sm = new Stud();
	        int choice;

	        do {
	            System.out.println("-- Student Grade Management System --");
	            System.out.println("1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search Student by ID");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    sm.addStudent();
	                    break;
	                case 2:
	                    sm.displayAllStudents();
	                    break;
	                case 3:
	                    sm.searchStudent();
	                    break;
	                case 4:
	                    System.out.println("Exiting program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please enter a valid option.");
	            }
	        } while (choice != 4);

	        sc.close(); 
	    }

}
