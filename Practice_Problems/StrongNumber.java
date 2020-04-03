package Practice_Problems;

import java.util.Scanner;

class StrongNumber{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for checking if it's a strong number: ");
		int num = scan.nextInt();
		int remainder;
		int sumOfFact = 0;
		int fact = 1 ;
		int OriginalNum = num;
		while(num>0){
			remainder = num%10;
			fact = 1;
			for(int i = 1; i<= remainder; i++){
				fact = fact * i;
			}
			sumOfFact = sumOfFact + fact;
			num = num/10;
			}
		if(OriginalNum == sumOfFact){
			System.out.println("The entered number is Strong number");
		}
		else{
			System.out.println("The entered number is not a Strong number");
		}
		scan.close();
	}
}
