package Constructor;

public class myclassmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.display();
		 Student s1 = new Student();
		 s1.displayData();
		 
		 Student s2 = new Student("safa",89);
		 s2.displayData();
		 
		 Student s3 = new Student("rohit",90,89);
		 s3.displayData();
		 
		 Student s4 = new Student("ruhi",60,49);
		 s4.displayData();
		 
		 Student s5 = new Student("rahul",70,79);
		 s5.displayData();
		 
		 
		 s5.show();
		 s5.display();
		 

	}

}
