package Day6;

import java.util.Scanner;

public class DoWhileOperation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        char decision;

        do{


            System.out.print("Enter first number: ");
            int num1=scan.nextInt();
            System.out.print("Enter second number: ");
            int num2=scan.nextInt();
            System.out.println("Addition of two numbers: "+(num1+num2));

            System.out.println("Do you want to continue? If yes enter y \nIf you want to close enter n or N");
            decision=scan.next().charAt(0);
            if(decision=='n'||decision=='N'){
                return;
            }
        }while(decision =='y'||decision=='Y');
    }
}
