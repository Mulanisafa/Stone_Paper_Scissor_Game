package DemoString;

public class String1 {
	public static void main(String[] args) {
		int i =10;
		String s1 = "hello";
		String s2 = new String("safa");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1+"world");
		System.out.println(s1);
		s1.concat("world");
		System.out.println(s1);
		s1 = s1.concat("world");
		System.out.println(s1);
		
	}

}
