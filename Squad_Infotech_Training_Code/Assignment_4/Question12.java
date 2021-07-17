package Assignment_4;
//12.	WAP to take any number from user and reverse it
import java.util.Scanner;

public class Question12 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to reverse it: ");
        int num = scan.nextInt();
        int Remainder=0;
        int ReversedNumber =0;

        for(int i=num;num!=0;){
            Remainder = num%10;
            ReversedNumber = ReversedNumber*10+Remainder;
            num = num/10;
        }
        System.out.println(ReversedNumber);
    }
}
