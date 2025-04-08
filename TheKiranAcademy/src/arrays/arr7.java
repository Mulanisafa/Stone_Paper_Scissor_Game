package arrays;

public class arr7 {

	public static void main(String[] args) {
		// largest and smallest
		int arr[]= {1,2,3,4,5};
		int min = arr[0],max = arr[0];
		for(int num :arr) {
			if(num<min)min=num;
			if(num>max)max = num;
		}
		System.out.println("min"+min+" "+"max"+ max);

	}

}
