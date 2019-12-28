package Day5;

import java.util.Scanner;

public class PalindromeWhile {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number to check if it is Palindrome or not: ");
        int num = scan.nextInt();
        int reversedNo =0;
        int remainder;
        int originalNo = num;

        while(num>0){
            remainder = num%10;
            reversedNo = reversedNo*10+remainder;
            num = num/10;
        }
        if(originalNo==reversedNo){
            System.out.println("Entered number is a Palindrome number");
        }else{
            System.out.println("Entered number is not a Palindrome number");
        }
    }
}
