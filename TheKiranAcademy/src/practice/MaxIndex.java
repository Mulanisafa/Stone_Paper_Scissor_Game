package practice;

public class MaxIndex {
	public static void main(String[] args) {
		int[]arr = {10,20,5,30,25,40,35};
		printmaxindex(arr);
		
	}
	public static void printmaxindex(int[]arr) {
		int maxIndex = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[maxIndex])
				maxIndex= i;
			System.out.println("index of max value"+maxIndex);
			
			
		}
	}

}
