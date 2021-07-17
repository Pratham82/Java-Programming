package Day5;

import java.util.Scanner;

public class FactorialFor {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter number to check its factorial: ");
		int num= scan.nextInt();
		int fact=1;
		
		for(int i=num;i>=1;i--) {
			fact =fact *i;
		}
		System.out.println("Factorial of "+ num+ " = "+fact);
	}

}
