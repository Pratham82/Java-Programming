package Assignment_1;

import java.util.Scanner;

public class Question7 {
	public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter 1st number: ");
	int n1 = scan.nextInt();
	System.out.print("Enter 2nd number: ");
	int n2 = scan.nextInt();
	
	n1 = n1 + n2;
	n2 = n1 - n2;
	n1 = n1 - n2;
	
	System.out.println("Swapped numbers: ");
	System.out.println("Number 1= "+n1);
	System.out.println("Number 2= "+n2);
	scan.close();
	}
	
}
