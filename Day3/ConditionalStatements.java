package Day3;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        int number;

        System.out.print("Enter the number 100: ");
        number=scan.nextInt();

        if (number == 100){
            System.out.print("The entered number is 100");
        }
        else
        {
            System.out.print("The entered number is not 100");
        }
    }
}