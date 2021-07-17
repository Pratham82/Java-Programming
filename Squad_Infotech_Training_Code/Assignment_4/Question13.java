package Assignment_4;
//13.	WAP to take any number from user and find whether its palindrome or not
import java.util.Scanner;

public class Question13 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to find out if it is a Palindrome number: ");
        int num = scan.nextInt();
        int Remainder =0;
        int ReversedNumber =0;
        int OriginalNum = num;

        for (int i=num; num!=0;){
            Remainder= num%10;
            ReversedNumber=ReversedNumber*10+Remainder;
            num =num/10;
        }
        if(OriginalNum == ReversedNumber){
            System.out.println("This is a Palindrome number ");
        }
        else{
            System.out.println("This is not a Palindrome number ");
        }
    }
}
