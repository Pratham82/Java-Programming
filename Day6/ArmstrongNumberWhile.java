package Day6;

import java.util.Scanner;

public class ArmstrongNumberWhile {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter number for checking if it is a Armstrong number: ");
        int enteredNumber =scan.nextInt();
        int remainder ;
        int sumOfRemainder=0;
        int originalNumber=enteredNumber;

        while(enteredNumber>0){
            remainder=enteredNumber%10;
            sumOfRemainder= sumOfRemainder +(remainder*remainder*remainder);
            enteredNumber=enteredNumber/10;
        }
        if(sumOfRemainder==originalNumber){
            System.out.println("Entered number is an Armstrong number");
        }
        else{
            System.out.println("Entered number is not a Armstrong number");
        }
    }
}
