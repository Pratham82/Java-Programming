package Day3;
import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args){
    int num;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number for checking: ");
    num= scan.nextInt();

    if (num%2==0)
    {
        System.out.println("Entered number is Even");
    }
    else
    {
        System.out.println("Entered number is Odd");
    }
    }
}
