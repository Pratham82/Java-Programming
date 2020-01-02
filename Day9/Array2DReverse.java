package Day9;
import java.util.Scanner;

public class Array2DReverse{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[][]= new int [3][3];
		
		System.out.println("Enter the values for 3 x3 matrix: ");
		for (int i=0; i<A.length; i++){
			for(int j=0; j<A.length; j++){
				A[i][j]= scan.nextInt();
			}
		}

		System.out.println("Array in 3 x 3 matrix form:");
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A.length; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix in reverse order: ");
		for (int i=A.length-1; i>=0; i--){
			for(int j=A.length-1; j>=0; j--){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}

