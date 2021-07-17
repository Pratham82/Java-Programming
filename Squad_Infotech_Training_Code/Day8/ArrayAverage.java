package Day8;
import java.util.Scanner;

public class ArrayAverage{

public static void main(String []args){
	Scanner scan = new Scanner(System.in);
	int A[] = new int [5];
        int total =0;
        double avg =0;
        
	System.out.println("Enter 5 values to find out average:");
	
	for (int i =0; i<A.length; i++){
		A[i] = scan.nextInt();
		total = total +  A[i];
        }
		
        avg = total / A.length;
	System.out.println("Average of the entered numbers is: "+ avg);
	scan.close();
	}
	
}