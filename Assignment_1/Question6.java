package Assignment_1;

import java.util.Scanner;

public class Question6 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1= scan.nextInt();
		System.out.print("Enter 2md number: ");
		int num2 = scan.nextInt();
		int num3;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("Swapped number :");
		System.out.println("Number 1 = "+num1);
		System.out.println("Number 2 = "+num2);
		
	}

}
