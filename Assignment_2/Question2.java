package Assignment_2;

import java.util.Scanner;

public class Question2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find out if its Even or Odd: ");
		int n1 = scan.nextInt();
		
		if(n1%2==0) {
			System.out.println("The entered number is Even");
		}
		else {
			System.out.println("The entered number is Odd");
		}
		
	}
}
