package Day5;

import java.util.Scanner;

public class ReverseWhile {
	public static void main(String []args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number for reversing: ");
		int n= scan.nextInt();
		
		int rem;
        int rev =0;
		while(n>0) {
			rem= n%10;
			rev= rev*10+rem;
			n= n/10;
		}
		System.out.println("Reversed value: "+ rev);
	}

}
