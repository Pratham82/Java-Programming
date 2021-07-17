package Day9;
import java.util.Scanner;

public class Array2D{
	public static void main(String []args){
                Scanner scan = new Scanner(System.in);	
		int Arr[][]=new int[3][3];
	        
		System.out.println("Enter 9 vlaues for 3 x 3 Array: ");
		for(int i=0; i<Arr.length; i++){
			for(int j=0; j<Arr.length; j++){
				Arr[i][j] = scan.nextInt();
			}
		}
		
                System.out.println("\nEntered number in 2D Matrix form: ");
		for(int i=0; i<Arr.length; i++){ 
			for(int j=0; j<Arr.length; j++){
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
