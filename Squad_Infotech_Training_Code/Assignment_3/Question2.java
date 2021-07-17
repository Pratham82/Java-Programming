package Assignment_3;

import java.util.Scanner;

public class Question2 {
	public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter your choice: ");
    char c = scan.next().charAt(0);
    
    switch(c) {
    case'y':
		case'Y':
			System.out.println("yes");
    	break;

		case'n':
		case'N':
			System.out.println("no");
    	break;
		default:
    		System.out.println("Wrong Input ");
    }
	
	}
}
