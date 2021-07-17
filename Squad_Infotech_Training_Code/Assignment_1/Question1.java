package Assignment_1;

import java.util.Scanner;

public class Question1 {
	public  static void main(String []args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Available operation: \nAddition\nSubtraction\nMultiplication\nDivision\nModulus");
	    System.out.println("----------------------------------------------");
	    System.out.print("Enter 1st number: ");
	    int num1= scan.nextInt();
	    System.out.print("Enter 2nd number: ");
	    int num2= scan.nextInt();
	    System.out.println("Enter the operation to perform: ");
	    System.out.println("----------------------------------------------");
	    System.out.println("Addition of two numbers: "+(num1+num2));
	    System.out.println("Subtraction of two numbers: "+(num1-num2));
	    System.out.println("Multiplication of two numbers: "+(num1*num2));
	    System.out.println("Division of two numbers: "+(num1/num2));
	    System.out.println("Modulus of two numbers: "+(num1%num2));
		scan.close();
	    
	    
	}

}
