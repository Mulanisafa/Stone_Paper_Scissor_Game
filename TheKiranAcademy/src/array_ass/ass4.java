package array_ass;



public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse of no
		
		int a[]= {2,4,5,6,7,8};
		
				
				int left = 0 ;
				int right = a.length-1;
				while(left<right) {
					int temp = left;
					a[left] =a[ right];
					a[right] = temp;
					
					left ++;
					right--;
					
				}
				for(int i:a) {
					System.out.println("reverse of no"+i);
					
				}
			
		
		

	}

}
