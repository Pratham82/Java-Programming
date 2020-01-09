package Assignment_2;

import java.util.Scanner;

public class Question1 {
	public static void main(String []args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter the number for checking: ");
	int n= scan.nextInt();
	
	if(n%5==0) {
		System.out.println("The entered number is divisible by 5");
	}
	else {
		System.out.println("The entered number is not divisible by 5");
	}
	
	}
}
