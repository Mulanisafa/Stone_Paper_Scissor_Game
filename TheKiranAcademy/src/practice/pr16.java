package practice;

public class pr16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//three sides of triangle as input 
		int  a = 10;
		int b = 30;
		int c = 20;
		
		if(a == b && b==c ) {
			System.out.println("it is a equilateral triangle");
		}else if (a == b || b == c|| a==c){
			System.out.println("it is isosceles triangle");
			
		}else  {
			System.out.println("it is a scalene triangle");
			//if we find the scalene triangle is 
			//(a != b || b != c || a!=c)
		
		}
		
	

	}

}
