package myassignment;

public class array {
	public static void main(String[] args) {
		int[]readings = {10,5,20,35,25,60,50};
		int minrange = 10;
		int maxrange = 50;
		int sum = 0;
		int count =0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int r :readings) {
			if(r>= minrange && r<= maxrange) {
				sum += r;
				count++;
				if(r>max)max = r;
				if(r<min)min = r;
				
			}
		}
		double avg =(count == 0)? 0:(double)sum/count;
		System.out.println("average"+avg);
		System.out.println("max"+(count ==0? "NA":max));
		System.out.println("min"+(count ==0? "NA":min));
	}

}
