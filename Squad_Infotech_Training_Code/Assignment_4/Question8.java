package Assignment_4;
//8.	WAP to take any number from user and find its factorial
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to find its factorials: ");
        int num = scan.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact =fact*i;
        }
        System.out.println("Factorial of "+num+": "+fact);
    }
}
