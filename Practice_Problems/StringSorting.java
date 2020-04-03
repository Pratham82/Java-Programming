package Practice_Problems;

import java.util.Scanner;

public class StringSorting{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter desired length for the array: ");
		int ALength = scan.nextInt();
		System.out.println("Enter "+ALength+" words: ");
		String A[] = new String [ALength];
		String temp = null;

		for(int i=0; i<A.length; i++){
			A[i]= scan.next();
		}

		System.out.println("Enter sorted list ");
		
		for(int i =0; i<A.length; i++){
			for(int j = i+1; j<A.length; j++){
				if(A[i].compareTo(A[j])>0){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
			System.out.println(A[i]);
		}
		scan.close();
	}
}

