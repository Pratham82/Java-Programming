package Day9;
import java.util.Scanner;

public class Array2D4x2{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[][] = new int [4][2];

		System.out.println("Enter the values for 4 x 2 array: ");
		for (int i=0; i<A.length; i++){
			for (int j= 0; j<A[i].length; j++){
				A[i][j]=scan.nextInt();
			}
		}

		System.out.println("Entered values in 4 x 2 matrix form: ");
		for(int i=0; i<A.length; i++){
			for (int j=0; j<A[i].length; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}

