package Assignment;

public class ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		if (num % 2 != 0) {
			System.out.println("weird");
		}else if(num % 2 == 0 && (num>=2 && num <=5)) {
			System.out.println("not weird");
		}else if(num % 2 == 0 && (num>=6 && num <=20)) {
			System.out.println(" weird");
		}
		
		else {
			System.out.println("not weird");
		}
		

	}

}
