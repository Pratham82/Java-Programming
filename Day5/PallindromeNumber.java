package Day5;

import java.util.Scanner;

public class PallindromeNumber {
	public static void main(String []args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= scan.nextInt();
		
		int rem;
        int rev =0;
        int originalNo= n;
        
		while(n>0) {
			rem= n%10;
			rev= rev*10+rem;
			n= n/10;
			
		}
		if (originalNo==rev) {
			System.out.println("The entered number is a Pallindrome number");
		}else {
			System.out.println("The enetred number is not a Pallindrome number ");
		}
		
	}

}
