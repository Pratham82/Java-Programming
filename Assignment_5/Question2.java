package Day_Assignment_5;
//2.	Take array and take any number from user and check whether that number is present in array or not.
import java.util.Scanner;

public class Question2{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[] = new int [5];
		int count = 0;
		System.out.println("Enter 5 numbers for Array: ");
		
		for(int i =0; i<A.length; i++){
			A[i] = scan.nextInt();
		}

		System.out.println("Enter number for checking if it is present in Java: ");
		int num = scan.nextInt();

		for(int i = 0; i<A.length; i++){
			if(A[i] == num){
				count++;
			}

		}
		if(count > 0){
			System.out.println("Number is present in the Array");
		}
		else{
			System.out.println("Number is not presetn ibn the Array");
		}

	}
}

