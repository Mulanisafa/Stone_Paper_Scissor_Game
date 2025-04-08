package ApplicationDevelopment;

import java.util.Scanner;

import java.util.Arrays;


class Student {
		int id;
		int[] marks = new int[3];
		int total;
		String name;
		double percentage;
		char grade;

		void calculateTotal() {
			total = marks[0] + marks[1] + marks[2];

		}

		void calculatePercentage() {
			percentage = (total/3.0);
		}

		void calculateGrade() {
			if (percentage >= 90)
				grade = 'A';
			else if (percentage >= 75)
				grade = 'B';
			else if (percentage >= 60)
				grade = 'C';
			else if (percentage >= 40)
				grade = 'D';
			else
				grade = 'F';

		}

		void displayStudent() {
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Marks: " + (Arrays.toString(marks)));
			calculateTotal();
			
			calculateGrade();
			System.out.println("Total: " + total);
		    System.out.println("Percentage: " + percentage+"%");
		    System.out.println("Grade: " + grade);
		}
	}

	class Stud {
		Student[] students = new Student[100];
		int count = 0;
		Scanner sc = new Scanner(System.in);

		void addStudent() {
			Student stu = new Student();
			System.out.println("enter a student Id");
			stu.id = sc.nextInt();
			sc.nextLine();

			System.out.println("enter a Student Name ");
			stu.name = sc.nextLine();
			for (int i = 0; i < 3; i++) {
				System.out.println("enter a marks for subjects" + (i + 1) + ":");
				stu.marks[i] = sc.nextInt();

			}
			stu.calculateTotal();
			stu.calculatePercentage();
			stu.calculateGrade();
			students[count] = stu;
			count++;
			System.out.println("student added successfully!!!");

		}

		void displayAllStudents() {
			if (count == 0) {
				System.out.println("no student available");
				return;

			}
			System.out.println("----Student List----");
			for (int i = 0; i < count; i++) {
				students[i].displayStudent();
			}
			System.out.println();
		}

		void searchStudent() {
			System.out.println("enter student ID to search");
			int id = sc.nextInt();
			boolean found = false;
			for (int i = 0; i < count; i++) {
				if (students[i].id == id) {
					System.out.println("student found");
					students[i].displayStudent();
					found = true;
					break;

				}
			}
			if (!found) {
				System.out.println("student not found");
			}
		}
		void closeScanner(){
			sc.close();
			
		}

}









