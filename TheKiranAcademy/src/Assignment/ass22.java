package Assignment;
import java.util.Scanner;
public class ass22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name of the day using switch
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a day");
		//String day = sc.next();
		//switch(day){
		//case "mon":System.out.println("monday");break;
		//case "tue":System.out.println("tuesday");break;
		//case "wed": System.out.println("wednesday");break;
		//case "thu": System.out.println("thursday");break;
		//case "fri": System.out.println("friday");break;
		//case "sat": System.out.println("satday");break;
		//case "sun": System.out.println("sunday");break;
	    //default:System.out.println("invalid day");
	
		
		
		
		
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
