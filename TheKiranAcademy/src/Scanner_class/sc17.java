package Scanner_class;
import java.util.Scanner;
public class sc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name of the day
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a day");
	
		int day = sc.nextInt();
		switch(day){
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3: System.out.println("wednesday");break;
		case 4: System.out.println("thursday");break;
		case 5: System.out.println("friday");break;
		case 6: System.out.println("satday");break;
		case 7: System.out.println("sunday");break;
		default:System.out.println("invalid day");

	}

}
}
