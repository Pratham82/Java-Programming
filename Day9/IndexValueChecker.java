package Day9;
import java.util.Scanner;

public class IndexValueChecker{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int A[] = new int [5];
		int count= 0;
		int max= 0;
		int maxInd=0;

		System.out.println("Enter 5 values for Array: ");
		for (int i=0; i<A.length; i++){
			A[i]=scan.nextInt();
		}

		//max = A[0];
		for (int i=0; i<A.length; i++){
			if(A[i]>max){
				max =A[i];
				
			}
                }

                for (int i=0; i<A.length; i++){
			if(A[i]==max){
				//System.out.println(i);
				maxInd=i;
			}
		}

		System.out.println("Maximum number in the entered array is "+ max +" And its index value is "+ maxInd);
		
	}
}
		

