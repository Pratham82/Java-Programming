package Day9;
import java.util.Scanner;

public class ForEach{
	public static void main(String []args){
		int[] A= new int[] {101,102,103,104,105};

		System.out.println("Array :");
		for(int i= 0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	        System.out.println("\n\n");
		System.out.println("Array using for each loop: "+" ");
		for(int i :A){
			System.out.print(i+" ");
		}
			
	}
}
