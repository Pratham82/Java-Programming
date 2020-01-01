package Day8;
import java.util.Scanner;

public class ArrayMinValue{
	public static void main(String []args){
		Scanner scan= new Scanner(System.in);
		int []a1= new int[10];
		int len1= a1.length;
	        int min= 0;

		System.out.println("Enter 10 values: ");
		for(int i=0; i<len1; i++){
			a1[i]= scan.nextInt();
		}

		min= a1[0];
		for(int i=0; i<len1; i++){
			if(a1[i]<min){
				min= a1[i];
			
			}
		}
		System.out.println("The minimum value enterred: "+min);
	}
}

		
