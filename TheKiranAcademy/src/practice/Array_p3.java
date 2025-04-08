package practice;
import java.util.ArrayList;

import java.util.List;

public class Array_p3 {
	public static void main(String[] args) {
		//print even first, then odd
		
		int[]arr = {1,2,3,4,5,6,0,9,7,6,8,5};
		printevenoddarr(arr);
		
	}
	public static void printevenoddarr(int[]arr) {
		List<Integer> evens = new ArrayList<>(),
				odds = new ArrayList<>();
		for(int num:arr)
			if(num % 2 == 0) 
				evens.add(num);
			else
				odds.add(num);
		evens.addAll(odds);
		System.out.println("even first,then odd "+evens);
				
			
				
				
		
	}
}
