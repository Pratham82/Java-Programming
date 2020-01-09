package Assignment_1;

import java.util.Scanner;

public class Question2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter amount: ");
	    int p = scan.nextInt();
	    System.out.print("Enter rate of interest: ");
	    int r =scan.nextInt();
	    System.out.print("Enter duration: ");
	    int n = scan.nextInt();
	    
	    System.out.println("Simple interest = "+ (p*r*n)/100);
		
	}
}
