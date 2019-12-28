package Day5;

import java.util.Scanner;

public class FactorFor {
public static void main(String[]args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter number for finiding its factors: ");
	int num1=scan.nextInt();
	for(int i=1;i<=num1;i++){
		if(num1%i==0) {
			System.out.println(i);
		}
	}
}

}
