package Assignment_4;
//11.	WAP to take any number from user and find its sum of digits.
import java.util.Scanner;

public class Question11 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find its sum: ");
        int num = scan.nextInt();
        int Remainder =0;
        int SumOfRemainder =0;

        for(int i =num; num!=0; ){
            Remainder =num%10;
            SumOfRemainder =SumOfRemainder+Remainder;
            num = num/10;
        }
       //1 iteration for sum of number:
       //Remainder =num%10;
       //SumOfRemainder =SumOfRemainder+Remainder;

        System.out.println(SumOfRemainder);
    }
}
