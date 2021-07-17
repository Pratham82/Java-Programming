package Day4;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Calculator :)");
        System.out.println("Operations available:\nAddition(+)\nSubtraction(-)\nMultiplication(*)\nDivision(/)\nModulus(%)");
        System.out.print("Enter expression: ");
        int n1 = scan.nextInt(); char operator = scan.next().charAt(0); int n2 = scan.nextInt();
        /*System.out.print("Enter 2nd number: ");
        int n2 = scan.nextInt();
        System.out.print("Enter the operation: ");
        char operator = scan.next().charAt(0);*/

        switch(operator){
            case '+':
                System.out.println("Addition of two numbers is: "+ (n1+n2));
                break;
            case'-':
                System.out.println("Subtraction of two numbers is: "+ (n1-n2));
                break;
            case'*':
                System.out.println("Multiplication of two numbers: "+ (n1*n2));
                break;
            case'/':
                System.out.println("Division of two numbers: "+ (n1/n2));
                break;
            case'%':
                System.out.println("Modulus of two numbers: "+ (n1%n2));
            default:
                System.out.println("Please choose correct operation");
        }
    }
}
