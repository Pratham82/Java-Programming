package Assignment_4;
//15.	WAP to print any number from user and find whether its Armstrong or not
import java.util.Scanner;

public class Question15{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter number for checking if it is a Armstrong number: ");
        int num =scan.nextInt();
        int remainder ;
        int sumOfRemainder=0;
        int originalNumber=num;

        for(int i=num; num!=0; ){
            remainder=num%10;
            sumOfRemainder= sumOfRemainder +(remainder*remainder*remainder);
            num=num/10;
        }
        if(sumOfRemainder==originalNumber){
            System.out.println("Entered number is an Armstrong number");
        }
        else{
            System.out.println("Entered number is not a Armstrong number");
        }
    }
}