package Assignment_5;
//3.	Take array and find min and max number
import java.util.Scanner;

public class Question3{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[] = new int[5];
		int Num, Max, Min;
		
		System.out.println("Enter 5 numebers for Array: ");
		for(int i =0; i<A.length; i++){
			A[i] = scan.nextInt();
		}
		
		Max = A[0];
		for(int i =0; i<A.length; i++){
			if(A[i] >Max){
				Max = A[i];
			}
		}
		
		System.out.println("Maximum number in Array: "+ Max);
		
		Min = A[0];
		for(int i =0; i<A.length; i++){
			if(A[i] < Min){
				Min =A[i];
			}
		}
		System.out.println("Minimum number in Array: "+ Min);

	}
}

