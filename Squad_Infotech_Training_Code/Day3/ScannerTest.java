package Day3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter First number: ");
        num1= scan.nextInt();
        System.out.print("Enter Second number: ");
        num2= scan.nextInt();

        System.out.println("Arithmetic operations on the entered numbers: ");
        System.out.println("Addition of two numbers = "+(num1+num2));
        System.out.println("Subtraction of two numbers = "+(num1-num2));
        System.out.println("Multiplication of two numbers = "+(num1*num2));
        System.out.println("Division of two numbers = "+(num1/num2));
        System.out.println("Modulus of two numbers = "+(num1%num2));
    }
}
