package ApplicationDevelopment;

import java.util.Arrays;

class Student11 {
	private int id;
	private String name;
	private int[] marks;
	//
	public Student11(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	

	public int getTotalMarks() {
		int total = 0;

		for (int mark : marks) {
			total += mark;

		}
		return total;

	}

	public double getpercentage() {
		return getTotalMarks() / (double) (marks.length);

	}

	public void getGrade() {
		double percentage = getpercentage();
		if (percentage > 90) {
			System.out.println("Grade A");
		} else if (percentage > 70) {
			System.out.println("Grade B");
		} else if (percentage > 50) {
			System.out.println("grade C");
		} else if (percentage > 35) {
			System.out.println("grade D");
		} else {
			System.out.println("fail");
		}

		System.out.println("getgrade" + percentage);

	}

	public void dispalydetails() {

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + (Arrays.toString(marks)));
		System.out.println("Total Marks: " + getTotalMarks());
		System.out.println("Percentage: " + getpercentage());
		getGrade();
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		int[] marks1 = { 85, 90, 80 };
		Student student1 = new Student(1, "John Doe", marks1);
		student1.dispalydetails();
		System.out.println();
		
		
		int[] marks2 = { 50, 70, 60 };
		Student student2 = new Student(2, "James Bond", marks2);
		student2.dispalydetails();
		System.out.println();
		
		
		int[] marks3 = { 91, 80, 60 };
		Student student3 = new Student(3, "Robert kiyosaki", marks3);
		student3.dispalydetails();
	}

}
