package arrays;

public class arr10 {

	public static void main(String[] args) {
		//search given no in array
		int[]arr = {1,2,3,4,5,6,7};
		int search = 5;
		for(int num:arr) {
			if(num == search) {
				System.out.println("no is found");
				return;
			}
			
		}
		System.out.println("no is not found");

	}

}
