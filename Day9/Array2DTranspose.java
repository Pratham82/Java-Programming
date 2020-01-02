package Day9;
import java.util.Scanner;
public class Array2DTranspose{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[][]= new int [3][3];
		
		System.out.println("Enter values for 3 x 3 array: ");
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A.length; j++){
				A[i][j]= scan.nextInt();
			}
		}

		System.out.println("Array in 3x 3 matrix form: ");
		for (int i=0; i<A.length; i++){
			for(int j= 0; j<A.length; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Transpose of matrix:");
		for (int i=0; i<A.length; i++){
			for(int j=0; j<A.length; j++){
				System.out.print(A[j][i]+" ");
			}
			System.out.println();
		}
	}
}
		
