package Day29;

import java.util.Scanner;

public class throwsClause {
    //throws is a keyword in Java which is used in the signature of method
    // to indicate that this method might throw one of the listed type exceptions.
    //We can use multiple exceptions with throws keyword
    //We have to write throws keyword with method creation
    public void ThrowsKeyword(int num1, int num2) throws ArrayIndexOutOfBoundsException,ArithmeticException{
        try{
            System.out.println("num1 = "+num1);
            System.out.println("num2 = "+num2);
            System.out.println("num1/num2 = "+(num1/num2));

        }catch(ArithmeticException ae){
            System.out.println("get message: "+ae.getMessage());
            System.out.println("ArithmeticException"+ae);
            ae.printStackTrace();
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        throwsClause tc = new throwsClause();
        System.out.println("Static input:");
        tc.ThrowsKeyword(45,0);

        int UserValue1, UserValue2;
        //Dynamically taking values
        System.out.println("Dynamically taking input from user  ");
        System.out.println("Enter num1: ");
        UserValue1 = scan.nextInt();
        System.out.println("Enter num2: ");
        UserValue2 = scan.nextInt();
        tc.ThrowsKeyword(UserValue1,UserValue2);



    }
}

