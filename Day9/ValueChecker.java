package Day9;
import java.util.Scanner;
//This program takes the input from the user and stroes the vlaue in the array, afterwards we can check if the vlaue is prsent in the Array
public class ValueChecker{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int A[]= new int[5];
		int count=0;
		
		System.out.println("Enter 5 numbers for array: ");
		for(int i=0; i<A.length; i++){
			A[i]= scan.nextInt();
		}

		System.out.println("Enter new number: ");
		int num = scan.nextInt();

		for(int i=0; i<A.length; i++){
			if(A[i]==num){
			count++;
		        }
		}
		if(count>0){
			System.out.println("Entered "+num +" is present in the given Array for "+count+" times");
		}
		else{
		        System.out.println("Entered number is not present in the given Arrray");  
	            }
		}
		
          }
