package Assignment_1;

import java.util.Scanner;

public class Question8 {
	public static void main(String []args) {
		Scanner scan = new Scanner (System.in);
		int productPrice = 125;
		System.out.println("Price of 1 product: "+125);
		System.out.print("Enter the quantity you want to buy: ");
		int quantity = scan.nextInt();
		
		System.out.println("Your final total is: " +productPrice*quantity);
		scan.close();
	}
}
