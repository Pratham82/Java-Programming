package Day9;
import java.util.Scanner;

public class ArrayDescendingOrder{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[]= new int[7];
		int temp = 0 ;
		System.out.println("Entere 7 values for array: ");

		for(int i=0; i<A.length; i++){
			A[i]= scan.nextInt();
		}

		System.out.println("Array in Descending Order: ");
		for(int i=0; i<A.length; i++){
			for(int j= i+1; j<A.length; j++){
				if(A[i]<A[j]){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}System.out.println(A[i]);
		}
	}
}
