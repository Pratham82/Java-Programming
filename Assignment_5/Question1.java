package Assignment_5;
//1.	Take array and find sum of all number present in it.
import java.util.Scanner;

public class Question1{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[] = new int[5];
		System.out.println("Enter 5 numbers for Array: ");
	       	int sum =0;

		for(int i = 0; i<A.length; i++){
			A[i] = scan.nextInt();
			sum = sum + A[i];
		}
			
		System.out.println("Sum of all the numbers: "+sum);
		}
}	
		
