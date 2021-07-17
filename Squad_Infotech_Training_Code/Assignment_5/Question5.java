package Assignment_5;
//5.	Take array and reverse that array
import java.util.Scanner;

public class Question5{
	public static void main(String [] args){
		Scanner scan  = new Scanner(System.in);
		int A[] = new int [5];

		System.out.println("Enter 5 numbers for Array: ");

		for (int i=0; i<A.length; i++){
			A[i] = scan.nextInt();
		}

		for (int i = A.length - 1; i>=0; i--){
			System.out.println(A[i]);
		}
	}
}
