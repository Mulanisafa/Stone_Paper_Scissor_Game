package arrays;

public class arr9 {

	public static void main(String[] args) {
		//count of even and odd
		int[]arr = {1,2,3,4,5,6,7};
		int even=0,odd=0;
		for(int num :arr) {
			if(num%2 == 0) {
				even ++;
			}else {
				odd++;
			}
		}
		System.out.println("even"+even + " "+ "odd"+odd);
		
		

	}

}
