package Constructor;

public class Student {
	String name;
	int rollno;
	float marks;
	
	
	public Student() {
		name ="rakhi";
		rollno = 99;
		marks = 0.3289f;
		
	}
	public Student(String n) {
		name = n;
		rollno = 0;
		marks = 0.0f;
		
		
	}
	public Student(String n,int r) {
		name = n;
		rollno = r;
		marks = 0.09F;
	}
	
	public Student(String k,int r,float f) {
		name = k;
		rollno = r;
		marks = 0.089F;
	}
	void displayData() {
		System.out.println(name+" "+rollno+" "+marks);
	}
	static void display() {
		System.out.println("static method");
	}
	void show() {
		System.out.println("non static method");
	}

	

}
