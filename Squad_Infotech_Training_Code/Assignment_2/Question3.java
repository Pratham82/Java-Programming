package Assignment_2;

import java.util.Scanner;

public class Question3 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int Year  = scan.nextInt();
		
		if ((Year%4==0 &&Year%100!=0)||(Year%400==0 )) {
			System.out.println("The entered number is a Leap year");
		}
		else {
			System.out.println("The entered number is not a Leap year");
		}
		scan.close();
	}

}
