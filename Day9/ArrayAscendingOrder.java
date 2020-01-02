package Day9;
import java.util.Scanner;

public class ArrayAscendingOrder{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[]= new int[5];
		int temp =0;
		System.out.println("Enter values for the array: ");
		
		for (int i=0; i<A.length; i++){
			A[i]= scan.nextInt();
		}
	
		System.out.println("Array in ascending order: ");
	        for(int i=0; i<A.length; i++){
			for(int j=i+1; j<A.length; j++){
			if(A[i]>A[j]){
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		    }
		    System.out.println(A[i]);
		}
	}
}


