package Assignment_3;

import java.util.Scanner;

public class Question1 {
	public static void main(String []args) {
		System.out.println("Welcome to calculator");
		System.out.println("======================");
		System.out.println("Operations available : \nAddition (+)\nSubtraction (-)\nMultiplication (*)\nDivision (/)\nModulous (%)");
		System.out.println("======================");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = scan.nextInt();
	    System.out.print("Enter 2nd number: ");
	    int n2 = scan.nextInt();
	    System.out.print("Enter operation to perform: ");
	    char op = scan.next().charAt(0);
	    
	    switch(op){
	    case'+':
	    	System.out.println("Addition of two numbers: "+(n1+n2));
	    	break;
	    case'-':
	    	System.out.println("Subtraction of two numbers: "+(n1-n2));
			break;
	    case'*':
	    	System.out.println("Multiplication of two numbers: "+(n1*n2));
			break;
	    case'/':
	    	System.out.println("Division of two numbers: "+(n1/n2));
			break;
	    case'%':
	    	System.out.println("Division of two numbers: "+(n1%n2));
			break;
	    default:
	        System.out.println("Enter correct value");
	    	
	    }
		
	}
}
