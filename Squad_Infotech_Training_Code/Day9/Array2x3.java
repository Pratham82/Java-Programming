package Day9;
import java.util.Scanner;

public class Array2x3{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[][] = new int [2][3];

		System.out.println("Enter vlaues for 2 x 3 matrix" );
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				A[i][j]= scan.nextInt();
			}
		}

		System.out.println("2 x 3 matrix of entered values; ");
		for (int i=0; i<A.length; i++){
			for (int j= 0; j<A[0].length; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}

