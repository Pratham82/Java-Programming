package Assignment_5;
//4.	Take array and find array in ascending order
import java.util.Scanner;

public class Question4{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);	
		int A[] = new int[5];
		int temp = 0;
		
		System.out.println("Enter 5 numbers for Array: ");
		
		for(int i= 0; i<A.length; i++){
			A[i] = scan.nextInt();
		}

		for(int i =0; i<A.length; i++){
			for(int j = i+1 ; j<A.length; j++){
				if(A[i]>A[j]){
					temp =A[i];
					A[i] = A[j];
					A[j] = temp;				
				}
			}
			System.out.println(A[i]);
		}
	}
}

