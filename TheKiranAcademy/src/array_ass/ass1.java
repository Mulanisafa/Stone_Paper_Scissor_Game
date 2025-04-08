package array_ass;
import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of all elements in array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row");
		int row = sc.nextInt();
		System.out.println("enter a col");
		int col = sc.nextInt();
		int sum = 0;
		
		int a[][]= new int[row][col];
		System.out.println("enter a "+(row)*(col)+"elements of array");
		for(int i =0;i<a.length;i++) {
			for(int j = 0; j<a.length;j++) {
				
				a[i][j]= sc.nextInt();
				
				
			}
		}
		for(int i =0;i<a.length;i++) {
			for(int  j= 0; j<a.length;j++) {
				
				sum += a[i][j];
				
				
			}
		}
		System.out.println("sum of elements"+sum);
	}

}
