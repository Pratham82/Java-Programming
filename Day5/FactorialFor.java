package Day5;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter number to get its Factorials: ");
        int num=scan.nextInt();
        int factorial=1;

        for(int i=num;i>=1;i--){
                factorial = factorial * i;
        }
        System.out.println("Factorial for "+num+" = "+factorial);
    }
}
